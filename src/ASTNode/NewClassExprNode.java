package ASTNode;

import Utils.Position;
import Utils.Type;

public class NewClassExprNode extends ExprNode {
    public Type classType;

    public NewClassExprNode(Position pos, Type classType) {
        super(pos);
        this.classType = classType;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
