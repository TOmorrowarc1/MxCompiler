package ASTNode;

public class VarExprNode extends ExprNode {
    public String identifier;

    public VarExprNode(String identifier) {
        this.identifier = identifier;
    }
}
