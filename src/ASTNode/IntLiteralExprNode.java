package ASTNode;

public class IntLiteralExprNode extends LiteralExprNode {
    int value;

    public IntLiteralExprNode(int value) {
        this.value = value;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
