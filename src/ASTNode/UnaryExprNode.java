package ASTNode;

import Utils.Position;

public class UnaryExprNode extends ExprNode {
    public enum UnaryOperator {
        POST_SELF_ADD, POST_SELF_SUB, PRE_SELF_ADD, PRE_SELF_SUB, MINUS, LOGIC_NOT, NOT
    }

    public UnaryOperator operator;
    public ExprNode expression;

    public UnaryExprNode(Position position, UnaryOperator op, ExprNode expr) {
        super(position);
        this.operator = op;
        this.expression = expr;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
