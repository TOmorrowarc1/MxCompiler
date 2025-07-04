package ASTNode;

import Utils.ExprNodeInfo;

abstract public class ExprNode extends ASTNode {
    public ExprNodeInfo nodeInfo;

    public ExprNode() {
        super();
    };

    public ExprNode(String type, boolean isLeftValue) {
        super();
        this.nodeInfo = new ExprNodeInfo(type, isLeftValue);
    }
}
