package ASTNode;

import Utils.Position;

public class JmpStmtNode extends StmtNode {
    public enum JumpType {
        BREAK, CONTINUE
    }

    ;
    public JumpType jumpType;

    public JmpStmtNode(Position position, JumpType jumpType) {
        super(position);
        this.jumpType = jumpType;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
