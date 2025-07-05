package ASTNode;

import Utils.Position;

public class ClassAccessNode extends ExprNode {
    public ExprNode object;
    public String classAccess;

    public ClassAccessNode(Position start, ExprNode object, String classAccess) {
        super(start);
        this.object = object;
        this.classAccess = classAccess;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
