package ASTNode;

import Utils.Position;

public class ClassAccessNode extends ExprNode {
    public String className;
    public ExprNode classAccess;

    public ClassAccessNode(Position start, String className, ExprNode classAccess) {
        super(start);
        this.className = className;
        this.classAccess = classAccess;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
