package ASTNode;

public class WhileStmtNode extends StmtNode {
    public ExprNode condition;
    public StmtNode body;

    public WhileStmtNode(ExprNode condition, StmtNode body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
