package ASTNode;

import Utils.Position;

public class NullLiteralExprNode extends LiteralExprNode {

    public NullLiteralExprNode(Position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
