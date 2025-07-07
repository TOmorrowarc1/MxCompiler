package FrontEnd;

import ASTNode.*;
import Utils.*;

import java.util.Optional;

public class SemanticChecker implements ASTNodeVisitor {
    private Scope scope;
    private Type currentClassType;
    private Type currentReturnType;

    public SemanticChecker(Scope globalscope) {
        scope = globalscope;
        currentClassType = null;
        currentReturnType = null;
    }

    @Override
    public void visit(ProgramNode node) {
        for (VarDefStmtNode varDefNode : node.varDeclarations) {
            varDefNode.accept(this);
        }
        for (FunctionDeclarationNode functionDeclarationNode : node.functions) {
            functionDeclarationNode.accept(this);
        }
        for (ClassDeclarationNode classDeclarationNode : node.classDeclarations) {
            classDeclarationNode.accept(this);
        }
    }

    @Override
    public void visit(ConstructorDeclarationNode node) {
        if (!node.constructorName.equals(currentClassType.typeName())) {
            throw new SemanticError(node.position.toString() + " The name of constructor function is uncorresponding.");
        }
        scope = new Scope(scope);
        currentReturnType = null;
        node.body.accept(this);
        scope = scope.getParentScope();
    }

    @Override
    public void visit(ClassDeclarationNode node) {
        Scope memoryScope = scope;
        if (scope.getType(node.className).isEmpty()) {
            throw new SemanticError(node.position.toString() + "Class " + node.className + " has not been declared??? ");
        }
        ClassType classType = (ClassType) scope.getType(node.className).get();
        scope = classType.getClassScope();
        currentClassType = classType;
        for (VarDefStmtNode varDefs : node.varDefs) {
            varDefs.accept(this);
        }
        for (FunctionDeclarationNode functionDeclarationNode : node.functionDefs) {
            functionDeclarationNode.accept(this);
        }
        for (ConstructorDeclarationNode constructorDeclarationNode : node.constructors) {
            constructorDeclarationNode.accept(this);
        }
        scope = memoryScope;
    }

    @Override
    public void visit(FunctionDeclarationNode node) {
        if (scope.getType(node.returnType.typeName()).isEmpty()) {
            throw new SemanticError(node.position.toString() + "The return type is not existed.");
        }
        scope = new Scope(scope);
        currentReturnType = scope.getType(node.returnType.typeName()).get();
        for (FunctionDeclarationNode.ParameterNode parameterNode : node.parameters) {
            if (scope.getType(parameterNode.parameterType.typeName()).isEmpty()) {
                throw new SemanticError(node.position.toString() + "The parameter type is not existed.");
            }
            scope.declareSymbol(parameterNode.identifier, new VariableSymbolInfo(parameterNode.parameterType));
        }
        node.body.accept(this);
        scope = scope.getParentScope();
    }

    @Override
    public void visit(EmptyStmtNode node) {
    }

    @Override
    public void visit(ExprStmtNode node) {
        node.expr.accept(this);
    }

    @Override
    public void visit(VarDefStmtNode node) {
        VariableSymbolInfo symbolInfo = new VariableSymbolInfo(node.varType);
        for (VarDefStmtNode.DefNode defNode : node.defList) {
            scope.declareSymbol(defNode.identifier, symbolInfo);
        }
    }

    @Override
    public void visit(JmpStmtNode node) {
        if (scope.getLoopDepth() <= 0) {
            throw new SemanticError(node.position.toString() + " Loop depth exceeded");
        }
    }

    @Override
    public void visit(ReturnStmtNode node) {
        node.expression.accept(this);
        if (!node.expression.nodeInfo.getType().equals(currentReturnType)) {
            throw new SemanticError(node.position.toString() + " Type not match: return value should be " + currentReturnType.toString() + ".");
        }
    }

    @Override
    public void visit(ForStmtNode node) {
        scope = new Scope(scope);
        node.varDefStmt.accept(this);
        node.condition.accept(this);
        node.step.accept(this);
        if (!node.condition.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement is not a bool");
        }
        scope.addLoopDepth();
        node.body.accept(this);
        scope.subLoopDepth();
        scope = scope.getParentScope();
    }

