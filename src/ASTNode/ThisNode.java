package ASTNode;

import Utils.Position;

public class ThisNode extends ExprNode {

    public ThisNode(Position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
