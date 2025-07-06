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
	 * Visit a parse tree produced by {@link YxParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(YxParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicType}
	 * labeled alternative in {@link YxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(YxParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link YxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(YxParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(YxParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(YxParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(YxParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(YxParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(YxParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(YxParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(YxParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(YxParser.ClassDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link YxParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(YxParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YxParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(YxParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link YxParser#newTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(YxParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link YxParser#newTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(YxParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(YxParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(YxParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(YxParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVisit}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVisit(YxParser.ArrayVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(YxParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAccess}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAccess(YxParser.ClassAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(YxParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(YxParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(YxParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(YxParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(YxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(YxParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link YxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(YxParser.TernaryContext ctx);
}