    @Override
    public void visit(WhileStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement is not a bool");
        }
        scope.addLoopDepth();
        node.body.accept(this);
        scope.addLoopDepth();
    }

    @Override
    public void visit(IfStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement should be a bool Expr.");
        }
        scope = new Scope(scope);
        node.thenStmt.accept(this);
        node.elseStmt.accept(this);
        scope = scope.getParentScope();
    }

    @Override
    public void visit(BlockStmtNode node) {
        scope = new Scope(scope);
        for (StmtNode statement : node.body) {
            statement.accept(this);
        }
        scope = scope.getParentScope();
    }

    @Override
    public void visit(FunctionCallExprNode node) {
        FunctionSymbolInfo functionSymbolInfo;
        if (node.callee instanceof ClassAccessNode classAccessNode) {
            classAccessNode.object.accept(this);
            if (scope.getType(classAccessNode.object.nodeInfo.getType().typeName()).isEmpty()) {
                throw new SemanticError(node.position.toString() + " Class has not been declared");
            }
            ClassType objectType = (ClassType) (scope.getType(classAccessNode.object.nodeInfo.getType().typeName()).get());
            if (objectType.getSymbol(classAccessNode.classAccess).isEmpty()) {
                throw new SemanticError(node.position.toString() + " No such method in the class.");
            }
            functionSymbolInfo = (FunctionSymbolInfo) objectType.getSymbol(classAccessNode.classAccess).get();
        } else if (node.callee instanceof VarExprNode varExprNode) {
            if (scope.getSymbol(varExprNode.identifier).isEmpty()) {
                throw new SemanticError(node.position.toString() + " Function has not been declared");
            }
            functionSymbolInfo = (FunctionSymbolInfo) scope.getSymbol(varExprNode.identifier).get();
        } else {
            throw new SemanticError(node.position.toString() + " The callee is not correct.");
        }
        if (node.parameters.size() != functionSymbolInfo.getParametersType().size()) {
            throw new SemanticError(node.position.toString() + " The number of parameters not corresponds.");
        }
        for (ExprNode parameter : node.parameters) {
            parameter.accept(this);
        }
        for (int i = 0; i < node.parameters.size(); i++) {
            if (!node.parameters.get(i).nodeInfo.getType().equals(functionSymbolInfo.getParametersType().get(i))) {
                throw new SemanticError(node.position.toString() + " The parameter type not match.");
            }
        }
        node.nodeInfo.setType(functionSymbolInfo.getReturnType());
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(ArrayVisitExprNode node) {
        node.index.accept(this);
        if (!node.index.nodeInfo.getType().equals(PrimitiveType.INT)) {
            throw new SemanticError(node.position.toString() + " Index must be int. ");
        }
        node.array.accept(this);
        if (!(node.array.nodeInfo.getType() instanceof ArrayType arrayType)) {
            throw new SemanticError(node.position.toString() + " Array type not match.");
        }
        node.nodeInfo.setType(arrayType.getElementType());
        node.nodeInfo.setIsLeftValue(true);
    }

    @Override
    public void visit(ClassAccessNode node) {
        //It only executes as a fieldAccessNode.
        node.object.accept(this);
        if (scope.getType(node.object.nodeInfo.getType().typeName()).isEmpty()) {
            throw new SemanticError(node.position.toString() + " Class has not been declared");
        }
        ClassType objectType = (ClassType) (scope.getType(node.object.nodeInfo.getType().typeName()).get());
        if (objectType.getSymbol(node.classAccess).isEmpty()) {
            throw new SemanticError(node.position.toString() + " No such member in the class.");
        }
        Type memberType = ((VariableSymbolInfo) (objectType.getSymbol(node.classAccess).get())).getType();
        node.nodeInfo.setType(memberType);
        node.nodeInfo.setIsLeftValue(true);
    }

    @Override
    public void visit(UnaryExprNode node) {
        node.expression.accept(this);
        if (node.operator == UnaryExprNode.UnaryOperator.LOGIC_NOT) {
            if (!node.expression.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
                throw new SemanticError(node.position.toString() + "Type not match: the type of the expression should be bool.");
            }
            node.nodeInfo.setType(PrimitiveType.BOOL);
            node.nodeInfo.setIsLeftValue(false);
        } else {
            if (!node.expression.nodeInfo.getType().equals(PrimitiveType.INT)) {
                throw new SemanticError(node.position.toString() + "Type not match: the type of the expression should be int.");
            }
            node.nodeInfo.setType(PrimitiveType.INT);
            if (node.operator == UnaryExprNode.UnaryOperator.SELF_ADD || node.operator == UnaryExprNode.UnaryOperator.SELF_SUB) {
                if (!node.expression.nodeInfo.isLeftValue()) {
                    throw new SemanticError(node.position.toString() + "A right value should not be ++/--");
                }
                node.nodeInfo.setIsLeftValue(true);
            } else {
                node.nodeInfo.setIsLeftValue(false);
            }
        }
    }

    @Override
    public void visit(NewClassExprNode node) {
        node.nodeInfo.setType(node.classType);
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(NewArrayExprNode node) {
        node.nodeInfo.setType(node.arrayType);
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(BinaryExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (!node.left.nodeInfo.getType().equals(node.right.nodeInfo.getType()) && !(node.left.nodeInfo.getType() instanceof ArrayType || node.right.nodeInfo.getType().equals(PrimitiveType.NULL)) && !(node.right.nodeInfo.getType() instanceof ArrayType || node.left.nodeInfo.getType().equals(PrimitiveType.NULL))) {
            throw new SemanticError(node.position.toString() + "Types not match: types on sides of the binary operator is different.");
        }
        switch (node.operator) {
            case LOGIC_AND, LOGIC_OR: {
                if (!node.left.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
                    throw new SemanticError(node.position.toString() + "Types not match: the type should be bool");
                }
                node.nodeInfo.setType(PrimitiveType.BOOL);
                break;
            }
            case SUB, MUL, DIV, MOD, OR, AND, LEFT_SHIFT, RIGHT_SHIFT: {
                if (!node.left.nodeInfo.getType().equals(PrimitiveType.INT)) {
                    throw new SemanticError(node.position.toString() + "Types not match: the type should be int");
                }
                node.nodeInfo.setType(PrimitiveType.INT);
                break;
            }
            case G, GE, L, LE, PLUS: {
                if (!node.left.nodeInfo.getType().equals(PrimitiveType.INT) && !node.left.nodeInfo.getType().equals(PrimitiveType.STRING)) {
                    throw new SemanticError(node.position.toString() + "Types  not match: the type should be int or string");
                }
                node.nodeInfo.setType(node.left.nodeInfo.getType());
                break;
            }
            case EQUAL, N_EQUAL: {
                node.nodeInfo.setType(PrimitiveType.BOOL);
                break;
            }
        }
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(TernaryExprNode node) {
        node.conditionExpr.accept(this);
        node.trueExpr.accept(this);
        node.falseExpr.accept(this);
        if (!node.conditionExpr.nodeInfo.getType().equals(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + "Types not match: the conditional Expr type should be bool");
        }
        if (!node.trueExpr.nodeInfo.getType().equals(node.falseExpr.nodeInfo.getType())) {
            throw new SemanticError(node.position.toString() + "Types not match: the lhs and rhs have different types");
        }
        node.nodeInfo.setType(node.trueExpr.nodeInfo.getType());
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(AssignExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (!node.left.nodeInfo.getType().equals(node.right.nodeInfo.getType())) {
            throw new SemanticError(node.position.toString() + "Types not match: assign the wrong type to left.");
        }
        if (!node.left.nodeInfo.isLeftValue()) {
            throw new SemanticError(node.position.toString() + "Types not match: the left is not assignable");
        }
        node.nodeInfo.setType(node.left.nodeInfo.getType());
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(ThisNode node) {
        node.nodeInfo = new ExprNodeInfo(currentClassType, false);
    }

    @Override
    public void visit(IntLiteralExprNode node) {
        node.nodeInfo.setType(PrimitiveType.INT);
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(BoolLiteralExprNode node) {
        node.nodeInfo.setType(PrimitiveType.BOOL);
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(StringLiteralExprNode node) {
        node.nodeInfo.setType(PrimitiveType.STRING);
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(VarExprNode node) {
        Optional<SymbolInfo> type = scope.getSymbol(node.identifier);
        if (type.isEmpty()) {
            throw new SemanticError(node.position.toString() + " The variable has not been defined");
        }
        node.nodeInfo = new ExprNodeInfo(((VariableSymbolInfo) type.get()).getType(), true);
    }

    @Override
    public void visit(EmptyExprNode node) {
        node.nodeInfo.setType(PrimitiveType.VOID);
        node.nodeInfo.setIsLeftValue(false);
    }
}
