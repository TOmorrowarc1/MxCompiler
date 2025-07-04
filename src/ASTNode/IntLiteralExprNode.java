package ASTNode;

import Utils.Position;

public class IntLiteralExprNode extends LiteralExprNode {
    int value;

    public IntLiteralExprNode(Position position, int value) {
        super(position);
        this.value = value;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
