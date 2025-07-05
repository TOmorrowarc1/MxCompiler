package ASTNode;

public interface ASTNodeVisitor {
    void visit(ProgramNode node);

    void visit(ClassDeclarationNode node);

    void visit(ConstructorDeclarationNode node);

    void visit(FunctionDeclarationNode node);

    void visit(BlockStmtNode node);

    void visit(IfStmtNode node);

    void visit(WhileStmtNode node);

    void visit(ForStmtNode node);

    void visit(JmpStmtNode node);

    void visit(ReturnStmtNode node);

    void visit(VarDefStmtNode node);

    void visit(ExprStmtNode node);

    void visit(EmptyStmtNode node);

    void visit(AssignExprNode node);

    void visit(BinaryExprNode node);

    void visit(FunctionCallExprNode node);

    void visit(ClassAccessNode node);

    void visit(UnaryExprNode node);

    void visit(IntLiteralExprNode node);

    void visit(BoolLiteralExprNode node);

    void visit(StringLiteralExprNode node);

    void visit(VarExprNode node);

    void visit(EmptyExprNode node);
}
