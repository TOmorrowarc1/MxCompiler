package ASTNode;

import Utils.ExprNodeInfo;
import Utils.Position;

abstract public class ExprNode extends ASTNode {
    public ExprNodeInfo nodeInfo;

    public ExprNode(Position position) {
        super(position);
    }

    public ExprNode(Position position, String type, boolean isLeftValue) {
        super(position);
        this.nodeInfo = new ExprNodeInfo(type, isLeftValue);
    }
}
