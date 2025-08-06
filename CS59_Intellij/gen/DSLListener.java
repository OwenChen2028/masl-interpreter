// Generated from C:/Users/Owen/Documents/cs59-dsl-project/CS59_Intellij/DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#numDec}.
	 * @param ctx the parse tree
	 */
	void enterNumDec(DSLParser.NumDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#numDec}.
	 * @param ctx the parse tree
	 */
	void exitNumDec(DSLParser.NumDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#listDec}.
	 * @param ctx the parse tree
	 */
	void enterListDec(DSLParser.ListDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#listDec}.
	 * @param ctx the parse tree
	 */
	void exitListDec(DSLParser.ListDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(DSLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(DSLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#numOp}.
	 * @param ctx the parse tree
	 */
	void enterNumOp(DSLParser.NumOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#numOp}.
	 * @param ctx the parse tree
	 */
	void exitNumOp(DSLParser.NumOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#incOp}.
	 * @param ctx the parse tree
	 */
	void enterIncOp(DSLParser.IncOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#incOp}.
	 * @param ctx the parse tree
	 */
	void exitIncOp(DSLParser.IncOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#decOp}.
	 * @param ctx the parse tree
	 */
	void enterDecOp(DSLParser.DecOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#decOp}.
	 * @param ctx the parse tree
	 */
	void exitDecOp(DSLParser.DecOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#listOp}.
	 * @param ctx the parse tree
	 */
	void enterListOp(DSLParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#listOp}.
	 * @param ctx the parse tree
	 */
	void exitListOp(DSLParser.ListOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#setOp}.
	 * @param ctx the parse tree
	 */
	void enterSetOp(DSLParser.SetOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#setOp}.
	 * @param ctx the parse tree
	 */
	void exitSetOp(DSLParser.SetOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#randOp}.
	 * @param ctx the parse tree
	 */
	void enterRandOp(DSLParser.RandOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#randOp}.
	 * @param ctx the parse tree
	 */
	void exitRandOp(DSLParser.RandOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#templateDec}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDec(DSLParser.TemplateDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#templateDec}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDec(DSLParser.TemplateDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(DSLParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(DSLParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DSLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DSLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(DSLParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(DSLParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(DSLParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(DSLParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#genStmt}.
	 * @param ctx the parse tree
	 */
	void enterGenStmt(DSLParser.GenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#genStmt}.
	 * @param ctx the parse tree
	 */
	void exitGenStmt(DSLParser.GenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ioStmt}.
	 * @param ctx the parse tree
	 */
	void enterIoStmt(DSLParser.IoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ioStmt}.
	 * @param ctx the parse tree
	 */
	void exitIoStmt(DSLParser.IoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(DSLParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(DSLParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(DSLParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(DSLParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#possibleNum}.
	 * @param ctx the parse tree
	 */
	void enterPossibleNum(DSLParser.PossibleNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#possibleNum}.
	 * @param ctx the parse tree
	 */
	void exitPossibleNum(DSLParser.PossibleNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#possibleStr}.
	 * @param ctx the parse tree
	 */
	void enterPossibleStr(DSLParser.PossibleStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#possibleStr}.
	 * @param ctx the parse tree
	 */
	void exitPossibleStr(DSLParser.PossibleStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#indexedID}.
	 * @param ctx the parse tree
	 */
	void enterIndexedID(DSLParser.IndexedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#indexedID}.
	 * @param ctx the parse tree
	 */
	void exitIndexedID(DSLParser.IndexedIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(DSLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(DSLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#contentItem}.
	 * @param ctx the parse tree
	 */
	void enterContentItem(DSLParser.ContentItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#contentItem}.
	 * @param ctx the parse tree
	 */
	void exitContentItem(DSLParser.ContentItemContext ctx);
}