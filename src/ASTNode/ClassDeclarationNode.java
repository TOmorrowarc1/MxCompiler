package ASTNode;

import Utils.Position;

import java.util.List;

public class ClassDeclarationNode extends DeclarationNode {
    public String className;
    public List<VarDefStmtNode> varDefs;
    public List<ConstructorDeclarationNode> constructors;
    public List<FunctionDeclarationNode> functionDefs;


    public ClassDeclarationNode(Position start, String className, List<VarDefStmtNode> varDefs, List<ConstructorDeclarationNode> constructors, List<FunctionDeclarationNode> functionDefs) {
        super(start);
        this.className = className;
        this.varDefs = varDefs;
        this.constructors = constructors;
        this.functionDefs = functionDefs;

    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
