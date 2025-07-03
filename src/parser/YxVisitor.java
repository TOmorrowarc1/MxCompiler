// Generated from parser/Yx.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(YxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(YxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(YxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmt(YxParser.BlockstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(YxParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(YxParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(YxParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(YxParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jmpstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJmpstmt(YxParser.JmpstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefstmt(YxParser.VarDefstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionstmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstmt(YxParser.ExpressionstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptystmt}
	 * labeled alternative in {@link YxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptystmt(YxParser.EmptystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(YxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(YxParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(YxParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastLevelExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastLevelExpr(YxParser.LastLevelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(YxParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrUnaryExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrUnaryExpr(YxParser.LogicOrUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrBinaryExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrBinaryExpr(YxParser.LogicOrBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndbitExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndbitExpr(YxParser.LogicAndbitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndBinaryExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndBinaryExpr(YxParser.LogicAndBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOrAndExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrAndExpr(YxParser.BitOrAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOrBinaryExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrBinaryExpr(YxParser.BitOrBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAndEqualExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndEqualExpr(YxParser.BitAndEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAndBinaryExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndBinaryExpr(YxParser.BitAndBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalCompareExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCompareExpr(YxParser.EqualCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalBinaryExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualBinaryExpr(YxParser.EqualBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareShiftExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareShiftExpr(YxParser.CompareShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareBinaryExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBinaryExpr(YxParser.CompareBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftAddExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftAddExpr(YxParser.ShiftAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftBinaryExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftBinaryExpr(YxParser.ShiftBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addMultExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMultExpr(YxParser.AddMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addBinaryExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddBinaryExpr(YxParser.AddBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multUnaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultUnaryExpr(YxParser.MultUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multBinaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultBinaryExpr(YxParser.MultBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPostfixExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixExpr(YxParser.UnaryPostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPrefixIncDecExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixIncDecExpr(YxParser.UnaryPrefixIncDecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpExpr(YxParser.UnaryOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixPrimaryExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixPrimaryExpr(YxParser.PostfixPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixIncDecExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncDecExpr(YxParser.PostfixIncDecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(YxParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(YxParser.LiteralContext ctx);
}