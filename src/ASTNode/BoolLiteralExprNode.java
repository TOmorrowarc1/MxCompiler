package ASTNode;

public class BoolLiteralExprNode extends LiteralExprNode{
    public boolean value;
    public BoolLiteralExprNode(boolean value) {
        this.value = value;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
