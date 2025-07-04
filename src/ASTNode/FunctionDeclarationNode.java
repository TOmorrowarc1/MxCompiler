package ASTNode;

import Utils.Position;

import java.util.List;

public class FunctionDeclarationNode extends DeclarationNode {
    String returnType;
    String name;
    List<ParameterNode> parameters;

    public FunctionDeclarationNode(Position position, String returnType, String name, List<ParameterNode> parameters) {
        super(position);
        this.returnType = returnType;
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }

    public static class ParameterNode extends ASTNode {
        public final String parameterType;
        public final String identifier;

        public ParameterNode(Position position, String parameterType, String identifier) {
            super(position);
            this.parameterType = parameterType;
            this.identifier = identifier;
        }

        @Override
        public void accept(ASTNodeVisitor visitor) {
        }
    }
}
