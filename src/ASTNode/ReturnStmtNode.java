package ASTNode;

public class ReturnStmtNode extends StmtNode {
    public ExprNode expression;
    //Be careful of the empty return.
    public ReturnStmtNode(ExprNode expression) {
        super();
        this.expression = expression;
    }
}
