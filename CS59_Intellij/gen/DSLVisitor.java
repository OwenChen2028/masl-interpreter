// Generated from C:/Users/Owen/Documents/cs59-dsl-project/CS59_Intellij/DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#numDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDec(DSLParser.NumDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#listDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDec(DSLParser.ListDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(DSLParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#numOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumOp(DSLParser.NumOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#incOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncOp(DSLParser.IncOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#decOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecOp(DSLParser.DecOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOp(DSLParser.ListOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#setOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOp(DSLParser.SetOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#randOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandOp(DSLParser.RandOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#templateDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDec(DSLParser.TemplateDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(DSLParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(DSLParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#repeatLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatLoop(DSLParser.RepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(DSLParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#genStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenStmt(DSLParser.GenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ioStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoStmt(DSLParser.IoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(DSLParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(DSLParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#possibleNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleNum(DSLParser.PossibleNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#possibleStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleStr(DSLParser.PossibleStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#indexedID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedID(DSLParser.IndexedIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(DSLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#contentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentItem(DSLParser.ContentItemContext ctx);
}