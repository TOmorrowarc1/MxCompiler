package ASTNode;

import Utils.Position;

import java.util.List;

public class FunctionCallExprNode extends ExprNode {
    String name;
    List<ExprNode> parameters;

    public FunctionCallExprNode(Position position, String name, List<ExprNode> parameters) {
        super(position);
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
