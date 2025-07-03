package ASTNode;

public class IfStmtNode extends StmtNode {
    public ExprNode condition;
    public StmtNode thenStmt;
    public StmtNode elseStmt;

    public IfStmtNode(ExprNode condition, StmtNode thenStmt, StmtNode elseStmt) {
        super();
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
    }
}
