package ASTNode;

public class JmpStmtNode extends StmtNode {
    public enum JumpType {
        BREAK, CONTINUE
    }

    ;
    public JumpType jumpType;

    public JmpStmtNode(JumpType jumpType) {
        super();
        this.jumpType = jumpType;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
