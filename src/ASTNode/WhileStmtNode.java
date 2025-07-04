package ASTNode;

import Utils.Position;

public class WhileStmtNode extends StmtNode {
    public ExprNode condition;
    public StmtNode body;

    public WhileStmtNode(Position position, ExprNode condition, StmtNode body) {
        super(position);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
