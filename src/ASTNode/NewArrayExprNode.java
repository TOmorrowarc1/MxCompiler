package ASTNode;

import Utils.Position;
import Utils.Type;

import java.util.List;

public class NewArrayExprNode extends ExprNode {
    public Type arrayType;
    public List<ExprNode> lengths;

    public NewArrayExprNode(Position pos, Type arrayType, List<ExprNode> lengths) {
        super(pos);
        this.arrayType = arrayType;
        this.lengths = lengths;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
