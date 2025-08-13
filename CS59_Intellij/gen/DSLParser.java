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
		BODY=25, ID=26, NUM=27, OP=28, STR=29, COMMENT=30, WS=31;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_declaration = 2, RULE_numDec = 3, 
		RULE_listDec = 4, RULE_operation = 5, RULE_numOp = 6, RULE_incOp = 7, 
		RULE_decOp = 8, RULE_listOp = 9, RULE_setOp = 10, RULE_randOp = 11, RULE_templateDec = 12, 
		RULE_conditional = 13, RULE_loop = 14, RULE_repeatLoop = 15, RULE_whileLoop = 16, 
		RULE_genStmt = 17, RULE_ioStmt = 18, RULE_readStmt = 19, RULE_writeStmt = 20, 
		RULE_expression = 21, RULE_possibleNum = 22, RULE_possibleStr = 23, RULE_indexedID = 24, 
		RULE_content = 25, RULE_contentItem = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "declaration", "numDec", "listDec", "operation", 
			"numOp", "incOp", "decOp", "listOp", "setOp", "randOp", "templateDec", 
			"conditional", "loop", "repeatLoop", "whileLoop", "genStmt", "ioStmt", 
			"readStmt", "writeStmt", "expression", "possibleNum", "possibleStr", 
			"indexedID", "content", "contentItem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'='", "':'", "','", "'Increment '", "'Decrement '", "'Set '", 
			"'('", "')'", "' To '", "'Randomize '", "'Begin Template '", "'End Template'", 
			"'Begin Check,'", "'If '", "'End Check'", "'Begin Loop,'", "'Repeat '", 
			"' Times:'", "'End Loop'", "'While '", "'Generate '", "'Read '", "'Write '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BODY", "ID", "NUM", "OP", "STR", "COMMENT", "WS"
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
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DSLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96622816L) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		public IoStmtContext ioStmt() {
			return getRuleContext(IoStmtContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
				{
				setState(62);
				declaration();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__10:
				{
				setState(63);
				operation();
				}
				break;
			case T__13:
				{
				setState(64);
				conditional();
				}
				break;
			case T__16:
				{
				setState(65);
				loop();
				}
				break;
			case T__21:
				{
				setState(66);
				genStmt();
				}
				break;
			case T__22:
			case T__23:
				{
				setState(67);
				ioStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(T__0);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				numDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				listDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
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
			setState(77);
			match(ID);
			setState(78);
			match(T__1);
			setState(79);
			expression();
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
		enterRule(_localctx, 8, RULE_listDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(83);
			possibleStr();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(84);
				match(T__3);
				setState(85);
				possibleStr();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class OperationContext extends ParserRuleContext {
		public NumOpContext numOp() {
			return getRuleContext(NumOpContext.class,0);
		}
		public ListOpContext listOp() {
			return getRuleContext(ListOpContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operation);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				numOp();
				}
				break;
			case T__6:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				listOp();
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
	public static class NumOpContext extends ParserRuleContext {
		public IncOpContext incOp() {
			return getRuleContext(IncOpContext.class,0);
		}
		public DecOpContext decOp() {
			return getRuleContext(DecOpContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_numOp);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				incOp();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				decOp();
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
	public static class IncOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public IncOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterIncOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitIncOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitIncOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncOpContext incOp() throws RecognitionException {
		IncOpContext _localctx = new IncOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__4);
			setState(100);
			match(ID);
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
	public static class DecOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public DecOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitDecOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecOpContext decOp() throws RecognitionException {
		DecOpContext _localctx = new DecOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			match(ID);
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
	public static class ListOpContext extends ParserRuleContext {
		public SetOpContext setOp() {
			return getRuleContext(SetOpContext.class,0);
		}
		public RandOpContext randOp() {
			return getRuleContext(RandOpContext.class,0);
		}
		public ListOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterListOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitListOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitListOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOpContext listOp() throws RecognitionException {
		ListOpContext _localctx = new ListOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listOp);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				setOp();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				randOp();
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
	public static class SetOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterSetOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitSetOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitSetOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetOpContext setOp() throws RecognitionException {
		SetOpContext _localctx = new SetOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__6);
			setState(110);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(111);
				match(T__7);
				setState(112);
				expression();
				setState(113);
				match(T__8);
				}
			}

			setState(117);
			match(T__9);
			setState(118);
			possibleStr();
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
	public static class RandOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public RandOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRandOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRandOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRandOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandOpContext randOp() throws RecognitionException {
		RandOpContext _localctx = new RandOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_randOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
			setState(121);
			match(ID);
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
		enterRule(_localctx, 24, RULE_templateDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(ID);
			setState(125);
			match(T__2);
			setState(126);
			content();
			setState(127);
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
	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 26, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__13);
			setState(130);
			match(T__14);
			setState(131);
			expression();
			setState(132);
			match(T__2);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(133);
					statement();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(139);
			match(T__15);
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
		public RepeatLoopContext repeatLoop() {
			return getRuleContext(RepeatLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
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
		enterRule(_localctx, 28, RULE_loop);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				repeatLoop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				whileLoop();
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
	public static class RepeatLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatLoopContext repeatLoop() throws RecognitionException {
		RepeatLoopContext _localctx = new RepeatLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repeatLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__16);
			setState(146);
			match(T__17);
			setState(147);
			expression();
			setState(148);
			match(T__18);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(149);
					statement();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(155);
			match(T__19);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__16);
			setState(158);
			match(T__20);
			setState(159);
			expression();
			setState(160);
			match(T__2);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(161);
					statement();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(167);
			match(T__19);
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
		enterRule(_localctx, 34, RULE_genStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__21);
			setState(170);
			match(ID);
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
	public static class IoStmtContext extends ParserRuleContext {
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public IoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterIoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitIoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitIoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStmtContext ioStmt() throws RecognitionException {
		IoStmtContext _localctx = new IoStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ioStmt);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				readStmt();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				writeStmt();
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
	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__22);
			setState(177);
			match(ID);
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
	public static class WriteStmtContext extends ParserRuleContext {
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__23);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(180);
				possibleStr();
				}
				break;
			case 2:
				{
				setState(181);
				expression();
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			possibleNum();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(185);
				match(OP);
				setState(186);
				possibleNum();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 44, RULE_possibleNum);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
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
		enterRule(_localctx, 46, RULE_possibleStr);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
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
		enterRule(_localctx, 48, RULE_indexedID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			setState(203);
			match(T__7);
			setState(204);
			expression();
			setState(205);
			match(T__8);
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
		public List<ContentItemContext> contentItem() {
			return getRuleContexts(ContentItemContext.class);
		}
		public ContentItemContext contentItem(int i) {
			return getRuleContext(ContentItemContext.class,i);
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
		enterRule(_localctx, 50, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(207);
					contentItem();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ContentItemContext extends ParserRuleContext {
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public TerminalNode BODY() { return getToken(DSLParser.BODY, 0); }
		public ContentItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterContentItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitContentItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitContentItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentItemContext contentItem() throws RecognitionException {
		ContentItemContext _localctx = new ContentItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_contentItem);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				possibleStr();
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(BODY);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005"+
		"\u00008\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001E\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005^\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\tl\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nt\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0087\b\r\n\r\f\r\u008a\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0090\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0097\b\u000f\n\u000f\f\u000f\u009a\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a3\b\u0010\n\u0010\f\u0010\u00a6\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00af\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b7\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00bc\b\u0015\n\u0015\f\u0015\u00bf\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00c4\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00c9\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005\u0019\u00d1\b\u0019"+
		"\n\u0019\f\u0019\u00d4\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u00d8"+
		"\b\u001a\u0001\u001a\u0004\u0088\u0098\u00a4\u00d2\u0000\u001b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.024\u0000\u0000\u00d8\u00009\u0001\u0000\u0000\u0000\u0002D\u0001"+
		"\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000"+
		"\u0000\bQ\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fa\u0001"+
		"\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012k\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016"+
		"x\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a\u0081\u0001"+
		"\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0091\u0001"+
		"\u0000\u0000\u0000 \u009d\u0001\u0000\u0000\u0000\"\u00a9\u0001\u0000"+
		"\u0000\u0000$\u00ae\u0001\u0000\u0000\u0000&\u00b0\u0001\u0000\u0000\u0000"+
		"(\u00b3\u0001\u0000\u0000\u0000*\u00b8\u0001\u0000\u0000\u0000,\u00c3"+
		"\u0001\u0000\u0000\u0000.\u00c8\u0001\u0000\u0000\u00000\u00ca\u0001\u0000"+
		"\u0000\u00002\u00d2\u0001\u0000\u0000\u00004\u00d7\u0001\u0000\u0000\u0000"+
		"68\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001"+
		"\u0001\u0000\u0000\u0000>E\u0003\u0004\u0002\u0000?E\u0003\n\u0005\u0000"+
		"@E\u0003\u001a\r\u0000AE\u0003\u001c\u000e\u0000BE\u0003\"\u0011\u0000"+
		"CE\u0003$\u0012\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000"+
		"D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0001"+
		"\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HL\u0003\u0006\u0003\u0000"+
		"IL\u0003\b\u0004\u0000JL\u0003\u0018\f\u0000KH\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000"+
		"\u0000\u0000MN\u0005\u001a\u0000\u0000NO\u0005\u0002\u0000\u0000OP\u0003"+
		"*\u0015\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0005\u001a\u0000\u0000"+
		"RS\u0005\u0003\u0000\u0000SX\u0003.\u0017\u0000TU\u0005\u0004\u0000\u0000"+
		"UW\u0003.\u0017\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[^\u0003\f\u0006\u0000\\^\u0003\u0012"+
		"\t\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u000b\u0001"+
		"\u0000\u0000\u0000_b\u0003\u000e\u0007\u0000`b\u0003\u0010\b\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\r\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0005\u0000\u0000de\u0005\u001a\u0000\u0000e\u000f\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000gh\u0005\u001a\u0000\u0000h\u0011"+
		"\u0001\u0000\u0000\u0000il\u0003\u0014\n\u0000jl\u0003\u0016\u000b\u0000"+
		"ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0013\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0007\u0000\u0000ns\u0005\u001a\u0000\u0000op\u0005"+
		"\b\u0000\u0000pq\u0003*\u0015\u0000qr\u0005\t\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000so\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0005\n\u0000\u0000vw\u0003.\u0017\u0000w\u0015\u0001"+
		"\u0000\u0000\u0000xy\u0005\u000b\u0000\u0000yz\u0005\u001a\u0000\u0000"+
		"z\u0017\u0001\u0000\u0000\u0000{|\u0005\f\u0000\u0000|}\u0005\u001a\u0000"+
		"\u0000}~\u0005\u0003\u0000\u0000~\u007f\u00032\u0019\u0000\u007f\u0080"+
		"\u0005\r\u0000\u0000\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u000e\u0000\u0000\u0082\u0083\u0005\u000f\u0000\u0000\u0083\u0084\u0003"+
		"*\u0015\u0000\u0084\u0088\u0005\u0003\u0000\u0000\u0085\u0087\u0003\u0002"+
		"\u0001\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0010\u0000\u0000\u008c\u001b\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0003\u001e\u000f\u0000\u008e\u0090\u0003 \u0010"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0011\u0000"+
		"\u0000\u0092\u0093\u0005\u0012\u0000\u0000\u0093\u0094\u0003*\u0015\u0000"+
		"\u0094\u0098\u0005\u0013\u0000\u0000\u0095\u0097\u0003\u0002\u0001\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0014\u0000\u0000\u009c\u001f\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0011\u0000\u0000\u009e\u009f\u0005\u0015\u0000\u0000"+
		"\u009f\u00a0\u0003*\u0015\u0000\u00a0\u00a4\u0005\u0003\u0000\u0000\u00a1"+
		"\u00a3\u0003\u0002\u0001\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8"+
		"!\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0016\u0000\u0000\u00aa\u00ab"+
		"\u0005\u001a\u0000\u0000\u00ab#\u0001\u0000\u0000\u0000\u00ac\u00af\u0003"+
		"&\u0013\u0000\u00ad\u00af\u0003(\u0014\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af%\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0017\u0000\u0000\u00b1\u00b2\u0005\u001a\u0000\u0000"+
		"\u00b2\'\u0001\u0000\u0000\u0000\u00b3\u00b6\u0005\u0018\u0000\u0000\u00b4"+
		"\u00b7\u0003.\u0017\u0000\u00b5\u00b7\u0003*\u0015\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7)\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bd\u0003,\u0016\u0000\u00b9\u00ba\u0005\u001c\u0000"+
		"\u0000\u00ba\u00bc\u0003,\u0016\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be+\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c4\u0005\u001b\u0000\u0000\u00c1"+
		"\u00c4\u0005\u001a\u0000\u0000\u00c2\u00c4\u00030\u0018\u0000\u00c3\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4-\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005"+
		"\u001d\u0000\u0000\u00c6\u00c9\u0005\u001a\u0000\u0000\u00c7\u00c9\u0003"+
		"0\u0018\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9/\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005\u001a\u0000\u0000\u00cb\u00cc\u0005\b\u0000\u0000"+
		"\u00cc\u00cd\u0003*\u0015\u0000\u00cd\u00ce\u0005\t\u0000\u0000\u00ce"+
		"1\u0001\u0000\u0000\u0000\u00cf\u00d1\u00034\u001a\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d33\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003.\u0017"+
		"\u0000\u00d6\u00d8\u0005\u0019\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d85\u0001\u0000\u0000\u0000"+
		"\u00139DKX]aks\u0088\u008f\u0098\u00a4\u00ae\u00b6\u00bd\u00c3\u00c8\u00d2"+
		"\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}