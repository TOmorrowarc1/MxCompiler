package ASTNode;

import Utils.Position;

import java.util.List;

public class ProgramNode extends ASTNode {
    public List<FunctionDeclarationNode> functions;
    public List<VarDefStmtNode> varDeclarations;
    public List<ClassDeclarationNode> classDeclarations;

    public ProgramNode(Position position, List<FunctionDeclarationNode> functions, List<VarDefStmtNode> varDeclarations, List<ClassDeclarationNode> classDeclarations) {
        super(position);
        this.functions = functions;
        this.varDeclarations = varDeclarations;
        this.classDeclarations = classDeclarations;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
