package ASTNode;

public class ExprStmtNode extends StmtNode {
    public ExprNode expr;
    public ExprStmtNode(ExprNode expr) {
        super();
        this.expr = expr;
    }
}
