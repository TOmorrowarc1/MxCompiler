package FrontEnd;

import ASTNode.*;
import Utils.Position;
import parser.YxBaseVisitor;
import parser.YxParser;

import java.util.ArrayList;
import java.util.List;


public class ASTBuilder extends YxBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(YxParser.ProgramContext ctx) {
        List<VarDefStmtNode> defs = new ArrayList<>();
        List<FunctionDeclarationNode> functions = new ArrayList<>();
        for (YxParser.VarDeclarationContext varDeclCtx : ctx.varDeclaration()) {
            defs.add((VarDefStmtNode) visit(varDeclCtx));
        }
        for (YxParser.FuncDeclarationContext funcDeclCtx : ctx.funcDeclaration()) {
            functions.add((FunctionDeclarationNode) visit(funcDeclCtx));
        }
        return new ProgramNode(new Position(ctx), functions, defs);
    }

    @Override
    public ASTNode visitVarDeclaration(YxParser.VarDeclarationContext ctx) {
        List<VarDefStmtNode.DefNode> defNodes = new ArrayList<>();
        for (YxParser.VarDefContext defContext : ctx.varDef()) {
            defNodes.add((ASTNode.VarDefStmtNode.DefNode) visit(defContext));
        }
        return new VarDefStmtNode(new Position(ctx), ctx.type().getText(), defNodes);
    }

    @Override
    public ASTNode visitVarDef(YxParser.VarDefContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.expr());
        return new VarDefStmtNode.DefNode(new Position(ctx), ctx.Identifier().getText(), expr);
    }

    @Override
    public ASTNode visitFuncDeclaration(YxParser.FuncDeclarationContext ctx) {
        List<ASTNode.FunctionDeclarationNode.ParameterNode> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (YxParser.ParameterContext paramCtx : ctx.parameterList().parameter()) {
                parameters.add((FunctionDeclarationNode.ParameterNode) visit(paramCtx));
            }
        }
        String returnType = ctx.type().getText();
        String name = ctx.Identifier().getText();
        BlockStmtNode body = (BlockStmtNode) visit(ctx.block());
        return new FunctionDeclarationNode(new Position(ctx), returnType, name, parameters, body);
    }

    @Override
    public ASTNode visitParameterList(YxParser.ParameterListContext ctx) {
        //It should not be used.
        return super.visitParameterList(ctx);
    }

    @Override
    public ASTNode visitParameter(YxParser.ParameterContext ctx) {
        return new ASTNode.FunctionDeclarationNode.ParameterNode(new Position(ctx), ctx.type().getText(), ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitFunctionCall(YxParser.FunctionCallContext ctx) {
        String name = ctx.Identifier().getText();
        List<ExprNode> parameters = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (YxParser.ExprContext paramCtx : ctx.argumentList().expr()) {
                parameters.add((ExprNode) visit(paramCtx));
            }
        }
        return new FunctionCallExprNode(new Position(ctx), name, parameters);
    }

    @Override
    public ASTNode visitArgumentList(YxParser.ArgumentListContext ctx) {
        //Should not enter.
        return super.visitArgumentList(ctx);
    }

    @Override
    public ASTNode visitClassDeclaration(YxParser.ClassDeclarationContext ctx) {
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public ASTNode visitClassMember(YxParser.ClassMemberContext ctx) {
        return super.visitClassMember(ctx);
    }

    @Override
    public ASTNode visitConstructorDeclaration(YxParser.ConstructorDeclarationContext ctx) {
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public ASTNode visitBlock(YxParser.BlockContext ctx) {
        List<StmtNode> stmts = new ArrayList<StmtNode>();
        for (YxParser.StatementContext statementContext : ctx.statement()) {
            stmts.add((StmtNode) visit(statementContext));
        }
        return new BlockStmtNode(new Position(ctx), stmts);
    }

    @Override
    public ASTNode visitBlockstmt(YxParser.BlockstmtContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public ASTNode visitIfstmt(YxParser.IfstmtContext ctx) {
        ExprNode condition = (ExprNode) visit(ctx.expr());
        StmtNode thenStmt = (StmtNode) visit(ctx.trueStmt);
        StmtNode elseStmt = new EmptyStmtNode(new Position(ctx));
        if (ctx.falseStmt != null) {
            elseStmt = (StmtNode) visit(ctx.falseStmt);
        }
        return new IfStmtNode(new Position(ctx), condition, thenStmt, elseStmt);
    }

    @Override
    public ASTNode visitWhilestmt(YxParser.WhilestmtContext ctx) {
        ExprNode condition = (ExprNode) visit(ctx.expr());
        StmtNode body = (StmtNode) visit(ctx.statement());
        return new WhileStmtNode(new Position(ctx), condition, body);
    }

    @Override
    public ASTNode visitForstmt(YxParser.ForstmtContext ctx) {
        StmtNode init = new EmptyStmtNode(new Position(ctx));
        ExprNode condition = new EmptyExprNode(new Position(ctx));
        ExprNode step = new EmptyExprNode(new Position(ctx));
        StmtNode body = (StmtNode) visit(ctx.bodyStatement);
        if (ctx.initializationStatement != null) {
            init = (StmtNode) visit(ctx.initializationStatement);
        }
        if (ctx.forConditionExpression != null) {
            condition = (ExprNode) visit(ctx.forConditionExpression);
        }
        if (ctx.stepExpression != null) {
            step = (ExprNode) visit(ctx.stepExpression);
        }
        return new ForStmtNode(new Position(ctx), (VarDefStmtNode) init, condition, step, body);
    }

    @Override
    public ASTNode visitReturnstmt(YxParser.ReturnstmtContext ctx) {
        ExprNode expr = null;
        if (ctx.expr() != null) {
            expr = (ExprNode) visit(ctx.expr());
        }
        return new ReturnStmtNode(new Position(ctx), expr);
    }

    @Override
    public ASTNode visitJmpstmt(YxParser.JmpstmtContext ctx) {
        ASTNode.JmpStmtNode.JumpType jmpType = null;
        if (ctx.getText().equals("break")) {
            jmpType = JmpStmtNode.JumpType.BREAK;
        } else if (ctx.getText().equals("continue")) {
            jmpType = JmpStmtNode.JumpType.CONTINUE;
        }
        return new JmpStmtNode(new Position(ctx), jmpType);
    }

    @Override
    public ASTNode visitVarDefstmt(YxParser.VarDefstmtContext ctx) {
        return visit(ctx.varDeclaration());
    }

    @Override
    public ASTNode visitExpressionstmt(YxParser.ExpressionstmtContext ctx) {
        return new ExprStmtNode(new Position(ctx), (ExprNode) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitEmptystmt(YxParser.EmptystmtContext ctx) {
        return new EmptyStmtNode(new Position(ctx));
    }

    @Override
    public ASTNode visitType(YxParser.TypeContext ctx) {
        //The function should not be executed.
        return super.visitType(ctx);
    }

    @Override
    public ASTNode visitExpr(YxParser.ExprContext ctx) {
        return visit(ctx.assignmentExpr());
    }

    @Override
    public ASTNode visitAssignOrExpr(YxParser.AssignOrExprContext ctx) {
        return visit(ctx.logicOrExpr());
    }

    @Override
    public ASTNode visitAssignExpr(YxParser.AssignExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.unaryExpr());
        ExprNode rhs = (ExprNode) visit(ctx.assignmentExpr());
        return new AssignExprNode(new Position(ctx), lhs, rhs);
    }

    @Override
    public ASTNode visitLogicOrAndExpr(YxParser.LogicOrAndExprContext ctx) {
        return visit(ctx.logicAndExpr());
    }

    @Override
    public ASTNode visitLogicOrBinaryExpr(YxParser.LogicOrBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        return new BinaryExprNode(new Position(ctx), BinaryExprNode.BinaryOperator.LOGIC_OR, lhs, rhs);
    }

    @Override
    public ASTNode visitLogicAndbitExpr(YxParser.LogicAndbitExprContext ctx) {
        return visit(ctx.bitOrExpr());
    }

    @Override
    public ASTNode visitLogicAndBinaryExpr(YxParser.LogicAndBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        return new BinaryExprNode(new Position(ctx), BinaryExprNode.BinaryOperator.LOGIC_AND, lhs, rhs);
    }

    @Override
    public ASTNode visitBitOrAndExpr(YxParser.BitOrAndExprContext ctx) {
        return visit(ctx.bitAndExpr());
    }

    @Override
    public ASTNode visitBitOrBinaryExpr(YxParser.BitOrBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        return new BinaryExprNode(new Position(ctx), BinaryExprNode.BinaryOperator.OR, lhs, rhs);
    }

    @Override
    public ASTNode visitBitAndEqualExpr(YxParser.BitAndEqualExprContext ctx) {
        return visit(ctx.equalExpr());
    }

    @Override
    public ASTNode visitBitAndBinaryExpr(YxParser.BitAndBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        return new BinaryExprNode(new Position(ctx), BinaryExprNode.BinaryOperator.AND, lhs, rhs);
    }

    @Override
    public ASTNode visitEqualCompareExpr(YxParser.EqualCompareExprContext ctx) {
        return visit(ctx.compareExpr());
    }

    @Override
    public ASTNode visitEqualBinaryExpr(YxParser.EqualBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator op = null;
        if (ctx.op.getText().equals("==")) {
            op = BinaryExprNode.BinaryOperator.EQUAL;
        } else if (ctx.op.getText().equals("!=")) {
            op = BinaryExprNode.BinaryOperator.N_EQUAL;
        }
        return new BinaryExprNode(new Position(ctx), op, lhs, rhs);
    }

    @Override
    public ASTNode visitCompareShiftExpr(YxParser.CompareShiftExprContext ctx) {
        return visit(ctx.shiftExpr());
    }

    @Override
    public ASTNode visitCompareBinaryExpr(YxParser.CompareBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator op = null;
        if (ctx.op.getText().equals(">")) {
            op = BinaryExprNode.BinaryOperator.G;
        } else if (ctx.op.getText().equals(">=")) {
            op = BinaryExprNode.BinaryOperator.GE;
        } else if (ctx.op.getText().equals("<=")) {
            op = BinaryExprNode.BinaryOperator.LE;
        } else if (ctx.op.getText().equals("<")) {
            op = BinaryExprNode.BinaryOperator.L;
        }
        return new BinaryExprNode(new Position(ctx), op, lhs, rhs);
    }

    @Override
    public ASTNode visitShiftAddExpr(YxParser.ShiftAddExprContext ctx) {
        return visit(ctx.addExpr());
    }

    @Override
    public ASTNode visitShiftBinaryExpr(YxParser.ShiftBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator op = null;
        if (ctx.op.getText().equals("<<")) {
            op = BinaryExprNode.BinaryOperator.LEFT_SHIFT;
        } else if (ctx.op.getText().equals(">>")) {
            op = BinaryExprNode.BinaryOperator.RIGHT_SHIFT;
        }
        return new BinaryExprNode(new Position(ctx), op, lhs, rhs);
    }

    @Override
    public ASTNode visitAddMultExpr(YxParser.AddMultExprContext ctx) {
        return visit(ctx.multExpr());
    }

    @Override
    public ASTNode visitAddBinaryExpr(YxParser.AddBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator op = null;
        if (ctx.op.getText().equals("+")) {
            op = BinaryExprNode.BinaryOperator.PLUS;
        } else if (ctx.op.getText().equals("-")) {
            op = BinaryExprNode.BinaryOperator.SUB;
        }
        return new BinaryExprNode(new Position(ctx), op, lhs, rhs);
    }

    @Override
    public ASTNode visitMultUnaryExpr(YxParser.MultUnaryExprContext ctx) {
        return visit(ctx.unaryExpr());
    }

    @Override
    public ASTNode visitMultBinaryExpr(YxParser.MultBinaryExprContext ctx) {
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator op = null;
        if (ctx.op.getText().equals("*")) {
            op = BinaryExprNode.BinaryOperator.MUL;
        } else if (ctx.op.getText().equals("/")) {
            op = BinaryExprNode.BinaryOperator.DIV;
        } else if (ctx.op.getText().equals("%")) {
            op = BinaryExprNode.BinaryOperator.MOD;
        }
        return new BinaryExprNode(new Position(ctx), op, lhs, rhs);
    }

    @Override
    public ASTNode visitUnaryPostfixExpr(YxParser.UnaryPostfixExprContext ctx) {
        return visit(ctx.postfixExpr());
    }

    @Override
    public ASTNode visitUnaryPrefixIncDecExpr(YxParser.UnaryPrefixIncDecExprContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.postfixExpr());
        UnaryExprNode.UnaryOperator op = null;
        if (ctx.op.getText().equals("++")) {
            op = UnaryExprNode.UnaryOperator.SELF_ADD;
        } else if (ctx.op.getText().equals("--")) {
            op = UnaryExprNode.UnaryOperator.SELF_SUB;
        }
        return new UnaryExprNode(new Position(ctx), op, expr);
    }

    @Override
    public ASTNode visitUnaryOpExpr(YxParser.UnaryOpExprContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.postfixExpr());
        UnaryExprNode.UnaryOperator op = null;
        if (ctx.op.getText().equals("-")) {
            op = UnaryExprNode.UnaryOperator.MINUS;
        } else if (ctx.op.getText().equals("!")) {
            op = UnaryExprNode.UnaryOperator.LOGIC_NOT;
        } else if (ctx.op.getText().equals("~")) {
            op = UnaryExprNode.UnaryOperator.NOT;
        }
        return new UnaryExprNode(new Position(ctx), op, expr);
    }

    @Override
    public ASTNode visitPostfixMember(YxParser.PostfixMemberContext ctx) {

        return super.visitPostfixMember(ctx);
    }

    @Override
    public ASTNode visitPostfixPrimaryExpr(YxParser.PostfixPrimaryExprContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public ASTNode visitPostfixMemberFunction(YxParser.PostfixMemberFunctionContext ctx) {
        return super.visitPostfixMemberFunction(ctx);
    }

    @Override
    public ASTNode visitPostfixIncDecExpr(YxParser.PostfixIncDecExprContext ctx) {
        ExprNode expr = (ExprNode) visit(ctx.primary());
        UnaryExprNode.UnaryOperator op = null;
        if (ctx.op.getText().equals("++")) {
            op = UnaryExprNode.UnaryOperator.SELF_ADD;
        } else if (ctx.op.getText().equals("--")) {
            op = UnaryExprNode.UnaryOperator.SELF_SUB;
        }
        return new UnaryExprNode(new Position(ctx), op, expr);
    }

    @Override
    public ASTNode visitPrimaryExpr(YxParser.PrimaryExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitPrimaryFunction(YxParser.PrimaryFunctionContext ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public ASTNode visitPrimaryIdentifier(YxParser.PrimaryIdentifierContext ctx) {
        return new VarExprNode(new Position(ctx), ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitPrimaryLiteral(YxParser.PrimaryLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public ASTNode visitLiteral(YxParser.LiteralContext ctx) {
        if (ctx.Integer() != null) {
            return new IntLiteralExprNode(new Position(ctx), Integer.parseInt(ctx.Integer().getText()));
        } else if (ctx.True() != null) {
            return new BoolLiteralExprNode(new Position(ctx), true);
        } else if (ctx.False() != null) {
            return new BoolLiteralExprNode(new Position(ctx), false);
        } else if (ctx.String() != null) {
            return new StringLiteralExprNode(new Position(ctx), ctx.String().getText());
        }
        //The visitor should not come to here.
        return super.visitLiteral(ctx);
    }
}