package ASTNode;

public class AssignExprNode extends ExprNode {
    public ExprNode left;
    public ExprNode right;

    public AssignExprNode(ExprNode lhs, ExprNode rhs) {
        super();
        this.left = lhs;
        this.right = rhs;
    }
}
