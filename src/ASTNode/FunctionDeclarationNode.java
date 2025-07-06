package ASTNode;

import Utils.Type;
import Utils.Position;
import java.util.List;

public class FunctionDeclarationNode extends DeclarationNode {
    public Type returnType;
    public String name;
    public List<ParameterNode> parameters;
    public BlockStmtNode body;

    public FunctionDeclarationNode(Position position, Type returnType, String name, List<ParameterNode> parameters, BlockStmtNode body) {
        super(position);
        this.returnType = returnType;
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }

    public static class ParameterNode extends ASTNode {
        public final Type parameterType;
        public final String identifier;

        public ParameterNode(Position position, Type parameterType, String identifier) {
            super(position);
            this.parameterType = parameterType;
            this.identifier = identifier;
        }

        @Override
        public void accept(ASTNodeVisitor visitor) {
        }
    }
}
