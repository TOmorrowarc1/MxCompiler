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
		Identifier=1, Int=2, Bool=3, Void=4, Str=5, Integer=6, String=7, True=8, 
		False=9, SelfAdd=10, SelfMinus=11, Plus=12, Minus=13, Mult=14, Div=15, 
		Mod=16, GreatThan=17, LessThan=18, GEThan=19, LEThan=20, NEqual=21, Equal=22, 
		LogicAnd=23, LogicOr=24, LogicNot=25, And=26, Or=27, Xor=28, Not=29, LeftShift=30, 
		RightShift=31, Assign=32, LParen=33, RParen=34, LBracket=35, RBracket=36, 
		LBrace=37, RBrace=38, Question=39, Colon=40, Semi=41, Comma=42, Dot=43, 
		If=44, Else=45, For=46, While=47, Break=48, Continue=49, Return=50, WhiteSpace=51, 
		BlockComment=52, LineComment=53;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_varDeclaration = 2, RULE_vardef = 3, 
		RULE_funcDeclaration = 4, RULE_parameterList = 5, RULE_parameter = 6, 
		RULE_functionCall = 7, RULE_argumentList = 8, RULE_block = 9, RULE_statement = 10, 
		RULE_expr = 11, RULE_assignmentExpr = 12, RULE_logicOrExpr = 13, RULE_logicAndExpr = 14, 
		RULE_bitOrExpr = 15, RULE_bitAndExpr = 16, RULE_equalExpr = 17, RULE_compareExpr = 18, 
		RULE_shiftExpr = 19, RULE_addExpr = 20, RULE_multExpr = 21, RULE_unaryExpr = 22, 
		RULE_postfixExpr = 23, RULE_primary = 24, RULE_literal = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "varDeclaration", "vardef", "funcDeclaration", "parameterList", 
			"parameter", "functionCall", "argumentList", "block", "statement", "expr", 
			"assignmentExpr", "logicOrExpr", "logicAndExpr", "bitOrExpr", "bitAndExpr", 
			"equalExpr", "compareExpr", "shiftExpr", "addExpr", "multExpr", "unaryExpr", 
			"postfixExpr", "primary", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'bool'", "'void'", "'string'", null, null, "'true'", 
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
			null, "Identifier", "Int", "Bool", "Void", "Str", "Integer", "String", 
			"True", "False", "SelfAdd", "SelfMinus", "Plus", "Minus", "Mult", "Div", 
			"Mod", "GreatThan", "LessThan", "GEThan", "LEThan", "NEqual", "Equal", 
			"LogicAnd", "LogicOr", "LogicNot", "And", "Or", "Xor", "Not", "LeftShift", 
			"RightShift", "Assign", "LParen", "RParen", "LBracket", "RBracket", "LBrace", 
			"RBrace", "Question", "Colon", "Semi", "Comma", "Dot", "If", "Else", 
			"For", "While", "Break", "Continue", "Return", "WhiteSpace", "BlockComment", 
			"LineComment"
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
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FuncDeclarationContext> funcDeclaration() {
			return getRuleContexts(FuncDeclarationContext.class);
		}
		public FuncDeclarationContext funcDeclaration(int i) {
			return getRuleContext(FuncDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
					varDeclaration();
					}
					break;
				case 2:
					{
					setState(53);
					funcDeclaration();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(YxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(YxParser.Bool, 0); }
		public TerminalNode Void() { return getToken(YxParser.Void, 0); }
		public TerminalNode Str() { return getToken(YxParser.Str, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public List<TerminalNode> Comma() { return getTokens(YxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(YxParser.Comma, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			vardef();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(65);
				match(Comma);
				setState(66);
				vardef();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(Semi);
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
	public static class VardefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(YxParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Identifier);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(75);
				match(Assign);
				setState(76);
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
	public static class FuncDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(YxParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitFuncDeclaration(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			type();
			setState(80);
			match(Identifier);
			setState(81);
			match(LParen);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				setState(82);
				parameterList();
				}
			}

			setState(85);
			match(RParen);
			setState(86);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(YxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(YxParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			parameter();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(89);
				match(Comma);
				setState(90);
				parameter();
				}
				}
				setState(95);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(Identifier);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(YxParser.Identifier, 0); }
		public TerminalNode LParen() { return getToken(YxParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(YxParser.RParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Identifier);
			setState(100);
			match(LParen);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9160372162L) != 0)) {
				{
				setState(101);
				argumentList();
				}
			}

			setState(104);
			match(RParen);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(YxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(YxParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expr();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(107);
				match(Comma);
				setState(108);
				expr();
				}
				}
				setState(113);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LBrace);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2201368878133246L) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterJmpstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitJmpstmt(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitWhilestmt(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitForstmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefstmtContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDefstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterVarDefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitVarDefstmt(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitIfstmt(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterExpressionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitExpressionstmt(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitReturnstmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockstmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBlockstmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptystmtContext extends StatementContext {
		public TerminalNode Semi() { return getToken(YxParser.Semi, 0); }
		public EmptystmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterEmptystmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitEmptystmt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBrace:
				_localctx = new BlockstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				block();
				}
				break;
			case If:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(If);
				setState(125);
				match(LParen);
				setState(126);
				expr();
				setState(127);
				match(RParen);
				setState(128);
				((IfstmtContext)_localctx).trueStmt = statement();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					match(Else);
					setState(130);
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
				setState(133);
				match(While);
				setState(134);
				match(LParen);
				setState(135);
				expr();
				setState(136);
				match(RParen);
				setState(137);
				statement();
				}
				break;
			case For:
				_localctx = new ForstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(For);
				setState(140);
				match(LParen);
				{
				setState(141);
				((ForstmtContext)_localctx).initializationStatement = statement();
				}
				setState(142);
				match(Semi);
				{
				setState(143);
				((ForstmtContext)_localctx).forConditionExpression = expr();
				}
				setState(144);
				match(Semi);
				{
				setState(145);
				((ForstmtContext)_localctx).stepExpression = expr();
				}
				setState(146);
				((ForstmtContext)_localctx).bodyStatement = statement();
				}
				break;
			case Return:
				_localctx = new ReturnstmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(Return);
				setState(149);
				expr();
				setState(150);
				match(Semi);
				}
				break;
			case Break:
			case Continue:
				_localctx = new JmpstmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				match(Semi);
				}
				break;
			case Int:
			case Bool:
			case Void:
			case Str:
				_localctx = new VarDefstmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				varDeclaration();
				}
				break;
			case Identifier:
			case Integer:
			case String:
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
				setState(155);
				expr();
				setState(156);
				match(Semi);
				}
				break;
			case Semi:
				_localctx = new EmptystmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
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
	public static class ExprContext extends ParserRuleContext {
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitAssignExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignOrExprContext extends AssignmentExprContext {
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public AssignOrExprContext(AssignmentExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterAssignOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitAssignOrExpr(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpr);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignOrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				logicOrExpr();
				}
				break;
			case 2:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				unaryExpr();
				setState(165);
				match(Assign);
				setState(166);
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
	public static class LogicOrAndExprContext extends LogicOrExprContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogicOrAndExprContext(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterLogicOrAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitLogicOrAndExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterLogicOrBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitLogicOrBinaryExpr(this);
		}
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicOrExpr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LogicOrAndExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				logicAndExpr();
				}
				break;
			case 2:
				_localctx = new LogicOrBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((LogicOrBinaryExprContext)_localctx).lhs = logicAndExpr();
				setState(172);
				match(LogicOr);
				setState(173);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterLogicAndBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitLogicAndBinaryExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndbitExprContext extends LogicAndExprContext {
		public BitOrExprContext bitOrExpr() {
			return getRuleContext(BitOrExprContext.class,0);
		}
		public LogicAndbitExprContext(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterLogicAndbitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitLogicAndbitExpr(this);
		}
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicAndExpr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LogicAndbitExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				bitOrExpr();
				}
				break;
			case 2:
				_localctx = new LogicAndBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((LogicAndBinaryExprContext)_localctx).lhs = bitAndExpr();
				setState(179);
				match(LogicAnd);
				setState(180);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBitOrBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBitOrBinaryExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrAndExprContext extends BitOrExprContext {
		public BitAndExprContext bitAndExpr() {
			return getRuleContext(BitAndExprContext.class,0);
		}
		public BitOrAndExprContext(BitOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBitOrAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBitOrAndExpr(this);
		}
	}

	public final BitOrExprContext bitOrExpr() throws RecognitionException {
		BitOrExprContext _localctx = new BitOrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bitOrExpr);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BitOrAndExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				bitAndExpr();
				}
				break;
			case 2:
				_localctx = new BitOrBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((BitOrBinaryExprContext)_localctx).lhs = bitAndExpr();
				setState(186);
				match(Or);
				setState(187);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBitAndEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBitAndEqualExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterBitAndBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitBitAndBinaryExpr(this);
		}
	}

	public final BitAndExprContext bitAndExpr() throws RecognitionException {
		BitAndExprContext _localctx = new BitAndExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bitAndExpr);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new BitAndEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				equalExpr();
				}
				break;
			case 2:
				_localctx = new BitAndBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				((BitAndBinaryExprContext)_localctx).lhs = equalExpr();
				setState(193);
				match(And);
				setState(194);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterEqualCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitEqualCompareExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterEqualBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitEqualBinaryExpr(this);
		}
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		EqualExprContext _localctx = new EqualExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equalExpr);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new EqualCompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				compareExpr();
				}
				break;
			case 2:
				_localctx = new EqualBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((EqualBinaryExprContext)_localctx).lhs = compareExpr();
				setState(200);
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
				setState(201);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterCompareBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitCompareBinaryExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareShiftExprContext extends CompareExprContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public CompareShiftExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterCompareShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitCompareShiftExpr(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compareExpr);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CompareShiftExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				shiftExpr();
				}
				break;
			case 2:
				_localctx = new CompareBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((CompareBinaryExprContext)_localctx).lhs = shiftExpr();
				setState(207);
				((CompareBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
					((CompareBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterShiftAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitShiftAddExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterShiftBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitShiftBinaryExpr(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shiftExpr);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ShiftAddExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				addExpr();
				}
				break;
			case 2:
				_localctx = new ShiftBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((ShiftBinaryExprContext)_localctx).lhs = addExpr();
				setState(214);
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
				setState(215);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterAddMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitAddMultExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterAddBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitAddBinaryExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addExpr);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AddMultExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				multExpr();
				}
				break;
			case 2:
				_localctx = new AddBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((AddBinaryExprContext)_localctx).lhs = multExpr();
				setState(221);
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
				setState(222);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterMultUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitMultUnaryExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterMultBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitMultBinaryExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multExpr);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MultUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				unaryExpr();
				}
				break;
			case 2:
				_localctx = new MultBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((MultBinaryExprContext)_localctx).lhs = unaryExpr();
				setState(228);
				((MultBinaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
					((MultBinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterUnaryOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitUnaryOpExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPostfixExprContext extends UnaryExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryPostfixExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterUnaryPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitUnaryPostfixExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterUnaryPrefixIncDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitUnaryPrefixIncDecExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryExpr);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Integer:
			case String:
			case True:
			case False:
			case LParen:
				_localctx = new UnaryPostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				postfixExpr();
				}
				break;
			case SelfAdd:
			case SelfMinus:
				_localctx = new UnaryPrefixIncDecExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
				setState(235);
				postfixExpr();
				}
				break;
			case Minus:
			case LogicNot:
			case Not:
				_localctx = new UnaryOpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				((UnaryOpExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 570433536L) != 0)) ) {
					((UnaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterPostfixIncDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitPostfixIncDecExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPrimaryExprContext extends PostfixExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PostfixPrimaryExprContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterPostfixPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitPostfixPrimaryExpr(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_postfixExpr);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new PostfixPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				primary();
				}
				break;
			case 2:
				_localctx = new PostfixIncDecExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				primary();
				setState(242);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LParen);
				setState(247);
				expr();
				setState(248);
				match(RParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				functionCall();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(YxParser.Integer, 0); }
		public TerminalNode True() { return getToken(YxParser.True, 0); }
		public TerminalNode False() { return getToken(YxParser.False, 0); }
		public TerminalNode String() { return getToken(YxParser.String, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YxListener ) ((YxListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
		"\u0004\u00015\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002"+
		"\n\u0002\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005"+
		"_\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bn\b\b\n\b\f\bq\t\b\u0001\t\u0001\t\u0005\tu\b\t\n\t"+
		"\f\tx\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a9\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00b7\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00be\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c5\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00cc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00da\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00e1\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e8\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ef\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f5\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00fe\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\n\u0001\u0000\u0002\u0005"+
		"\u0001\u000001\u0001\u0000\u0015\u0016\u0001\u0000\u0011\u0014\u0001\u0000"+
		"\u001e\u001f\u0001\u0000\f\r\u0001\u0000\u000e\u0010\u0001\u0000\n\u000b"+
		"\u0003\u0000\r\r\u0019\u0019\u001d\u001d\u0001\u0000\u0006\t\u0109\u0000"+
		"8\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000"+
		"\u0000\nX\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ec\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000"+
		"\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000"+
		"\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000"+
		"\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000"+
		"\u0000 \u00c4\u0001\u0000\u0000\u0000\"\u00cb\u0001\u0000\u0000\u0000"+
		"$\u00d2\u0001\u0000\u0000\u0000&\u00d9\u0001\u0000\u0000\u0000(\u00e0"+
		"\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000"+
		"\u0000\u0000.\u00f4\u0001\u0000\u0000\u00000\u00fd\u0001\u0000\u0000\u0000"+
		"2\u00ff\u0001\u0000\u0000\u000047\u0003\u0004\u0002\u000057\u0003\b\u0004"+
		"\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0000\u0000\u0001"+
		"<\u0001\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u0003\u0001"+
		"\u0000\u0000\u0000?@\u0003\u0002\u0001\u0000@E\u0003\u0006\u0003\u0000"+
		"AB\u0005*\u0000\u0000BD\u0003\u0006\u0003\u0000CA\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005)\u0000"+
		"\u0000I\u0005\u0001\u0000\u0000\u0000JM\u0005\u0001\u0000\u0000KL\u0005"+
		" \u0000\u0000LN\u0003\u0016\u000b\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0003\u0002\u0001"+
		"\u0000PQ\u0005\u0001\u0000\u0000QS\u0005!\u0000\u0000RT\u0003\n\u0005"+
		"\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0005\"\u0000\u0000VW\u0003\u0012\t\u0000W\t\u0001\u0000"+
		"\u0000\u0000X]\u0003\f\u0006\u0000YZ\u0005*\u0000\u0000Z\\\u0003\f\u0006"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000b\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0005\u0001\u0000"+
		"\u0000b\r\u0001\u0000\u0000\u0000cd\u0005\u0001\u0000\u0000df\u0005!\u0000"+
		"\u0000eg\u0003\u0010\b\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000i\u000f\u0001\u0000"+
		"\u0000\u0000jo\u0003\u0016\u000b\u0000kl\u0005*\u0000\u0000ln\u0003\u0016"+
		"\u000b\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0011\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rv\u0005%\u0000\u0000su\u0003\u0014\n"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0005&\u0000\u0000z\u0013\u0001\u0000\u0000\u0000"+
		"{\u00a0\u0003\u0012\t\u0000|}\u0005,\u0000\u0000}~\u0005!\u0000\u0000"+
		"~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080"+
		"\u0083\u0003\u0014\n\u0000\u0081\u0082\u0005-\u0000\u0000\u0082\u0084"+
		"\u0003\u0014\n\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u00a0\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"/\u0000\u0000\u0086\u0087\u0005!\u0000\u0000\u0087\u0088\u0003\u0016\u000b"+
		"\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u008a\u0003\u0014\n\u0000"+
		"\u008a\u00a0\u0001\u0000\u0000\u0000\u008b\u008c\u0005.\u0000\u0000\u008c"+
		"\u008d\u0005!\u0000\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f"+
		"\u0005)\u0000\u0000\u008f\u0090\u0003\u0016\u000b\u0000\u0090\u0091\u0005"+
		")\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0093\u0003\u0014"+
		"\n\u0000\u0093\u00a0\u0001\u0000\u0000\u0000\u0094\u0095\u00052\u0000"+
		"\u0000\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u0097\u0005)\u0000\u0000"+
		"\u0097\u00a0\u0001\u0000\u0000\u0000\u0098\u0099\u0007\u0001\u0000\u0000"+
		"\u0099\u00a0\u0005)\u0000\u0000\u009a\u00a0\u0003\u0004\u0002\u0000\u009b"+
		"\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005)\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0005)\u0000\u0000\u009f{\u0001\u0000"+
		"\u0000\u0000\u009f|\u0001\u0000\u0000\u0000\u009f\u0085\u0001\u0000\u0000"+
		"\u0000\u009f\u008b\u0001\u0000\u0000\u0000\u009f\u0094\u0001\u0000\u0000"+
		"\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000"+
		"\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u0018\f\u0000"+
		"\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a9\u0003\u001a\r\u0000\u00a4"+
		"\u00a5\u0003,\u0016\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6\u00a7\u0003"+
		"\u0018\f\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a9\u0019\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b0\u0003\u001c\u000e\u0000\u00ab\u00ac\u0003\u001c"+
		"\u000e\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad\u00ae\u0003\u001c"+
		"\u000e\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000"+
		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b7\u0003\u001e\u000f\u0000\u00b2\u00b3\u0003 \u0010"+
		"\u0000\u00b3\u00b4\u0005\u0017\u0000\u0000\u00b4\u00b5\u0003 \u0010\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000"+
		"\u00b8\u00be\u0003 \u0010\u0000\u00b9\u00ba\u0003 \u0010\u0000\u00ba\u00bb"+
		"\u0005\u001b\u0000\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001"+
		"\u0000\u0000\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u00bf\u00c5\u0003"+
		"\"\u0011\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1\u00c2\u0005\u001a"+
		"\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c5!\u0001\u0000\u0000\u0000\u00c6\u00cc\u0003$\u0012\u0000\u00c7"+
		"\u00c8\u0003$\u0012\u0000\u00c8\u00c9\u0007\u0002\u0000\u0000\u00c9\u00ca"+
		"\u0003$\u0012\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc#\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d3\u0003&\u0013\u0000\u00ce\u00cf\u0003&\u0013\u0000"+
		"\u00cf\u00d0\u0007\u0003\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000\u00d4\u00da"+
		"\u0003(\u0014\u0000\u00d5\u00d6\u0003(\u0014\u0000\u00d6\u00d7\u0007\u0004"+
		"\u0000\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8\u00da\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000"+
		"\u0000\u00da\'\u0001\u0000\u0000\u0000\u00db\u00e1\u0003*\u0015\u0000"+
		"\u00dc\u00dd\u0003*\u0015\u0000\u00dd\u00de\u0007\u0005\u0000\u0000\u00de"+
		"\u00df\u0003*\u0015\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00db"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1)\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e8\u0003,\u0016\u0000\u00e3\u00e4\u0003,\u0016"+
		"\u0000\u00e4\u00e5\u0007\u0006\u0000\u0000\u00e5\u00e6\u0003,\u0016\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e8+\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ef\u0003.\u0017\u0000\u00ea\u00eb\u0007\u0007\u0000\u0000\u00eb\u00ef"+
		"\u0003.\u0017\u0000\u00ec\u00ed\u0007\b\u0000\u0000\u00ed\u00ef\u0003"+
		".\u0017\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef-\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f5\u00030\u0018\u0000\u00f1\u00f2\u00030\u0018\u0000\u00f2"+
		"\u00f3\u0007\u0007\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5"+
		"/\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0016\u000b\u0000\u00f8\u00f9\u0005\"\u0000\u0000\u00f9\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fe\u00032\u0019\u0000\u00fb\u00fe\u0005\u0001\u0000"+
		"\u0000\u00fc\u00fe\u0003\u000e\u0007\u0000\u00fd\u00f6\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe1\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0007\t\u0000\u0000\u01003\u0001\u0000\u0000\u0000\u0018"+
		"68EMS]fov\u0083\u009f\u00a8\u00af\u00b6\u00bd\u00c4\u00cb\u00d2\u00d9"+
		"\u00e0\u00e7\u00ee\u00f4\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}