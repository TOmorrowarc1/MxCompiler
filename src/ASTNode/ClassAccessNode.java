package ASTNode;

import Utils.Position;

public class ClassAccessNode extends ExprNode {
    public ExprNode className;
    public ExprNode classAccess;

    public ClassAccessNode(Position start, ExprNode className, ExprNode classAccess) {
        super(start);
        this.className = className;
        this.classAccess = classAccess;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
