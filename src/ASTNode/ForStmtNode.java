package ASTNode;

import Utils.Position;

public class ForStmtNode extends StmtNode {
    public StmtNode varStmt;
    public ExprNode condition;
    public ExprNode step;
    public StmtNode body;

    public  ForStmtNode(Position position, StmtNode varStmt, ExprNode condition, ExprNode step, StmtNode body) {
        super(position);
        this.varStmt = varStmt;
        this.condition = condition;
        this.step = step;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
