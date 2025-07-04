package ASTNode;

import Utils.Position;

public class VarExprNode extends ExprNode {
    public String identifier;

    public VarExprNode(Position position, String identifier) {
        super(position);
        this.identifier = identifier;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
