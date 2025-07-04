package ASTNode;

import Utils.Position;

abstract public class ASTNode {
    public Position position;

    public ASTNode(Position position) {
        this.position = position;
    }

    abstract public void accept(ASTNodeVisitor visitor);
};
