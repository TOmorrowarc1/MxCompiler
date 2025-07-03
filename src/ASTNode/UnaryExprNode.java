package ASTNode;

public class UnaryExprNode extends ExprNode {
    public enum UnaryOperator {
        SELF_ADD, SELF_SUB, MINUS, LOGIC_NOT, NOT
    }

    ;
    public UnaryOperator operator;
    public ExprNode expression;

    public UnaryExprNode(UnaryOperator op, ExprNode expr) {
        super();
        this.operator = op;
        this.expression = expr;
    }
}
