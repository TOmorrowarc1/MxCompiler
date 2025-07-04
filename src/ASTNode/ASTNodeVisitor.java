package ASTNode;

public interface ASTNodeVisitor {
    void visit(BlockStmtNode node);

    void visit(IfStmtNode node);

    void visit(WhileStmtNode node);

    void visit(ForStmtNode node);

    void visit(JmpStmtNode node);

    void visit(ReturnStmtNode node);

    void visit(VarDefStmtNode node);

    void visit(VarDefStmtNode.DefNode node);

    void visit(ExprStmtNode node);

    void visit(EmptyStmtNode node);

    void visit(AssignExprNode node);

    void visit(BinaryExprNode node);

    void visit(UnaryExprNode node);

    void visit(IntLiteralExprNode node);

    void visit(BoolLiteralExprNode node);

    void visit(VarExprNode node);

    void visit(EmptyExprNode node);

}
