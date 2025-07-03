package ASTNode;

import java.util.List;

public class VarDefStmtNode extends StmtNode {
    public String type;
    public List<DefNode> defList;

    public VarDefStmtNode(String type, List<DefNode> defList) {
        super();
        this.type = type;
        this.defList = defList;
    }

    public static class DefNode extends ASTNode {
        public final String identifier;
        public final ExprNode initValue;

        public DefNode(String name, ExprNode initValue) {
            super();
            this.identifier = name;
            this.initValue = initValue;
        }
    }
}
