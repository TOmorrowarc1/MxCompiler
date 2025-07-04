package ASTNode;

import Utils.Position;

public class ReturnStmtNode extends StmtNode {
    public ExprNode expression;

    //Be careful of the empty return.
    public ReturnStmtNode(Position position, ExprNode expression) {
        super(position);
        this.expression = expression;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
