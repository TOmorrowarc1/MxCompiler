package FrontEnd;

import ASTNode.*;
import Utils.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.YxBaseVisitor;
import parser.YxParser;

import java.util.ArrayList;
import java.util.List;


public class ASTBuilder extends YxBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(YxParser.ProgramContext ctx) {
        System.out.println("Program " + ctx.getText() + '\n');
        List<VarDefStmtNode> defs = new ArrayList<>();
        List<FunctionDeclarationNode> functions = new ArrayList<>();
        List<ClassDeclarationNode> classes = new ArrayList<>();
        for (YxParser.VarDeclarationContext varDeclCtx : ctx.varDeclaration()) {
            defs.add((VarDefStmtNode) visit(varDeclCtx));
        }
        for (YxParser.FuncDeclarationContext funcDeclCtx : ctx.funcDeclaration()) {
            functions.add((FunctionDeclarationNode) visit(funcDeclCtx));
        }
        for (YxParser.ClassDeclarationContext classDeclCtx : ctx.classDeclaration()) {
            classes.add((ClassDeclarationNode) visit(classDeclCtx));
        }
        return new ProgramNode(new Position(ctx), defs, functions, classes);
    }

    @Override
    public ASTNode visitBaseType(YxParser.BaseTypeContext ctx) {
        //Should not be executed.
        return super.visitBaseType(ctx);
    }

    private Type analysisBaseType(YxParser.BaseTypeContext ctx) {
        System.out.println("AnalysisBaseType " + ctx.getText() + '\n');
        Type nodeType;
        if (ctx.Int() != null) {
            nodeType = PrimitiveType.INT;
        } else if (ctx.Bool() != null) {
            nodeType = PrimitiveType.BOOL;
        } else if (ctx.Str() != null) {
            nodeType = PrimitiveType.STRING;
        } else if (ctx.Void() != null) {
            nodeType = PrimitiveType.VOID;
        } else if (ctx.Identifier() != null) {
            nodeType = new ClassType(ctx.Identifier().getText());
        } else {
            throw new SemanticError("The Unknown basic type.");
        }
        return nodeType;
    }

    private Type analysisType(YxParser.TypeContext ctx) {
        System.out.println("AnalysisType " + ctx.getText() + '\n');
        Type nodeType = analysisBaseType(ctx.baseType());
        List<TerminalNode> brackets = ctx.LBRACK();
        int dimensions = (brackets != null) ? brackets.size() : 0;
        Type finalType = nodeType;
        for (int i = 0; i < dimensions; i++) {
            finalType = new ArrayType(finalType);
        }
        return finalType;
    }

    @Override
    public ASTNode visitVarDeclaration(YxParser.VarDeclarationContext ctx) {
        System.out.println("VarDeclaration " + ctx.getText() + '\n');
        Type varType = analysisType(ctx.type());
        List<VarDefStmtNode.DefNode> defNodes = new ArrayList<>();
        for (YxParser.VarDefContext defContext : ctx.varDef()) {
            defNodes.add((VarDefStmtNode.DefNode) visit(defContext));
        }
        return new VarDefStmtNode(new Position(ctx), varType, defNodes);
    }

    @Override
    public ASTNode visitVarDef(YxParser.VarDefContext ctx) {
        System.out.println("VarDef " + ctx.getText() + '\n');
        ExprNode expr;
        if (ctx.expr() != null) {
            expr = (ExprNode) visit(ctx.expr());
        } else {
            expr = new EmptyExprNode(new Position(ctx));
        }

        return new VarDefStmtNode.DefNode(new Position(ctx), ctx.Identifier().getText(), expr);
    }

    @Override
    public ASTNode visitFuncDeclaration(YxParser.FuncDeclarationContext ctx) {
        System.out.println("FuncDeclaration " + ctx.getText() + '\n');
        List<FunctionDeclarationNode.ParameterNode> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (YxParser.ParameterContext paramCtx : ctx.parameterList().parameter()) {
                parameters.add((FunctionDeclarationNode.ParameterNode) visit(paramCtx));
            }
        }
        Type returnType = analysisType(ctx.type());
        String name = ctx.Identifier().getText();
        BlockStmtNode body = (BlockStmtNode) visit(ctx.block());
        return new FunctionDeclarationNode(new Position(ctx), returnType, name, parameters, body);
    }

    @Override
    public ASTNode visitParameterList(YxParser.ParameterListContext ctx) {
        //Should not be executed.
        return super.visitParameterList(ctx);
    }

    @Override
    public ASTNode visitParameter(YxParser.ParameterContext ctx) {
        System.out.println(ctx.getText() + '\n');
        return new FunctionDeclarationNode.ParameterNode(new Position(ctx), analysisType(ctx.type()), ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitClassDeclaration(YxParser.ClassDeclarationContext ctx) {
        System.out.println(ctx.getText() + '\n');
        String name = ctx.Identifier().getText();
        List<VarDefStmtNode> varDefs = new ArrayList<>();
        List<FunctionDeclarationNode> functionDefs = new ArrayList<>();
        List<ConstructorDeclarationNode> constructors = new ArrayList<>();
        for (YxParser.ClassMemberContext members : ctx.classMember()) {
            if (members.varDeclaration() != null) {
                varDefs.add((VarDefStmtNode) visit(members.varDeclaration()));
            } else if (members.funcDeclaration() != null) {
                functionDefs.add((FunctionDeclarationNode) visit(members.funcDeclaration()));
            } else {
                constructors.add((ConstructorDeclarationNode) visit(members.constructorDeclaration()));
            }
        }
        return new ClassDeclarationNode(new Position(ctx), name, varDefs, constructors, functionDefs);
    }

    @Override
    public ASTNode visitClassMember(YxParser.ClassMemberContext ctx) {
        //Should not be executed.
        return super.visitClassMember(ctx);
    }

    @Override
    public ASTNode visitConstructorDeclaration(YxParser.ConstructorDeclarationContext ctx) {
        System.out.println(ctx.getText() + '\n');
        String name = ctx.Identifier().getText();
        BlockStmtNode body = (BlockStmtNode) visit(ctx.block());
        return new ConstructorDeclarationNode(new Position(ctx), name, body);
    }

    @Override
    public ASTNode visitBlock(YxParser.BlockContext ctx) {
        System.out.println("Block " + ctx.getText() + '\n');
        List<StmtNode> stmts = new ArrayList<StmtNode>();
        for (YxParser.StatementContext statementContext : ctx.statement()) {
            stmts.add((StmtNode) visit(statementContext));
        }
        return new BlockStmtNode(new Position(ctx), stmts);
    }

    @Override
    public ASTNode visitBlockstmt(YxParser.BlockstmtContext ctx) {
        System.out.println("BlockStmt " + ctx.getText() + '\n');
        return visit(ctx.block());
    }

    @Override
    public ASTNode visitIfstmt(YxParser.IfstmtContext ctx) {
        System.out.println("IfStmt " + ctx.getText() + '\n');
        ExprNode condition = (ExprNode) visit(ctx.expr());
        StmtNode thenStmt = (StmtNode) visit(ctx.trueStmt);
        StmtNode elseStmt;
        if (ctx.falseStmt != null) {
            elseStmt = (StmtNode) visit(ctx.falseStmt);
        } else {
            elseStmt = new EmptyStmtNode(new Position(ctx));
        }
        return new IfStmtNode(new Position(ctx), condition, thenStmt, elseStmt);
    }

    @Override
    public ASTNode visitWhilestmt(YxParser.WhilestmtContext ctx) {
        System.out.println("WhileStmt " + ctx.getText() + '\n');
        ExprNode condition = (ExprNode) visit(ctx.expr());
        StmtNode body = (StmtNode) visit(ctx.statement());
        return new WhileStmtNode(new Position(ctx), condition, body);
    }

    @Override
    public ASTNode visitForstmt(YxParser.ForstmtContext ctx) {
        System.out.println("ForStmt " + ctx.getText() + '\n');
        StmtNode init;
        ExprNode condition;
        ExprNode step;
        StmtNode body = (StmtNode) visit(ctx.bodyStatement);
        if (ctx.initializationStatement != null) {
            init = (StmtNode) visit(ctx.initializationStatement);
        } else {
            init = new EmptyStmtNode(new Position(ctx));
        }
        if (ctx.forConditionExpression != null) {
            condition = (ExprNode) visit(ctx.forConditionExpression);
        } else {
            condition = new EmptyExprNode(new Position(ctx));
        }
        if (ctx.stepExpression != null) {
            step = (ExprNode) visit(ctx.stepExpression);
        } else {
            step = new EmptyExprNode(new Position(ctx));
        }
        return new ForStmtNode(new Position(ctx), (VarDefStmtNode) init, condition, step, body);
    }

    @Override
    public ASTNode visitReturnstmt(YxParser.ReturnstmtContext ctx) {
        System.out.println("ReturnStmt " + ctx.getText() + '\n');
        ExprNode expr;
        if (ctx.expr() != null) {
            expr = (ExprNode) visit(ctx.expr());
        } else {
            expr = new EmptyExprNode(new Position(ctx));
        }
        return new ReturnStmtNode(new Position(ctx), expr);
    }

    @Override
    public ASTNode visitJmpstmt(YxParser.JmpstmtContext ctx) {
        System.out.println("JmpStmt " + ctx.getText() + '\n');
        JmpStmtNode.JumpType jmpType;
        if (ctx.getText().equals("break")) {
            jmpType = JmpStmtNode.JumpType.BREAK;
        } else if (ctx.getText().equals("continue")) {
            jmpType = JmpStmtNode.JumpType.CONTINUE;
        } else {
            throw new SemanticError("Invalid JmpStmt");
        }
        return new JmpStmtNode(new Position(ctx), jmpType);
    }

    @Override
    public ASTNode visitVarDefstmt(YxParser.VarDefstmtContext ctx) {
        System.out.println("VarDefStmt " + ctx.getText() + '\n');
        return visit(ctx.varDeclaration());
    }

    @Override
    public ASTNode visitExpressionstmt(YxParser.ExpressionstmtContext ctx) {
        System.out.println("ExprStmt " + ctx.getText() + '\n');
        return new ExprStmtNode(new Position(ctx), (ExprNode) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitEmptystmt(YxParser.EmptystmtContext ctx) {
        System.out.println("EmptyStmt " + ctx.getText() + '\n');
        return new EmptyStmtNode(new Position(ctx));
    }

    @Override
    public ASTNode visitType(YxParser.TypeContext ctx) {
        //Should not be executed.
        return super.visitType(ctx);
    }

    @Override
    public ASTNode visitSubExpr(YxParser.SubExprContext ctx) {
        System.out.println("SubExprVisit " + ctx.getText() + '\n');
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitPostfix(YxParser.PostfixContext ctx) {
        System.out.println("PostFixVisit " + ctx.getText() + '\n');
        ExprNode expr = (ExprNode) visit(ctx.expr());
        UnaryExprNode.UnaryOperator unaryOperator;
        if (ctx.op.getText().equals("++")) {
            unaryOperator = UnaryExprNode.UnaryOperator.SELF_ADD;
        } else if (ctx.op.getText().equals("--")) {
            unaryOperator = UnaryExprNode.UnaryOperator.SELF_SUB;
        } else {
            throw new SemanticError("Invalid binary operator");

        }
        return new UnaryExprNode(new Position(ctx), unaryOperator, expr);
    }

    @Override
    public ASTNode visitClassAccess(YxParser.ClassAccessContext ctx) {
        System.out.println("ClassAccessVisit " + ctx.getText() + '\n');
        ExprNode object = (ExprNode) visit(ctx.expr());
        return new ClassAccessNode(new Position(ctx), object, ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitFunctionCall(YxParser.FunctionCallContext ctx) {
        System.out.println("FunctionCallVisit " + ctx.getText() + '\n');
        ExprNode callee = (ExprNode) visit(ctx.expr());
        List<ExprNode> parameters = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (YxParser.ExprContext paramCtx : ctx.argumentList().expr()) {
                parameters.add((ExprNode) visit(paramCtx));
            }
        }
        return new FunctionCallExprNode(new Position(ctx), callee, parameters);
    }

    @Override
    public ASTNode visitArgumentList(YxParser.ArgumentListContext ctx) {
        //Should not enter.
        return super.visitArgumentList(ctx);
    }

    @Override
    public ASTNode visitNewClass(YxParser.NewClassContext ctx) {
        System.out.println("NewClass " + ctx.getText() + '\n');
        Type classType = new ClassType(ctx.Identifier().getText());
        return new NewClassExprNode(new Position(ctx), classType);
    }

    @Override
    public ASTNode visitNewArray(YxParser.NewArrayContext ctx) {
        System.out.println("NewArray " + ctx.getText() + '\n');
        Type arrayType = new ArrayType(analysisBaseType(ctx.baseType()));
        List<ExprNode> dimensions = new ArrayList<>();
        for (YxParser.ExprContext exprContext : ctx.expr()) {
            dimensions.add((ExprNode) visit(exprContext));
        }
        return new NewArrayExprNode(new Position(ctx), arrayType, dimensions);
    }


    @Override
    public ASTNode visitThisExpr(YxParser.ThisExprContext ctx) {
        System.out.println("ThisVisit " + ctx.getText() + '\n');
        return new ThisNode(new Position(ctx));
    }

    @Override
    public ASTNode visitUnaryExpr(YxParser.UnaryExprContext ctx) {
        System.out.println("UnaryVisit " + ctx.getText() + '\n');
        ExprNode expr = (ExprNode) visit(ctx.expr());
        UnaryExprNode.UnaryOperator unaryOperator;
        switch (ctx.op.getText()) {
            case "++": {
                unaryOperator = UnaryExprNode.UnaryOperator.SELF_ADD;
                break;
            }
            case "--": {
                unaryOperator = UnaryExprNode.UnaryOperator.SELF_SUB;
                break;
            }
            case "-": {
                unaryOperator = UnaryExprNode.UnaryOperator.MINUS;
                break;
            }
            case "!": {
                unaryOperator = UnaryExprNode.UnaryOperator.LOGIC_NOT;
                break;
            }
            case "~": {
                unaryOperator = UnaryExprNode.UnaryOperator.NOT;
                break;
            }
            default: {
                throw new SemanticError("Invalid unary operator");
            }
        }
        return new UnaryExprNode(new Position(ctx), unaryOperator, expr);
    }

    @Override
    public ASTNode visitBinaryExpr(YxParser.BinaryExprContext ctx) {
        System.out.println("BinaryVisit " + ctx.getText() + '\n');
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        BinaryExprNode.BinaryOperator binaryOperator;
        switch (ctx.op.getText()) {
            case "*": {
                binaryOperator = BinaryExprNode.BinaryOperator.MUL;
                break;
            }
            case "/": {
                binaryOperator = BinaryExprNode.BinaryOperator.DIV;
                break;
            }
            case "%": {
                binaryOperator = BinaryExprNode.BinaryOperator.MOD;
                break;
            }
            case "+": {
                binaryOperator = BinaryExprNode.BinaryOperator.PLUS;
                break;
            }
            case "-": {
                binaryOperator = BinaryExprNode.BinaryOperator.SUB;
                break;
            }
            case "<<": {
                binaryOperator = BinaryExprNode.BinaryOperator.LEFT_SHIFT;
                break;
            }
            case ">>": {
                binaryOperator = BinaryExprNode.BinaryOperator.RIGHT_SHIFT;
                break;
            }
            case ">=": {
                binaryOperator = BinaryExprNode.BinaryOperator.GE;
                break;
            }
            case "<=": {
                binaryOperator = BinaryExprNode.BinaryOperator.LE;
                break;
            }
            case ">": {
                binaryOperator = BinaryExprNode.BinaryOperator.G;
                break;
            }
            case "<": {
                binaryOperator = BinaryExprNode.BinaryOperator.L;
                break;
            }
            case "==": {
                binaryOperator = BinaryExprNode.BinaryOperator.EQUAL;
                break;
            }
            case "!=": {
                binaryOperator = BinaryExprNode.BinaryOperator.N_EQUAL;
                break;
            }
            case "&": {
                binaryOperator = BinaryExprNode.BinaryOperator.AND;
                break;
            }
            case "|": {
                binaryOperator = BinaryExprNode.BinaryOperator.OR;
                break;
            }
            case "&&": {
                binaryOperator = BinaryExprNode.BinaryOperator.LOGIC_AND;
                break;
            }
            case "||": {
                binaryOperator = BinaryExprNode.BinaryOperator.LOGIC_OR;
                break;
            }
            default: {
                throw new SemanticError("Invalid binary operator");
            }
        }
        return new BinaryExprNode(new Position(ctx), binaryOperator, lhs, rhs);
    }

    @Override
    public ASTNode visitTernary(YxParser.TernaryContext ctx) {
        System.out.println("TernaryVisit " + ctx.getText() + '\n');
        ExprNode conditionExpr = (ExprNode) visit(ctx.condition);
        ExprNode trueExpr = (ExprNode) visit(ctx.trueExpr);
        ExprNode falseExpr = (ExprNode) visit(ctx.falseExpr);
        return new TernaryExprNode(new Position(ctx), conditionExpr, trueExpr, falseExpr);
    }

    @Override
    public ASTNode visitAssignment(YxParser.AssignmentContext ctx) {
        System.out.println("AssignmentVisit " + ctx.getText() + '\n');
        ExprNode lhs = (ExprNode) visit(ctx.lhs);
        ExprNode rhs = (ExprNode) visit(ctx.rhs);
        return new AssignExprNode(new Position(ctx), lhs, rhs);
    }

    @Override
    public ASTNode visitVariable(YxParser.VariableContext ctx) {
        System.out.println("VarVisit " + ctx.getText() + '\n');
        return new VarExprNode(new Position(ctx), ctx.Identifier().getText());
    }

    @Override
    public ASTNode visitConstant(YxParser.ConstantContext ctx) {
        System.out.println("Constant " + ctx.getText() + '\n');
        return visit(ctx.literal());
    }

    @Override
    public ASTNode visitArrayVisit(YxParser.ArrayVisitContext ctx) {
        System.out.println("ArrayVisit " + ctx.getText() + '\n');
        ExprNode array = (ExprNode) visit(ctx.array);
        ExprNode index = (ExprNode) visit(ctx.index);
        return new ArrayVisitExprNode(new Position(ctx), array, index);
    }

    @Override
    public ASTNode visitLiteral(YxParser.LiteralContext ctx) {
        System.out.println("Literal " + ctx.getText() + '\n');
        if (ctx.Integer() != null) {
            return new IntLiteralExprNode(new Position(ctx), Integer.parseInt(ctx.Integer().getText()));
        } else if (ctx.True() != null) {
            return new BoolLiteralExprNode(new Position(ctx), true);
        } else if (ctx.False() != null) {
            return new BoolLiteralExprNode(new Position(ctx), false);
        } else if (ctx.String() != null) {
            return new StringLiteralExprNode(new Position(ctx), ctx.String().getText());
        }
        throw new SemanticError("Invalid literal type");
    }
}