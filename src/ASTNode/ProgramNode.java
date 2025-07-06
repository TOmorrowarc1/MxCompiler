package ASTNode;

import Utils.Position;

import java.util.List;

public class ProgramNode extends ASTNode {
    public List<VarDefStmtNode> varDeclarations;
    public List<FunctionDeclarationNode> functions;
    public List<ClassDeclarationNode> classDeclarations;

    public ProgramNode(Position position, List<VarDefStmtNode> varDeclarations, List<FunctionDeclarationNode> functions, List<ClassDeclarationNode> classDeclarations) {
        super(position);
        this.varDeclarations = varDeclarations;
        this.functions = functions;
        this.classDeclarations = classDeclarations;
    }

    @Override
    public void accept(ASTNodeVisitor visitor) {
        visitor.visit(this);
    }
}
