// Generated from parser/Yx.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YxParser}.
 */
public interface YxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(YxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(YxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(YxParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(YxParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(YxParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(YxParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(YxParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(YxParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(YxParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(YxParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(YxParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(YxParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(YxParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(YxParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(YxParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(YxParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(YxParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(YxParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(YxParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(YxParser.BlockstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(YxParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(YxParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(YxParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(YxParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(YxParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(YxParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(YxParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(YxParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jmpstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterJmpstmt(YxParser.JmpstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jmpstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitJmpstmt(YxParser.JmpstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDefstmt(YxParser.VarDefstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDefstmt(YxParser.VarDefstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstmt(YxParser.ExpressionstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstmt(YxParser.ExpressionstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptystmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptystmt(YxParser.EmptystmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptystmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptystmt(YxParser.EmptystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(YxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(YxParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(YxParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(YxParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(YxParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(YxParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(YxParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(YxParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(YxParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(YxParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(YxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(YxParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classAccess}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassAccess(YxParser.ClassAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classAccess}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassAccess(YxParser.ClassAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(YxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(YxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(YxParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(YxParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(YxParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(YxParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(YxParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(YxParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernary(YxParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernary(YxParser.TernaryContext ctx);
}