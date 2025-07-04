package ASTNode;

public class AssignExprNode extends ExprNode {
    public ExprNode left;
    public ExprNode right;

    public AssignExprNode(ExprNode lhs, ExprNode rhs) {
        super();
        this.left = lhs;
        this.right = rhs;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
