package ASTNode;

import Utils.Position;
import Utils.Type;

import java.util.List;

public class NewArrayExprNode extends ExprNode {
    public Type arrayType;
    public List<ExprNode> dimensions;

    public NewArrayExprNode(Position pos, Type arrayType, List<ExprNode> dimensions) {
        super(pos);
        this.arrayType = arrayType;
        this.dimensions = dimensions;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
