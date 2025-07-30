// Generated from C:/Users/Owen/Documents/cs59-dsl-project/CS59_Intellij/DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DSLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DSLParser.ParseContext ctx);
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
	 * Enter a parse tree produced by {@link DSLParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(DSLParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(DSLParser.PrintStmtContext ctx);
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
	 * Enter a parse tree produced by {@link DSLParser#substitution}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution(DSLParser.SubstitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#substitution}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution(DSLParser.SubstitutionContext ctx);
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
}