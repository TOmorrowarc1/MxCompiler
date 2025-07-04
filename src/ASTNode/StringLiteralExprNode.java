package ASTNode;

import Utils.Position;

public class StringLiteralExprNode extends LiteralExprNode {
    String value;

    public StringLiteralExprNode(Position position, String value) {
        super(position);
        this.value = value;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
