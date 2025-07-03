// Generated from parser/Yx.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class YxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Identifier=2, Int=3, Bool=4, Void=5, Integer=6, True=7, False=8, 
		SelfAdd=9, SelfMinus=10, Plus=11, Minus=12, Mult=13, Div=14, Mod=15, GreatThan=16, 
		LessThan=17, GEThan=18, LEThan=19, NEqual=20, Equal=21, LogicAnd=22, LogicOr=23, 
		LogicNot=24, And=25, Or=26, Xor=27, Not=28, LeftShift=29, RightShift=30, 
		Assign=31, LParen=32, RParen=33, LBracket=34, RBracket=35, LBrace=36, 
		RBrace=37, Question=38, Colon=39, Semi=40, Comma=41, Dot=42, If=43, Else=44, 
		For=45, While=46, Break=47, Continue=48, Return=49, WhiteSpace=50, BlockComment=51, 
		LineComment=52;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_type = 4, RULE_def = 5, RULE_expr = 6, RULE_assignmentExpr = 7, RULE_logicOrExpr = 8, 
		RULE_logicAndExpr = 9, RULE_bitOrExpr = 10, RULE_bitAndExpr = 11, RULE_equalExpr = 12, 
		RULE_compareExpr = 13, RULE_shiftExpr = 14, RULE_addExpr = 15, RULE_multExpr = 16, 
		RULE_unaryExpr = 17, RULE_postfixExpr = 18, RULE_primary = 19, RULE_literal = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "block", "statement", "type", "def", "expr", "assignmentExpr", 
			"logicOrExpr", "logicAndExpr", "bitOrExpr", "bitAndExpr", "equalExpr", 
			"compareExpr", "shiftExpr", "addExpr", "multExpr", "unaryExpr", "postfixExpr", 
			"primary", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main()'", null, "'int'", "'bool'", "'void'", null, "'true'", 
			"'flase'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
			"'<'", "'>='", "'<='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'~'", "'<<'", "'>>'", "'='", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'?'", "':'", "';'", "','", "'.'", "'if'", "'else'", "'for'", 
			"'while'", "'break'", "'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Identifier", "Int", "Bool", "Void", "Integer", "True", "False", 
			"SelfAdd", "SelfMinus", "Plus", "Minus", "Mult", "Div", "Mod", "GreatThan", 
			"LessThan", "GEThan", "LEThan", "NEqual", "Equal", "LogicAnd", "LogicOr", 
			"LogicNot", "And", "Or", "Xor", "Not", "LeftShift", "RightShift", "Assign", 
			"LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Question", 
			"Colon", "Semi", "Comma", "Dot", "If", "Else", "For", "While", "Break", 
			"Continue", "Return", "WhiteSpace", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "Yx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YxParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Int) {
				{
				{
				setState(42);
				function();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(YxParser.Int, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Int);
			setState(51);
			match(T__0);
			setState(52);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(YxParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(YxParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LBrace);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1100684439066588L) != 0)) {
				{
				{
				setState(55);
				statement();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(RBrace);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JmpstmtContext extends StatementContext {
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public TerminalNode Break() { return getToken(YxParser.Break, 0); }
		public TerminalNode Continue() { return getToken(YxParser.Continue, 0); }
		public JmpstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitJmpstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends StatementContext {
		public TerminalNode While() { return getToken(YxParser.While, 0); }
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(YxParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends StatementContext {
		public StatementContext initializationStatement;
		public ExprContext forConditionExpression;
		public ExprContext stepExpression;
		public StatementContext bodyStatement;
		public TerminalNode For() { return getToken(YxParser.For, 0); }
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(YxParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(YxParser.Semi, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefstmtContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public List<TerminalNode> Comma() { return getTokens(YxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(YxParser.Comma, i);
		}
		public VarDefstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitVarDefstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends StatementContext {
		public StatementContext trueStmt;
		public StatementContext falseStmt;
		public TerminalNode If() { return getToken(YxParser.If, 0); }
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(YxParser.RParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(YxParser.Else, 0); }
		public IfstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionstmtContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public ExpressionstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitExpressionstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstmtContext extends StatementContext {
		public TerminalNode Return() { return getToken(YxParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public ReturnstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockstmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBlockstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptystmtContext extends StatementContext {
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public EmptystmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitEmptystmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBrace:
				_localctx = new BlockstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				block();
				}
				break;
			case If:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(If);
				setState(65);
				match(LParen);
				setState(66);
				expr();
				setState(67);
				match(RParen);
				setState(68);
				((IfstmtContext)_localctx).trueStmt = statement();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(69);
					match(Else);
					setState(70);
					((IfstmtContext)_localctx).falseStmt = statement();
					}
					break;
				}
				}
				break;
			case While:
				_localctx = new WhilestmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(While);
				setState(74);
				match(LParen);
				setState(75);
				expr();
				setState(76);
				match(RParen);
				setState(77);
				statement();
				}
				break;
			case For:
				_localctx = new ForstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(For);
				setState(80);
				match(LParen);
				{
				setState(81);
				((ForstmtContext)_localctx).initializationStatement = statement();
				}
				setState(82);
				match(Semi);
				{
				setState(83);
				((ForstmtContext)_localctx).forConditionExpression = expr();
				}
				setState(84);
				match(Semi);
				{
				setState(85);
				((ForstmtContext)_localctx).stepExpression = expr();
				}
				setState(86);
				((ForstmtContext)_localctx).bodyStatement = statement();
				}
				break;
			case Return:
				_localctx = new ReturnstmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(Return);
				setState(89);
				expr();
				setState(90);
				match(Semi);
				}
				break;
			case Break:
			case Continue:
				_localctx = new JmpstmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				match(Semi);
				}
				break;
			case Int:
			case Bool:
				_localctx = new VarDefstmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				type();
				setState(95);
				def();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(96);
					match(Comma);
					setState(97);
					def();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(Semi);
				}
				break;
			case Identifier:
			case Integer:
			case True:
			case False:
			case SelfAdd:
			case SelfMinus:
			case Minus:
			case LogicNot:
			case Not:
			case LParen:
				_localctx = new ExpressionstmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				expr();
				setState(106);
				match(Semi);
				}
				break;
			case Semi:
				_localctx = new EmptystmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				match(Semi);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(YxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(YxParser.Bool, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Bool) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(YxParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Identifier);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(114);
				match(Assign);
				setState(115);
				expr();
				}
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
	public static class ExprContext extends ParserRuleContext {
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			assignmentExpr();
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
	public static class AssignmentExprContext extends ParserRuleContext {
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
	 
		public AssignmentExprContext() { }
		public void copyFrom(AssignmentExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends AssignmentExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode Assign() { return getToken(YxParser.Assign, 0); }
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public AssignExprContext(AssignmentExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastLevelExprContext extends AssignmentExprContext {
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public LastLevelExprContext(AssignmentExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLastLevelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExpr);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new LastLevelExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				logicOrExpr();
				}
				break;
			case 2:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				unaryExpr();
				setState(122);
				match(Assign);
				setState(123);
				assignmentExpr();
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
	public static class LogicOrExprContext extends ParserRuleContext {
		public LogicOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOrExpr; }
	 
		public LogicOrExprContext() { }
		public void copyFrom(LogicOrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrUnaryExprContext extends LogicOrExprContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOrUnaryExprContext(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLogicOrUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrBinaryExprContext extends LogicOrExprContext {
		public LogicAndExprContext lhs;
		public LogicAndExprContext rhs;
		public TerminalNode LogicOr() { return getToken(YxParser.LogicOr, 0); }
		public List<LogicAndExprContext> logicAndExpr() {
			return getRuleContexts(LogicAndExprContext.class);
		}
		public LogicAndExprContext logicAndExpr(int i) {
			return getRuleContext(LogicAndExprContext.class,i);
		}
		public LogicOrBinaryExprContext(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLogicOrBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicOrExpr);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new LogicOrUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				logicAndExpr();
				}
				break;
			case 2:
				_localctx = new LogicOrBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((LogicOrBinaryExprContext)_localctx).lhs = logicAndExpr();
				setState(129);
				match(LogicOr);
				setState(130);
				((LogicOrBinaryExprContext)_localctx).rhs = logicAndExpr();
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
	public static class LogicAndExprContext extends ParserRuleContext {
		public LogicAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAndExpr; }
	 
		public LogicAndExprContext() { }
		public void copyFrom(LogicAndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndBinaryExprContext extends LogicAndExprContext {
		public BitAndExprContext lhs;
		public BitAndExprContext rhs;
		public TerminalNode LogicAnd() { return getToken(YxParser.LogicAnd, 0); }
		public List<BitAndExprContext> bitAndExpr() {
			return getRuleContexts(BitAndExprContext.class);
		}
		public BitAndExprContext bitAndExpr(int i) {
			return getRuleContext(BitAndExprContext.class,i);
		}
		public LogicAndBinaryExprContext(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLogicAndBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndbitExprContext extends LogicAndExprContext {
		public BitOrExprContext bitOrExpr() {
			return getRuleContext(BitOrExprContext.class,0);
		}
		public LogicAndbitExprContext(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLogicAndbitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicAndExpr);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new LogicAndbitExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				bitOrExpr();
				}
				break;
			case 2:
				_localctx = new LogicAndBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((LogicAndBinaryExprContext)_localctx).lhs = bitAndExpr();
				setState(136);
				match(LogicAnd);
				setState(137);
				((LogicAndBinaryExprContext)_localctx).rhs = bitAndExpr();
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
	public static class BitOrExprContext extends ParserRuleContext {
		public BitOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOrExpr; }
	 
		public BitOrExprContext() { }
		public void copyFrom(BitOrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrBinaryExprContext extends BitOrExprContext {
		public BitAndExprContext lhs;
		public BitAndExprContext rhs;
		public TerminalNode Or() { return getToken(YxParser.Or, 0); }
		public List<BitAndExprContext> bitAndExpr() {
			return getRuleContexts(BitAndExprContext.class);
		}
		public BitAndExprContext bitAndExpr(int i) {
			return getRuleContext(BitAndExprContext.class,i);
		}
		public BitOrBinaryExprContext(BitOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBitOrBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrAndExprContext extends BitOrExprContext {
		public BitAndExprContext bitAndExpr() {
			return getRuleContext(BitAndExprContext.class,0);
		}
		public BitOrAndExprContext(BitOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBitOrAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOrExprContext bitOrExpr() throws RecognitionException {
		BitOrExprContext _localctx = new BitOrExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bitOrExpr);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BitOrAndExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				bitAndExpr();
				}
				break;
			case 2:
				_localctx = new BitOrBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((BitOrBinaryExprContext)_localctx).lhs = bitAndExpr();
				setState(143);
				match(Or);
				setState(144);
				((BitOrBinaryExprContext)_localctx).rhs = bitAndExpr();
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
	public static class BitAndExprContext extends ParserRuleContext {
		public BitAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAndExpr; }
	 
		public BitAndExprContext() { }
		public void copyFrom(BitAndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndEqualExprContext extends BitAndExprContext {
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public BitAndEqualExprContext(BitAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBitAndEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndBinaryExprContext extends BitAndExprContext {
		public EqualExprContext lhs;
		public EqualExprContext rhs;
		public TerminalNode And() { return getToken(YxParser.And, 0); }
		public List<EqualExprContext> equalExpr() {
			return getRuleContexts(EqualExprContext.class);
		}
		public EqualExprContext equalExpr(int i) {
			return getRuleContext(EqualExprContext.class,i);
		}
		public BitAndBinaryExprContext(BitAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitBitAndBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitAndExprContext bitAndExpr() throws RecognitionException {
		BitAndExprContext _localctx = new BitAndExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bitAndExpr);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BitAndEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				equalExpr();
				}
				break;
			case 2:
				_localctx = new BitAndBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((BitAndBinaryExprContext)_localctx).lhs = equalExpr();
				setState(150);
				match(And);
				setState(151);
				((BitAndBinaryExprContext)_localctx).rhs = equalExpr();
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
	public static class EqualExprContext extends ParserRuleContext {
		public EqualExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpr; }
	 
		public EqualExprContext() { }
		public void copyFrom(EqualExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualCompareExprContext extends EqualExprContext {
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public EqualCompareExprContext(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitEqualCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualBinaryExprContext extends EqualExprContext {
		public CompareExprContext lhs;
		public Token op;
		public CompareExprContext rhs;
		public List<CompareExprContext> compareExpr() {
			return getRuleContexts(CompareExprContext.class);
		}
		public CompareExprContext compareExpr(int i) {
			return getRuleContext(CompareExprContext.class,i);
		}
		public TerminalNode Equal() { return getToken(YxParser.Equal, 0); }
		public TerminalNode NEqual() { return getToken(YxParser.NEqual, 0); }
		public EqualBinaryExprContext(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitEqualBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		EqualExprContext _localctx = new EqualExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalExpr);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualCompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				compareExpr();
				}
				break;
			case 2:
				_localctx = new EqualBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((EqualBinaryExprContext)_localctx).lhs = compareExpr();
				setState(157);
				((EqualBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEqual || _la==Equal) ) {
					((EqualBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				((EqualBinaryExprContext)_localctx).rhs = compareExpr();
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
	public static class CompareExprContext extends ParserRuleContext {
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
	 
		public CompareExprContext() { }
		public void copyFrom(CompareExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareBinaryExprContext extends CompareExprContext {
		public ShiftExprContext lhs;
		public Token op;
		public ShiftExprContext rhs;
		public List<ShiftExprContext> shiftExpr() {
			return getRuleContexts(ShiftExprContext.class);
		}
		public ShiftExprContext shiftExpr(int i) {
			return getRuleContext(ShiftExprContext.class,i);
		}
		public TerminalNode GreatThan() { return getToken(YxParser.GreatThan, 0); }
		public TerminalNode GEThan() { return getToken(YxParser.GEThan, 0); }
		public TerminalNode LEThan() { return getToken(YxParser.LEThan, 0); }
		public TerminalNode LessThan() { return getToken(YxParser.LessThan, 0); }
		public CompareBinaryExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitCompareBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareShiftExprContext extends CompareExprContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public CompareShiftExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitCompareShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compareExpr);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CompareShiftExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				shiftExpr();
				}
				break;
			case 2:
				_localctx = new CompareBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((CompareBinaryExprContext)_localctx).lhs = shiftExpr();
				setState(164);
				((CompareBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
					((CompareBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				((CompareBinaryExprContext)_localctx).rhs = shiftExpr();
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
	public static class ShiftExprContext extends ParserRuleContext {
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
	 
		public ShiftExprContext() { }
		public void copyFrom(ShiftExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftAddExprContext extends ShiftExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public ShiftAddExprContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitShiftAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftBinaryExprContext extends ShiftExprContext {
		public AddExprContext lhs;
		public Token op;
		public AddExprContext rhs;
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode LeftShift() { return getToken(YxParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(YxParser.RightShift, 0); }
		public ShiftBinaryExprContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitShiftBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shiftExpr);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ShiftAddExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				addExpr();
				}
				break;
			case 2:
				_localctx = new ShiftBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				((ShiftBinaryExprContext)_localctx).lhs = addExpr();
				setState(171);
				((ShiftBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
					((ShiftBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				((ShiftBinaryExprContext)_localctx).rhs = addExpr();
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
	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddMultExprContext extends AddExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AddMultExprContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitAddMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddBinaryExprContext extends AddExprContext {
		public MultExprContext lhs;
		public Token op;
		public MultExprContext rhs;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public TerminalNode Plus() { return getToken(YxParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(YxParser.Minus, 0); }
		public AddBinaryExprContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitAddBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_addExpr);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AddMultExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				multExpr();
				}
				break;
			case 2:
				_localctx = new AddBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				((AddBinaryExprContext)_localctx).lhs = multExpr();
				setState(178);
				((AddBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
					((AddBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				((AddBinaryExprContext)_localctx).rhs = multExpr();
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
	public static class MultExprContext extends ParserRuleContext {
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultUnaryExprContext extends MultExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultUnaryExprContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitMultUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultBinaryExprContext extends MultExprContext {
		public UnaryExprContext lhs;
		public Token op;
		public UnaryExprContext rhs;
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public TerminalNode Mult() { return getToken(YxParser.Mult, 0); }
		public TerminalNode Div() { return getToken(YxParser.Div, 0); }
		public TerminalNode Mod() { return getToken(YxParser.Mod, 0); }
		public MultBinaryExprContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitMultBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multExpr);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new MultUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				unaryExpr();
				}
				break;
			case 2:
				_localctx = new MultBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((MultBinaryExprContext)_localctx).lhs = unaryExpr();
				setState(185);
				((MultBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
					((MultBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				((MultBinaryExprContext)_localctx).rhs = unaryExpr();
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
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOpExprContext extends UnaryExprContext {
		public Token op;
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TerminalNode Minus() { return getToken(YxParser.Minus, 0); }
		public TerminalNode LogicNot() { return getToken(YxParser.LogicNot, 0); }
		public TerminalNode Not() { return getToken(YxParser.Not, 0); }
		public UnaryOpExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitUnaryOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPostfixExprContext extends UnaryExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryPostfixExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitUnaryPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPrefixIncDecExprContext extends UnaryExprContext {
		public Token op;
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TerminalNode SelfAdd() { return getToken(YxParser.SelfAdd, 0); }
		public TerminalNode SelfMinus() { return getToken(YxParser.SelfMinus, 0); }
		public UnaryPrefixIncDecExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitUnaryPrefixIncDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryExpr);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Integer:
			case True:
			case False:
			case LParen:
				_localctx = new UnaryPostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				postfixExpr();
				}
				break;
			case SelfAdd:
			case SelfMinus:
				_localctx = new UnaryPrefixIncDecExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((UnaryPrefixIncDecExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SelfAdd || _la==SelfMinus) ) {
					((UnaryPrefixIncDecExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				postfixExpr();
				}
				break;
			case Minus:
			case LogicNot:
			case Not:
				_localctx = new UnaryOpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((UnaryOpExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 285216768L) != 0)) ) {
					((UnaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				postfixExpr();
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
	public static class PostfixExprContext extends ParserRuleContext {
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	 
		public PostfixExprContext() { }
		public void copyFrom(PostfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIncDecExprContext extends PostfixExprContext {
		public Token op;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SelfAdd() { return getToken(YxParser.SelfAdd, 0); }
		public TerminalNode SelfMinus() { return getToken(YxParser.SelfMinus, 0); }
		public PostfixIncDecExprContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitPostfixIncDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPrimaryExprContext extends PostfixExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PostfixPrimaryExprContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitPostfixPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_postfixExpr);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new PostfixPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				primary();
				}
				break;
			case 2:
				_localctx = new PostfixIncDecExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				primary();
				setState(199);
				((PostfixIncDecExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SelfAdd || _la==SelfMinus) ) {
					((PostfixIncDecExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(YxParser.RParen, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(LParen);
				setState(204);
				expr();
				setState(205);
				match(RParen);
				}
				break;
			case Integer:
			case True:
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(Identifier);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(YxParser.Integer, 0); }
		public TerminalNode True() { return getToken(YxParser.True, 0); }
		public TerminalNode False() { return getToken(YxParser.False, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YxVisitor ) return ((YxVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\u0004\u00014\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"9\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003"+
		"\n\u0003\f\u0003f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0085\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0093\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009a\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a1\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00a8\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b6\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bd\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00ca\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d2\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\n\u0001\u0000/0\u0001\u0000"+
		"\u0003\u0004\u0001\u0000\u0014\u0015\u0001\u0000\u0010\u0013\u0001\u0000"+
		"\u001d\u001e\u0001\u0000\u000b\f\u0001\u0000\r\u000f\u0001\u0000\t\n\u0003"+
		"\u0000\f\f\u0018\u0018\u001c\u001c\u0001\u0000\u0006\b\u00dc\u0000-\u0001"+
		"\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000"+
		"\u0000\u0006m\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nq\u0001"+
		"\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000"+
		"\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000"+
		"\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000"+
		"\u0000\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000"+
		"\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000"+
		"\u0000 \u00bc\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000"+
		"$\u00c9\u0001\u0000\u0000\u0000&\u00d1\u0001\u0000\u0000\u0000(\u00d3"+
		"\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005"+
		"\u0000\u0000\u00011\u0001\u0001\u0000\u0000\u000023\u0005\u0003\u0000"+
		"\u000034\u0005\u0001\u0000\u000045\u0003\u0004\u0002\u00005\u0003\u0001"+
		"\u0000\u0000\u00006:\u0005$\u0000\u000079\u0003\u0006\u0003\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=>\u0005%\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?n\u0003\u0004"+
		"\u0002\u0000@A\u0005+\u0000\u0000AB\u0005 \u0000\u0000BC\u0003\f\u0006"+
		"\u0000CD\u0005!\u0000\u0000DG\u0003\u0006\u0003\u0000EF\u0005,\u0000\u0000"+
		"FH\u0003\u0006\u0003\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000Hn\u0001\u0000\u0000\u0000IJ\u0005.\u0000\u0000JK\u0005 \u0000\u0000"+
		"KL\u0003\f\u0006\u0000LM\u0005!\u0000\u0000MN\u0003\u0006\u0003\u0000"+
		"Nn\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000PQ\u0005 \u0000\u0000Q"+
		"R\u0003\u0006\u0003\u0000RS\u0005(\u0000\u0000ST\u0003\f\u0006\u0000T"+
		"U\u0005(\u0000\u0000UV\u0003\f\u0006\u0000VW\u0003\u0006\u0003\u0000W"+
		"n\u0001\u0000\u0000\u0000XY\u00051\u0000\u0000YZ\u0003\f\u0006\u0000Z"+
		"[\u0005(\u0000\u0000[n\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000"+
		"]n\u0005(\u0000\u0000^_\u0003\b\u0004\u0000_d\u0003\n\u0005\u0000`a\u0005"+
		")\u0000\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005(\u0000\u0000"+
		"hn\u0001\u0000\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005(\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000ln\u0005(\u0000\u0000m?\u0001\u0000\u0000\u0000"+
		"m@\u0001\u0000\u0000\u0000mI\u0001\u0000\u0000\u0000mO\u0001\u0000\u0000"+
		"\u0000mX\u0001\u0000\u0000\u0000m\\\u0001\u0000\u0000\u0000m^\u0001\u0000"+
		"\u0000\u0000mi\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0007"+
		"\u0001\u0000\u0000\u0000op\u0007\u0001\u0000\u0000p\t\u0001\u0000\u0000"+
		"\u0000qt\u0005\u0002\u0000\u0000rs\u0005\u001f\u0000\u0000su\u0003\f\u0006"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u000b\u0001"+
		"\u0000\u0000\u0000vw\u0003\u000e\u0007\u0000w\r\u0001\u0000\u0000\u0000"+
		"x~\u0003\u0010\b\u0000yz\u0003\"\u0011\u0000z{\u0005\u001f\u0000\u0000"+
		"{|\u0003\u000e\u0007\u0000|~\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f"+
		"\u0085\u0003\u0012\t\u0000\u0080\u0081\u0003\u0012\t\u0000\u0081\u0082"+
		"\u0005\u0017\u0000\u0000\u0082\u0083\u0003\u0012\t\u0000\u0083\u0085\u0001"+
		"\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001"+
		"\u0000\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u008c\u0003"+
		"\u0014\n\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0089\u0005\u0016"+
		"\u0000\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000"+
		"\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u0093\u0003\u0016"+
		"\u000b\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0005\u001a"+
		"\u0000\u0000\u0090\u0091\u0003\u0016\u000b\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000"+
		"\u0000\u0000\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u009a\u0003\u0018"+
		"\f\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u0097\u0005\u0019\u0000"+
		"\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000"+
		"\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u00a1\u0003\u001a\r\u0000\u009c"+
		"\u009d\u0003\u001a\r\u0000\u009d\u009e\u0007\u0002\u0000\u0000\u009e\u009f"+
		"\u0003\u001a\r\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009b\u0001"+
		"\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1\u0019\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a8\u0003\u001c\u000e\u0000\u00a3\u00a4\u0003"+
		"\u001c\u000e\u0000\u00a4\u00a5\u0007\u0003\u0000\u0000\u00a5\u00a6\u0003"+
		"\u001c\u000e\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00af\u0003\u001e\u000f\u0000\u00aa\u00ab\u0003"+
		"\u001e\u000f\u0000\u00ab\u00ac\u0007\u0004\u0000\u0000\u00ac\u00ad\u0003"+
		"\u001e\u000f\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b6\u0003 \u0010\u0000\u00b1\u00b2\u0003 \u0010"+
		"\u0000\u00b2\u00b3\u0007\u0005\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000"+
		"\u00b7\u00bd\u0003\"\u0011\u0000\u00b8\u00b9\u0003\"\u0011\u0000\u00b9"+
		"\u00ba\u0007\u0006\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00c4\u0003"+
		"$\u0012\u0000\u00bf\u00c0\u0007\u0007\u0000\u0000\u00c0\u00c4\u0003$\u0012"+
		"\u0000\u00c1\u00c2\u0007\b\u0000\u0000\u00c2\u00c4\u0003$\u0012\u0000"+
		"\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5"+
		"\u00ca\u0003&\u0013\u0000\u00c6\u00c7\u0003&\u0013\u0000\u00c7\u00c8\u0007"+
		"\u0007\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca%\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u00cd\u0003\f\u0006"+
		"\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0003(\u0014\u0000\u00d0\u00d2\u0005\u0002\u0000\u0000\u00d1"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0007\t\u0000\u0000\u00d4)\u0001\u0000\u0000\u0000\u0013-:Gdmt}\u0084"+
		"\u008b\u0092\u0099\u00a0\u00a7\u00ae\u00b5\u00bc\u00c3\u00c9\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}