// Generated from C:/Users/Owen/Documents/cs59-dsl-project/CS59_Intellij/DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, CNT=27, ID=28, NUM=29, OP=30, STR=31, ENDL=32, COMMENT=33;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_declaration = 2, RULE_numDec = 3, 
		RULE_numOp = 4, RULE_listDec = 5, RULE_templateDec = 6, RULE_conditional = 7, 
		RULE_loop = 8, RULE_genStmt = 9, RULE_printStmt = 10, RULE_expression = 11, 
		RULE_possibleNum = 12, RULE_possibleStr = 13, RULE_content = 14, RULE_substitution = 15, 
		RULE_indexedID = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "declaration", "numDec", "numOp", "listDec", "templateDec", 
			"conditional", "loop", "genStmt", "printStmt", "expression", "possibleNum", 
			"possibleStr", "content", "substitution", "indexedID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "' = '", "'.'", "'Increment '", "'Decrement '", "': '", 
			"', '", "'Begin Template '", "':'", "'End Template.'", "'Begin Check, If ['", 
			"']:'", "'End Check.'", "'Begin Loop, '", "'Repeat ['", "'] Times'", 
			"'While ['", "']'", "'End Loop.'", "'Generate '", "'Print '", "' In '", 
			"' ('", "'\"Count\"'", "'\"Random\"'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CNT", "ID", "NUM", "OP", "STR", "ENDL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DSLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4566567218L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public GenStmtContext genStmt() {
			return getRuleContext(GenStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(DSLParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(DSLParser.ENDL, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ENDL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__7:
			case ID:
				{
				setState(48);
				declaration();
				}
				break;
			case T__10:
				{
				setState(49);
				conditional();
				}
				break;
			case T__13:
				{
				setState(50);
				loop();
				}
				break;
			case T__19:
				{
				setState(51);
				genStmt();
				}
				break;
			case T__20:
				{
				setState(52);
				printStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					match(ENDL);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public NumDecContext numDec() {
			return getRuleContext(NumDecContext.class,0);
		}
		public ListDecContext listDec() {
			return getRuleContext(ListDecContext.class,0);
		}
		public TemplateDecContext templateDec() {
			return getRuleContext(TemplateDecContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				numDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				listDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				templateDec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumDecContext extends ParserRuleContext {
		public NumOpContext numOp() {
			return getRuleContext(NumOpContext.class,0);
		}
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterNumDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitNumDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitNumDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumDecContext numDec() throws RecognitionException {
		NumDecContext _localctx = new NumDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(66);
				match(ID);
				setState(67);
				match(T__1);
				setState(68);
				expression();
				}
				}
				break;
			case T__3:
			case T__4:
				{
				setState(69);
				numOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public NumOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterNumOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitNumOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitNumOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumOpContext numOp() throws RecognitionException {
		NumOpContext _localctx = new NumOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numOp);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(T__3);
				setState(75);
				match(ID);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(76);
				match(T__4);
				setState(77);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public List<PossibleStrContext> possibleStr() {
			return getRuleContexts(PossibleStrContext.class);
		}
		public PossibleStrContext possibleStr(int i) {
			return getRuleContext(PossibleStrContext.class,i);
		}
		public ListDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterListDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitListDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitListDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDecContext listDec() throws RecognitionException {
		ListDecContext _localctx = new ListDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(T__5);
			setState(82);
			possibleStr();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(83);
				match(T__6);
				setState(84);
				possibleStr();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(DSLParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(DSLParser.ENDL, i);
		}
		public TemplateDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTemplateDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTemplateDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTemplateDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDecContext templateDec() throws RecognitionException {
		TemplateDecContext _localctx = new TemplateDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_templateDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__7);
			setState(93);
			match(ID);
			setState(94);
			match(T__8);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(ENDL);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==ENDL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(107);
			content();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(ENDL);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ENDL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(DSLParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(DSLParser.ENDL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__10);
			setState(123);
			expression();
			setState(124);
			match(T__11);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(ENDL);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(131);
					statement();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ENDL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(DSLParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(DSLParser.ENDL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__13);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(146);
				match(T__14);
				setState(147);
				expression();
				setState(148);
				match(T__15);
				}
				break;
			case T__16:
				{
				setState(150);
				match(T__16);
				setState(151);
				expression();
				setState(152);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			match(T__8);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(ENDL);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(163);
					statement();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ENDL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public GenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterGenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitGenStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitGenStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenStmtContext genStmt() throws RecognitionException {
		GenStmtContext _localctx = new GenStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__19);
			setState(178);
			match(ID);
			setState(179);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__20);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(182);
				possibleStr();
				}
				break;
			case 2:
				{
				setState(183);
				expression();
				}
				break;
			}
			setState(186);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PossibleNumContext> possibleNum() {
			return getRuleContexts(PossibleNumContext.class);
		}
		public PossibleNumContext possibleNum(int i) {
			return getRuleContext(PossibleNumContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(DSLParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(DSLParser.OP, i);
		}
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				possibleNum();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP) {
					{
					{
					setState(189);
					match(OP);
					setState(190);
					possibleNum();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(196);
				possibleStr();
				setState(197);
				match(T__21);
				setState(198);
				match(ID);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossibleNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DSLParser.NUM, 0); }
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public IndexedIDContext indexedID() {
			return getRuleContext(IndexedIDContext.class,0);
		}
		public PossibleNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterPossibleNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitPossibleNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitPossibleNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleNumContext possibleNum() throws RecognitionException {
		PossibleNumContext _localctx = new PossibleNumContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_possibleNum);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				indexedID();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossibleStrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(DSLParser.STR, 0); }
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public IndexedIDContext indexedID() {
			return getRuleContext(IndexedIDContext.class,0);
		}
		public PossibleStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterPossibleStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitPossibleStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitPossibleStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleStrContext possibleStr() throws RecognitionException {
		PossibleStrContext _localctx = new PossibleStrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_possibleStr);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				indexedID();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<SubstitutionContext> substitution() {
			return getRuleContexts(SubstitutionContext.class);
		}
		public SubstitutionContext substitution(int i) {
			return getRuleContext(SubstitutionContext.class,i);
		}
		public List<TerminalNode> CNT() { return getTokens(DSLParser.CNT); }
		public TerminalNode CNT(int i) {
			return getToken(DSLParser.CNT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(214);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(212);
						substitution();
						}
						break;
					case CNT:
						{
						setState(213);
						match(CNT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstitutionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public IndexedIDContext indexedID() {
			return getRuleContext(IndexedIDContext.class,0);
		}
		public SubstitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterSubstitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitSubstitution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitSubstitution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstitutionContext substitution() throws RecognitionException {
		SubstitutionContext _localctx = new SubstitutionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_substitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(219);
				match(ID);
				}
				break;
			case 2:
				{
				setState(220);
				indexedID();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexedIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterIndexedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitIndexedID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitIndexedID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedIDContext indexedID() throws RecognitionException {
		IndexedIDContext _localctx = new IndexedIDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexedID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			match(T__22);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
			case STR:
				{
				setState(225);
				expression();
				}
				break;
			case T__23:
			case T__24:
				{
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001,\b\u0001\n"+
		"\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0005\u00019\b\u0001\n\u0001"+
		"\f\u0001<\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003G\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004O\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"a\b\u0006\n\u0006\f\u0006d\t\u0006\u0001\u0006\u0005\u0006g\b\u0006\n"+
		"\u0006\f\u0006j\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006n\b\u0006\n"+
		"\u0006\f\u0006q\t\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006"+
		"w\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u007f\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0001"+
		"\u0007\u0005\u0007\u0085\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\u0007"+
		"\u0005\u0007\u008b\b\u0007\n\u0007\f\u0007\u008e\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u009b\b\b\u0001\b\u0001\b\u0005\b\u009f\b\b\n\b\f\b\u00a2"+
		"\t\b\u0001\b\u0005\b\u00a5\b\b\n\b\f\b\u00a8\t\b\u0001\b\u0005\b\u00ab"+
		"\b\b\n\b\f\b\u00ae\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00c0\b\u000b\n\u000b\f\u000b\u00c3"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00ce\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00d3\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u00d7\b\u000e"+
		"\n\u000e\f\u000e\u00da\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00de"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e4"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0086\u00a6\u00d8\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0002\u0002\u0000\u0001\u0001  \u0001\u0000"+
		"\u0018\u0019\u00f8\u0000%\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\b"+
		"N\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000"+
		"\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000\u0000"+
		"\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000\u0000\u0000"+
		"\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00cd\u0001\u0000\u0000\u0000"+
		"\u001a\u00d2\u0001\u0000\u0000\u0000\u001c\u00d8\u0001\u0000\u0000\u0000"+
		"\u001e\u00dd\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000\""+
		"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001"+
		"\u0001\u0000\u0000\u0000*,\u0007\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.5\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000006\u0003"+
		"\u0004\u0002\u000016\u0003\u000e\u0007\u000026\u0003\u0010\b\u000036\u0003"+
		"\u0012\t\u000046\u0003\u0014\n\u000050\u0001\u0000\u0000\u000051\u0001"+
		"\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u00006:\u0001\u0000\u0000\u000079\u0005 \u0000\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=A\u0003\u0006\u0003\u0000>A\u0003\n\u0005\u0000?A\u0003"+
		"\f\u0006\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u001c\u0000"+
		"\u0000CD\u0005\u0002\u0000\u0000DG\u0003\u0016\u000b\u0000EG\u0003\b\u0004"+
		"\u0000FB\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0003\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0004\u0000\u0000KO\u0005\u001c\u0000\u0000LM\u0005\u0005\u0000"+
		"\u0000MO\u0005\u001c\u0000\u0000NJ\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u001c\u0000\u0000QR\u0005"+
		"\u0006\u0000\u0000RW\u0003\u001a\r\u0000ST\u0005\u0007\u0000\u0000TV\u0003"+
		"\u001a\r\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000[\u000b\u0001\u0000"+
		"\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u001c\u0000\u0000^b\u0005"+
		"\t\u0000\u0000_a\u0005 \u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ch\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0007\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000ko\u0003\u001c\u000e\u0000ln\u0005 \u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pu\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000y\r"+
		"\u0001\u0000\u0000\u0000z{\u0005\u000b\u0000\u0000{|\u0003\u0016\u000b"+
		"\u0000|\u0080\u0005\f\u0000\u0000}\u007f\u0005 \u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0086\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0002\u0001"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u008c\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0007\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\r\u0000\u0000"+
		"\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u009a\u0005\u000e\u0000\u0000"+
		"\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0094\u0003\u0016\u000b\u0000"+
		"\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u009b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098\u0003\u0016\u000b\u0000"+
		"\u0098\u0099\u0005\u0012\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a0\u0005\t\u0000\u0000\u009d"+
		"\u009f\u0005 \u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0007\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0013\u0000\u0000\u00b0\u0011"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b3"+
		"\u0005\u001c\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u0013"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0005\u0015\u0000\u0000\u00b6\u00b9"+
		"\u0003\u001a\r\u0000\u00b7\u00b9\u0003\u0016\u000b\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u0015\u0001"+
		"\u0000\u0000\u0000\u00bc\u00c1\u0003\u0018\f\u0000\u00bd\u00be\u0005\u001e"+
		"\u0000\u0000\u00be\u00c0\u0003\u0018\f\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u001a\r\u0000"+
		"\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000"+
		"\u00ca\u00ce\u0005\u001d\u0000\u0000\u00cb\u00ce\u0005\u001c\u0000\u0000"+
		"\u00cc\u00ce\u0003 \u0010\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u0019\u0001\u0000\u0000\u0000\u00cf\u00d3\u0005\u001f\u0000\u0000\u00d0"+
		"\u00d3\u0005\u001c\u0000\u0000\u00d1\u00d3\u0003 \u0010\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0003\u001e\u000f\u0000\u00d5\u00d7\u0005\u001b\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0005\u001c\u0000\u0000\u00dc\u00de"+
		"\u0003 \u0010\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u001f\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u001c\u0000\u0000\u00e0\u00e3\u0005\u0017\u0000\u0000\u00e1\u00e4\u0003"+
		"\u0016\u000b\u0000\u00e2\u00e4\u0007\u0001\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u001a\u0000\u0000\u00e6!\u0001\u0000"+
		"\u0000\u0000\u001c%-5:@FNWbhou\u0080\u0086\u008c\u009a\u00a0\u00a6\u00ac"+
		"\u00b8\u00c1\u00c8\u00cd\u00d2\u00d6\u00d8\u00dd\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}