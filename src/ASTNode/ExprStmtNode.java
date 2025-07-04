package ASTNode;

import Utils.Position;

public class ExprStmtNode extends StmtNode {
    public ExprNode expr;

    public ExprStmtNode(Position position, ExprNode expr) {
        super(position);
        this.expr = expr;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
