package FrontEnd;

import ASTNode.*;
import Utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SemanticChecker implements ASTNodeVisitor {
    private Scope scope;
    private Type currentClassType;
    private Type currentReturnType;
    private int loopDepth;

    public SemanticChecker(Scope globalscope) {
        scope = new Scope(globalscope);
        currentClassType = null;
        currentReturnType = null;
    }

    @Override
    public void visit(ProgramNode node) {
        for (ASTNode declarations : node.consequenceProgram) {
            declarations.accept(this);
        }
    }

    @Override
    public void visit(ConstructorDeclarationNode node) {
        if (!node.constructorName.equals(currentClassType.typeName())) {
            throw new SemanticError(node.position.toString() + " The name of constructor function is uncorresponding.");
        }
        scope = new Scope(scope);
        currentReturnType = PrimitiveType.VOID;
        node.body.accept(this);
        scope = scope.getParentScope();
    }

    @Override
    public void visit(ClassDeclarationNode node) {
        Scope memoryScope = scope;
        if (scope.getType(node.className).isEmpty()) {
            throw new SemanticError(node.position.toString() + "Class " + node.className + " has not been declared??? ");
        }
        if (scope.getSymbol(node.className).isPresent()) {
            throw new SemanticError(node.position.toString() + " The class name and the function name should not be same.");
        }
        ClassType classType = (ClassType) scope.getType(node.className).get();
        classType.getClassScope().setParentScope(scope);
        //Distinguish the symbol collect and the semantic check scope, so as global declarations.
        scope = new Scope(classType.getClassScope());
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

    private boolean isTypeValid(Type type) {
        while (type instanceof ArrayType arrayType) {
            type = arrayType.getElementType();
        }
        return scope.getType(type.typeName()).isPresent();
    }

    private Type getBaseType(Type type) {
        while (type instanceof ArrayType arrayType) {
            type = arrayType.getElementType();
        }
        return type;
    }

    @Override
    public void visit(FunctionDeclarationNode node) {
        if (!isTypeValid(node.returnType)) {
            throw new SemanticError(node.position.toString() + "The return type is not existed.");
        }
        scope = new Scope(scope);
        currentReturnType = node.returnType;
        for (FunctionDeclarationNode.ParameterNode parameterNode : node.parameters) {
            if (!isTypeValid(parameterNode.parameterType)) {
                throw new SemanticError(node.position.toString() + " The parameter type is not existed.");
            }
            if (getBaseType(parameterNode.parameterType).isEquivalent(PrimitiveType.VOID)) {
                throw new SemanticError(node.position.toString() + " The parameter type should not be void.");
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
        if (!isTypeValid(node.varType)) {
            throw new SemanticError(node.position.toString() + "The variable type(class) is not existed.");
        }
        if (getBaseType(node.varType).isEquivalent(PrimitiveType.VOID)) {
            throw new SemanticError(node.position.toString() + " The variable type cannot be void.");
        }
        VariableSymbolInfo symbolInfo = new VariableSymbolInfo(node.varType);
        for (VarDefStmtNode.DefNode defNode : node.defList) {
            defNode.type = node.varType;
            defNode.accept(this);
            scope.declareSymbol(defNode.identifier, symbolInfo);
        }
    }

    @Override
    public void visit(VarDefStmtNode.DefNode node) {
        node.initValue.accept(this);
        if (!(node.initValue instanceof EmptyExprNode) && !isAssignable(node.type, node.initValue.nodeInfo.getType())) {
            throw new SemanticError(node.position.toString() + "The new variable type is not assignable.");
        }
    }

    @Override
    public void visit(JmpStmtNode node) {
        if (this.loopDepth <= 0) {
            throw new SemanticError(node.position.toString() + " Loop depth exceeded");
        }
    }

    @Override
    public void visit(ReturnStmtNode node) {
        node.expression.accept(this);
        Type realReturnType;
        if (node.expression instanceof EmptyExprNode) {
            realReturnType = PrimitiveType.VOID;
        } else {
            realReturnType = node.expression.nodeInfo.getType();
        }
        if (!isAssignable(currentReturnType, realReturnType)) {
            throw new SemanticError(node.position.toString() + " Type not match: return value should be " + currentReturnType.toString() + ".");
        }
    }

    @Override
    public void visit(ForStmtNode node) {
        scope = new Scope(scope);
        node.varStmt.accept(this);
        node.condition.accept(this);
        node.step.accept(this);
        if (!node.condition.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL) && !(node.condition instanceof EmptyExprNode)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement is not a bool");
        }
        this.loopDepth++;
        node.body.accept(this);
        this.loopDepth--;
        scope = scope.getParentScope();
    }

    @Override
    public void visit(WhileStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL) && !(node.condition instanceof EmptyExprNode)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement is not a bool");
        }
        this.loopDepth++;
        scope = new Scope(scope);
        node.body.accept(this);
        scope = scope.getParentScope();
        this.loopDepth--;
    }

    @Override
    public void visit(IfStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + " Type not match: condition judgement should be a bool Expr.");
        }
        scope = new Scope(scope);
        node.thenStmt.accept(this);
        scope = scope.getParentScope();
        scope = new Scope(scope);
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
    public void visit(SubExprNode node) {
        node.exprNode.accept(this);
        node.nodeInfo = node.exprNode.nodeInfo;
    }

    @Override
    public void visit(FunctionCallExprNode node) {
        FunctionSymbolInfo functionSymbolInfo;
        if (node.callee instanceof ClassAccessNode classAccessNode) {
            classAccessNode.object.accept(this);
            if (!isTypeValid(classAccessNode.object.nodeInfo.getType())) {
                throw new SemanticError(node.position.toString() + classAccessNode.object.nodeInfo.getType().typeName() + " Class has not been declared.");
            }
            if (classAccessNode.object.nodeInfo.getType() instanceof ArrayType) {
                if (classAccessNode.classAccess.equals("size")) {
                    List<Type> emptyList = new ArrayList<>();
                    functionSymbolInfo = new FunctionSymbolInfo(PrimitiveType.INT, emptyList);
                } else {
                    throw new SemanticError(node.position.toString() + " No such method in the class.");
                }
            } else if (classAccessNode.object.nodeInfo.getType() instanceof ClassType) {
                ClassType objectType = (ClassType) (scope.getType(classAccessNode.object.nodeInfo.getType().typeName()).get());
                if (objectType.getSymbol(classAccessNode.classAccess).isEmpty()) {
                    throw new SemanticError(node.position.toString() + " No such method in the class.");
                }
                functionSymbolInfo = (FunctionSymbolInfo) objectType.getSymbol(classAccessNode.classAccess).get();
            } else {
                throw new SemanticError(node.position.toString() + " Name has not been declared.");
            }
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
            if (!isAssignable(functionSymbolInfo.getParametersType().get(i), node.parameters.get(i).nodeInfo.getType())) {
                throw new SemanticError(node.position.toString() + " The parameter type not match.");
            }
        }
        node.nodeInfo = new ExprNodeInfo(functionSymbolInfo.getReturnType(), false);
    }

    @Override
    public void visit(ArrayVisitExprNode node) {
        node.index.accept(this);
        if (!node.index.nodeInfo.getType().isEquivalent(PrimitiveType.INT)) {
            throw new SemanticError(node.position.toString() + " Index must be int. ");
        }
        node.array.accept(this);
        if (node.array instanceof NewArrayExprNode) {
            throw new SemanticError(node.position.toString() + " The array creating as a new value cannot be visited.");
        }
        if (!(node.array.nodeInfo.getType() instanceof ArrayType arrayType)) {
            throw new SemanticError(node.position.toString() + " Array type not match.");
        }
        node.nodeInfo = new ExprNodeInfo(arrayType.getElementType(), true);
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
        node.nodeInfo = new ExprNodeInfo(memberType, true);
    }

    @Override
    public void visit(UnaryExprNode node) {
        node.expression.accept(this);
        node.nodeInfo = new ExprNodeInfo();
        if (node.operator == UnaryExprNode.UnaryOperator.LOGIC_NOT) {
            if (!node.expression.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL)) {
                throw new SemanticError(node.position.toString() + "Type not match: the type of the expression should be bool.");
            }
            node.nodeInfo.setType(PrimitiveType.BOOL);
            node.nodeInfo.setIsLeftValue(false);
        } else {
            if (!node.expression.nodeInfo.getType().isEquivalent(PrimitiveType.INT)) {
                throw new SemanticError(node.position.toString() + "Type not match: the type of the expression should be int.");
            }
            node.nodeInfo.setType(PrimitiveType.INT);
            if (node.operator == UnaryExprNode.UnaryOperator.PRE_SELF_ADD || node.operator == UnaryExprNode.UnaryOperator.PRE_SELF_SUB) {
                if (!node.expression.nodeInfo.isLeftValue()) {
                    throw new SemanticError(node.position.toString() + "A right value should not be subject of ++/--");
                }
                node.nodeInfo.setIsLeftValue(true);
            } else {
                if (node.operator == UnaryExprNode.UnaryOperator.POST_SELF_ADD || node.operator == UnaryExprNode.UnaryOperator.POST_SELF_SUB) {
                    if (!node.expression.nodeInfo.isLeftValue()) {
                        throw new SemanticError(node.position.toString() + "A right value should not be subject of ++/--");
                    }
                }
                node.nodeInfo.setIsLeftValue(false);
            }
        }
    }

    @Override
    public void visit(NewClassExprNode node) {
        node.nodeInfo = new ExprNodeInfo(node.classType, false);
    }

    @Override
    public void visit(NewArrayExprNode node) {
        for (ExprNode length : node.lengths) {
            length.accept(this);
            if (!length.nodeInfo.getType().isEquivalent(PrimitiveType.INT)) {
                throw new SemanticError(node.position.toString() + "Type not match: the length of the array should be int.");
            }
        }
        node.nodeInfo = new ExprNodeInfo(node.arrayType, false);
    }

    @Override
    public void visit(BinaryExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (!node.left.nodeInfo.getType().isEquivalent(node.right.nodeInfo.getType()) && !(node.left.nodeInfo.getType() instanceof ArrayType || node.right.nodeInfo.getType().isEquivalent(PrimitiveType.NULL)) && !(node.right.nodeInfo.getType() instanceof ArrayType || node.left.nodeInfo.getType().isEquivalent(PrimitiveType.NULL))) {
            throw new SemanticError(node.position.toString() + "Types not match: types on sides of the binary operator is different.");
        }
        node.nodeInfo = new ExprNodeInfo();
        switch (node.operator) {
            case LOGIC_AND, LOGIC_OR: {
                if (!node.left.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL)) {
                    throw new SemanticError(node.position.toString() + "Types not match: the type should be bool");
                }
                node.nodeInfo.setType(PrimitiveType.BOOL);
                break;
            }
            case SUB, MUL, DIV, MOD, OR, AND, XOR, LEFT_SHIFT, RIGHT_SHIFT: {
                if (!node.left.nodeInfo.getType().isEquivalent(PrimitiveType.INT)) {
                    throw new SemanticError(node.position.toString() + "Types not match: the type should be int");
                }
                node.nodeInfo.setType(PrimitiveType.INT);
                break;
            }
            case G, GE, L, LE, PLUS: {
                if (!node.left.nodeInfo.getType().isEquivalent(PrimitiveType.INT) && !node.left.nodeInfo.getType().isEquivalent(ClassType.STRING)) {
                    throw new SemanticError(node.position.toString() + "Types not match: the type should be int or string");
                }
                if (node.operator.equals(BinaryExprNode.BinaryOperator.PLUS)) {
                    node.nodeInfo.setType(node.left.nodeInfo.getType());
                } else {
                    node.nodeInfo.setType(PrimitiveType.BOOL);
                }
                break;
            }
            case EQUAL, N_EQUAL: {
                node.nodeInfo.setType(PrimitiveType.BOOL);
                break;
            }
        }
    }

    @Override
    public void visit(TernaryExprNode node) {
        node.conditionExpr.accept(this);
        node.trueExpr.accept(this);
        node.falseExpr.accept(this);
        if (!node.conditionExpr.nodeInfo.getType().isEquivalent(PrimitiveType.BOOL)) {
            throw new SemanticError(node.position.toString() + "Types not match: the conditional Expr type should be bool");
        }
        if (!isAssignable(node.trueExpr.nodeInfo.getType(), node.falseExpr.nodeInfo.getType()) && !isAssignable(node.falseExpr.nodeInfo.getType(), node.trueExpr.nodeInfo.getType())) {
            throw new SemanticError(node.position.toString() + "Types not match: the lhs and rhs have different types");
        }
        node.nodeInfo = new ExprNodeInfo(node.trueExpr.nodeInfo.getType(), false);
    }

    @Override
    public void visit(AssignExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (!isAssignable(node.left.nodeInfo.getType(), node.right.nodeInfo.getType())) {
            throw new SemanticError(node.position.toString() + "Types not match: assign the wrong type to left.");
        }
        if (!node.left.nodeInfo.isLeftValue()) {
            throw new SemanticError(node.position.toString() + "Types not match: the left is not assignable");
        }
        node.nodeInfo = new ExprNodeInfo(node.left.nodeInfo.getType(), false);
    }

    private boolean isAssignable(Type lhs, Type rhs) {
        if (lhs.isEquivalent(rhs)) {
            return true;
        }
        if (lhs instanceof ArrayType || lhs instanceof ClassType) {
            return rhs.isEquivalent(PrimitiveType.NULL);
        }
        return false;
    }

    @Override
    public void visit(ThisNode node) {
        node.nodeInfo = new ExprNodeInfo(currentClassType, false);
    }

    @Override
    public void visit(IntLiteralExprNode node) {
        node.nodeInfo = new ExprNodeInfo(PrimitiveType.INT, false);
    }

    @Override
    public void visit(BoolLiteralExprNode node) {
        node.nodeInfo = new ExprNodeInfo(PrimitiveType.BOOL, false);
    }

    @Override
    public void visit(StringLiteralExprNode node) {
        node.nodeInfo = new ExprNodeInfo(ClassType.STRING, false);
    }

    @Override
    public void visit(NullLiteralExprNode node) {
        node.nodeInfo = new ExprNodeInfo(PrimitiveType.NULL, false);
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
        node.nodeInfo = new ExprNodeInfo(PrimitiveType.VOID, false);
    }
}
