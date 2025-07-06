package ASTNode;

import Utils.Position;

public class TernaryExprNode extends ExprNode {
    public ExprNode conditionExpr;
    public ExprNode trueExpr;
    public ExprNode falseExpr;

    public TernaryExprNode(Position pos, ExprNode conditionExpr, ExprNode trueExpr, ExprNode falseExpr) {
        super(pos);
        this.conditionExpr = conditionExpr;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
