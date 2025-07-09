package FrontEnd;

import ASTNode.*;
import Utils.*;

import java.util.ArrayList;
import java.util.List;

public class SymbolCollector implements ASTNodeVisitor {
    private final Scope globalScope;
    private Scope currentScope;
    private String currentClass = null;

    public SymbolCollector(Scope globalScope) {
        this.globalScope = globalScope;
        this.currentScope = globalScope;
    }

    @Override
    public void visit(EmptyExprNode node) {
    }

    @Override
    public void visit(VarExprNode node) {
    }

    @Override
    public void visit(ThisNode node) {
    }

    @Override
    public void visit(StringLiteralExprNode node) {
    }

    @Override
    public void visit(NullLiteralExprNode node) {
    }

    @Override
    public void visit(BoolLiteralExprNode node) {
    }

    @Override
    public void visit(IntLiteralExprNode node) {
    }

    @Override
    public void visit(UnaryExprNode node) {
    }

    @Override
    public void visit(NewArrayExprNode node) {
    }

    @Override
    public void visit(NewClassExprNode node) {
    }

    @Override
    public void visit(FunctionCallExprNode node) {
    }

    @Override
    public void visit(ArrayVisitExprNode node) {
    }

    @Override
    public void visit(ClassAccessNode node) {
    }

    @Override
    public void visit(BinaryExprNode node) {
    }

    @Override
    public void visit(AssignExprNode node) {
    }

    @Override
    public void visit(TernaryExprNode node) {
    }

    @Override
    public void visit(EmptyStmtNode node) {
    }

    @Override
    public void visit(ExprStmtNode node) {
    }

    @Override
    public void visit(VarDefStmtNode node) {
        VariableSymbolInfo symbolInfo = new VariableSymbolInfo(node.varType);
        for (VarDefStmtNode.DefNode defNode : node.defList) {
            currentScope.declareSymbol(defNode.identifier, symbolInfo);
        }
    }

    @Override
    public void visit(VarDefStmtNode.DefNode node) {
    }

    @Override
    public void visit(ReturnStmtNode node) {
    }

    @Override
    public void visit(JmpStmtNode node) {
    }

    @Override
    public void visit(ForStmtNode node) {
    }

    @Override
    public void visit(WhileStmtNode node) {
    }

    @Override
    public void visit(IfStmtNode node) {
    }

    @Override
    public void visit(BlockStmtNode node) {
    }

    @Override
    public void visit(FunctionDeclarationNode node) {
        List<Type> parameterType = new ArrayList<>();
        for (FunctionDeclarationNode.ParameterNode param : node.parameters) {
            parameterType.add(param.parameterType);
        }
        currentScope.declareSymbol(node.name, new FunctionSymbolInfo(node.returnType, parameterType));
    }

    @Override
    public void visit(ProgramNode node) {
        for (FunctionDeclarationNode funcDeclarationNode : node.functions) {
            funcDeclarationNode.accept(this);
        }
        for (ClassDeclarationNode classDeclarationNode : node.classDeclarations) {
            classDeclarationNode.accept(this);
        }
        if (globalScope.getSymbol("main").isEmpty()) {
            throw new SemanticError("No main function found.");
        }
        FunctionSymbolInfo mainFunc = (FunctionSymbolInfo) globalScope.getSymbol("main").get();
        if (!mainFunc.getReturnType().isEquivalent(PrimitiveType.INT)) {
            throw new SemanticError("The return type of main() must be int.");
        }
        if (!mainFunc.getParametersType().isEmpty()) {
            throw new SemanticError("The parameters of main() must be empty.");
        }
    }

    @Override
    public void visit(ConstructorDeclarationNode node) {
        if (!node.constructorName.equals(currentClass)) {
            throw new SemanticError(node.position.toString() + "The name of constructure should be the name of the class.");
        }
        ClassType classType = new ClassType(node.constructorName);
        List<Type> parameterType = new ArrayList<>();
        currentScope.declareSymbol(node.constructorName, new FunctionSymbolInfo(classType, parameterType));
    }

    @Override
    public void visit(ClassDeclarationNode node) {
        Scope classScope = new Scope(globalScope);
        currentScope = classScope;
        currentClass = node.className;
        for (VarDefStmtNode varDefNode : node.varDefs) {
            varDefNode.accept(this);
        }
        for (ConstructorDeclarationNode constructorDeclarationNode : node.constructors) {
            constructorDeclarationNode.accept(this);
        }
        for (FunctionDeclarationNode functionDeclarationNode : node.functionDefs) {
            functionDeclarationNode.accept(this);
        }
        ClassType classType = new ClassType(node.className, classScope);
        currentScope = globalScope;
        currentClass = null;
        currentScope.declareType(node.className, classType);
    }
}
