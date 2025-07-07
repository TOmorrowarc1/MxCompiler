package ASTNode;

import Utils.ExprNodeInfo;
import Utils.Position;
import Utils.Type;

abstract public class ExprNode extends ASTNode {
    public ExprNodeInfo nodeInfo;

    public ExprNode(Position position) {
        super(position);
    }

    public ExprNode(Position position, Type type, boolean isLeftValue) {
        super(position);
        this.nodeInfo = new ExprNodeInfo(type, isLeftValue);
    }
}
