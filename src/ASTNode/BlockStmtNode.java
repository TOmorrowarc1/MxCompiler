package ASTNode;

import java.util.List;

public class BlockStmtNode extends StmtNode{
    public List<StmtNode> body;

    public BlockStmtNode(List<StmtNode> statements) {
        super();
        this.body = statements;
    }
}
