package ASTNode;

import Utils.Position;

public class ForStmtNode extends StmtNode {
    public VarDefStmtNode varDefStmt;
    public ExprNode condition;
    public ExprNode step;
    public StmtNode body;

    public  ForStmtNode(Position position, VarDefStmtNode varDefStmt, ExprNode condition, ExprNode step, StmtNode body) {
        super(position);
        this.varDefStmt = varDefStmt;
        this.condition = condition;
        this.step = step;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
