// Generated from src/MicroC_language/parsing/MicroC.g4 by ANTLR 4.5.3
package MicroC_language.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, ASSIGN=3, SEMI=4, GT=5, GE=6, LT=7, LE=8, EQ=9, NEQ=10, PLUS=11, 
		MINUS=12, MUL=13, DIV=14, NOT=15, LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, 
		LBRACKET=20, RBRACKET=21, COLON=22, IF=23, ELSE=24, WHILE=25, CONTINUE=26, 
		BREAK=27, WRITE=28, READ=29, INT=30, VOID=31, COMMENT=32, INTEGER=33, 
		IDENTIFIER=34, WS=35;
	public static final int
		RULE_expr = 0, RULE_expr1 = 1, RULE_expr2 = 2, RULE_exprnegate = 3, RULE_expr3 = 4, 
		RULE_opr = 5, RULE_decl = 6, RULE_type = 7, RULE_stmt = 8, RULE_assignStmt = 9, 
		RULE_continueStmt = 10, RULE_readStmt = 11, RULE_breakStmt = 12, RULE_writeStmt = 13, 
		RULE_ifelseStmt = 14, RULE_whileStmt = 15, RULE_blockStmt = 16, RULE_program = 17, 
		RULE_identifier = 18, RULE_integer = 19;
	public static final String[] ruleNames = {
		"expr", "expr1", "expr2", "exprnegate", "expr3", "opr", "decl", "type", 
		"stmt", "assignStmt", "continueStmt", "readStmt", "breakStmt", "writeStmt", 
		"ifelseStmt", "whileStmt", "blockStmt", "program", "identifier", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'|'", "'='", "';'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='", "'+'", "'-'", "'*'", "'/'", "'!'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "':'", "'if'", "'else'", "'while'", "'continue'", "'break'", 
		"'write'", "'read'", "'int'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "ASSIGN", "SEMI", "GT", "GE", "LT", "LE", "EQ", "NEQ", 
		"PLUS", "MINUS", "MUL", "DIV", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACKET", "RBRACKET", "COLON", "IF", "ELSE", "WHILE", "CONTINUE", "BREAK", 
		"WRITE", "READ", "INT", "VOID", "COMMENT", "INTEGER", "IDENTIFIER", "WS"
	};
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
	public String getGrammarFileName() { return "MicroC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(MicroCParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MicroCParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(MicroCParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				expr1();
				setState(42);
				match(PLUS);
				setState(43);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				expr1();
				setState(46);
				match(MINUS);
				setState(47);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				expr1();
				setState(50);
				match(OR);
				setState(51);
				expr();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode MUL() { return getToken(MicroCParser.MUL, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode DIV() { return getToken(MicroCParser.DIV, 0); }
		public TerminalNode AND() { return getToken(MicroCParser.AND, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr1);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				expr2();
				setState(57);
				match(MUL);
				setState(58);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				expr2();
				setState(61);
				match(DIV);
				setState(62);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				expr2();
				setState(65);
				match(AND);
				setState(66);
				expr1();
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

	public static class Expr2Context extends ParserRuleContext {
		public ExprnegateContext exprnegate() {
			return getRuleContext(ExprnegateContext.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr2);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				exprnegate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expr3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				expr3();
				setState(73);
				opr();
				setState(74);
				expr();
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

	public static class ExprnegateContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(MicroCParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MicroCParser.NOT, 0); }
		public ExprnegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprnegate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExprnegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExprnegate(this);
		}
	}

	public final ExprnegateContext exprnegate() throws RecognitionException {
		ExprnegateContext _localctx = new ExprnegateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprnegate);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(MINUS);
				setState(79);
				expr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(NOT);
				setState(81);
				expr();
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

	public static class Expr3Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(MicroCParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MicroCParser.RBRACKET, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpr3(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr3);
		int _la;
		try {
			setState(92);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				identifier();
				setState(89);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(85);
					match(LBRACKET);
					setState(86);
					expr();
					setState(87);
					match(RBRACKET);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				integer();
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

	public static class OprContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(MicroCParser.GT, 0); }
		public TerminalNode GE() { return getToken(MicroCParser.GE, 0); }
		public TerminalNode LT() { return getToken(MicroCParser.LT, 0); }
		public TerminalNode LE() { return getToken(MicroCParser.LE, 0); }
		public TerminalNode EQ() { return getToken(MicroCParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MicroCParser.NEQ, 0); }
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitOpr(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public TerminalNode LBRACKET() { return getToken(MicroCParser.LBRACKET, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MicroCParser.RBRACKET, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			identifier();
			setState(102);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(98);
				match(LBRACKET);
				setState(99);
				integer();
				setState(100);
				match(RBRACKET);
				}
			}

			setState(104);
			match(SEMI);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MicroCParser.INT, 0); }
		public TerminalNode VOID() { return getToken(MicroCParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VOID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public IfelseStmtContext ifelseStmt() {
			return getRuleContext(IfelseStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				assignStmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				continueStmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				breakStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				readStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				writeStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				ifelseStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				whileStmt();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				blockStmt();
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

	public static class AssignStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MicroCParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public TerminalNode LBRACKET() { return getToken(MicroCParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MicroCParser.RBRACKET, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			identifier();
			setState(123);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(119);
				match(LBRACKET);
				setState(120);
				expr();
				setState(121);
				match(RBRACKET);
				}
			}

			setState(125);
			match(ASSIGN);
			setState(126);
			expr();
			setState(127);
			match(SEMI);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MicroCParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CONTINUE);
			setState(130);
			match(SEMI);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MicroCParser.READ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public TerminalNode LBRACKET() { return getToken(MicroCParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MicroCParser.RBRACKET, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitReadStmt(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(READ);
			setState(133);
			identifier();
			setState(138);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(134);
				match(LBRACKET);
				setState(135);
				expr();
				setState(136);
				match(RBRACKET);
				}
			}

			setState(140);
			match(SEMI);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MicroCParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(BREAK);
			setState(143);
			match(SEMI);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MicroCParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MicroCParser.SEMI, 0); }
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitWriteStmt(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WRITE);
			setState(146);
			expr();
			setState(147);
			match(SEMI);
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

	public static class IfelseStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MicroCParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MicroCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MicroCParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(MicroCParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MicroCParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MicroCParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MicroCParser.RBRACE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MicroCParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MicroCParser.ELSE, i);
		}
		public IfelseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIfelseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIfelseStmt(this);
		}
	}

	public final IfelseStmtContext ifelseStmt() throws RecognitionException {
		IfelseStmtContext _localctx = new IfelseStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifelseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			match(LPAREN);
			setState(151);
			expr();
			setState(152);
			match(RPAREN);
			setState(153);
			match(LBRACE);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				stmt();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << IDENTIFIER))) != 0) );
			setState(159);
			match(RBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(160);
				match(ELSE);
				setState(161);
				match(LBRACE);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					stmt();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << IDENTIFIER))) != 0) );
				setState(167);
				match(RBRACE);
				}
				}
				setState(173);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MicroCParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MicroCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MicroCParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MicroCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MicroCParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(WHILE);
			setState(175);
			match(LPAREN);
			setState(176);
			expr();
			setState(177);
			match(RPAREN);
			setState(178);
			match(LBRACE);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				stmt();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << IDENTIFIER))) != 0) );
			setState(184);
			match(RBRACE);
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

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MicroCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MicroCParser.RBRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(LBRACE);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VOID) {
				{
				{
				setState(187);
				decl();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				stmt();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << IDENTIFIER))) != 0) );
			setState(198);
			match(RBRACE);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MicroCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MicroCParser.RBRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LBRACE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==VOID) {
				{
				{
				setState(201);
				decl();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				stmt();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << IDENTIFIER))) != 0) );
			setState(212);
			match(RBRACE);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MicroCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDENTIFIER);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MicroCParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(INTEGER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5\3\5\5\5U\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\5\6_\n\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bi\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"w\n\n\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u009e\n\20\r\20\16"+
		"\20\u009f\3\20\3\20\3\20\3\20\6\20\u00a6\n\20\r\20\16\20\u00a7\3\20\3"+
		"\20\7\20\u00ac\n\20\f\20\16\20\u00af\13\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\6\21\u00b7\n\21\r\21\16\21\u00b8\3\21\3\21\3\22\3\22\7\22\u00bf\n"+
		"\22\f\22\16\22\u00c2\13\22\3\22\6\22\u00c5\n\22\r\22\16\22\u00c6\3\22"+
		"\3\22\3\23\3\23\7\23\u00cd\n\23\f\23\16\23\u00d0\13\23\3\23\6\23\u00d3"+
		"\n\23\r\23\16\23\u00d4\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\7\f\3\2 !\u00e5\2\67\3"+
		"\2\2\2\4F\3\2\2\2\6N\3\2\2\2\bT\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16b\3\2"+
		"\2\2\20l\3\2\2\2\22v\3\2\2\2\24x\3\2\2\2\26\u0083\3\2\2\2\30\u0086\3\2"+
		"\2\2\32\u0090\3\2\2\2\34\u0093\3\2\2\2\36\u0097\3\2\2\2 \u00b0\3\2\2\2"+
		"\"\u00bc\3\2\2\2$\u00ca\3\2\2\2&\u00d8\3\2\2\2(\u00da\3\2\2\2*8\5\4\3"+
		"\2+,\5\4\3\2,-\7\r\2\2-.\5\2\2\2.8\3\2\2\2/\60\5\4\3\2\60\61\7\16\2\2"+
		"\61\62\5\2\2\2\628\3\2\2\2\63\64\5\4\3\2\64\65\7\4\2\2\65\66\5\2\2\2\66"+
		"8\3\2\2\2\67*\3\2\2\2\67+\3\2\2\2\67/\3\2\2\2\67\63\3\2\2\28\3\3\2\2\2"+
		"9G\5\6\4\2:;\5\6\4\2;<\7\17\2\2<=\5\4\3\2=G\3\2\2\2>?\5\6\4\2?@\7\20\2"+
		"\2@A\5\4\3\2AG\3\2\2\2BC\5\6\4\2CD\7\3\2\2DE\5\4\3\2EG\3\2\2\2F9\3\2\2"+
		"\2F:\3\2\2\2F>\3\2\2\2FB\3\2\2\2G\5\3\2\2\2HO\5\b\5\2IO\5\n\6\2JK\5\n"+
		"\6\2KL\5\f\7\2LM\5\2\2\2MO\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2O\7\3"+
		"\2\2\2PQ\7\16\2\2QU\5\2\2\2RS\7\21\2\2SU\5\2\2\2TP\3\2\2\2TR\3\2\2\2U"+
		"\t\3\2\2\2V[\5&\24\2WX\7\26\2\2XY\5\2\2\2YZ\7\27\2\2Z\\\3\2\2\2[W\3\2"+
		"\2\2[\\\3\2\2\2\\_\3\2\2\2]_\5(\25\2^V\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`"+
		"a\t\2\2\2a\r\3\2\2\2bc\5\20\t\2ch\5&\24\2de\7\26\2\2ef\5(\25\2fg\7\27"+
		"\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\6\2\2k\17\3\2\2\2lm\t"+
		"\3\2\2m\21\3\2\2\2nw\5\24\13\2ow\5\26\f\2pw\5\32\16\2qw\5\30\r\2rw\5\34"+
		"\17\2sw\5\36\20\2tw\5 \21\2uw\5\"\22\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2v"+
		"q\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\23\3\2\2\2x}\5&\24"+
		"\2yz\7\26\2\2z{\5\2\2\2{|\7\27\2\2|~\3\2\2\2}y\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\5\2\2\2\u0081\u0082\7\6\2\2\u0082"+
		"\25\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085\7\6\2\2\u0085\27\3\2\2\2"+
		"\u0086\u0087\7\37\2\2\u0087\u008c\5&\24\2\u0088\u0089\7\26\2\2\u0089\u008a"+
		"\5\2\2\2\u008a\u008b\7\27\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\6\2\2\u008f\31"+
		"\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\7\6\2\2\u0092\33\3\2\2\2\u0093"+
		"\u0094\7\36\2\2\u0094\u0095\5\2\2\2\u0095\u0096\7\6\2\2\u0096\35\3\2\2"+
		"\2\u0097\u0098\7\31\2\2\u0098\u0099\7\22\2\2\u0099\u009a\5\2\2\2\u009a"+
		"\u009b\7\23\2\2\u009b\u009d\7\24\2\2\u009c\u009e\5\22\n\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00ad\7\25\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a5\7"+
		"\24\2\2\u00a4\u00a6\5\22\n\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\25"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\2\2\2\u00b3"+
		"\u00b4\7\23\2\2\u00b4\u00b6\7\24\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7\25\2\2\u00bb!\3\2\2\2\u00bc\u00c0\7\24\2"+
		"\2\u00bd\u00bf\5\16\b\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\25"+
		"\2\2\u00c9#\3\2\2\2\u00ca\u00ce\7\24\2\2\u00cb\u00cd\5\16\b\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5\22\n\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7%\3\2\2\2\u00d8\u00d9\7$\2\2"+
		"\u00d9\'\3\2\2\2\u00da\u00db\7#\2\2\u00db)\3\2\2\2\24\67FNT[^hv}\u008c"+
		"\u009f\u00a7\u00ad\u00b8\u00c0\u00c6\u00ce\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}