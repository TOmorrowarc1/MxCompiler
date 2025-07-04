package ASTNode;

import Utils.Position;

public class AssignExprNode extends ExprNode {
    public ExprNode left;
    public ExprNode right;

    public AssignExprNode(Position position, ExprNode lhs, ExprNode rhs) {
        super(position);
        this.left = lhs;
        this.right = rhs;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
