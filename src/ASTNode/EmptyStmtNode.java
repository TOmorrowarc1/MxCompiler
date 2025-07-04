package ASTNode;

public class EmptyStmtNode extends StmtNode {
    public EmptyStmtNode() {
        super();
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
