package ASTNode;

public class ForStmtNode extends StmtNode {
    public VarDefStmtNode varDefStmt;
    public ExprNode condition;
    public ExprNode step;
    public StmtNode body;

    public  ForStmtNode(VarDefStmtNode varDefStmt, ExprNode condition, ExprNode step, StmtNode body) {
        super();
        this.varDefStmt = varDefStmt;
        this.condition = condition;
        this.step = step;
        this.body = body;
    }
}
