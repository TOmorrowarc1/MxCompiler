package ASTNode;

import Utils.Position;

public class EmptyStmtNode extends StmtNode {
    public EmptyStmtNode(Position position) {
        super(position);
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
