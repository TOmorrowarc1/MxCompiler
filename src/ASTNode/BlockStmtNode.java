package ASTNode;

import Utils.Position;

import java.util.List;

public class BlockStmtNode extends StmtNode {
    public List<StmtNode> body;

    public BlockStmtNode(Position position, List<StmtNode> statements) {
        super(position);
        this.body = statements;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
