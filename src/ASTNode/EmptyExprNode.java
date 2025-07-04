package ASTNode;

public class EmptyExprNode extends ExprNode {
    public EmptyExprNode() {
        super();
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
