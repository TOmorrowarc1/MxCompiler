package ASTNode;

import Utils.Position;

public class SubExprNode extends ExprNode {
    public ExprNode exprNode;

    public SubExprNode(Position pos, ExprNode exprNode) {
        super(pos);
        this.exprNode = exprNode;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
