package ASTNode;

import Utils.Position;

public class EmptyExprNode extends ExprNode {
    public EmptyExprNode(Position position) {
        super(position);
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
