package FrontEnd;

import ASTNode.*;
import Utils.FunctionSymbolInfo;
import Utils.Scope;
import Utils.VariableSymbolInfo;

import java.util.ArrayList;
import java.util.List;

public class SymbolCollector implements ASTNodeVisitor {
    private final Scope globalScope;

    public SymbolCollector(Scope globalScope) {
        this.globalScope = globalScope;
    }

    @Override
    public void visit(EmptyExprNode node) {
    }

    @Override
    public void visit(VarExprNode node) {
    }

    @Override
    public void visit(StringLiteralExprNode node) {
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
    public void visit(FunctionCallExprNode node) {
    }

    @Override
    public void visit(BinaryExprNode node) {
    }

    @Override
    public void visit(AssignExprNode node) {
    }

    @Override
    public void visit(EmptyStmtNode node) {
    }

    @Override
    public void visit(ExprStmtNode node) {
    }

    @Override
    public void visit(VarDefStmtNode node) {
        VariableSymbolInfo symbolInfo = new VariableSymbolInfo(node.type);
        for (VarDefStmtNode.DefNode defNode : node.defList) {
            globalScope.declareSymbol(defNode.identifier, symbolInfo);
        }
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
        List<String> parameterType = new ArrayList<>();
        for (FunctionDeclarationNode.ParameterNode param : node.parameters) {
            parameterType.add(param.parameterType);
        }
        globalScope.declareSymbol(node.name, new FunctionSymbolInfo(node.returnType, parameterType));
    }

    @Override
    public void visit(ProgramNode node) {
        for (VarDefStmtNode varDefNode : node.varDeclarations) {
            varDefNode.accept(this);
        }
        for (FunctionDeclarationNode funcDeclarationNode : node.functions) {
            funcDeclarationNode.accept(this);
        }
    }
}
