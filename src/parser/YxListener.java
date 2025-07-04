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
	 * Enter a parse tree produced by {@link YxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(YxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(YxParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link YxParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(YxParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(YxParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(YxParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(YxParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignOrExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignOrExpr(YxParser.AssignOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignOrExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignOrExpr(YxParser.AssignOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(YxParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link YxParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(YxParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrAndExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrAndExpr(YxParser.LogicOrAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrAndExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrAndExpr(YxParser.LogicOrAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrBinaryExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrBinaryExpr(YxParser.LogicOrBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrBinaryExpr}
	 * labeled alternative in {@link YxParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrBinaryExpr(YxParser.LogicOrBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndbitExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndbitExpr(YxParser.LogicAndbitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndbitExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndbitExpr(YxParser.LogicAndbitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndBinaryExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndBinaryExpr(YxParser.LogicAndBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndBinaryExpr}
	 * labeled alternative in {@link YxParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndBinaryExpr(YxParser.LogicAndBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrAndExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitOrAndExpr(YxParser.BitOrAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrAndExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitOrAndExpr(YxParser.BitOrAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrBinaryExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitOrBinaryExpr(YxParser.BitOrBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrBinaryExpr}
	 * labeled alternative in {@link YxParser#bitOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitOrBinaryExpr(YxParser.BitOrBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndEqualExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitAndEqualExpr(YxParser.BitAndEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndEqualExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitAndEqualExpr(YxParser.BitAndEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndBinaryExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitAndBinaryExpr(YxParser.BitAndBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndBinaryExpr}
	 * labeled alternative in {@link YxParser#bitAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitAndBinaryExpr(YxParser.BitAndBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalCompareExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualCompareExpr(YxParser.EqualCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalCompareExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualCompareExpr(YxParser.EqualCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalBinaryExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualBinaryExpr(YxParser.EqualBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalBinaryExpr}
	 * labeled alternative in {@link YxParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualBinaryExpr(YxParser.EqualBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareShiftExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareShiftExpr(YxParser.CompareShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareShiftExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareShiftExpr(YxParser.CompareShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareBinaryExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareBinaryExpr(YxParser.CompareBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareBinaryExpr}
	 * labeled alternative in {@link YxParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareBinaryExpr(YxParser.CompareBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftAddExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftAddExpr(YxParser.ShiftAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftAddExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftAddExpr(YxParser.ShiftAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftBinaryExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftBinaryExpr(YxParser.ShiftBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftBinaryExpr}
	 * labeled alternative in {@link YxParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftBinaryExpr(YxParser.ShiftBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addMultExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddMultExpr(YxParser.AddMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addMultExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddMultExpr(YxParser.AddMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addBinaryExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddBinaryExpr(YxParser.AddBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addBinaryExpr}
	 * labeled alternative in {@link YxParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddBinaryExpr(YxParser.AddBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multUnaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultUnaryExpr(YxParser.MultUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multUnaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultUnaryExpr(YxParser.MultUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multBinaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultBinaryExpr(YxParser.MultBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multBinaryExpr}
	 * labeled alternative in {@link YxParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultBinaryExpr(YxParser.MultBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPostfixExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixExpr(YxParser.UnaryPostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPostfixExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixExpr(YxParser.UnaryPostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPrefixIncDecExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixIncDecExpr(YxParser.UnaryPrefixIncDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPrefixIncDecExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixIncDecExpr(YxParser.UnaryPrefixIncDecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpExpr(YxParser.UnaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link YxParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpExpr(YxParser.UnaryOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixPrimaryExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixPrimaryExpr(YxParser.PostfixPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixPrimaryExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixPrimaryExpr(YxParser.PostfixPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixIncDecExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixIncDecExpr(YxParser.PostfixIncDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixIncDecExpr}
	 * labeled alternative in {@link YxParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixIncDecExpr(YxParser.PostfixIncDecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YxParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(YxParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YxParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(YxParser.PrimaryContext ctx);
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
}