package ASTNode;

public class BinaryExprNode extends ExprNode {
    public enum BinaryOperator {
        LOGIC_OR, LOGIC_AND, OR, AND, EQUAL, N_EQUAL, GE, LE, G, L, LEFT_SHIFT, RIGHT_SHIFT, PLUS, SUB, MUL, DIV, MOD
    }

    ;
    public BinaryOperator operator;
    public ExprNode left;
    public ExprNode right;

    public BinaryExprNode(BinaryOperator op, ExprNode lhs, ExprNode rhs) {
        super();
        operator = op;
        left = lhs;
        right = rhs;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
