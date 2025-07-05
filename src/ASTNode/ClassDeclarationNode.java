package ASTNode;

import Utils.Position;

import java.util.List;

public class ClassDeclarationNode extends DeclarationNode {
    public String className;
    public List<FunctionDeclarationNode> functionDeclarations;
    public List<VarDefStmtNode> varDefs;

    public ClassDeclarationNode(Position start, String className, List<FunctionDeclarationNode> functionDeclarations, List<VarDefStmtNode> varDefs) {
        super(start);
        this.className = className;
        this.functionDeclarations = functionDeclarations;
        this.varDefs = varDefs;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
