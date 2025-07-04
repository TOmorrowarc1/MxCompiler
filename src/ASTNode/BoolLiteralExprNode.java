package ASTNode;

import Utils.Position;

public class BoolLiteralExprNode extends LiteralExprNode{
    public boolean value;

    public BoolLiteralExprNode(Position position, boolean value) {
        super(position);
        this.value = value;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
