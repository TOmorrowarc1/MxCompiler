package ASTNode;

public class ReturnStmtNode extends StmtNode {
    public ExprNode expression;

    public ReturnStmtNode(ExprNode expression) {
        super();
        this.expression = expression;
    }
}
