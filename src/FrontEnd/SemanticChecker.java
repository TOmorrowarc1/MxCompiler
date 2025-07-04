package FrontEnd;

import ASTNode.*;
import Utils.*;

public class SemanticChecker implements ASTNodeVisitor {
    private Scope scope;

    public SemanticChecker(Scope scope) {
        this.scope = scope;
    }

    @Override
    public void visit(BlockStmtNode node) {
        this.scope = new Scope(scope);
        for (StmtNode statement : node.body){
            visit(statement);
        }
    }

    @Override
    public void visit(IfStmtNode node) {

    }

    @Override
    public void visit(WhileStmtNode node) {

    }

    @Override
    public void visit(ForStmtNode node) {

    }

    @Override
    public void visit(JmpStmtNode node) {

    }

    @Override
    public void visit(ReturnStmtNode node) {

    }

    @Override
    public void visit(ASTNode.VarDefStmtNode node) {

    }

    @Override
    public void visit(ASTNode.ExprStmtNode node) {

    }

    @Override
    public void visit(ASTNode.EmptyStmtNode node) {

    }

    @Override
    public void visit(ASTNode.AssignExprNode node) {

    }

    @Override
    public void visit(ASTNode.BinaryExprNode node) {

    }

    @Override
    public void visit(ASTNode.UnaryExprNode node) {

    }

    @Override
    public void visit(ASTNode.IntLiteralExprNode node) {

    }

    @Override
    public void visit(ASTNode.BoolLiteralExprNode node) {

    }

    @Override
    public void visit(ASTNode.VarExprNode node) {

    }

    @Override
    public void visit(ASTNode.EmptyExprNode node) {

    }
}
