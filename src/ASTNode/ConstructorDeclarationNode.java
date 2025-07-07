package ASTNode;

import Utils.Position;
public class ConstructorDeclarationNode extends DeclarationNode {
    public String constructorName;
    public BlockStmtNode body;

    public ConstructorDeclarationNode(Position position, String constructorName, BlockStmtNode body) {
        super(position);
        this.constructorName = constructorName;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }

}
