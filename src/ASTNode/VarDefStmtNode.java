package ASTNode;

import Utils.Position;
import Utils.Type;

import java.util.List;

public class VarDefStmtNode extends StmtNode {
    public Type varType;
    public List<DefNode> defList;

    public VarDefStmtNode(Position position, Type varType, List<DefNode> defList) {
        super(position);
        this.varType = varType;
        this.defList = defList;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }

    public static class DefNode extends ASTNode {
        public final String identifier;
        public final ExprNode initValue;

        public DefNode(Position position, String name, ExprNode initValue) {
            super(position);
            this.identifier = name;
            this.initValue = initValue;
        }

        @Override
        public void accept(ASTNodeVisitor visitor) {
        }
    }
}
