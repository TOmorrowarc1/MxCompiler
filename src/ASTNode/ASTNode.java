package ASTNode;

abstract public class ASTNode {
    abstract public void accept(ASTNodeVisitor visitor);
};
