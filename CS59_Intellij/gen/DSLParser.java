// Generated from C:/Users/Owen/Documents/cs59_DSL/CS59_Intellij/DSL.g4 by ANTLR 4.13.2
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
		T__24=25, T__25=26, T__26=27, CNT=28, ID=29, NUM=30, OP=31, STR=32, ENDL=33, 
		COMMENT=34;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_declaration = 2, RULE_numDec = 3, 
		RULE_listDec = 4, RULE_operation = 5, RULE_numOp = 6, RULE_listOp = 7, 
		RULE_templateDec = 8, RULE_conditional = 9, RULE_loop = 10, RULE_genStmt = 11, 
		RULE_ioStmt = 12, RULE_expression = 13, RULE_possibleNum = 14, RULE_possibleStr = 15, 
		RULE_content = 16, RULE_substitution = 17, RULE_indexedID = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "declaration", "numDec", "listDec", "operation", 
			"numOp", "listOp", "templateDec", "conditional", "loop", "genStmt", "ioStmt", 
			"expression", "possibleNum", "possibleStr", "content", "substitution", 
			"indexedID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'.'", "' = '", "': '", "', '", "'Increment '", "'Decrement '", 
			"'Assign '", "' To '", "'Begin Template '", "':'", "'End Template'", 
			"'Begin Check, If '", "'End Check'", "'Begin Loop, '", "'Repeat '", "' Times'", 
			"'While '", "'End Loop'", "'Generate '", "'Read '", "'Write '", "' In '", 
			"' ('", "'\"Count\"'", "'\"Random\"'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "CNT", "ID", "NUM", "OP", "STR", "ENDL", "COMMENT"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9134187974L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(46);
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
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52);
				declaration();
				}
				break;
			case 2:
				{
				setState(53);
				operation();
				}
				break;
			case 3:
				{
				}
				break;
			case 4:
				{
				setState(55);
				conditional();
				}
				break;
			case 5:
				{
				setState(56);
				loop();
				}
				break;
			case 6:
				{
				setState(57);
				genStmt();
				}
				break;
			case 7:
				{
				setState(58);
				ioStmt();
				}
				break;
			}
			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(ENDL);
					}
					} 
				}
				setState(67);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				numDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				listDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(73);
				match(ID);
				setState(74);
				match(T__2);
				setState(75);
				expression();
				}
				}
				break;
			case T__5:
			case T__6:
				{
				setState(76);
				numOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(79);
			match(ID);
			setState(80);
			match(T__3);
			setState(81);
			possibleStr();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(82);
				match(T__4);
				setState(83);
				possibleStr();
				}
				}
				setState(88);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				numOp();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		enterRule(_localctx, 12, RULE_numOp);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(93);
				match(T__5);
				setState(94);
				match(ID);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				match(T__6);
				setState(96);
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
	public static class ListOpContext extends ParserRuleContext {
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DSLParser.ID, i);
		}
		public List<IndexedIDContext> indexedID() {
			return getRuleContexts(IndexedIDContext.class);
		}
		public IndexedIDContext indexedID(int i) {
			return getRuleContext(IndexedIDContext.class,i);
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
		enterRule(_localctx, 14, RULE_listOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(T__7);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(104);
					match(ID);
					}
					break;
				case 2:
					{
					setState(105);
					indexedID();
					}
					break;
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(T__8);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(115);
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
		enterRule(_localctx, 16, RULE_templateDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			match(ID);
			setState(119);
			match(T__10);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(ENDL);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
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
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(132);
			content();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(ENDL);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(139);
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
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__11);
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
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__12);
			setState(148);
			expression();
			setState(149);
			match(T__10);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(ENDL);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(156);
					statement();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(162);
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
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__13);
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
		enterRule(_localctx, 20, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__14);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(171);
				match(T__15);
				setState(172);
				expression();
				setState(173);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(175);
				match(T__17);
				setState(176);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			match(T__10);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(ENDL);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(186);
					statement();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ENDL) {
				{
				{
				setState(192);
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
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
		enterRule(_localctx, 22, RULE_genStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__19);
			setState(201);
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
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public IndexedIDContext indexedID() {
			return getRuleContext(IndexedIDContext.class,0);
		}
		public PossibleStrContext possibleStr() {
			return getRuleContext(PossibleStrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_ioStmt);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(203);
				match(T__20);
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(204);
					match(ID);
					}
					break;
				case 2:
					{
					setState(205);
					indexedID();
					}
					break;
				}
				}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(208);
				match(T__21);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(209);
					possibleStr();
					}
					break;
				case 2:
					{
					setState(210);
					expression();
					}
					break;
				}
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(215);
				possibleNum();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP) {
					{
					{
					setState(216);
					match(OP);
					setState(217);
					possibleNum();
					}
					}
					setState(222);
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
				setState(223);
				possibleStr();
				setState(224);
				match(T__22);
				setState(225);
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
		enterRule(_localctx, 28, RULE_possibleNum);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
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
		enterRule(_localctx, 30, RULE_possibleStr);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
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
		enterRule(_localctx, 32, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(241);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(239);
						substitution();
						}
						break;
					case CNT:
						{
						setState(240);
						match(CNT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 34, RULE_substitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ID);
				}
				break;
			case 2:
				{
				setState(247);
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
		enterRule(_localctx, 36, RULE_indexedID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
			setState(251);
			match(T__23);
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
			case STR:
				{
				setState(252);
				expression();
				}
				break;
			case T__24:
			case T__25:
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
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
			setState(256);
			match(T__26);
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
		"\u0004\u0001\"\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007\u0004\u0007e\b\u0007\u000b"+
		"\u0007\f\u0007f\u0001\u0007\u0001\u0007\u0004\u0007k\b\u0007\u000b\u0007"+
		"\f\u0007l\u0001\u0007\u0004\u0007p\b\u0007\u000b\u0007\f\u0007q\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bz\b\b\n\b\f"+
		"\b}\t\b\u0001\b\u0005\b\u0080\b\b\n\b\f\b\u0083\t\b\u0001\b\u0001\b\u0005"+
		"\b\u0087\b\b\n\b\f\b\u008a\t\b\u0001\b\u0005\b\u008d\b\b\n\b\f\b\u0090"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0098\b\t"+
		"\n\t\f\t\u009b\t\t\u0001\t\u0005\t\u009e\b\t\n\t\f\t\u00a1\t\t\u0001\t"+
		"\u0005\t\u00a4\b\t\n\t\f\t\u00a7\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\n\u0001\n\u0005"+
		"\n\u00b6\b\n\n\n\f\n\u00b9\t\n\u0001\n\u0005\n\u00bc\b\n\n\n\f\n\u00bf"+
		"\t\n\u0001\n\u0005\n\u00c2\b\n\n\n\f\n\u00c5\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00cf\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d4\b\f\u0003\f\u00d6\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00db\b\r\n\r\f\r\u00de\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00e4\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e9\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ee"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u00f2\b\u0010\n\u0010\f\u0010"+
		"\u00f5\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00f9\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ff\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u009f\u00bd\u00f3\u0000\u0013\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$\u0000\u0002\u0002\u0000\u0001\u0001!!\u0001\u0000\u0019\u001a"+
		"\u011a\u0000)\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004"+
		"G\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000"+
		"\u0000\u0000\n[\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000\u000e"+
		"d\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u0093\u0001"+
		"\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u00c8\u0001"+
		"\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a\u00e3\u0001"+
		"\u0000\u0000\u0000\u001c\u00e8\u0001\u0000\u0000\u0000\u001e\u00ed\u0001"+
		"\u0000\u0000\u0000 \u00f3\u0001\u0000\u0000\u0000\"\u00f8\u0001\u0000"+
		"\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000"+
		".0\u0007\u0000\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002;\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u00004<\u0003\u0004\u0002\u00005<\u0003"+
		"\n\u0005\u00006<\u0001\u0000\u0000\u00007<\u0003\u0012\t\u00008<\u0003"+
		"\u0014\n\u00009<\u0003\u0016\u000b\u0000:<\u0003\u0018\f\u0000;4\u0001"+
		"\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000"+
		";7\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=A\u0005\u0002"+
		"\u0000\u0000>@\u0005!\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DH\u0003\u0006\u0003"+
		"\u0000EH\u0003\b\u0004\u0000FH\u0003\u0010\b\u0000GD\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0005\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u001d\u0000\u0000JK\u0005\u0003\u0000\u0000"+
		"KN\u0003\u001a\r\u0000LN\u0003\f\u0006\u0000MI\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005\u001d"+
		"\u0000\u0000PQ\u0005\u0004\u0000\u0000QV\u0003\u001e\u000f\u0000RS\u0005"+
		"\u0005\u0000\u0000SU\u0003\u001e\u000f\u0000TR\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\t\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\\\u0003\f"+
		"\u0006\u0000Z\\\u0003\u000e\u0007\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000"+
		"\u0000^b\u0005\u001d\u0000\u0000_`\u0005\u0007\u0000\u0000`b\u0005\u001d"+
		"\u0000\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\r\u0001"+
		"\u0000\u0000\u0000ce\u0005\b\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hk\u0005\u001d\u0000\u0000ik\u0003$\u0012\u0000"+
		"jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000"+
		"\u0000\u0000np\u0005\t\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0003\u001e\u000f\u0000t\u000f\u0001\u0000\u0000"+
		"\u0000uv\u0005\n\u0000\u0000vw\u0005\u001d\u0000\u0000w{\u0005\u000b\u0000"+
		"\u0000xz\u0005!\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0081\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0007\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0088\u0003 \u0010\u0000\u0085\u0087\u0005!\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008e"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0007\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\f\u0000\u0000\u0092\u0011\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000\u0094\u0095\u0003\u001a"+
		"\r\u0000\u0095\u0099\u0005\u000b\u0000\u0000\u0096\u0098\u0005!\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0000\u0000"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u000e\u0000\u0000\u00a9\u0013\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b1\u0005\u000f\u0000\u0000\u00ab\u00ac\u0005\u0010\u0000"+
		"\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000"+
		"\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0012\u0000\u0000"+
		"\u00b0\u00b2\u0003\u001a\r\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b7\u0005\u000b\u0000\u0000\u00b4\u00b6\u0005!\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bd"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc"+
		"\u0003\u0002\u0001\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0007\u0000\u0000\u0000\u00c1\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0013\u0000\u0000\u00c7\u0015\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0014\u0000\u0000\u00c9\u00ca\u0005\u001d\u0000\u0000\u00ca\u0017"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ce\u0005\u0015\u0000\u0000\u00cc\u00cf"+
		"\u0005\u001d\u0000\u0000\u00cd\u00cf\u0003$\u0012\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0005\u0016\u0000\u0000\u00d1\u00d4\u0003"+
		"\u001e\u000f\u0000\u00d2\u00d4\u0003\u001a\r\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00dc\u0003\u001c"+
		"\u000e\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9\u00db\u0003\u001c"+
		"\u000e\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e4\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003\u001e\u000f\u0000\u00e0\u00e1\u0005\u0017"+
		"\u0000\u0000\u00e1\u00e2\u0005\u001d\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d7\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000"+
		"\u0000\u0000\u00e4\u001b\u0001\u0000\u0000\u0000\u00e5\u00e9\u0005\u001e"+
		"\u0000\u0000\u00e6\u00e9\u0005\u001d\u0000\u0000\u00e7\u00e9\u0003$\u0012"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u001d\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ee\u0005 \u0000\u0000\u00eb\u00ee\u0005\u001d\u0000\u0000"+
		"\u00ec\u00ee\u0003$\u0012\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u001f\u0001\u0000\u0000\u0000\u00ef\u00f2\u0003\"\u0011\u0000\u00f0\u00f2"+
		"\u0005\u001c\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4!\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0005"+
		"\u001d\u0000\u0000\u00f7\u00f9\u0003$\u0012\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9#\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u001d\u0000\u0000\u00fb\u00fe\u0005\u0018\u0000"+
		"\u0000\u00fc\u00ff\u0003\u001a\r\u0000\u00fd\u00ff\u0007\u0001\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u001b\u0000\u0000"+
		"\u0101%\u0001\u0000\u0000\u0000#)1;AGMV[afjlq{\u0081\u0088\u008e\u0099"+
		"\u009f\u00a5\u00b1\u00b7\u00bd\u00c3\u00ce\u00d3\u00d5\u00dc\u00e3\u00e8"+
		"\u00ed\u00f1\u00f3\u00f8\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}