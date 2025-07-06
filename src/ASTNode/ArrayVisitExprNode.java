package ASTNode;

import Utils.Position;

public class ArrayVisitExprNode extends ExprNode{
    public ExprNode array;
    public ExprNode index;

    public ArrayVisitExprNode(Position position, ExprNode array, ExprNode index) {
        super(position);
        this.array = array;
        this.index = index;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
