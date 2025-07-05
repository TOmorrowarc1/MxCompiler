package ASTNode;

import Utils.Position;

import java.util.List;

public class ConstructorDeclarationNode extends DeclarationNode {
    public String constructorName;
    public List<FunctionDeclarationNode.ParameterNode> parameters;
    public BlockStmtNode body;

    public ConstructorDeclarationNode(Position position, String constructorName, List<ASTNode.FunctionDeclarationNode.ParameterNode> parameters, BlockStmtNode body) {
        super(position);
        this.constructorName = constructorName;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }

}
