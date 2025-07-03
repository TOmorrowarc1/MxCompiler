package ASTNode;

abstract public class ExprNode extends ASTNode {
    public String type;
    public boolean isLeftValue;

    public ExprNode(){};
    public ExprNode(String type, boolean isLeftValue) {
        this.type = type;
        this.isLeftValue = isLeftValue;
    }
}
