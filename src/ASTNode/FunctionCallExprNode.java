package ASTNode;

import Utils.Position;

import java.util.List;

public class FunctionCallExprNode extends ExprNode {
    public ExprNode callee;
    public List<ExprNode> parameters;

    public FunctionCallExprNode(Position position, ExprNode callee, List<ExprNode> parameters) {
        super(position);
        this.callee = callee;
        this.parameters = parameters;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
