package ASTNode;

import Utils.Position;

public class NewExprNode extends ExprNode {
    public ExprNode newItem;

    public NewExprNode(Position pos, ExprNode newItem) {
        super(pos);
        this.newItem = newItem;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
