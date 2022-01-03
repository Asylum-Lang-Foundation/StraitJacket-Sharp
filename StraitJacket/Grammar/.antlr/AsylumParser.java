// Generated from /home/gota/Documents/C#/StraitJacket/StraitJacket/Grammar/Asylum.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsylumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, AS=37, ASYNC=38, ATOMIC=39, 
		AWAIT=40, BREAK=41, CASE=42, CONST=43, CONTINUE=44, DEFAULT=45, DO=46, 
		ELIF=47, ELSE=48, ENUM=49, EXPLICITCAST=50, EXTERN=51, FOR=52, FUNCTION=53, 
		GET=54, IF=55, IMPL=56, IMPLICITCAST=57, IN=58, INLINE=59, INTERFACE=60, 
		INTERNAL=61, IS=62, LOOP=63, NAMESPACE=64, NEW=65, OPERATOR=66, PRIVATE=67, 
		PROTECTED=68, PUBLIC=69, RETURN=70, SET=71, SIZEOF=72, STATIC=73, STRUCT=74, 
		SWITCH=75, TYPEDEF=76, TYPEOF=77, UNSAFE=78, UNION=79, USING=80, VOLATILE=81, 
		WHILE=82, ASSIGN_OP_EQ=83, ASSIGN_OP_ADD_EQ=84, ASSIGN_OP_SUB_EQ=85, ASSIGN_OP_EXP_EQ=86, 
		ASSIGN_OP_MUL_EQ=87, ASSIGN_OP_DIV_EQ=88, ASSIGN_OP_MOD_EQ=89, ASSIGN_OP_BITAND_EQ=90, 
		ASSIGN_OP_BITOR_EQ=91, ASSIGN_OP_XOR_EQ=92, ASSIGN_OP_BITFLIP_EQ=93, ASSIGN_OP_LSHIFT_EQ=94, 
		ASSIGN_OP_RSHIFT_EQ=95, ASSIGN_OP_AND_EQ=96, ASSIGN_OP_OR_EQ=97, ASSIGN_OP_NAND_EQ=98, 
		ASSIGN_OP_NOR_EQ=99, ASSIGN_OP_CHECK_NULL=100, OP_ADD=101, OP_ADDRESS_OF=102, 
		OP_AND=103, OP_BITWISE_OR=104, OP_DIV=105, OP_EQ=106, OP_GE=107, OP_GT=108, 
		OP_LAMBDA=109, OP_LE=110, OP_LSHIFT=111, OP_LT=112, OP_MEMBER_ACCESS=113, 
		OP_MINUS_MINUS=114, OP_MOD=115, OP_MUL=116, OP_NAND=117, OP_NE=118, OP_NOR=119, 
		OP_NOT=120, OP_NULL_CHECK=121, OP_OR=122, OP_PLUS_PLUS=123, OP_RANGE=124, 
		OP_REFERENCE_POINTER=125, OP_RET=126, OP_RSHIFT=127, OP_SUB=128, OP_TILDE=129, 
		UNSIGNED=130, SIGNED=131, FIXED=132, INTEGER=133, IDENTIFIER=134, ESCAPE_SEQUENCE=135, 
		STRING=136, LINE_COMMENT=137, COMMENT=138, WHITESPACES=139;
	public static final int
		RULE_init = 0, RULE_universal_statement = 1, RULE_using_statement = 2, 
		RULE_namespace_statement = 3, RULE_extern_function_property = 4, RULE_extern_function_definition = 5, 
		RULE_function_property = 6, RULE_function_definition = 7, RULE_constructor_definition = 8, 
		RULE_operator_definition = 9, RULE_attribute = 10, RULE_enum_definition = 11, 
		RULE_enum_entry = 12, RULE_union_definition = 13, RULE_struct_definition = 14, 
		RULE_interface_definition = 15, RULE_implementation_definition = 16, RULE_implementation_entry = 17, 
		RULE_cast_definition = 18, RULE_typedef_definition = 19, RULE_struct_entry = 20, 
		RULE_struct_entry_property = 21, RULE_code_body = 22, RULE_code_statement = 23, 
		RULE_loop = 24, RULE_while_loop = 25, RULE_do_while_loop = 26, RULE_for_loop = 27, 
		RULE_break_statement = 28, RULE_continue_statement = 29, RULE_if_statement = 30, 
		RULE_switch_case = 31, RULE_switch_rule = 32, RULE_function_call = 33, 
		RULE_constructor_with_initializers = 34, RULE_initializer_value = 35, 
		RULE_return_value = 36, RULE_type_implements_extended = 37, RULE_type_implements_extended_expression = 38, 
		RULE_type_implements = 39, RULE_generic_definition = 40, RULE_generic_specifier = 41, 
		RULE_expression = 42, RULE_primary_expression = 43, RULE_unary_expression = 44, 
		RULE_access_modifier = 45, RULE_variable_assignment = 46, RULE_variable_declaration = 47, 
		RULE_label = 48, RULE_variable_arguments = 49, RULE_variable_parameter = 50, 
		RULE_variable_type = 51, RULE_primitives = 52, RULE_defined_constants = 53, 
		RULE_variable_or_function = 54, RULE_operator = 55, RULE_assignment_operator = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "universal_statement", "using_statement", "namespace_statement", 
			"extern_function_property", "extern_function_definition", "function_property", 
			"function_definition", "constructor_definition", "operator_definition", 
			"attribute", "enum_definition", "enum_entry", "union_definition", "struct_definition", 
			"interface_definition", "implementation_definition", "implementation_entry", 
			"cast_definition", "typedef_definition", "struct_entry", "struct_entry_property", 
			"code_body", "code_statement", "loop", "while_loop", "do_while_loop", 
			"for_loop", "break_statement", "continue_statement", "if_statement", 
			"switch_case", "switch_rule", "function_call", "constructor_with_initializers", 
			"initializer_value", "return_value", "type_implements_extended", "type_implements_extended_expression", 
			"type_implements", "generic_definition", "generic_specifier", "expression", 
			"primary_expression", "unary_expression", "access_modifier", "variable_assignment", 
			"variable_declaration", "label", "variable_arguments", "variable_parameter", 
			"variable_type", "primitives", "defined_constants", "variable_or_function", 
			"operator", "assignment_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'.*'", "';'", "'('", "')'", "'{'", "'}'", "'['", "','", 
			"']'", "':'", "'?'", "'...'", "'This'", "'string'", "'bool'", "'f16'", 
			"'f32'", "'f64'", "'f80'", "'f128'", "'varlen'", "'object'", "'void'", 
			"'func'", "'event'", "'char'", "'wchar'", "'var'", "'unsigned'", "'signed'", 
			"'floating'", "'fixed'", "'true'", "'false'", "'null'", "'as'", "'async'", 
			"'atomic'", "'await'", "'break'", "'case'", "'const'", "'continue'", 
			"'default'", "'do'", "'else if'", "'else'", "'enum'", "'explicitcast'", 
			"'extern'", "'for'", "'fn'", "'get'", "'if'", "'impl'", "'implicitcast'", 
			"'in'", "'inline'", "'interface'", "'internal'", "'is'", "'loop'", "'namespace'", 
			"'new'", "'operator'", null, null, null, "'return'", "'set'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'typeof'", "'unsafe'", 
			"'union'", "'using'", "'volatile'", "'while'", "'='", "'+='", "'-='", 
			"'**='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'~='", "'<<='", 
			"'>>='", "'&&='", "'||='", "'!&='", "'!|='", "'??='", "'+'", "'&'", "'&&'", 
			"'|'", "'/'", "'=='", "'>='", "'>'", "'=>'", "'<='", "'<<'", "'<'", "'^'", 
			"'--'", "'%'", "'*'", "'!&'", "'!='", "'!|'", "'!'", "'??'", "'||'", 
			"'++'", "'..'", "'@'", "'->'", "'>>'", "'-'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AS", "ASYNC", "ATOMIC", "AWAIT", "BREAK", "CASE", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "ELIF", "ELSE", "ENUM", "EXPLICITCAST", "EXTERN", "FOR", 
			"FUNCTION", "GET", "IF", "IMPL", "IMPLICITCAST", "IN", "INLINE", "INTERFACE", 
			"INTERNAL", "IS", "LOOP", "NAMESPACE", "NEW", "OPERATOR", "PRIVATE", 
			"PROTECTED", "PUBLIC", "RETURN", "SET", "SIZEOF", "STATIC", "STRUCT", 
			"SWITCH", "TYPEDEF", "TYPEOF", "UNSAFE", "UNION", "USING", "VOLATILE", 
			"WHILE", "ASSIGN_OP_EQ", "ASSIGN_OP_ADD_EQ", "ASSIGN_OP_SUB_EQ", "ASSIGN_OP_EXP_EQ", 
			"ASSIGN_OP_MUL_EQ", "ASSIGN_OP_DIV_EQ", "ASSIGN_OP_MOD_EQ", "ASSIGN_OP_BITAND_EQ", 
			"ASSIGN_OP_BITOR_EQ", "ASSIGN_OP_XOR_EQ", "ASSIGN_OP_BITFLIP_EQ", "ASSIGN_OP_LSHIFT_EQ", 
			"ASSIGN_OP_RSHIFT_EQ", "ASSIGN_OP_AND_EQ", "ASSIGN_OP_OR_EQ", "ASSIGN_OP_NAND_EQ", 
			"ASSIGN_OP_NOR_EQ", "ASSIGN_OP_CHECK_NULL", "OP_ADD", "OP_ADDRESS_OF", 
			"OP_AND", "OP_BITWISE_OR", "OP_DIV", "OP_EQ", "OP_GE", "OP_GT", "OP_LAMBDA", 
			"OP_LE", "OP_LSHIFT", "OP_LT", "OP_MEMBER_ACCESS", "OP_MINUS_MINUS", 
			"OP_MOD", "OP_MUL", "OP_NAND", "OP_NE", "OP_NOR", "OP_NOT", "OP_NULL_CHECK", 
			"OP_OR", "OP_PLUS_PLUS", "OP_RANGE", "OP_REFERENCE_POINTER", "OP_RET", 
			"OP_RSHIFT", "OP_SUB", "OP_TILDE", "UNSIGNED", "SIGNED", "FIXED", "INTEGER", 
			"IDENTIFIER", "ESCAPE_SEQUENCE", "STRING", "LINE_COMMENT", "COMMENT", 
			"WHITESPACES"
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
	public String getGrammarFileName() { return "Asylum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AsylumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<Universal_statementContext> universal_statement() {
			return getRuleContexts(Universal_statementContext.class);
		}
		public Universal_statementContext universal_statement(int i) {
			return getRuleContext(Universal_statementContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ASYNC) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << ENUM) | (1L << EXTERN) | (1L << FOR) | (1L << FUNCTION) | (1L << IF) | (1L << IMPL) | (1L << INLINE) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEDEF - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (USING - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)) | (1L << (OP_PLUS_PLUS - 64)) | (1L << (OP_REFERENCE_POINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
				{
				{
				setState(114);
				universal_statement();
				}
				}
				setState(119);
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

	public static class Universal_statementContext extends ParserRuleContext {
		public Universal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal_statement; }
	 
		public Universal_statementContext() { }
		public void copyFrom(Universal_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UniversalFunctionContext extends Universal_statementContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public UniversalFunctionContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalStructContext extends Universal_statementContext {
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public UniversalStructContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalTopLevelCodeContext extends Universal_statementContext {
		public Code_statementContext code_statement() {
			return getRuleContext(Code_statementContext.class,0);
		}
		public UniversalTopLevelCodeContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalUsingContext extends Universal_statementContext {
		public Using_statementContext using_statement() {
			return getRuleContext(Using_statementContext.class,0);
		}
		public UniversalUsingContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalNamespaceContext extends Universal_statementContext {
		public Namespace_statementContext namespace_statement() {
			return getRuleContext(Namespace_statementContext.class,0);
		}
		public UniversalNamespaceContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalEnumContext extends Universal_statementContext {
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public UniversalEnumContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalInterfaceContext extends Universal_statementContext {
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public UniversalInterfaceContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalExternFunctionContext extends Universal_statementContext {
		public Extern_function_definitionContext extern_function_definition() {
			return getRuleContext(Extern_function_definitionContext.class,0);
		}
		public UniversalExternFunctionContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalTypedefContext extends Universal_statementContext {
		public Typedef_definitionContext typedef_definition() {
			return getRuleContext(Typedef_definitionContext.class,0);
		}
		public UniversalTypedefContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalImplementationContext extends Universal_statementContext {
		public Implementation_definitionContext implementation_definition() {
			return getRuleContext(Implementation_definitionContext.class,0);
		}
		public UniversalImplementationContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UniversalUnionContext extends Universal_statementContext {
		public Union_definitionContext union_definition() {
			return getRuleContext(Union_definitionContext.class,0);
		}
		public UniversalUnionContext(Universal_statementContext ctx) { copyFrom(ctx); }
	}

	public final Universal_statementContext universal_statement() throws RecognitionException {
		Universal_statementContext _localctx = new Universal_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_universal_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new UniversalUsingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				using_statement();
				}
				break;
			case 2:
				_localctx = new UniversalNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				namespace_statement();
				}
				break;
			case 3:
				_localctx = new UniversalExternFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				extern_function_definition();
				}
				break;
			case 4:
				_localctx = new UniversalFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				function_definition();
				}
				break;
			case 5:
				_localctx = new UniversalEnumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				enum_definition();
				}
				break;
			case 6:
				_localctx = new UniversalUnionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				union_definition();
				}
				break;
			case 7:
				_localctx = new UniversalStructContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				struct_definition();
				}
				break;
			case 8:
				_localctx = new UniversalInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				interface_definition();
				}
				break;
			case 9:
				_localctx = new UniversalImplementationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				implementation_definition();
				}
				break;
			case 10:
				_localctx = new UniversalTypedefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				typedef_definition();
				}
				break;
			case 11:
				_localctx = new UniversalTopLevelCodeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				code_statement();
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

	public static class Using_statementContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(AsylumParser.USING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public TerminalNode STATIC() { return getToken(AsylumParser.STATIC, 0); }
		public Using_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_statement; }
	}

	public final Using_statementContext using_statement() throws RecognitionException {
		Using_statementContext _localctx = new Using_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_using_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(USING);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(134);
				match(STATIC);
				}
			}

			setState(137);
			match(IDENTIFIER);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(138);
				match(T__0);
				setState(139);
				match(IDENTIFIER);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(145);
				match(T__1);
				}
			}

			setState(148);
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

	public static class Namespace_statementContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(AsylumParser.NAMESPACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public Namespace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_statement; }
	}

	public final Namespace_statementContext namespace_statement() throws RecognitionException {
		Namespace_statementContext _localctx = new Namespace_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(NAMESPACE);
			setState(151);
			match(IDENTIFIER);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(152);
				match(T__0);
				setState(153);
				match(IDENTIFIER);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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

	public static class Extern_function_propertyContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(AsylumParser.STATIC, 0); }
		public TerminalNode ASYNC() { return getToken(AsylumParser.ASYNC, 0); }
		public Extern_function_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_function_property; }
	}

	public final Extern_function_propertyContext extern_function_property() throws RecognitionException {
		Extern_function_propertyContext _localctx = new Extern_function_propertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_extern_function_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==ASYNC || _la==STATIC) ) {
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

	public static class Extern_function_definitionContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(AsylumParser.EXTERN, 0); }
		public TerminalNode FUNCTION() { return getToken(AsylumParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Variable_argumentsContext variable_arguments() {
			return getRuleContext(Variable_argumentsContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<Extern_function_propertyContext> extern_function_property() {
			return getRuleContexts(Extern_function_propertyContext.class);
		}
		public Extern_function_propertyContext extern_function_property(int i) {
			return getRuleContext(Extern_function_propertyContext.class,i);
		}
		public TerminalNode OP_RET() { return getToken(AsylumParser.OP_RET, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Extern_function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_function_definition; }
	}

	public final Extern_function_definitionContext extern_function_definition() throws RecognitionException {
		Extern_function_definitionContext _localctx = new Extern_function_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extern_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(163);
				attribute();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(EXTERN);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(170);
				access_modifier();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASYNC || _la==STATIC) {
				{
				{
				setState(173);
				extern_function_property();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(FUNCTION);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(T__3);
			setState(182);
			variable_arguments();
			setState(183);
			match(T__4);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(184);
				match(OP_RET);
				setState(185);
				variable_type(0);
				}
			}

			setState(188);
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

	public static class Function_propertyContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(AsylumParser.STATIC, 0); }
		public TerminalNode INLINE() { return getToken(AsylumParser.INLINE, 0); }
		public TerminalNode ASYNC() { return getToken(AsylumParser.ASYNC, 0); }
		public TerminalNode UNSAFE() { return getToken(AsylumParser.UNSAFE, 0); }
		public Function_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_property; }
	}

	public final Function_propertyContext function_property() throws RecognitionException {
		Function_propertyContext _localctx = new Function_propertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ASYNC - 38)) | (1L << (INLINE - 38)) | (1L << (STATIC - 38)) | (1L << (UNSAFE - 38)))) != 0)) ) {
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AsylumParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Variable_argumentsContext variable_arguments() {
			return getRuleContext(Variable_argumentsContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<Function_propertyContext> function_property() {
			return getRuleContexts(Function_propertyContext.class);
		}
		public Function_propertyContext function_property(int i) {
			return getRuleContext(Function_propertyContext.class,i);
		}
		public Generic_definitionContext generic_definition() {
			return getRuleContext(Generic_definitionContext.class,0);
		}
		public TerminalNode OP_RET() { return getToken(AsylumParser.OP_RET, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(192);
				attribute();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(198);
				access_modifier();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ASYNC - 38)) | (1L << (INLINE - 38)) | (1L << (STATIC - 38)) | (1L << (UNSAFE - 38)))) != 0)) {
				{
				{
				setState(201);
				function_property();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(FUNCTION);
			setState(208);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(209);
				generic_definition();
				}
			}

			setState(212);
			match(T__3);
			setState(213);
			variable_arguments();
			setState(214);
			match(T__4);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(215);
				match(OP_RET);
				setState(216);
				variable_type(0);
				}
			}

			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(219);
					match(OP_LAMBDA);
					setState(220);
					expression(0);
					setState(221);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(223);
					match(T__5);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
						{
						{
						setState(224);
						code_statement();
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(230);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__2:
				{
				setState(233);
				match(T__2);
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

	public static class Constructor_definitionContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Variable_argumentsContext variable_arguments() {
			return getRuleContext(Variable_argumentsContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<Function_propertyContext> function_property() {
			return getRuleContexts(Function_propertyContext.class);
		}
		public Function_propertyContext function_property(int i) {
			return getRuleContext(Function_propertyContext.class,i);
		}
		public Generic_definitionContext generic_definition() {
			return getRuleContext(Generic_definitionContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public Constructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_definition; }
	}

	public final Constructor_definitionContext constructor_definition() throws RecognitionException {
		Constructor_definitionContext _localctx = new Constructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructor_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(236);
				attribute();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(242);
				access_modifier();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					function_property();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(251);
			variable_type(0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(252);
				generic_definition();
				}
			}

			setState(255);
			match(T__3);
			setState(256);
			variable_arguments();
			setState(257);
			match(T__4);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(258);
					match(OP_LAMBDA);
					setState(259);
					expression(0);
					setState(260);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(262);
					match(T__5);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
						{
						{
						setState(263);
						code_statement();
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(269);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__2:
				{
				setState(272);
				match(T__2);
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

	public static class Operator_definitionContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(AsylumParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Variable_argumentsContext variable_arguments() {
			return getRuleContext(Variable_argumentsContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode INLINE() { return getToken(AsylumParser.INLINE, 0); }
		public TerminalNode OP_RET() { return getToken(AsylumParser.OP_RET, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public Operator_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_definition; }
	}

	public final Operator_definitionContext operator_definition() throws RecognitionException {
		Operator_definitionContext _localctx = new Operator_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(275);
				attribute();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(281);
				match(INLINE);
				}
			}

			setState(284);
			match(OPERATOR);
			setState(285);
			operator();
			setState(286);
			match(T__3);
			setState(287);
			variable_arguments();
			setState(288);
			match(T__4);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(289);
				match(OP_RET);
				setState(290);
				variable_type(0);
				}
			}

			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(293);
					match(OP_LAMBDA);
					setState(294);
					expression(0);
					setState(295);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(297);
					match(T__5);
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
						{
						{
						setState(298);
						code_statement();
						}
						}
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(304);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__2:
				{
				setState(307);
				match(T__2);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__7);
			setState(311);
			match(IDENTIFIER);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(312);
				match(T__3);
				setState(313);
				expression(0);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(314);
					match(T__8);
					setState(315);
					expression(0);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(T__4);
				}
			}

			setState(325);
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

	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AsylumParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public List<Enum_entryContext> enum_entry() {
			return getRuleContexts(Enum_entryContext.class);
		}
		public Enum_entryContext enum_entry(int i) {
			return getRuleContext(Enum_entryContext.class,i);
		}
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(327);
				attribute();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(333);
				access_modifier();
				}
			}

			setState(336);
			match(ENUM);
			setState(337);
			match(IDENTIFIER);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(338);
				match(T__10);
				setState(339);
				match(INTEGER);
				}
			}

			setState(342);
			match(T__5);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(343);
				enum_entry();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(344);
					match(T__8);
					setState(345);
					enum_entry();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(353);
			match(T__6);
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

	public static class Enum_entryContext extends ParserRuleContext {
		public Enum_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_entry; }
	 
		public Enum_entryContext() { }
		public void copyFrom(Enum_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnumEntryPlainContext extends Enum_entryContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public EnumEntryPlainContext(Enum_entryContext ctx) { copyFrom(ctx); }
	}
	public static class EnumEntryDataContext extends Enum_entryContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public EnumEntryDataContext(Enum_entryContext ctx) { copyFrom(ctx); }
	}
	public static class EnumEntryStructsContext extends Enum_entryContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public EnumEntryStructsContext(Enum_entryContext ctx) { copyFrom(ctx); }
	}

	public final Enum_entryContext enum_entry() throws RecognitionException {
		Enum_entryContext _localctx = new Enum_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum_entry);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new EnumEntryPlainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(IDENTIFIER);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(356);
					match(ASSIGN_OP_EQ);
					setState(357);
					match(INTEGER);
					}
				}

				}
				break;
			case 2:
				_localctx = new EnumEntryDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(IDENTIFIER);
				setState(361);
				match(T__3);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(362);
					variable_type(0);
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(363);
						match(T__8);
						setState(364);
						variable_type(0);
						}
						}
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(372);
				match(T__4);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(373);
					match(ASSIGN_OP_EQ);
					setState(374);
					match(INTEGER);
					}
				}

				}
				break;
			case 3:
				_localctx = new EnumEntryStructsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(IDENTIFIER);
				setState(378);
				match(T__5);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(379);
					variable_parameter();
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(380);
						match(T__8);
						setState(381);
						variable_parameter();
						}
						}
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(389);
				match(T__6);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(390);
					match(ASSIGN_OP_EQ);
					setState(391);
					match(INTEGER);
					}
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

	public static class Union_definitionContext extends ParserRuleContext {
		public TerminalNode UNSAFE() { return getToken(AsylumParser.UNSAFE, 0); }
		public TerminalNode UNION() { return getToken(AsylumParser.UNION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public Union_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_definition; }
	}

	public final Union_definitionContext union_definition() throws RecognitionException {
		Union_definitionContext _localctx = new Union_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_union_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(396);
				attribute();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(UNSAFE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(403);
				access_modifier();
				}
			}

			setState(406);
			match(UNION);
			setState(407);
			match(IDENTIFIER);
			setState(408);
			match(T__5);
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				variable_parameter();
				setState(410);
				match(T__2);
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0) );
			setState(416);
			match(T__6);
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

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(AsylumParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public Generic_definitionContext generic_definition() {
			return getRuleContext(Generic_definitionContext.class,0);
		}
		public Type_implementsContext type_implements() {
			return getRuleContext(Type_implementsContext.class,0);
		}
		public List<Struct_entryContext> struct_entry() {
			return getRuleContexts(Struct_entryContext.class);
		}
		public Struct_entryContext struct_entry(int i) {
			return getRuleContext(Struct_entryContext.class,i);
		}
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(418);
				attribute();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(424);
				access_modifier();
				}
			}

			setState(427);
			match(STRUCT);
			setState(428);
			match(IDENTIFIER);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(429);
				generic_definition();
				}
			}

			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(432);
				type_implements();
				}
			}

			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(435);
				match(T__5);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST) | (1L << INTERNAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (PUBLIC - 67)) | (1L << (STATIC - 67)) | (1L << (VOLATILE - 67)) | (1L << (UNSIGNED - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (SIGNED - 131)) | (1L << (FIXED - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					{
					setState(436);
					struct_entry();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(T__6);
				}
				break;
			case T__2:
				{
				setState(443);
				match(T__2);
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

	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AsylumParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public Generic_definitionContext generic_definition() {
			return getRuleContext(Generic_definitionContext.class,0);
		}
		public Type_implementsContext type_implements() {
			return getRuleContext(Type_implementsContext.class,0);
		}
		public List<Struct_entryContext> struct_entry() {
			return getRuleContexts(Struct_entryContext.class);
		}
		public Struct_entryContext struct_entry(int i) {
			return getRuleContext(Struct_entryContext.class,i);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(446);
				attribute();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(452);
				access_modifier();
				}
			}

			setState(455);
			match(INTERFACE);
			setState(456);
			match(IDENTIFIER);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(457);
				generic_definition();
				}
			}

			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(460);
				type_implements();
				}
			}

			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(463);
				match(T__5);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST) | (1L << INTERNAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (PUBLIC - 67)) | (1L << (STATIC - 67)) | (1L << (VOLATILE - 67)) | (1L << (UNSIGNED - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (SIGNED - 131)) | (1L << (FIXED - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					{
					setState(464);
					struct_entry();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(T__6);
				}
				break;
			case T__2:
				{
				setState(471);
				match(T__2);
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

	public static class Implementation_definitionContext extends ParserRuleContext {
		public TerminalNode IMPL() { return getToken(AsylumParser.IMPL, 0); }
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Generic_definitionContext generic_definition() {
			return getRuleContext(Generic_definitionContext.class,0);
		}
		public List<Implementation_entryContext> implementation_entry() {
			return getRuleContexts(Implementation_entryContext.class);
		}
		public Implementation_entryContext implementation_entry(int i) {
			return getRuleContext(Implementation_entryContext.class,i);
		}
		public Implementation_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition; }
	}

	public final Implementation_definitionContext implementation_definition() throws RecognitionException {
		Implementation_definitionContext _localctx = new Implementation_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_implementation_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(IMPL);
			setState(475);
			variable_or_function();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(476);
				match(FOR);
				setState(477);
				variable_type(0);
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(480);
				generic_definition();
				}
			}

			setState(483);
			match(T__5);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ASYNC) | (1L << ATOMIC) | (1L << CONST) | (1L << EXPLICITCAST) | (1L << FUNCTION) | (1L << IMPLICITCAST) | (1L << INLINE) | (1L << INTERNAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPERATOR - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (PUBLIC - 66)) | (1L << (STATIC - 66)) | (1L << (UNSAFE - 66)) | (1L << (VOLATILE - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (UNSIGNED - 130)) | (1L << (SIGNED - 130)) | (1L << (FIXED - 130)) | (1L << (IDENTIFIER - 130)))) != 0)) {
				{
				{
				setState(484);
				implementation_entry();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(T__6);
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

	public static class Implementation_entryContext extends ParserRuleContext {
		public Implementation_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_entry; }
	 
		public Implementation_entryContext() { }
		public void copyFrom(Implementation_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImplementationEntryConstructorContext extends Implementation_entryContext {
		public Constructor_definitionContext constructor_definition() {
			return getRuleContext(Constructor_definitionContext.class,0);
		}
		public ImplementationEntryConstructorContext(Implementation_entryContext ctx) { copyFrom(ctx); }
	}
	public static class ImplementationEntryOperatorContext extends Implementation_entryContext {
		public Operator_definitionContext operator_definition() {
			return getRuleContext(Operator_definitionContext.class,0);
		}
		public ImplementationEntryOperatorContext(Implementation_entryContext ctx) { copyFrom(ctx); }
	}
	public static class ImplementationEntryCastContext extends Implementation_entryContext {
		public Cast_definitionContext cast_definition() {
			return getRuleContext(Cast_definitionContext.class,0);
		}
		public ImplementationEntryCastContext(Implementation_entryContext ctx) { copyFrom(ctx); }
	}
	public static class ImplementationEntryFunctionContext extends Implementation_entryContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public ImplementationEntryFunctionContext(Implementation_entryContext ctx) { copyFrom(ctx); }
	}

	public final Implementation_entryContext implementation_entry() throws RecognitionException {
		Implementation_entryContext _localctx = new Implementation_entryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_implementation_entry);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new ImplementationEntryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				function_definition();
				}
				break;
			case 2:
				_localctx = new ImplementationEntryConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				constructor_definition();
				}
				break;
			case 3:
				_localctx = new ImplementationEntryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				operator_definition();
				}
				break;
			case 4:
				_localctx = new ImplementationEntryCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				cast_definition();
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

	public static class Cast_definitionContext extends ParserRuleContext {
		public Variable_parameterContext variable_parameter() {
			return getRuleContext(Variable_parameterContext.class,0);
		}
		public TerminalNode OP_RET() { return getToken(AsylumParser.OP_RET, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IMPLICITCAST() { return getToken(AsylumParser.IMPLICITCAST, 0); }
		public TerminalNode EXPLICITCAST() { return getToken(AsylumParser.EXPLICITCAST, 0); }
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode INLINE() { return getToken(AsylumParser.INLINE, 0); }
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public Cast_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_definition; }
	}

	public final Cast_definitionContext cast_definition() throws RecognitionException {
		Cast_definitionContext _localctx = new Cast_definitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cast_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(498);
				attribute();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(504);
				match(INLINE);
				}
			}

			setState(507);
			_la = _input.LA(1);
			if ( !(_la==EXPLICITCAST || _la==IMPLICITCAST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(508);
			match(T__3);
			setState(509);
			variable_parameter();
			setState(510);
			match(T__4);
			setState(511);
			match(OP_RET);
			setState(512);
			variable_type(0);
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(513);
				match(T__5);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
					{
					{
					setState(514);
					code_statement();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(T__6);
				}
				break;
			case OP_LAMBDA:
				{
				setState(521);
				match(OP_LAMBDA);
				setState(522);
				expression(0);
				setState(523);
				match(T__2);
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

	public static class Typedef_definitionContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(AsylumParser.TYPEDEF, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Typedef_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef_definition; }
	}

	public final Typedef_definitionContext typedef_definition() throws RecognitionException {
		Typedef_definitionContext _localctx = new Typedef_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typedef_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(TYPEDEF);
			setState(528);
			variable_type(0);
			setState(529);
			match(IDENTIFIER);
			setState(530);
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

	public static class Struct_entryContext extends ParserRuleContext {
		public Struct_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_entry; }
	 
		public Struct_entryContext() { }
		public void copyFrom(Struct_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructAccessContext extends Struct_entryContext {
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public StructAccessContext(Struct_entryContext ctx) { copyFrom(ctx); }
	}
	public static class StructDataContext extends Struct_entryContext {
		public Variable_parameterContext variable_parameter() {
			return getRuleContext(Variable_parameterContext.class,0);
		}
		public Struct_entry_propertyContext struct_entry_property() {
			return getRuleContext(Struct_entry_propertyContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public StructDataContext(Struct_entryContext ctx) { copyFrom(ctx); }
	}

	public final Struct_entryContext struct_entry() throws RecognitionException {
		Struct_entryContext _localctx = new Struct_entryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_entry);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new StructDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
					{
					setState(532);
					access_modifier();
					}
				}

				setState(535);
				variable_parameter();
				setState(538);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(536);
					match(T__2);
					}
					break;
				case T__5:
				case OP_LAMBDA:
					{
					setState(537);
					struct_entry_property();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new StructAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				access_modifier();
				setState(541);
				match(T__10);
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

	public static class Struct_entry_propertyContext extends ParserRuleContext {
		public Struct_entry_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_entry_property; }
	 
		public Struct_entry_propertyContext() { }
		public void copyFrom(Struct_entry_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyGetSetContext extends Struct_entry_propertyContext {
		public TerminalNode GET() { return getToken(AsylumParser.GET, 0); }
		public TerminalNode SET() { return getToken(AsylumParser.SET, 0); }
		public List<TerminalNode> OP_LAMBDA() { return getTokens(AsylumParser.OP_LAMBDA); }
		public TerminalNode OP_LAMBDA(int i) {
			return getToken(AsylumParser.OP_LAMBDA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Access_modifierContext> access_modifier() {
			return getRuleContexts(Access_modifierContext.class);
		}
		public Access_modifierContext access_modifier(int i) {
			return getRuleContext(Access_modifierContext.class,i);
		}
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public PropertyGetSetContext(Struct_entry_propertyContext ctx) { copyFrom(ctx); }
	}
	public static class PropertySetOnlyContext extends Struct_entry_propertyContext {
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertySetOnlyContext(Struct_entry_propertyContext ctx) { copyFrom(ctx); }
	}

	public final Struct_entry_propertyContext struct_entry_property() throws RecognitionException {
		Struct_entry_propertyContext _localctx = new Struct_entry_propertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_struct_entry_property);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new PropertyGetSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(T__5);
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
						{
						setState(546);
						access_modifier();
						}
					}

					setState(549);
					match(GET);
					setState(563);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(550);
						match(T__2);
						}
						break;
					case T__5:
						{
						setState(551);
						match(T__5);
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
							{
							{
							setState(552);
							code_statement();
							}
							}
							setState(557);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(558);
						match(T__6);
						}
						break;
					case OP_LAMBDA:
						{
						setState(559);
						match(OP_LAMBDA);
						setState(560);
						expression(0);
						setState(561);
						match(T__2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)) | (1L << (SET - 61)))) != 0)) {
					{
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
						{
						setState(567);
						access_modifier();
						}
					}

					setState(570);
					match(SET);
					setState(584);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(571);
						match(T__2);
						}
						break;
					case T__5:
						{
						setState(572);
						match(T__5);
						setState(576);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
							{
							{
							setState(573);
							code_statement();
							}
							}
							setState(578);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(579);
						match(T__6);
						}
						break;
					case OP_LAMBDA:
						{
						setState(580);
						match(OP_LAMBDA);
						setState(581);
						expression(0);
						setState(582);
						match(T__2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(588);
				match(T__6);
				}
				break;
			case OP_LAMBDA:
				_localctx = new PropertySetOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(OP_LAMBDA);
				setState(590);
				expression(0);
				setState(591);
				match(T__2);
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

	public static class Code_bodyContext extends ParserRuleContext {
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public Code_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_body; }
	}

	public final Code_bodyContext code_body() throws RecognitionException {
		Code_bodyContext _localctx = new Code_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_code_body);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(T__5);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
					{
					{
					setState(596);
					code_statement();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				code_statement();
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

	public static class Code_statementContext extends ParserRuleContext {
		public Code_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_statement; }
	 
		public Code_statementContext() { }
		public void copyFrom(Code_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends Code_statementContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public BreakStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStatementContext extends Code_statementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchCaseStatementContext extends Code_statementContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public SwitchCaseStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopStatementContext extends Code_statementContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public WhileLoopStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionStatementContext extends Code_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class IndentedStatementContext extends Code_statementContext {
		public TerminalNode UNSAFE() { return getToken(AsylumParser.UNSAFE, 0); }
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public IndentedStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ForLoopStatementContext extends Code_statementContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ForLoopStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends Code_statementContext {
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public ReturnStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclarationStatementContext extends Code_statementContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public VariableDeclarationStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class LoopStatementContext extends Code_statementContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class DoWhileLoopStatementContext extends Code_statementContext {
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public DoWhileLoopStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends Code_statementContext {
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public ContinueStatementContext(Code_statementContext ctx) { copyFrom(ctx); }
	}

	public final Code_statementContext code_statement() throws RecognitionException {
		Code_statementContext _localctx = new Code_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_code_statement);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				variable_declaration();
				setState(607);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				loop();
				}
				break;
			case 3:
				_localctx = new WhileLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				while_loop();
				}
				break;
			case 4:
				_localctx = new DoWhileLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				do_while_loop();
				}
				break;
			case 5:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				for_loop();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				break_statement();
				}
				break;
			case 7:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				continue_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchCaseStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(616);
				switch_case();
				}
				break;
			case 10:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(617);
				expression(0);
				setState(618);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new IndentedStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(620);
					match(UNSAFE);
					}
				}

				setState(623);
				match(T__5);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
					{
					{
					setState(624);
					code_statement();
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
				match(T__6);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(631);
				return_value();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(AsylumParser.LOOP, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LOOP);
			setState(635);
			code_body();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AsylumParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(WHILE);
			setState(638);
			expression(0);
			setState(639);
			code_body();
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AsylumParser.DO, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AsylumParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(DO);
			setState(642);
			code_body();
			setState(643);
			match(WHILE);
			setState(644);
			expression(0);
			setState(645);
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

	public static class For_loopContext extends ParserRuleContext {
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEachLoopNoParensContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
		public TerminalNode IN() { return getToken(AsylumParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Variable_parameterContext variable_parameter() {
			return getRuleContext(Variable_parameterContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public ForEachLoopNoParensContext(For_loopContext ctx) { copyFrom(ctx); }
	}
	public static class TraditionalForLoopContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TraditionalForLoopContext(For_loopContext ctx) { copyFrom(ctx); }
	}
	public static class TraditionalForLoopNoParensContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TraditionalForLoopNoParensContext(For_loopContext ctx) { copyFrom(ctx); }
	}
	public static class ForEachLoopContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
		public TerminalNode IN() { return getToken(AsylumParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Variable_parameterContext variable_parameter() {
			return getRuleContext(Variable_parameterContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public ForEachLoopContext(For_loopContext ctx) { copyFrom(ctx); }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_loop);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new TraditionalForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(FOR);
				setState(648);
				match(T__3);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(649);
					variable_assignment();
					}
					break;
				case 2:
					{
					setState(650);
					variable_declaration();
					}
					break;
				}
				setState(653);
				match(T__2);
				setState(654);
				expression(0);
				setState(655);
				match(T__2);
				setState(656);
				expression(0);
				setState(657);
				match(T__4);
				setState(658);
				code_body();
				}
				break;
			case 2:
				_localctx = new TraditionalForLoopNoParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(FOR);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(661);
					variable_assignment();
					}
					break;
				case 2:
					{
					setState(662);
					variable_declaration();
					}
					break;
				}
				setState(665);
				match(T__2);
				setState(666);
				expression(0);
				setState(667);
				match(T__2);
				setState(668);
				expression(0);
				setState(669);
				code_body();
				}
				break;
			case 3:
				_localctx = new ForEachLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				match(FOR);
				setState(672);
				match(T__3);
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(673);
					variable_parameter();
					}
					break;
				case 2:
					{
					setState(674);
					match(IDENTIFIER);
					}
					break;
				}
				setState(677);
				match(IN);
				setState(678);
				expression(0);
				setState(679);
				match(T__4);
				setState(680);
				code_body();
				}
				break;
			case 4:
				_localctx = new ForEachLoopNoParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				match(FOR);
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(683);
					variable_parameter();
					}
					break;
				case 2:
					{
					setState(684);
					match(IDENTIFIER);
					}
					break;
				}
				setState(687);
				match(IN);
				setState(688);
				expression(0);
				setState(689);
				code_body();
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AsylumParser.BREAK, 0); }
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(BREAK);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(694);
				match(INTEGER);
				}
			}

			setState(697);
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

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AsylumParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(CONTINUE);
			setState(700);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AsylumParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Code_bodyContext> code_body() {
			return getRuleContexts(Code_bodyContext.class);
		}
		public Code_bodyContext code_body(int i) {
			return getRuleContext(Code_bodyContext.class,i);
		}
		public TerminalNode CONST() { return getToken(AsylumParser.CONST, 0); }
		public List<TerminalNode> ELIF() { return getTokens(AsylumParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(AsylumParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(AsylumParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(702);
				match(CONST);
				}
			}

			setState(705);
			match(IF);
			setState(706);
			expression(0);
			setState(707);
			code_body();
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					match(ELIF);
					setState(709);
					expression(0);
					setState(710);
					code_body();
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(717);
				match(ELSE);
				setState(718);
				code_body();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
	 
		public Switch_caseContext() { }
		public void copyFrom(Switch_caseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchCaseContext extends Switch_caseContext {
		public TerminalNode SWITCH() { return getToken(AsylumParser.SWITCH, 0); }
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<Switch_ruleContext> switch_rule() {
			return getRuleContexts(Switch_ruleContext.class);
		}
		public Switch_ruleContext switch_rule(int i) {
			return getRuleContext(Switch_ruleContext.class,i);
		}
		public SwitchCaseContext(Switch_caseContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchCaseNoParensContext extends Switch_caseContext {
		public TerminalNode SWITCH() { return getToken(AsylumParser.SWITCH, 0); }
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public List<Switch_ruleContext> switch_rule() {
			return getRuleContexts(Switch_ruleContext.class);
		}
		public Switch_ruleContext switch_rule(int i) {
			return getRuleContext(Switch_ruleContext.class,i);
		}
		public SwitchCaseNoParensContext(Switch_caseContext ctx) { copyFrom(ctx); }
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switch_case);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new SwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(SWITCH);
				setState(722);
				match(T__3);
				setState(723);
				variable_or_function();
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_LAMBDA) {
					{
					setState(724);
					match(OP_LAMBDA);
					setState(725);
					match(IDENTIFIER);
					}
				}

				setState(728);
				match(T__4);
				setState(729);
				match(T__5);
				setState(731); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(730);
					switch_rule();
					}
					}
					setState(733); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(735);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new SwitchCaseNoParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(SWITCH);
				setState(738);
				variable_or_function();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_LAMBDA) {
					{
					setState(739);
					match(OP_LAMBDA);
					setState(740);
					match(IDENTIFIER);
					}
				}

				setState(743);
				match(T__5);
				setState(745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(744);
					switch_rule();
					}
					}
					setState(747); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(749);
				match(T__6);
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

	public static class Switch_ruleContext extends ParserRuleContext {
		public Switch_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_rule; }
	 
		public Switch_ruleContext() { }
		public void copyFrom(Switch_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseExpressionContext extends Switch_ruleContext {
		public TerminalNode BREAK() { return getToken(AsylumParser.BREAK, 0); }
		public List<TerminalNode> CASE() { return getTokens(AsylumParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(AsylumParser.CASE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public CaseExpressionContext(Switch_ruleContext ctx) { copyFrom(ctx); }
	}
	public static class CaseDefaultContext extends Switch_ruleContext {
		public TerminalNode DEFAULT() { return getToken(AsylumParser.DEFAULT, 0); }
		public TerminalNode BREAK() { return getToken(AsylumParser.BREAK, 0); }
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public CaseDefaultContext(Switch_ruleContext ctx) { copyFrom(ctx); }
	}

	public final Switch_ruleContext switch_rule() throws RecognitionException {
		Switch_ruleContext _localctx = new Switch_ruleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_rule);
		int _la;
		try {
			int _alt;
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				_localctx = new CaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(753);
					match(CASE);
					setState(754);
					expression(0);
					setState(755);
					match(T__10);
					}
					}
					setState(759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(761);
						code_statement();
						}
						} 
					}
					setState(766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(767);
				match(BREAK);
				setState(768);
				match(T__2);
				}
				break;
			case DEFAULT:
				_localctx = new CaseDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(DEFAULT);
				setState(771);
				match(T__10);
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(772);
						code_statement();
						}
						} 
					}
					setState(777);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(778);
				match(BREAK);
				setState(779);
				match(T__2);
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

	public static class Function_callContext extends ParserRuleContext {
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(AsylumParser.AWAIT, 0); }
		public Generic_specifierContext generic_specifier() {
			return getRuleContext(Generic_specifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(782);
				match(AWAIT);
				}
			}

			setState(785);
			variable_or_function();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(786);
				generic_specifier();
				}
			}

			setState(789);
			match(T__3);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << CONST))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
				{
				setState(791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(790);
					label();
					}
					break;
				}
				setState(793);
				expression(0);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(794);
					match(T__8);
					setState(796);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(795);
						label();
						}
						break;
					}
					setState(798);
					expression(0);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(806);
			match(T__4);
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

	public static class Constructor_with_initializersContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AsylumParser.NEW, 0); }
		public List<Initializer_valueContext> initializer_value() {
			return getRuleContexts(Initializer_valueContext.class);
		}
		public Initializer_valueContext initializer_value(int i) {
			return getRuleContext(Initializer_valueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Constructor_with_initializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_with_initializers; }
	}

	public final Constructor_with_initializersContext constructor_with_initializers() throws RecognitionException {
		Constructor_with_initializersContext _localctx = new Constructor_with_initializersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructor_with_initializers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(808);
				match(NEW);
				}
			}

			setState(811);
			variable_type(0);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(812);
				match(T__3);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << CONST))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
					{
					setState(813);
					expression(0);
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(814);
						match(T__8);
						setState(815);
						expression(0);
						}
						}
						setState(820);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(823);
				match(T__4);
				}
			}

			setState(826);
			match(T__5);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << CONST))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
				{
				setState(827);
				initializer_value();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(828);
					match(T__8);
					setState(829);
					initializer_value();
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(837);
			match(T__6);
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

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initializer_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(839);
				match(IDENTIFIER);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(840);
					match(T__0);
					setState(841);
					match(IDENTIFIER);
					}
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(847);
				match(T__10);
				}
				break;
			}
			setState(850);
			expression(0);
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

	public static class Return_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(AsylumParser.RETURN, 0); }
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_value);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case ATOMIC:
			case AWAIT:
			case CONST:
			case NEW:
			case SIZEOF:
			case STATIC:
			case TYPEOF:
			case UNSAFE:
			case VOLATILE:
			case OP_ADD:
			case OP_ADDRESS_OF:
			case OP_MEMBER_ACCESS:
			case OP_MINUS_MINUS:
			case OP_MUL:
			case OP_NOT:
			case OP_PLUS_PLUS:
			case OP_REFERENCE_POINTER:
			case OP_SUB:
			case OP_TILDE:
			case UNSIGNED:
			case SIGNED:
			case FIXED:
			case INTEGER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				expression(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(RETURN);
				setState(854);
				expression(0);
				setState(855);
				match(T__2);
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

	public static class Type_implements_extendedContext extends ParserRuleContext {
		public Type_implements_extended_expressionContext type_implements_extended_expression() {
			return getRuleContext(Type_implements_extended_expressionContext.class,0);
		}
		public Type_implements_extendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_implements_extended; }
	}

	public final Type_implements_extendedContext type_implements_extended() throws RecognitionException {
		Type_implements_extendedContext _localctx = new Type_implements_extendedContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_type_implements_extended);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(T__10);
			setState(860);
			type_implements_extended_expression(0);
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

	public static class Type_implements_extended_expressionContext extends ParserRuleContext {
		public Type_implements_extended_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_implements_extended_expression; }
	 
		public Type_implements_extended_expressionContext() { }
		public void copyFrom(Type_implements_extended_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeImplementsExprSingleContext extends Type_implements_extended_expressionContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TypeImplementsExprSingleContext(Type_implements_extended_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeImplementsExprAndContext extends Type_implements_extended_expressionContext {
		public List<Type_implements_extended_expressionContext> type_implements_extended_expression() {
			return getRuleContexts(Type_implements_extended_expressionContext.class);
		}
		public Type_implements_extended_expressionContext type_implements_extended_expression(int i) {
			return getRuleContext(Type_implements_extended_expressionContext.class,i);
		}
		public TypeImplementsExprAndContext(Type_implements_extended_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeImplementsExprOrContext extends Type_implements_extended_expressionContext {
		public List<Type_implements_extended_expressionContext> type_implements_extended_expression() {
			return getRuleContexts(Type_implements_extended_expressionContext.class);
		}
		public Type_implements_extended_expressionContext type_implements_extended_expression(int i) {
			return getRuleContext(Type_implements_extended_expressionContext.class,i);
		}
		public TerminalNode OP_BITWISE_OR() { return getToken(AsylumParser.OP_BITWISE_OR, 0); }
		public TypeImplementsExprOrContext(Type_implements_extended_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeImplementsExprParenthesisContext extends Type_implements_extended_expressionContext {
		public Type_implements_extended_expressionContext type_implements_extended_expression() {
			return getRuleContext(Type_implements_extended_expressionContext.class,0);
		}
		public TypeImplementsExprParenthesisContext(Type_implements_extended_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Type_implements_extended_expressionContext type_implements_extended_expression() throws RecognitionException {
		return type_implements_extended_expression(0);
	}

	private Type_implements_extended_expressionContext type_implements_extended_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_implements_extended_expressionContext _localctx = new Type_implements_extended_expressionContext(_ctx, _parentState);
		Type_implements_extended_expressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_type_implements_extended_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				_localctx = new TypeImplementsExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(863);
				match(T__3);
				setState(864);
				type_implements_extended_expression(0);
				setState(865);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new TypeImplementsExprSingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(867);
				variable_type(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(876);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						_localctx = new TypeImplementsExprOrContext(new Type_implements_extended_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_implements_extended_expression);
						setState(870);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(871);
						match(OP_BITWISE_OR);
						setState(872);
						type_implements_extended_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new TypeImplementsExprAndContext(new Type_implements_extended_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_implements_extended_expression);
						setState(873);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(874);
						match(T__8);
						setState(875);
						type_implements_extended_expression(3);
						}
						break;
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_implementsContext extends ParserRuleContext {
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public Type_implementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_implements; }
	}

	public final Type_implementsContext type_implements() throws RecognitionException {
		Type_implementsContext _localctx = new Type_implementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_implements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__10);
			setState(882);
			variable_type(0);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(883);
				match(T__8);
				setState(884);
				variable_type(0);
				}
				}
				setState(889);
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

	public static class Generic_definitionContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public List<Type_implements_extendedContext> type_implements_extended() {
			return getRuleContexts(Type_implements_extendedContext.class);
		}
		public Type_implements_extendedContext type_implements_extended(int i) {
			return getRuleContext(Type_implements_extendedContext.class,i);
		}
		public Generic_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_definition; }
	}

	public final Generic_definitionContext generic_definition() throws RecognitionException {
		Generic_definitionContext _localctx = new Generic_definitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generic_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(OP_LT);
			setState(891);
			match(IDENTIFIER);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(892);
				type_implements_extended();
				}
			}

			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(895);
				match(T__8);
				setState(896);
				match(IDENTIFIER);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(897);
					type_implements_extended();
					}
				}

				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(905);
			match(OP_GT);
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

	public static class Generic_specifierContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public Generic_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_specifier; }
	}

	public final Generic_specifierContext generic_specifier() throws RecognitionException {
		Generic_specifierContext _localctx = new Generic_specifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_generic_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(OP_LT);
			setState(908);
			variable_type(0);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(909);
				match(T__8);
				setState(910);
				variable_type(0);
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			match(OP_GT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCodeContext extends ExpressionContext {
		public TerminalNode UNSAFE() { return getToken(AsylumParser.UNSAFE, 0); }
		public List<Code_statementContext> code_statement() {
			return getRuleContexts(Code_statementContext.class);
		}
		public Code_statementContext code_statement(int i) {
			return getRuleContext(Code_statementContext.class,i);
		}
		public ExprCodeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTernaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprTernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public TerminalNode OP_LE() { return getToken(AsylumParser.OP_LE, 0); }
		public TerminalNode OP_GE() { return getToken(AsylumParser.OP_GE, 0); }
		public TerminalNode IS() { return getToken(AsylumParser.IS, 0); }
		public TerminalNode AS() { return getToken(AsylumParser.AS, 0); }
		public ExprComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AsylumParser.STRING, 0); }
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNullCheckContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_NULL_CHECK() { return getToken(AsylumParser.OP_NULL_CHECK, 0); }
		public ExprNullCheckContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCommaContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprCommaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprShiftContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_LSHIFT() { return getToken(AsylumParser.OP_LSHIFT, 0); }
		public TerminalNode OP_RSHIFT() { return getToken(AsylumParser.OP_RSHIFT, 0); }
		public ExprShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCallReturnedFunctionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprCallReturnedFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAdditiveContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_ADD() { return getToken(AsylumParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(AsylumParser.OP_SUB, 0); }
		public ExprAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_BITWISE_OR() { return getToken(AsylumParser.OP_BITWISE_OR, 0); }
		public ExprBitOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrimaryContext extends ExpressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public ExprPrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_AND() { return getToken(AsylumParser.OP_AND, 0); }
		public ExprAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEqualityComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_EQ() { return getToken(AsylumParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(AsylumParser.OP_NE, 0); }
		public ExprEqualityComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprXorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_MEMBER_ACCESS() { return getToken(AsylumParser.OP_MEMBER_ACCESS, 0); }
		public ExprXorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(AsylumParser.OP_OR, 0); }
		public ExprOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMultiplicativeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(AsylumParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(AsylumParser.OP_MOD, 0); }
		public ExprMultiplicativeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprUnaryContext extends ExpressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public ExprBitAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRangeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_RANGE() { return getToken(AsylumParser.OP_RANGE, 0); }
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public ExprRangeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntegerContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public ExprIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExprAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLambdaContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public ExprLambdaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSubprimaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_PLUS_PLUS() { return getToken(AsylumParser.OP_PLUS_PLUS, 0); }
		public TerminalNode OP_MINUS_MINUS() { return getToken(AsylumParser.OP_MINUS_MINUS, 0); }
		public TerminalNode OP_NOT() { return getToken(AsylumParser.OP_NOT, 0); }
		public ExprSubprimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(919);
				match(T__3);
				setState(920);
				expression(0);
				setState(921);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(923);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(924);
				unary_expression();
				}
				break;
			case 4:
				{
				_localctx = new ExprCodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(925);
					match(UNSAFE);
					}
				}

				setState(928);
				match(T__5);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (RETURN - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (SWITCH - 65)) | (1L << (TYPEOF - 65)) | (1L << (UNSAFE - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)) | (1L << (OP_ADD - 65)) | (1L << (OP_ADDRESS_OF - 65)) | (1L << (OP_MEMBER_ACCESS - 65)) | (1L << (OP_MINUS_MINUS - 65)) | (1L << (OP_MUL - 65)) | (1L << (OP_NOT - 65)) | (1L << (OP_PLUS_PLUS - 65)) | (1L << (OP_REFERENCE_POINTER - 65)) | (1L << (OP_SUB - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OP_TILDE - 129)) | (1L << (UNSIGNED - 129)) | (1L << (SIGNED - 129)) | (1L << (FIXED - 129)) | (1L << (INTEGER - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (STRING - 129)))) != 0)) {
					{
					{
					setState(929);
					code_statement();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(936);
				match(INTEGER);
				}
				break;
			case 6:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(937);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1002);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRangeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(940);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(941);
						match(OP_RANGE);
						setState(943);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN_OP_EQ) {
							{
							setState(942);
							match(ASSIGN_OP_EQ);
							}
						}

						setState(945);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultiplicativeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(946);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(947);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (OP_DIV - 105)) | (1L << (OP_MOD - 105)) | (1L << (OP_MUL - 105)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(948);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(949);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(950);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(951);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(952);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(953);
						_la = _input.LA(1);
						if ( !(_la==OP_LSHIFT || _la==OP_RSHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(954);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(955);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(956);
						_la = _input.LA(1);
						if ( !(_la==AS || _la==IS || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (OP_GE - 107)) | (1L << (OP_GT - 107)) | (1L << (OP_LE - 107)) | (1L << (OP_LT - 107)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(957);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprEqualityComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(958);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(959);
						_la = _input.LA(1);
						if ( !(_la==OP_EQ || _la==OP_NE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(960);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprBitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(961);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(962);
						match(OP_ADDRESS_OF);
						setState(963);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(964);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(965);
						match(OP_MEMBER_ACCESS);
						setState(966);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprBitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(967);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(968);
						match(OP_BITWISE_OR);
						setState(969);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExprAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(970);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(971);
						match(OP_AND);
						setState(972);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExprOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(973);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(974);
						match(OP_OR);
						setState(975);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ExprNullCheckContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(976);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(977);
						match(OP_NULL_CHECK);
						setState(978);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(979);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(980);
						match(T__11);
						setState(981);
						expression(0);
						setState(982);
						match(T__10);
						setState(983);
						expression(7);
						}
						break;
					case 14:
						{
						_localctx = new ExprLambdaContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(985);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(986);
						match(OP_LAMBDA);
						setState(987);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new ExprAssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(988);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(989);
						assignment_operator();
						setState(990);
						expression(5);
						}
						break;
					case 16:
						{
						_localctx = new ExprCommaContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(992);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(993);
						match(T__8);
						setState(994);
						expression(5);
						}
						break;
					case 17:
						{
						_localctx = new ExprCallReturnedFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(995);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(996);
						match(T__3);
						setState(997);
						expression(0);
						setState(998);
						match(T__4);
						}
						break;
					case 18:
						{
						_localctx = new ExprSubprimaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1000);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1001);
						_la = _input.LA(1);
						if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (OP_MINUS_MINUS - 114)) | (1L << (OP_NOT - 114)) | (1L << (OP_PLUS_PLUS - 114)))) != 0)) ) {
						_errHandler.recoverInline(this);
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
				}
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public Constructor_with_initializersContext constructor_with_initializers() {
			return getRuleContext(Constructor_with_initializersContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AsylumParser.NEW, 0); }
		public TerminalNode TYPEOF() { return getToken(AsylumParser.TYPEOF, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(AsylumParser.SIZEOF, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primary_expression);
		try {
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				variable_or_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				constructor_with_initializers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(NEW);
				setState(1011);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				match(TYPEOF);
				setState(1013);
				match(T__3);
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1014);
					variable_or_function();
					}
					break;
				case 2:
					{
					setState(1015);
					variable_type(0);
					}
					break;
				}
				setState(1018);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1020);
				match(SIZEOF);
				setState(1021);
				match(T__3);
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1022);
					variable_or_function();
					}
					break;
				case 2:
					{
					setState(1023);
					variable_type(0);
					}
					break;
				}
				setState(1026);
				match(T__4);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public TerminalNode OP_ADD() { return getToken(AsylumParser.OP_ADD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_SUB() { return getToken(AsylumParser.OP_SUB, 0); }
		public TerminalNode OP_NOT() { return getToken(AsylumParser.OP_NOT, 0); }
		public TerminalNode OP_TILDE() { return getToken(AsylumParser.OP_TILDE, 0); }
		public TerminalNode OP_PLUS_PLUS() { return getToken(AsylumParser.OP_PLUS_PLUS, 0); }
		public TerminalNode OP_MINUS_MINUS() { return getToken(AsylumParser.OP_MINUS_MINUS, 0); }
		public TerminalNode OP_MEMBER_ACCESS() { return getToken(AsylumParser.OP_MEMBER_ACCESS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public TerminalNode OP_REFERENCE_POINTER() { return getToken(AsylumParser.OP_REFERENCE_POINTER, 0); }
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public Defined_constantsContext defined_constants() {
			return getRuleContext(Defined_constantsContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unary_expression);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(OP_ADD);
				setState(1031);
				expression(0);
				}
				break;
			case OP_SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				match(OP_SUB);
				setState(1033);
				expression(0);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1034);
				match(OP_NOT);
				setState(1035);
				expression(0);
				}
				break;
			case OP_TILDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
				match(OP_TILDE);
				setState(1037);
				expression(0);
				}
				break;
			case OP_PLUS_PLUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				match(OP_PLUS_PLUS);
				setState(1039);
				expression(0);
				}
				break;
			case OP_MINUS_MINUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				match(OP_MINUS_MINUS);
				setState(1041);
				expression(0);
				}
				break;
			case OP_MEMBER_ACCESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				match(OP_MEMBER_ACCESS);
				setState(1043);
				expression(0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(1044);
				match(T__3);
				setState(1045);
				variable_type(0);
				setState(1046);
				match(T__4);
				setState(1047);
				expression(0);
				}
				break;
			case OP_ADDRESS_OF:
				enterOuterAlt(_localctx, 9);
				{
				setState(1049);
				match(OP_ADDRESS_OF);
				setState(1050);
				expression(0);
				}
				break;
			case OP_REFERENCE_POINTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(1051);
				match(OP_REFERENCE_POINTER);
				setState(1052);
				expression(0);
				}
				break;
			case OP_MUL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1053);
				match(OP_MUL);
				setState(1054);
				expression(0);
				}
				break;
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 12);
				{
				setState(1055);
				defined_constants();
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

	public static class Access_modifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AsylumParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AsylumParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(AsylumParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(AsylumParser.PRIVATE, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_access_modifier);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(PUBLIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				match(PROTECTED);
				setState(1060);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
				match(PRIVATE);
				setState(1062);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1063);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1064);
				match(PROTECTED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1065);
				match(INTERNAL);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	 
		public Variable_assignmentContext() { }
		public void copyFrom(Variable_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableAssignmentNormalContext extends Variable_assignmentContext {
		public List<Variable_or_functionContext> variable_or_function() {
			return getRuleContexts(Variable_or_functionContext.class);
		}
		public Variable_or_functionContext variable_or_function(int i) {
			return getRuleContext(Variable_or_functionContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ASSIGN_OP_EQ() { return getTokens(AsylumParser.ASSIGN_OP_EQ); }
		public TerminalNode ASSIGN_OP_EQ(int i) {
			return getToken(AsylumParser.ASSIGN_OP_EQ, i);
		}
		public VariableAssignmentNormalContext(Variable_assignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VariableAssignmentUnpackContext extends Variable_assignmentContext {
		public List<Variable_or_functionContext> variable_or_function() {
			return getRuleContexts(Variable_or_functionContext.class);
		}
		public Variable_or_functionContext variable_or_function(int i) {
			return getRuleContext(Variable_or_functionContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentUnpackContext(Variable_assignmentContext ctx) { copyFrom(ctx); }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variable_assignment);
		int _la;
		try {
			int _alt;
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentUnpackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				variable_or_function();
				setState(1071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1069);
					match(T__8);
					setState(1070);
					variable_or_function();
					}
					}
					setState(1073); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(1075);
				assignment_operator();
				setState(1076);
				expression(0);
				}
				break;
			case 2:
				_localctx = new VariableAssignmentNormalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				variable_or_function();
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1079);
						match(ASSIGN_OP_EQ);
						setState(1080);
						variable_or_function();
						}
						} 
					}
					setState(1085);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1086);
				assignment_operator();
				setState(1087);
				expression(0);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclareWithTupleInitializerContext extends Variable_declarationContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public Constructor_with_initializersContext constructor_with_initializers() {
			return getRuleContext(Constructor_with_initializersContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode NEW() { return getToken(AsylumParser.NEW, 0); }
		public VariableDeclareWithTupleInitializerContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclareWithInitializerExprContext extends Variable_declarationContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public List<TerminalNode> ASSIGN_OP_EQ() { return getTokens(AsylumParser.ASSIGN_OP_EQ); }
		public TerminalNode ASSIGN_OP_EQ(int i) {
			return getToken(AsylumParser.ASSIGN_OP_EQ, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VariableDeclareWithInitializerExprContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclareWithoutInitializerMultipleTypesContext extends Variable_declarationContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VariableDeclareWithoutInitializerMultipleTypesContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclareWithTupleInitializerExprContext extends Variable_declarationContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VariableDeclareWithTupleInitializerExprContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclareWithoutInitializerContext extends Variable_declarationContext {
		public Variable_parameterContext variable_parameter() {
			return getRuleContext(Variable_parameterContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public VariableDeclareWithoutInitializerContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclareWithInitializerContext extends Variable_declarationContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public List<TerminalNode> ASSIGN_OP_EQ() { return getTokens(AsylumParser.ASSIGN_OP_EQ); }
		public TerminalNode ASSIGN_OP_EQ(int i) {
			return getToken(AsylumParser.ASSIGN_OP_EQ, i);
		}
		public Constructor_with_initializersContext constructor_with_initializers() {
			return getRuleContext(Constructor_with_initializersContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode NEW() { return getToken(AsylumParser.NEW, 0); }
		public VariableDeclareWithInitializerContext(Variable_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variable_declaration);
		int _la;
		try {
			int _alt;
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				_localctx = new VariableDeclareWithInitializerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1091);
					attribute();
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
				variable_parameter();
				setState(1102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1098);
						match(ASSIGN_OP_EQ);
						setState(1099);
						variable_parameter();
						}
						} 
					}
					setState(1104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1105);
				match(ASSIGN_OP_EQ);
				setState(1107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1106);
					match(NEW);
					}
					break;
				}
				setState(1111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1109);
					constructor_with_initializers();
					}
					break;
				case 2:
					{
					setState(1110);
					function_call();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new VariableDeclareWithTupleInitializerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1113);
					attribute();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
				variable_parameter();
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1120);
					match(T__8);
					setState(1121);
					variable_parameter();
					}
					}
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1127);
				match(ASSIGN_OP_EQ);
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1128);
					match(NEW);
					}
					break;
				}
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1131);
					constructor_with_initializers();
					}
					break;
				case 2:
					{
					setState(1132);
					function_call();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new VariableDeclareWithInitializerExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1135);
					attribute();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				variable_parameter();
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1142);
						match(ASSIGN_OP_EQ);
						setState(1143);
						variable_parameter();
						}
						} 
					}
					setState(1148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				}
				setState(1149);
				match(ASSIGN_OP_EQ);
				setState(1150);
				expression(0);
				}
				break;
			case 4:
				_localctx = new VariableDeclareWithTupleInitializerExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1152);
					attribute();
					}
					}
					setState(1157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1158);
				variable_parameter();
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1159);
					match(T__8);
					setState(1160);
					variable_parameter();
					}
					}
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1166);
				match(ASSIGN_OP_EQ);
				setState(1167);
				expression(0);
				}
				break;
			case 5:
				_localctx = new VariableDeclareWithoutInitializerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1169);
					attribute();
					}
					}
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1175);
				variable_parameter();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1176);
					match(T__8);
					setState(1177);
					match(IDENTIFIER);
					}
					}
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new VariableDeclareWithoutInitializerMultipleTypesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1183);
					attribute();
					}
					}
					setState(1188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1189);
				variable_parameter();
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1190);
					match(T__8);
					setState(1191);
					variable_parameter();
					}
					}
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(IDENTIFIER);
			setState(1200);
			match(T__10);
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

	public static class Variable_argumentsContext extends ParserRuleContext {
		public Variable_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_arguments; }
	 
		public Variable_argumentsContext() { }
		public void copyFrom(Variable_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableArgsNoneOrSomeContext extends Variable_argumentsContext {
		public List<Variable_parameterContext> variable_parameter() {
			return getRuleContexts(Variable_parameterContext.class);
		}
		public Variable_parameterContext variable_parameter(int i) {
			return getRuleContext(Variable_parameterContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VariableArgsNoneOrSomeContext(Variable_argumentsContext ctx) { copyFrom(ctx); }
	}
	public static class VariableArgsVariadicOnlyContext extends Variable_argumentsContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VariableArgsVariadicOnlyContext(Variable_argumentsContext ctx) { copyFrom(ctx); }
	}

	public final Variable_argumentsContext variable_arguments() throws RecognitionException {
		Variable_argumentsContext _localctx = new Variable_argumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variable_arguments);
		int _la;
		try {
			int _alt;
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				_localctx = new VariableArgsNoneOrSomeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1202);
						label();
						}
						break;
					}
					setState(1205);
					variable_parameter();
					setState(1213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1206);
							match(T__8);
							setState(1208);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
							case 1:
								{
								setState(1207);
								label();
								}
								break;
							}
							setState(1210);
							variable_parameter();
							}
							} 
						}
						setState(1215);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8) {
						{
						setState(1216);
						match(T__8);
						setState(1218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
							{
							setState(1217);
							variable_type(0);
							}
						}

						setState(1220);
						match(T__12);
						setState(1221);
						match(IDENTIFIER);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new VariableArgsVariadicOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOLATILE - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (FIXED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1226);
					variable_type(0);
					}
				}

				setState(1229);
				match(T__12);
				setState(1230);
				match(IDENTIFIER);
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

	public static class Variable_parameterContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public Variable_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_parameter; }
	}

	public final Variable_parameterContext variable_parameter() throws RecognitionException {
		Variable_parameterContext _localctx = new Variable_parameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variable_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			variable_type(0);
			setState(1234);
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

	public static class Variable_typeContext extends ParserRuleContext {
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
	 
		public Variable_typeContext() { }
		public void copyFrom(Variable_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarTypeCustomContext extends Variable_typeContext {
		public Variable_or_functionContext variable_or_function() {
			return getRuleContext(Variable_or_functionContext.class,0);
		}
		public VarTypeCustomContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeGenericsContext extends Variable_typeContext {
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public VarTypeGenericsContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeStaticContext extends Variable_typeContext {
		public TerminalNode STATIC() { return getToken(AsylumParser.STATIC, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VarTypeStaticContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeVolatileContext extends Variable_typeContext {
		public TerminalNode VOLATILE() { return getToken(AsylumParser.VOLATILE, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VarTypeVolatileContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeArrayContext extends Variable_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(AsylumParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(AsylumParser.INTEGER, i);
		}
		public VarTypeArrayContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeTupleContext extends Variable_typeContext {
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public VarTypeTupleContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeThisContext extends Variable_typeContext {
		public VarTypeThisContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeReferenceContext extends Variable_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public VarTypeReferenceContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeTupleProperContext extends Variable_typeContext {
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public VarTypeTupleProperContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeConstantContext extends Variable_typeContext {
		public TerminalNode CONST() { return getToken(AsylumParser.CONST, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VarTypeConstantContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypeAtomicContext extends Variable_typeContext {
		public TerminalNode ATOMIC() { return getToken(AsylumParser.ATOMIC, 0); }
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public VarTypeAtomicContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypePrimitiveContext extends Variable_typeContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public VarTypePrimitiveContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}
	public static class VarTypePointerContext extends Variable_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public VarTypePointerContext(Variable_typeContext ctx) { copyFrom(ctx); }
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		return variable_type(0);
	}

	private Variable_typeContext variable_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, _parentState);
		Variable_typeContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_variable_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				_localctx = new VarTypePrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1237);
				primitives();
				}
				break;
			case 2:
				{
				_localctx = new VarTypeTupleProperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1238);
				match(T__3);
				setState(1239);
				variable_type(0);
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1240);
					match(T__8);
					setState(1241);
					variable_type(0);
					}
					}
					setState(1244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(1246);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new VarTypeConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1248);
				match(CONST);
				setState(1249);
				variable_type(6);
				}
				break;
			case 4:
				{
				_localctx = new VarTypeStaticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1250);
				match(STATIC);
				setState(1251);
				variable_type(5);
				}
				break;
			case 5:
				{
				_localctx = new VarTypeVolatileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1252);
				match(VOLATILE);
				setState(1253);
				variable_type(4);
				}
				break;
			case 6:
				{
				_localctx = new VarTypeAtomicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1254);
				match(ATOMIC);
				setState(1255);
				match(OP_LT);
				setState(1256);
				variable_type(0);
				setState(1257);
				match(OP_GT);
				}
				break;
			case 7:
				{
				_localctx = new VarTypeCustomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1259);
				variable_or_function();
				}
				break;
			case 8:
				{
				_localctx = new VarTypeThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1260);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						_localctx = new VarTypePointerContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1263);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1264);
						match(OP_MUL);
						}
						break;
					case 2:
						{
						_localctx = new VarTypeReferenceContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1265);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1266);
						match(OP_ADDRESS_OF);
						}
						break;
					case 3:
						{
						_localctx = new VarTypeArrayContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1267);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1268);
						match(T__7);
						setState(1270);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTEGER) {
							{
							setState(1269);
							match(INTEGER);
							}
						}

						setState(1278);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(1272);
							match(T__8);
							setState(1274);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==INTEGER) {
								{
								setState(1273);
								match(INTEGER);
								}
							}

							}
							}
							setState(1280);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1281);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new VarTypeGenericsContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1282);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1283);
						match(OP_LT);
						setState(1284);
						variable_type(0);
						setState(1289);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(1285);
							match(T__8);
							setState(1286);
							variable_type(0);
							}
							}
							setState(1291);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1292);
						match(OP_GT);
						}
						break;
					case 5:
						{
						_localctx = new VarTypeTupleContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1294);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1297); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1295);
								match(T__8);
								setState(1296);
								variable_type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1299); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(1305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitivesContext extends ParserRuleContext {
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
	 
		public PrimitivesContext() { }
		public void copyFrom(PrimitivesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveDoubleContext extends PrimitivesContext {
		public PrimitiveDoubleContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveFixedAnyContext extends PrimitivesContext {
		public PrimitiveFixedAnyContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveBoolContext extends PrimitivesContext {
		public PrimitiveBoolContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveObjectContext extends PrimitivesContext {
		public PrimitiveObjectContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveVoidContext extends PrimitivesContext {
		public PrimitiveVoidContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveUnsignedAnyContext extends PrimitivesContext {
		public PrimitiveUnsignedAnyContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveFixedContext extends PrimitivesContext {
		public TerminalNode FIXED() { return getToken(AsylumParser.FIXED, 0); }
		public PrimitiveFixedContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveExtendedContext extends PrimitivesContext {
		public PrimitiveExtendedContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveEventContext extends PrimitivesContext {
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public PrimitiveEventContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveStringContext extends PrimitivesContext {
		public PrimitiveStringContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveCharContext extends PrimitivesContext {
		public PrimitiveCharContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveHalfContext extends PrimitivesContext {
		public PrimitiveHalfContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveFloatingAnyContext extends PrimitivesContext {
		public PrimitiveFloatingAnyContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveFloatContext extends PrimitivesContext {
		public PrimitiveFloatContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveAutoVariableContext extends PrimitivesContext {
		public PrimitiveAutoVariableContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveWideCharContext extends PrimitivesContext {
		public PrimitiveWideCharContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveSignedContext extends PrimitivesContext {
		public TerminalNode SIGNED() { return getToken(AsylumParser.SIGNED, 0); }
		public PrimitiveSignedContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveDecimalContext extends PrimitivesContext {
		public PrimitiveDecimalContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveFunctionContext extends PrimitivesContext {
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public PrimitiveFunctionContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveSignedAnyContext extends PrimitivesContext {
		public PrimitiveSignedAnyContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveVarLenContext extends PrimitivesContext {
		public PrimitiveVarLenContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveUnsignedContext extends PrimitivesContext {
		public TerminalNode UNSIGNED() { return getToken(AsylumParser.UNSIGNED, 0); }
		public PrimitiveUnsignedContext(PrimitivesContext ctx) { copyFrom(ctx); }
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_primitives);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new PrimitiveStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new PrimitiveBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(T__15);
				}
				break;
			case UNSIGNED:
				_localctx = new PrimitiveUnsignedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(UNSIGNED);
				}
				break;
			case SIGNED:
				_localctx = new PrimitiveSignedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				match(SIGNED);
				}
				break;
			case T__16:
				_localctx = new PrimitiveHalfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1310);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new PrimitiveFloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1311);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new PrimitiveDoubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1312);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new PrimitiveExtendedContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1313);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new PrimitiveDecimalContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1314);
				match(T__20);
				}
				break;
			case FIXED:
				_localctx = new PrimitiveFixedContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1315);
				match(FIXED);
				}
				break;
			case T__21:
				_localctx = new PrimitiveVarLenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1316);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new PrimitiveObjectContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1317);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new PrimitiveVoidContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1318);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new PrimitiveFunctionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1319);
				match(T__24);
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1320);
					match(OP_LT);
					setState(1321);
					variable_type(0);
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(1322);
						match(T__8);
						setState(1323);
						variable_type(0);
						}
						}
						setState(1328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1329);
					match(OP_GT);
					}
					break;
				}
				}
				break;
			case T__25:
				_localctx = new PrimitiveEventContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1333);
				match(T__25);
				setState(1345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1334);
					match(OP_LT);
					setState(1335);
					variable_type(0);
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(1336);
						match(T__8);
						setState(1337);
						variable_type(0);
						}
						}
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1343);
					match(OP_GT);
					}
					break;
				}
				}
				break;
			case T__26:
				_localctx = new PrimitiveCharContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1347);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new PrimitiveWideCharContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1348);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new PrimitiveAutoVariableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1349);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new PrimitiveUnsignedAnyContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1350);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new PrimitiveSignedAnyContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1351);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new PrimitiveFloatingAnyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1352);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new PrimitiveFixedAnyContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1353);
				match(T__32);
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

	public static class Defined_constantsContext extends ParserRuleContext {
		public Defined_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_constants; }
	 
		public Defined_constantsContext() { }
		public void copyFrom(Defined_constantsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantTrueContext extends Defined_constantsContext {
		public ConstantTrueContext(Defined_constantsContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantNullContext extends Defined_constantsContext {
		public ConstantNullContext(Defined_constantsContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantFalseContext extends Defined_constantsContext {
		public ConstantFalseContext(Defined_constantsContext ctx) { copyFrom(ctx); }
	}

	public final Defined_constantsContext defined_constants() throws RecognitionException {
		Defined_constantsContext _localctx = new Defined_constantsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_defined_constants);
		try {
			setState(1359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new ConstantTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new ConstantFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new ConstantNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1358);
				match(T__35);
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

	public static class Variable_or_functionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsylumParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsylumParser.IDENTIFIER, i);
		}
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public Variable_or_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_or_function; }
	}

	public final Variable_or_functionContext variable_or_function() throws RecognitionException {
		Variable_or_functionContext _localctx = new Variable_or_functionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variable_or_function);
		try {
			int _alt;
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				match(IDENTIFIER);
				setState(1366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1362);
						match(T__0);
						setState(1363);
						match(IDENTIFIER);
						}
						} 
					}
					setState(1368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case UNSIGNED:
			case SIGNED:
			case FIXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				primitives();
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

	public static class OperatorContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(AsylumParser.OP_ADD, 0); }
		public TerminalNode OP_AND() { return getToken(AsylumParser.OP_AND, 0); }
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public TerminalNode OP_BITWISE_OR() { return getToken(AsylumParser.OP_BITWISE_OR, 0); }
		public TerminalNode OP_DIV() { return getToken(AsylumParser.OP_DIV, 0); }
		public TerminalNode OP_EQ() { return getToken(AsylumParser.OP_EQ, 0); }
		public TerminalNode OP_GE() { return getToken(AsylumParser.OP_GE, 0); }
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public TerminalNode OP_LE() { return getToken(AsylumParser.OP_LE, 0); }
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public TerminalNode OP_LSHIFT() { return getToken(AsylumParser.OP_LSHIFT, 0); }
		public TerminalNode OP_MEMBER_ACCESS() { return getToken(AsylumParser.OP_MEMBER_ACCESS, 0); }
		public TerminalNode OP_MINUS_MINUS() { return getToken(AsylumParser.OP_MINUS_MINUS, 0); }
		public TerminalNode OP_MOD() { return getToken(AsylumParser.OP_MOD, 0); }
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public TerminalNode OP_OR() { return getToken(AsylumParser.OP_OR, 0); }
		public TerminalNode OP_NAND() { return getToken(AsylumParser.OP_NAND, 0); }
		public TerminalNode OP_NE() { return getToken(AsylumParser.OP_NE, 0); }
		public TerminalNode OP_NOR() { return getToken(AsylumParser.OP_NOR, 0); }
		public TerminalNode OP_NOT() { return getToken(AsylumParser.OP_NOT, 0); }
		public TerminalNode OP_PLUS_PLUS() { return getToken(AsylumParser.OP_PLUS_PLUS, 0); }
		public TerminalNode OP_RANGE() { return getToken(AsylumParser.OP_RANGE, 0); }
		public TerminalNode OP_RSHIFT() { return getToken(AsylumParser.OP_RSHIFT, 0); }
		public TerminalNode OP_SUB() { return getToken(AsylumParser.OP_SUB, 0); }
		public TerminalNode OP_TILDE() { return getToken(AsylumParser.OP_TILDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operator);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN_OP_EQ:
			case ASSIGN_OP_ADD_EQ:
			case ASSIGN_OP_SUB_EQ:
			case ASSIGN_OP_EXP_EQ:
			case ASSIGN_OP_MUL_EQ:
			case ASSIGN_OP_DIV_EQ:
			case ASSIGN_OP_MOD_EQ:
			case ASSIGN_OP_BITAND_EQ:
			case ASSIGN_OP_BITOR_EQ:
			case ASSIGN_OP_XOR_EQ:
			case ASSIGN_OP_BITFLIP_EQ:
			case ASSIGN_OP_LSHIFT_EQ:
			case ASSIGN_OP_RSHIFT_EQ:
			case ASSIGN_OP_AND_EQ:
			case ASSIGN_OP_OR_EQ:
			case ASSIGN_OP_NAND_EQ:
			case ASSIGN_OP_NOR_EQ:
			case ASSIGN_OP_CHECK_NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				assignment_operator();
				}
				break;
			case OP_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				match(OP_ADD);
				}
				break;
			case OP_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				match(OP_AND);
				}
				break;
			case OP_ADDRESS_OF:
				enterOuterAlt(_localctx, 4);
				{
				setState(1375);
				match(OP_ADDRESS_OF);
				}
				break;
			case OP_BITWISE_OR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1376);
				match(OP_BITWISE_OR);
				}
				break;
			case OP_DIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(1377);
				match(OP_DIV);
				}
				break;
			case OP_EQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1378);
				match(OP_EQ);
				}
				break;
			case OP_GE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1379);
				match(OP_GE);
				}
				break;
			case OP_GT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1380);
				match(OP_GT);
				}
				break;
			case OP_LE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1381);
				match(OP_LE);
				}
				break;
			case OP_LT:
				enterOuterAlt(_localctx, 11);
				{
				setState(1382);
				match(OP_LT);
				}
				break;
			case OP_LSHIFT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1383);
				match(OP_LSHIFT);
				}
				break;
			case OP_MEMBER_ACCESS:
				enterOuterAlt(_localctx, 13);
				{
				setState(1384);
				match(OP_MEMBER_ACCESS);
				}
				break;
			case OP_MINUS_MINUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(1385);
				match(OP_MINUS_MINUS);
				}
				break;
			case OP_MOD:
				enterOuterAlt(_localctx, 15);
				{
				setState(1386);
				match(OP_MOD);
				}
				break;
			case OP_MUL:
				enterOuterAlt(_localctx, 16);
				{
				setState(1387);
				match(OP_MUL);
				}
				break;
			case OP_OR:
				enterOuterAlt(_localctx, 17);
				{
				setState(1388);
				match(OP_OR);
				}
				break;
			case OP_NAND:
				enterOuterAlt(_localctx, 18);
				{
				setState(1389);
				match(OP_NAND);
				}
				break;
			case OP_NE:
				enterOuterAlt(_localctx, 19);
				{
				setState(1390);
				match(OP_NE);
				}
				break;
			case OP_NOR:
				enterOuterAlt(_localctx, 20);
				{
				setState(1391);
				match(OP_NOR);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1392);
				match(OP_NOT);
				}
				break;
			case OP_PLUS_PLUS:
				enterOuterAlt(_localctx, 22);
				{
				setState(1393);
				match(OP_PLUS_PLUS);
				}
				break;
			case OP_RANGE:
				enterOuterAlt(_localctx, 23);
				{
				setState(1394);
				match(OP_RANGE);
				}
				break;
			case OP_RSHIFT:
				enterOuterAlt(_localctx, 24);
				{
				setState(1395);
				match(OP_RSHIFT);
				}
				break;
			case OP_SUB:
				enterOuterAlt(_localctx, 25);
				{
				setState(1396);
				match(OP_SUB);
				}
				break;
			case OP_TILDE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1397);
				match(OP_TILDE);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EQ, 0); }
		public TerminalNode ASSIGN_OP_ADD_EQ() { return getToken(AsylumParser.ASSIGN_OP_ADD_EQ, 0); }
		public TerminalNode ASSIGN_OP_SUB_EQ() { return getToken(AsylumParser.ASSIGN_OP_SUB_EQ, 0); }
		public TerminalNode ASSIGN_OP_EXP_EQ() { return getToken(AsylumParser.ASSIGN_OP_EXP_EQ, 0); }
		public TerminalNode ASSIGN_OP_MUL_EQ() { return getToken(AsylumParser.ASSIGN_OP_MUL_EQ, 0); }
		public TerminalNode ASSIGN_OP_DIV_EQ() { return getToken(AsylumParser.ASSIGN_OP_DIV_EQ, 0); }
		public TerminalNode ASSIGN_OP_MOD_EQ() { return getToken(AsylumParser.ASSIGN_OP_MOD_EQ, 0); }
		public TerminalNode ASSIGN_OP_BITAND_EQ() { return getToken(AsylumParser.ASSIGN_OP_BITAND_EQ, 0); }
		public TerminalNode ASSIGN_OP_BITOR_EQ() { return getToken(AsylumParser.ASSIGN_OP_BITOR_EQ, 0); }
		public TerminalNode ASSIGN_OP_XOR_EQ() { return getToken(AsylumParser.ASSIGN_OP_XOR_EQ, 0); }
		public TerminalNode ASSIGN_OP_BITFLIP_EQ() { return getToken(AsylumParser.ASSIGN_OP_BITFLIP_EQ, 0); }
		public TerminalNode ASSIGN_OP_LSHIFT_EQ() { return getToken(AsylumParser.ASSIGN_OP_LSHIFT_EQ, 0); }
		public TerminalNode ASSIGN_OP_RSHIFT_EQ() { return getToken(AsylumParser.ASSIGN_OP_RSHIFT_EQ, 0); }
		public TerminalNode ASSIGN_OP_AND_EQ() { return getToken(AsylumParser.ASSIGN_OP_AND_EQ, 0); }
		public TerminalNode ASSIGN_OP_OR_EQ() { return getToken(AsylumParser.ASSIGN_OP_OR_EQ, 0); }
		public TerminalNode ASSIGN_OP_NAND_EQ() { return getToken(AsylumParser.ASSIGN_OP_NAND_EQ, 0); }
		public TerminalNode ASSIGN_OP_NOR_EQ() { return getToken(AsylumParser.ASSIGN_OP_NOR_EQ, 0); }
		public TerminalNode ASSIGN_OP_CHECK_NULL() { return getToken(AsylumParser.ASSIGN_OP_CHECK_NULL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ASSIGN_OP_EQ - 83)) | (1L << (ASSIGN_OP_ADD_EQ - 83)) | (1L << (ASSIGN_OP_SUB_EQ - 83)) | (1L << (ASSIGN_OP_EXP_EQ - 83)) | (1L << (ASSIGN_OP_MUL_EQ - 83)) | (1L << (ASSIGN_OP_DIV_EQ - 83)) | (1L << (ASSIGN_OP_MOD_EQ - 83)) | (1L << (ASSIGN_OP_BITAND_EQ - 83)) | (1L << (ASSIGN_OP_BITOR_EQ - 83)) | (1L << (ASSIGN_OP_XOR_EQ - 83)) | (1L << (ASSIGN_OP_BITFLIP_EQ - 83)) | (1L << (ASSIGN_OP_LSHIFT_EQ - 83)) | (1L << (ASSIGN_OP_RSHIFT_EQ - 83)) | (1L << (ASSIGN_OP_AND_EQ - 83)) | (1L << (ASSIGN_OP_OR_EQ - 83)) | (1L << (ASSIGN_OP_NAND_EQ - 83)) | (1L << (ASSIGN_OP_NOR_EQ - 83)) | (1L << (ASSIGN_OP_CHECK_NULL - 83)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return type_implements_extended_expression_sempred((Type_implements_extended_expressionContext)_localctx, predIndex);
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 51:
			return variable_type_sempred((Variable_typeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_implements_extended_expression_sempred(Type_implements_extended_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		}
		return true;
	}
	private boolean variable_type_sempred(Variable_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 9);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008d\u057d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3\4"+
		"\3\4\5\4\u008a\n\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\5"+
		"\4\u0095\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5"+
		"\3\5\3\5\3\6\3\6\3\7\7\7\u00a7\n\7\f\7\16\7\u00aa\13\7\3\7\3\7\5\7\u00ae"+
		"\n\7\3\7\7\7\u00b1\n\7\f\7\16\7\u00b4\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00bd\n\7\3\7\3\7\3\b\3\b\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3"+
		"\t\5\t\u00ca\n\t\3\t\7\t\u00cd\n\t\f\t\16\t\u00d0\13\t\3\t\3\t\3\t\5\t"+
		"\u00d5\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00e4\n\t\f\t\16\t\u00e7\13\t\3\t\5\t\u00ea\n\t\3\t\5\t\u00ed\n\t\3"+
		"\n\7\n\u00f0\n\n\f\n\16\n\u00f3\13\n\3\n\5\n\u00f6\n\n\3\n\7\n\u00f9\n"+
		"\n\f\n\16\n\u00fc\13\n\3\n\3\n\5\n\u0100\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u010b\n\n\f\n\16\n\u010e\13\n\3\n\5\n\u0111\n\n\3\n\5\n"+
		"\u0114\n\n\3\13\7\13\u0117\n\13\f\13\16\13\u011a\13\13\3\13\5\13\u011d"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0126\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u012e\n\13\f\13\16\13\u0131\13\13\3\13\5\13\u0134"+
		"\n\13\3\13\5\13\u0137\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u013f\n\f\f\f\16"+
		"\f\u0142\13\f\3\f\3\f\5\f\u0146\n\f\3\f\3\f\3\r\7\r\u014b\n\r\f\r\16\r"+
		"\u014e\13\r\3\r\5\r\u0151\n\r\3\r\3\r\3\r\3\r\5\r\u0157\n\r\3\r\3\r\3"+
		"\r\3\r\7\r\u015d\n\r\f\r\16\r\u0160\13\r\5\r\u0162\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\5\16\u0169\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0170\n\16\f\16"+
		"\16\16\u0173\13\16\5\16\u0175\n\16\3\16\3\16\3\16\5\16\u017a\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0181\n\16\f\16\16\16\u0184\13\16\5\16\u0186"+
		"\n\16\3\16\3\16\3\16\5\16\u018b\n\16\5\16\u018d\n\16\3\17\7\17\u0190\n"+
		"\17\f\17\16\17\u0193\13\17\3\17\3\17\5\17\u0197\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u019f\n\17\r\17\16\17\u01a0\3\17\3\17\3\20\7\20\u01a6"+
		"\n\20\f\20\16\20\u01a9\13\20\3\20\5\20\u01ac\n\20\3\20\3\20\3\20\5\20"+
		"\u01b1\n\20\3\20\5\20\u01b4\n\20\3\20\3\20\7\20\u01b8\n\20\f\20\16\20"+
		"\u01bb\13\20\3\20\3\20\5\20\u01bf\n\20\3\21\7\21\u01c2\n\21\f\21\16\21"+
		"\u01c5\13\21\3\21\5\21\u01c8\n\21\3\21\3\21\3\21\5\21\u01cd\n\21\3\21"+
		"\5\21\u01d0\n\21\3\21\3\21\7\21\u01d4\n\21\f\21\16\21\u01d7\13\21\3\21"+
		"\3\21\5\21\u01db\n\21\3\22\3\22\3\22\3\22\5\22\u01e1\n\22\3\22\5\22\u01e4"+
		"\n\22\3\22\3\22\7\22\u01e8\n\22\f\22\16\22\u01eb\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u01f3\n\23\3\24\7\24\u01f6\n\24\f\24\16\24\u01f9"+
		"\13\24\3\24\5\24\u01fc\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0206\n\24\f\24\16\24\u0209\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u0210"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u0218\n\26\3\26\3\26\3\26\5\26"+
		"\u021d\n\26\3\26\3\26\3\26\5\26\u0222\n\26\3\27\3\27\5\27\u0226\n\27\3"+
		"\27\3\27\3\27\3\27\7\27\u022c\n\27\f\27\16\27\u022f\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0236\n\27\5\27\u0238\n\27\3\27\5\27\u023b\n\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0241\n\27\f\27\16\27\u0244\13\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u024b\n\27\5\27\u024d\n\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0254\n\27\3\30\3\30\7\30\u0258\n\30\f\30\16\30\u025b\13\30\3\30\3"+
		"\30\5\30\u025f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0270\n\31\3\31\3\31\7\31\u0274\n\31\f"+
		"\31\16\31\u0277\13\31\3\31\3\31\5\31\u027b\n\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u028e"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u029a\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02a6\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02b0\n\35\3\35\3\35\3\35\3\35"+
		"\5\35\u02b6\n\35\3\36\3\36\5\36\u02ba\n\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \5 \u02c2\n \3 \3 \3 \3 \3 \3 \3 \7 \u02cb\n \f \16 \u02ce\13 \3 \3 "+
		"\5 \u02d2\n \3!\3!\3!\3!\3!\5!\u02d9\n!\3!\3!\3!\6!\u02de\n!\r!\16!\u02df"+
		"\3!\3!\3!\3!\3!\3!\5!\u02e8\n!\3!\3!\6!\u02ec\n!\r!\16!\u02ed\3!\3!\5"+
		"!\u02f2\n!\3\"\3\"\3\"\3\"\6\"\u02f8\n\"\r\"\16\"\u02f9\3\"\7\"\u02fd"+
		"\n\"\f\"\16\"\u0300\13\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0308\n\"\f\"\16"+
		"\"\u030b\13\"\3\"\3\"\5\"\u030f\n\"\3#\5#\u0312\n#\3#\3#\5#\u0316\n#\3"+
		"#\3#\5#\u031a\n#\3#\3#\3#\5#\u031f\n#\3#\7#\u0322\n#\f#\16#\u0325\13#"+
		"\5#\u0327\n#\3#\3#\3$\5$\u032c\n$\3$\3$\3$\3$\3$\7$\u0333\n$\f$\16$\u0336"+
		"\13$\5$\u0338\n$\3$\5$\u033b\n$\3$\3$\3$\3$\7$\u0341\n$\f$\16$\u0344\13"+
		"$\5$\u0346\n$\3$\3$\3%\3%\3%\7%\u034d\n%\f%\16%\u0350\13%\3%\5%\u0353"+
		"\n%\3%\3%\3&\3&\3&\3&\3&\5&\u035c\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5("+
		"\u0367\n(\3(\3(\3(\3(\3(\3(\7(\u036f\n(\f(\16(\u0372\13(\3)\3)\3)\3)\7"+
		")\u0378\n)\f)\16)\u037b\13)\3*\3*\3*\5*\u0380\n*\3*\3*\3*\5*\u0385\n*"+
		"\7*\u0387\n*\f*\16*\u038a\13*\3*\3*\3+\3+\3+\3+\7+\u0392\n+\f+\16+\u0395"+
		"\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03a1\n,\3,\3,\7,\u03a5\n,\f,\16"+
		",\u03a8\13,\3,\3,\3,\5,\u03ad\n,\3,\3,\3,\5,\u03b2\n,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\7,\u03ed\n,\f,\16,\u03f0\13,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u03fb\n-\3-\3-\3-\3-\3-\3-\5-\u0403\n-\3-\3-\5-\u0407\n-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\5.\u0423\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u042d\n/\3\60\3\60\3\60\6\60"+
		"\u0432\n\60\r\60\16\60\u0433\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u043c"+
		"\n\60\f\60\16\60\u043f\13\60\3\60\3\60\3\60\5\60\u0444\n\60\3\61\7\61"+
		"\u0447\n\61\f\61\16\61\u044a\13\61\3\61\3\61\3\61\7\61\u044f\n\61\f\61"+
		"\16\61\u0452\13\61\3\61\3\61\5\61\u0456\n\61\3\61\3\61\5\61\u045a\n\61"+
		"\3\61\7\61\u045d\n\61\f\61\16\61\u0460\13\61\3\61\3\61\3\61\7\61\u0465"+
		"\n\61\f\61\16\61\u0468\13\61\3\61\3\61\5\61\u046c\n\61\3\61\3\61\5\61"+
		"\u0470\n\61\3\61\7\61\u0473\n\61\f\61\16\61\u0476\13\61\3\61\3\61\3\61"+
		"\7\61\u047b\n\61\f\61\16\61\u047e\13\61\3\61\3\61\3\61\3\61\7\61\u0484"+
		"\n\61\f\61\16\61\u0487\13\61\3\61\3\61\3\61\7\61\u048c\n\61\f\61\16\61"+
		"\u048f\13\61\3\61\3\61\3\61\3\61\7\61\u0495\n\61\f\61\16\61\u0498\13\61"+
		"\3\61\3\61\3\61\7\61\u049d\n\61\f\61\16\61\u04a0\13\61\3\61\7\61\u04a3"+
		"\n\61\f\61\16\61\u04a6\13\61\3\61\3\61\3\61\7\61\u04ab\n\61\f\61\16\61"+
		"\u04ae\13\61\5\61\u04b0\n\61\3\62\3\62\3\62\3\63\5\63\u04b6\n\63\3\63"+
		"\3\63\3\63\5\63\u04bb\n\63\3\63\7\63\u04be\n\63\f\63\16\63\u04c1\13\63"+
		"\3\63\3\63\5\63\u04c5\n\63\3\63\3\63\5\63\u04c9\n\63\5\63\u04cb\n\63\3"+
		"\63\5\63\u04ce\n\63\3\63\3\63\5\63\u04d2\n\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\6\65\u04dd\n\65\r\65\16\65\u04de\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04f0"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04f9\n\65\3\65\3\65\5\65"+
		"\u04fd\n\65\7\65\u04ff\n\65\f\65\16\65\u0502\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u050a\n\65\f\65\16\65\u050d\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\6\65\u0514\n\65\r\65\16\65\u0515\7\65\u0518\n\65\f\65\16\65\u051b"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\7\66\u052f\n\66\f\66\16\66\u0532\13\66\3\66"+
		"\3\66\5\66\u0536\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u053d\n\66\f\66\16"+
		"\66\u0540\13\66\3\66\3\66\5\66\u0544\n\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u054d\n\66\3\67\3\67\3\67\5\67\u0552\n\67\38\38\38\78\u0557"+
		"\n8\f8\168\u055a\138\38\58\u055d\n8\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0579\n9\3:\3:\3:\2\5N"+
		"Vh;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnpr\2\f\4\2((KK\6\2((==KKPP\4\2\64\64;;\4\2kkuv"+
		"\4\2gg\u0082\u0082\4\2qq\u0081\u0081\7\2\'\'@@mnpprr\4\2llxx\5\2ttzz}"+
		"}\3\2Uf\2\u0677\2w\3\2\2\2\4\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u0098\3\2"+
		"\2\2\n\u00a3\3\2\2\2\f\u00a8\3\2\2\2\16\u00c0\3\2\2\2\20\u00c5\3\2\2\2"+
		"\22\u00f1\3\2\2\2\24\u0118\3\2\2\2\26\u0138\3\2\2\2\30\u014c\3\2\2\2\32"+
		"\u018c\3\2\2\2\34\u0191\3\2\2\2\36\u01a7\3\2\2\2 \u01c3\3\2\2\2\"\u01dc"+
		"\3\2\2\2$\u01f2\3\2\2\2&\u01f7\3\2\2\2(\u0211\3\2\2\2*\u0221\3\2\2\2,"+
		"\u0253\3\2\2\2.\u025e\3\2\2\2\60\u027a\3\2\2\2\62\u027c\3\2\2\2\64\u027f"+
		"\3\2\2\2\66\u0283\3\2\2\28\u02b5\3\2\2\2:\u02b7\3\2\2\2<\u02bd\3\2\2\2"+
		">\u02c1\3\2\2\2@\u02f1\3\2\2\2B\u030e\3\2\2\2D\u0311\3\2\2\2F\u032b\3"+
		"\2\2\2H\u0352\3\2\2\2J\u035b\3\2\2\2L\u035d\3\2\2\2N\u0366\3\2\2\2P\u0373"+
		"\3\2\2\2R\u037c\3\2\2\2T\u038d\3\2\2\2V\u03ac\3\2\2\2X\u0406\3\2\2\2Z"+
		"\u0422\3\2\2\2\\\u042c\3\2\2\2^\u0443\3\2\2\2`\u04af\3\2\2\2b\u04b1\3"+
		"\2\2\2d\u04d1\3\2\2\2f\u04d3\3\2\2\2h\u04ef\3\2\2\2j\u054c\3\2\2\2l\u0551"+
		"\3\2\2\2n\u055c\3\2\2\2p\u0578\3\2\2\2r\u057a\3\2\2\2tv\5\4\3\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\3\3\2\2\2yw\3\2\2\2z\u0086\5\6\4\2"+
		"{\u0086\5\b\5\2|\u0086\5\f\7\2}\u0086\5\20\t\2~\u0086\5\30\r\2\177\u0086"+
		"\5\34\17\2\u0080\u0086\5\36\20\2\u0081\u0086\5 \21\2\u0082\u0086\5\"\22"+
		"\2\u0083\u0086\5(\25\2\u0084\u0086\5\60\31\2\u0085z\3\2\2\2\u0085{\3\2"+
		"\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\5\3\2\2\2\u0087\u0089\7R\2\2\u0088\u008a"+
		"\7K\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0090\7\u0088\2\2\u008c\u008d\7\3\2\2\u008d\u008f\7\u0088\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7\4\2\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\5\2\2\u0097"+
		"\7\3\2\2\2\u0098\u0099\7B\2\2\u0099\u009e\7\u0088\2\2\u009a\u009b\7\3"+
		"\2\2\u009b\u009d\7\u0088\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\5\2\2\u00a2\t\3\2\2\2\u00a3\u00a4\t\2\2\2\u00a4\13"+
		"\3\2\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ad\7\65\2\2\u00ac\u00ae\5\\/\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\5\n\6\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\7"+
		"\u0088\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5d\63\2\u00b9\u00bc\7\7\2\2"+
		"\u00ba\u00bb\7\u0080\2\2\u00bb\u00bd\5h\65\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\r\3\2\2\2"+
		"\u00c0\u00c1\t\3\2\2\u00c1\17\3\2\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\\/\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\5\16\b\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\67\2\2\u00d2"+
		"\u00d4\7\u0088\2\2\u00d3\u00d5\5R*\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\5d\63\2\u00d8"+
		"\u00db\7\7\2\2\u00d9\u00da\7\u0080\2\2\u00da\u00dc\5h\65\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\7o\2\2\u00de"+
		"\u00df\5V,\2\u00df\u00e0\7\5\2\2\u00e0\u00ea\3\2\2\2\u00e1\u00e5\7\b\2"+
		"\2\u00e2\u00e4\5\60\31\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00ea\7\t\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00ed\7\5\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\21\3\2\2\2\u00ee\u00f0\5\26\f\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\5\\/\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\5\16\b\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\5h\65\2\u00fe\u0100\5R*\2\u00ff\u00fe"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\6\2\2\u0102"+
		"\u0103\5d\63\2\u0103\u0113\7\7\2\2\u0104\u0105\7o\2\2\u0105\u0106\5V,"+
		"\2\u0106\u0107\7\5\2\2\u0107\u0111\3\2\2\2\u0108\u010c\7\b\2\2\u0109\u010b"+
		"\5\60\31\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111"+
		"\7\t\2\2\u0110\u0104\3\2\2\2\u0110\u0108\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0114\7\5\2\2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114\23\3\2\2"+
		"\2\u0115\u0117\5\26\f\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011d\7=\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\7D\2\2\u011f\u0120\5p9\2\u0120\u0121\7\6\2"+
		"\2\u0121\u0122\5d\63\2\u0122\u0125\7\7\2\2\u0123\u0124\7\u0080\2\2\u0124"+
		"\u0126\5h\65\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0136\3\2"+
		"\2\2\u0127\u0128\7o\2\2\u0128\u0129\5V,\2\u0129\u012a\7\5\2\2\u012a\u0134"+
		"\3\2\2\2\u012b\u012f\7\b\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7\t\2\2\u0133\u0127\3\2\2\2\u0133"+
		"\u012b\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0137\7\5\2\2\u0136\u0133\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\25\3\2\2\2\u0138\u0139\7\n\2\2\u0139\u0145"+
		"\7\u0088\2\2\u013a\u013b\7\6\2\2\u013b\u0140\5V,\2\u013c\u013d\7\13\2"+
		"\2\u013d\u013f\5V,\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\7\7\2\2\u0144\u0146\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\f\2\2\u0148\27\3\2\2\2\u0149\u014b"+
		"\5\26\f\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151"+
		"\5\\/\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7\63\2\2\u0153\u0156\7\u0088\2\2\u0154\u0155\7\r\2\2\u0155\u0157"+
		"\7\u0087\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0161\7\b\2\2\u0159\u015e\5\32\16\2\u015a\u015b\7\13\2\2\u015b"+
		"\u015d\5\32\16\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0159\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\t"+
		"\2\2\u0164\31\3\2\2\2\u0165\u0168\7\u0088\2\2\u0166\u0167\7U\2\2\u0167"+
		"\u0169\7\u0087\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u018d"+
		"\3\2\2\2\u016a\u016b\7\u0088\2\2\u016b\u0174\7\6\2\2\u016c\u0171\5h\65"+
		"\2\u016d\u016e\7\13\2\2\u016e\u0170\5h\65\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0179\7\7\2\2\u0177\u0178\7U\2\2\u0178\u017a\7\u0087"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u018d\3\2\2\2\u017b"+
		"\u017c\7\u0088\2\2\u017c\u0185\7\b\2\2\u017d\u0182\5f\64\2\u017e\u017f"+
		"\7\13\2\2\u017f\u0181\5f\64\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2"+
		"\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u018a\7\t\2\2\u0188\u0189\7U\2\2\u0189\u018b\7\u0087\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u0165\3\2\2\2\u018c"+
		"\u016a\3\2\2\2\u018c\u017b\3\2\2\2\u018d\33\3\2\2\2\u018e\u0190\5\26\f"+
		"\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7P\2\2\u0195"+
		"\u0197\5\\/\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\7Q\2\2\u0199\u019a\7\u0088\2\2\u019a\u019e\7\b\2\2\u019b"+
		"\u019c\5f\64\2\u019c\u019d\7\5\2\2\u019d\u019f\3\2\2\2\u019e\u019b\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\7\t\2\2\u01a3\35\3\2\2\2\u01a4\u01a6\5\26\f"+
		"\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\5\\/\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7L"+
		"\2\2\u01ae\u01b0\7\u0088\2\2\u01af\u01b1\5R*\2\u01b0\u01af\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\5P)\2\u01b3\u01b2\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4\u01be\3\2\2\2\u01b5\u01b9\7\b\2\2\u01b6\u01b8"+
		"\5*\26\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\7\t"+
		"\2\2\u01bd\u01bf\7\5\2\2\u01be\u01b5\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\37\3\2\2\2\u01c0\u01c2\5\26\f\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2"+
		"\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u01c8\5\\/\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\7>\2\2\u01ca\u01cc\7\u0088\2\2\u01cb\u01cd"+
		"\5R*\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01d0\5P)\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01da\3\2\2"+
		"\2\u01d1\u01d5\7\b\2\2\u01d2\u01d4\5*\26\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01db\7\t\2\2\u01d9\u01db\7\5\2\2\u01da\u01d1\3\2"+
		"\2\2\u01da\u01d9\3\2\2\2\u01db!\3\2\2\2\u01dc\u01dd\7:\2\2\u01dd\u01e0"+
		"\5n8\2\u01de\u01df\7\66\2\2\u01df\u01e1\5h\65\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5R*\2\u01e3\u01e2\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\7\b\2\2\u01e6\u01e8"+
		"\5$\23\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\t"+
		"\2\2\u01ed#\3\2\2\2\u01ee\u01f3\5\20\t\2\u01ef\u01f3\5\22\n\2\u01f0\u01f3"+
		"\5\24\13\2\u01f1\u01f3\5&\24\2\u01f2\u01ee\3\2\2\2\u01f2\u01ef\3\2\2\2"+
		"\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3%\3\2\2\2\u01f4\u01f6\5"+
		"\26\f\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc\7="+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\t\4\2\2\u01fe\u01ff\7\6\2\2\u01ff\u0200\5f\64\2\u0200\u0201\7\7"+
		"\2\2\u0201\u0202\7\u0080\2\2\u0202\u020f\5h\65\2\u0203\u0207\7\b\2\2\u0204"+
		"\u0206\5\60\31\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3"+
		"\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u0210\7\t\2\2\u020b\u020c\7o\2\2\u020c\u020d\5V,\2\u020d\u020e\7\5\2"+
		"\2\u020e\u0210\3\2\2\2\u020f\u0203\3\2\2\2\u020f\u020b\3\2\2\2\u0210\'"+
		"\3\2\2\2\u0211\u0212\7N\2\2\u0212\u0213\5h\65\2\u0213\u0214\7\u0088\2"+
		"\2\u0214\u0215\7\5\2\2\u0215)\3\2\2\2\u0216\u0218\5\\/\2\u0217\u0216\3"+
		"\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\5f\64\2\u021a"+
		"\u021d\7\5\2\2\u021b\u021d\5,\27\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021d\u0222\3\2\2\2\u021e\u021f\5\\/\2\u021f\u0220\7\r\2\2\u0220"+
		"\u0222\3\2\2\2\u0221\u0217\3\2\2\2\u0221\u021e\3\2\2\2\u0222+\3\2\2\2"+
		"\u0223\u0237\7\b\2\2\u0224\u0226\5\\/\2\u0225\u0224\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0235\78\2\2\u0228\u0236\7\5\2\2\u0229"+
		"\u022d\7\b\2\2\u022a\u022c\5\60\31\2\u022b\u022a\3\2\2\2\u022c\u022f\3"+
		"\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0236\7\t\2\2\u0231\u0232\7o\2\2\u0232\u0233\5V,"+
		"\2\u0233\u0234\7\5\2\2\u0234\u0236\3\2\2\2\u0235\u0228\3\2\2\2\u0235\u0229"+
		"\3\2\2\2\u0235\u0231\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0225\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u024c\3\2\2\2\u0239\u023b\5\\/\2\u023a\u0239\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u024a\7I\2\2\u023d"+
		"\u024b\7\5\2\2\u023e\u0242\7\b\2\2\u023f\u0241\5\60\31\2\u0240\u023f\3"+
		"\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u024b\7\t\2\2\u0246\u0247\7o"+
		"\2\2\u0247\u0248\5V,\2\u0248\u0249\7\5\2\2\u0249\u024b\3\2\2\2\u024a\u023d"+
		"\3\2\2\2\u024a\u023e\3\2\2\2\u024a\u0246\3\2\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u023a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0254\7\t"+
		"\2\2\u024f\u0250\7o\2\2\u0250\u0251\5V,\2\u0251\u0252\7\5\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u0223\3\2\2\2\u0253\u024f\3\2\2\2\u0254-\3\2\2\2\u0255"+
		"\u0259\7\b\2\2\u0256\u0258\5\60\31\2\u0257\u0256\3\2\2\2\u0258\u025b\3"+
		"\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025f\7\t\2\2\u025d\u025f\5\60\31\2\u025e\u0255\3"+
		"\2\2\2\u025e\u025d\3\2\2\2\u025f/\3\2\2\2\u0260\u0261\5`\61\2\u0261\u0262"+
		"\7\5\2\2\u0262\u027b\3\2\2\2\u0263\u027b\5\62\32\2\u0264\u027b\5\64\33"+
		"\2\u0265\u027b\5\66\34\2\u0266\u027b\58\35\2\u0267\u027b\5:\36\2\u0268"+
		"\u027b\5<\37\2\u0269\u027b\5> \2\u026a\u027b\5@!\2\u026b\u026c\5V,\2\u026c"+
		"\u026d\7\5\2\2\u026d\u027b\3\2\2\2\u026e\u0270\7P\2\2\u026f\u026e\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275\7\b\2\2\u0272"+
		"\u0274\5\60\31\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3"+
		"\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278"+
		"\u027b\7\t\2\2\u0279\u027b\5J&\2\u027a\u0260\3\2\2\2\u027a\u0263\3\2\2"+
		"\2\u027a\u0264\3\2\2\2\u027a\u0265\3\2\2\2\u027a\u0266\3\2\2\2\u027a\u0267"+
		"\3\2\2\2\u027a\u0268\3\2\2\2\u027a\u0269\3\2\2\2\u027a\u026a\3\2\2\2\u027a"+
		"\u026b\3\2\2\2\u027a\u026f\3\2\2\2\u027a\u0279\3\2\2\2\u027b\61\3\2\2"+
		"\2\u027c\u027d\7A\2\2\u027d\u027e\5.\30\2\u027e\63\3\2\2\2\u027f\u0280"+
		"\7T\2\2\u0280\u0281\5V,\2\u0281\u0282\5.\30\2\u0282\65\3\2\2\2\u0283\u0284"+
		"\7\60\2\2\u0284\u0285\5.\30\2\u0285\u0286\7T\2\2\u0286\u0287\5V,\2\u0287"+
		"\u0288\7\5\2\2\u0288\67\3\2\2\2\u0289\u028a\7\66\2\2\u028a\u028d\7\6\2"+
		"\2\u028b\u028e\5^\60\2\u028c\u028e\5`\61\2\u028d\u028b\3\2\2\2\u028d\u028c"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7\5\2\2\u0290"+
		"\u0291\5V,\2\u0291\u0292\7\5\2\2\u0292\u0293\5V,\2\u0293\u0294\7\7\2\2"+
		"\u0294\u0295\5.\30\2\u0295\u02b6\3\2\2\2\u0296\u0299\7\66\2\2\u0297\u029a"+
		"\5^\60\2\u0298\u029a\5`\61\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7\5\2\2\u029c\u029d\5V"+
		",\2\u029d\u029e\7\5\2\2\u029e\u029f\5V,\2\u029f\u02a0\5.\30\2\u02a0\u02b6"+
		"\3\2\2\2\u02a1\u02a2\7\66\2\2\u02a2\u02a5\7\6\2\2\u02a3\u02a6\5f\64\2"+
		"\u02a4\u02a6\7\u0088\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a8\7<\2\2\u02a8\u02a9\5V,\2\u02a9\u02aa\7\7\2"+
		"\2\u02aa\u02ab\5.\30\2\u02ab\u02b6\3\2\2\2\u02ac\u02af\7\66\2\2\u02ad"+
		"\u02b0\5f\64\2\u02ae\u02b0\7\u0088\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\7<\2\2\u02b2\u02b3\5V,\2\u02b3"+
		"\u02b4\5.\30\2\u02b4\u02b6\3\2\2\2\u02b5\u0289\3\2\2\2\u02b5\u0296\3\2"+
		"\2\2\u02b5\u02a1\3\2\2\2\u02b5\u02ac\3\2\2\2\u02b69\3\2\2\2\u02b7\u02b9"+
		"\7+\2\2\u02b8\u02ba\7\u0087\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\5\2\2\u02bc;\3\2\2\2\u02bd\u02be"+
		"\7.\2\2\u02be\u02bf\7\5\2\2\u02bf=\3\2\2\2\u02c0\u02c2\7-\2\2\u02c1\u02c0"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\79\2\2\u02c4"+
		"\u02c5\5V,\2\u02c5\u02cc\5.\30\2\u02c6\u02c7\7\61\2\2\u02c7\u02c8\5V,"+
		"\2\u02c8\u02c9\5.\30\2\u02c9\u02cb\3\2\2\2\u02ca\u02c6\3\2\2\2\u02cb\u02ce"+
		"\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d1\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02cf\u02d0\7\62\2\2\u02d0\u02d2\5.\30\2\u02d1\u02cf\3"+
		"\2\2\2\u02d1\u02d2\3\2\2\2\u02d2?\3\2\2\2\u02d3\u02d4\7M\2\2\u02d4\u02d5"+
		"\7\6\2\2\u02d5\u02d8\5n8\2\u02d6\u02d7\7o\2\2\u02d7\u02d9\7\u0088\2\2"+
		"\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db"+
		"\7\7\2\2\u02db\u02dd\7\b\2\2\u02dc\u02de\5B\"\2\u02dd\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2"+
		"\2\2\u02e1\u02e2\7\t\2\2\u02e2\u02f2\3\2\2\2\u02e3\u02e4\7M\2\2\u02e4"+
		"\u02e7\5n8\2\u02e5\u02e6\7o\2\2\u02e6\u02e8\7\u0088\2\2\u02e7\u02e5\3"+
		"\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\7\b\2\2\u02ea"+
		"\u02ec\5B\"\2\u02eb\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\t\2\2\u02f0"+
		"\u02f2\3\2\2\2\u02f1\u02d3\3\2\2\2\u02f1\u02e3\3\2\2\2\u02f2A\3\2\2\2"+
		"\u02f3\u02f4\7,\2\2\u02f4\u02f5\5V,\2\u02f5\u02f6\7\r\2\2\u02f6\u02f8"+
		"\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fe\3\2\2\2\u02fb\u02fd\5\60\31\2\u02fc\u02fb\3"+
		"\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7+\2\2\u0302\u0303\7\5"+
		"\2\2\u0303\u030f\3\2\2\2\u0304\u0305\7/\2\2\u0305\u0309\7\r\2\2\u0306"+
		"\u0308\5\60\31\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3"+
		"\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c"+
		"\u030d\7+\2\2\u030d\u030f\7\5\2\2\u030e\u02f7\3\2\2\2\u030e\u0304\3\2"+
		"\2\2\u030fC\3\2\2\2\u0310\u0312\7*\2\2\u0311\u0310\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\5n8\2\u0314\u0316\5T+\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0326\7\6"+
		"\2\2\u0318\u031a\5b\62\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u0323\5V,\2\u031c\u031e\7\13\2\2\u031d\u031f\5b\62"+
		"\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322"+
		"\5V,\2\u0321\u031c\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0319\3\2"+
		"\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7\7\2\2\u0329"+
		"E\3\2\2\2\u032a\u032c\7C\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u033a\5h\65\2\u032e\u0337\7\6\2\2\u032f\u0334\5V"+
		",\2\u0330\u0331\7\13\2\2\u0331\u0333\5V,\2\u0332\u0330\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2"+
		"\2\2\u0339\u033b\7\7\2\2\u033a\u032e\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0345\7\b\2\2\u033d\u0342\5H%\2\u033e\u033f\7\13"+
		"\2\2\u033f\u0341\5H%\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0345"+
		"\u033d\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\7\t"+
		"\2\2\u0348G\3\2\2\2\u0349\u034e\7\u0088\2\2\u034a\u034b\7\3\2\2\u034b"+
		"\u034d\7\u0088\2\2\u034c\u034a\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2\2\2\u0351"+
		"\u0353\7\r\2\2\u0352\u0349\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u0355\5V,\2\u0355I\3\2\2\2\u0356\u035c\5V,\2\u0357\u0358\7"+
		"H\2\2\u0358\u0359\5V,\2\u0359\u035a\7\5\2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035cK\3\2\2\2\u035d\u035e\7\r\2\2"+
		"\u035e\u035f\5N(\2\u035fM\3\2\2\2\u0360\u0361\b(\1\2\u0361\u0362\7\6\2"+
		"\2\u0362\u0363\5N(\2\u0363\u0364\7\7\2\2\u0364\u0367\3\2\2\2\u0365\u0367"+
		"\5h\65\2\u0366\u0360\3\2\2\2\u0366\u0365\3\2\2\2\u0367\u0370\3\2\2\2\u0368"+
		"\u0369\f\5\2\2\u0369\u036a\7j\2\2\u036a\u036f\5N(\6\u036b\u036c\f\4\2"+
		"\2\u036c\u036d\7\13\2\2\u036d\u036f\5N(\5\u036e\u0368\3\2\2\2\u036e\u036b"+
		"\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"O\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0374\7\r\2\2\u0374\u0379\5h\65\2"+
		"\u0375\u0376\7\13\2\2\u0376\u0378\5h\65\2\u0377\u0375\3\2\2\2\u0378\u037b"+
		"\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037aQ\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037c\u037d\7r\2\2\u037d\u037f\7\u0088\2\2\u037e\u0380"+
		"\5L\'\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0388\3\2\2\2\u0381"+
		"\u0382\7\13\2\2\u0382\u0384\7\u0088\2\2\u0383\u0385\5L\'\2\u0384\u0383"+
		"\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0381\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2"+
		"\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7n\2\2\u038cS\3\2\2\2\u038d\u038e"+
		"\7r\2\2\u038e\u0393\5h\65\2\u038f\u0390\7\13\2\2\u0390\u0392\5h\65\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0397\7n\2\2\u0397"+
		"U\3\2\2\2\u0398\u0399\b,\1\2\u0399\u039a\7\6\2\2\u039a\u039b\5V,\2\u039b"+
		"\u039c\7\7\2\2\u039c\u03ad\3\2\2\2\u039d\u03ad\5X-\2\u039e\u03ad\5Z.\2"+
		"\u039f\u03a1\7P\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a6\7\b\2\2\u03a3\u03a5\5\60\31\2\u03a4\u03a3\3\2\2\2"+
		"\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9"+
		"\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ad\7\t\2\2\u03aa\u03ad\7\u0087\2"+
		"\2\u03ab\u03ad\7\u008a\2\2\u03ac\u0398\3\2\2\2\u03ac\u039d\3\2\2\2\u03ac"+
		"\u039e\3\2\2\2\u03ac\u03a0\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2"+
		"\2\2\u03ad\u03ee\3\2\2\2\u03ae\u03af\f\25\2\2\u03af\u03b1\7~\2\2\u03b0"+
		"\u03b2\7U\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03ed\5V,\26\u03b4\u03b5\f\24\2\2\u03b5\u03b6\t\5\2\2\u03b6"+
		"\u03ed\5V,\25\u03b7\u03b8\f\23\2\2\u03b8\u03b9\t\6\2\2\u03b9\u03ed\5V"+
		",\24\u03ba\u03bb\f\22\2\2\u03bb\u03bc\t\7\2\2\u03bc\u03ed\5V,\23\u03bd"+
		"\u03be\f\21\2\2\u03be\u03bf\t\b\2\2\u03bf\u03ed\5V,\22\u03c0\u03c1\f\20"+
		"\2\2\u03c1\u03c2\t\t\2\2\u03c2\u03ed\5V,\21\u03c3\u03c4\f\17\2\2\u03c4"+
		"\u03c5\7h\2\2\u03c5\u03ed\5V,\20\u03c6\u03c7\f\16\2\2\u03c7\u03c8\7s\2"+
		"\2\u03c8\u03ed\5V,\17\u03c9\u03ca\f\r\2\2\u03ca\u03cb\7j\2\2\u03cb\u03ed"+
		"\5V,\16\u03cc\u03cd\f\f\2\2\u03cd\u03ce\7i\2\2\u03ce\u03ed\5V,\r\u03cf"+
		"\u03d0\f\13\2\2\u03d0\u03d1\7|\2\2\u03d1\u03ed\5V,\f\u03d2\u03d3\f\n\2"+
		"\2\u03d3\u03d4\7{\2\2\u03d4\u03ed\5V,\13\u03d5\u03d6\f\t\2\2\u03d6\u03d7"+
		"\7\16\2\2\u03d7\u03d8\5V,\2\u03d8\u03d9\7\r\2\2\u03d9\u03da\5V,\t\u03da"+
		"\u03ed\3\2\2\2\u03db\u03dc\f\b\2\2\u03dc\u03dd\7o\2\2\u03dd\u03ed\5V,"+
		"\t\u03de\u03df\f\7\2\2\u03df\u03e0\5r:\2\u03e0\u03e1\5V,\7\u03e1\u03ed"+
		"\3\2\2\2\u03e2\u03e3\f\6\2\2\u03e3\u03e4\7\13\2\2\u03e4\u03ed\5V,\7\u03e5"+
		"\u03e6\f\30\2\2\u03e6\u03e7\7\6\2\2\u03e7\u03e8\5V,\2\u03e8\u03e9\7\7"+
		"\2\2\u03e9\u03ed\3\2\2\2\u03ea\u03eb\f\27\2\2\u03eb\u03ed\t\n\2\2\u03ec"+
		"\u03ae\3\2\2\2\u03ec\u03b4\3\2\2\2\u03ec\u03b7\3\2\2\2\u03ec\u03ba\3\2"+
		"\2\2\u03ec\u03bd\3\2\2\2\u03ec\u03c0\3\2\2\2\u03ec\u03c3\3\2\2\2\u03ec"+
		"\u03c6\3\2\2\2\u03ec\u03c9\3\2\2\2\u03ec\u03cc\3\2\2\2\u03ec\u03cf\3\2"+
		"\2\2\u03ec\u03d2\3\2\2\2\u03ec\u03d5\3\2\2\2\u03ec\u03db\3\2\2\2\u03ec"+
		"\u03de\3\2\2\2\u03ec\u03e2\3\2\2\2\u03ec\u03e5\3\2\2\2\u03ec\u03ea\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"W\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u0407\5n8\2\u03f2\u0407\5F$\2\u03f3"+
		"\u0407\5D#\2\u03f4\u03f5\7C\2\2\u03f5\u0407\5D#\2\u03f6\u03f7\7O\2\2\u03f7"+
		"\u03fa\7\6\2\2\u03f8\u03fb\5n8\2\u03f9\u03fb\5h\65\2\u03fa\u03f8\3\2\2"+
		"\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\7\7\2\2\u03fd\u0407"+
		"\3\2\2\2\u03fe\u03ff\7J\2\2\u03ff\u0402\7\6\2\2\u0400\u0403\5n8\2\u0401"+
		"\u0403\5h\65\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0405\7\7\2\2\u0405\u0407\3\2\2\2\u0406\u03f1\3\2\2\2\u0406"+
		"\u03f2\3\2\2\2\u0406\u03f3\3\2\2\2\u0406\u03f4\3\2\2\2\u0406\u03f6\3\2"+
		"\2\2\u0406\u03fe\3\2\2\2\u0407Y\3\2\2\2\u0408\u0409\7g\2\2\u0409\u0423"+
		"\5V,\2\u040a\u040b\7\u0082\2\2\u040b\u0423\5V,\2\u040c\u040d\7z\2\2\u040d"+
		"\u0423\5V,\2\u040e\u040f\7\u0083\2\2\u040f\u0423\5V,\2\u0410\u0411\7}"+
		"\2\2\u0411\u0423\5V,\2\u0412\u0413\7t\2\2\u0413\u0423\5V,\2\u0414\u0415"+
		"\7s\2\2\u0415\u0423\5V,\2\u0416\u0417\7\6\2\2\u0417\u0418\5h\65\2\u0418"+
		"\u0419\7\7\2\2\u0419\u041a\5V,\2\u041a\u0423\3\2\2\2\u041b\u041c\7h\2"+
		"\2\u041c\u0423\5V,\2\u041d\u041e\7\177\2\2\u041e\u0423\5V,\2\u041f\u0420"+
		"\7v\2\2\u0420\u0423\5V,\2\u0421\u0423\5l\67\2\u0422\u0408\3\2\2\2\u0422"+
		"\u040a\3\2\2\2\u0422\u040c\3\2\2\2\u0422\u040e\3\2\2\2\u0422\u0410\3\2"+
		"\2\2\u0422\u0412\3\2\2\2\u0422\u0414\3\2\2\2\u0422\u0416\3\2\2\2\u0422"+
		"\u041b\3\2\2\2\u0422\u041d\3\2\2\2\u0422\u041f\3\2\2\2\u0422\u0421\3\2"+
		"\2\2\u0423[\3\2\2\2\u0424\u042d\7G\2\2\u0425\u0426\7F\2\2\u0426\u042d"+
		"\7?\2\2\u0427\u0428\7E\2\2\u0428\u042d\7F\2\2\u0429\u042d\7E\2\2\u042a"+
		"\u042d\7F\2\2\u042b\u042d\7?\2\2\u042c\u0424\3\2\2\2\u042c\u0425\3\2\2"+
		"\2\u042c\u0427\3\2\2\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042b"+
		"\3\2\2\2\u042d]\3\2\2\2\u042e\u0431\5n8\2\u042f\u0430\7\13\2\2\u0430\u0432"+
		"\5n8\2\u0431\u042f\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\5r:\2\u0436\u0437\5V,\2"+
		"\u0437\u0444\3\2\2\2\u0438\u043d\5n8\2\u0439\u043a\7U\2\2\u043a\u043c"+
		"\5n8\2\u043b\u0439\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\5r"+
		":\2\u0441\u0442\5V,\2\u0442\u0444\3\2\2\2\u0443\u042e\3\2\2\2\u0443\u0438"+
		"\3\2\2\2\u0444_\3\2\2\2\u0445\u0447\5\26\f\2\u0446\u0445\3\2\2\2\u0447"+
		"\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2"+
		"\2\2\u044a\u0448\3\2\2\2\u044b\u0450\5f\64\2\u044c\u044d\7U\2\2\u044d"+
		"\u044f\5f\64\2\u044e\u044c\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2"+
		"\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u0450\3\2\2\2\u0453"+
		"\u0455\7U\2\2\u0454\u0456\7C\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2"+
		"\2\u0456\u0459\3\2\2\2\u0457\u045a\5F$\2\u0458\u045a\5D#\2\u0459\u0457"+
		"\3\2\2\2\u0459\u0458\3\2\2\2\u045a\u04b0\3\2\2\2\u045b\u045d\5\26\f\2"+
		"\u045c\u045b\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0466\5f\64\2\u0462"+
		"\u0463\7\13\2\2\u0463\u0465\5f\64\2\u0464\u0462\3\2\2\2\u0465\u0468\3"+
		"\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468"+
		"\u0466\3\2\2\2\u0469\u046b\7U\2\2\u046a\u046c\7C\2\2\u046b\u046a\3\2\2"+
		"\2\u046b\u046c\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u0470\5F$\2\u046e\u0470"+
		"\5D#\2\u046f\u046d\3\2\2\2\u046f\u046e\3\2\2\2\u0470\u04b0\3\2\2\2\u0471"+
		"\u0473\5\26\f\2\u0472\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477"+
		"\u047c\5f\64\2\u0478\u0479\7U\2\2\u0479\u047b\5f\64\2\u047a\u0478\3\2"+
		"\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"\u047f\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0480\7U\2\2\u0480\u0481\5V,"+
		"\2\u0481\u04b0\3\2\2\2\u0482\u0484\5\26\f\2\u0483\u0482\3\2\2\2\u0484"+
		"\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2"+
		"\2\2\u0487\u0485\3\2\2\2\u0488\u048d\5f\64\2\u0489\u048a\7\13\2\2\u048a"+
		"\u048c\5f\64\2\u048b\u0489\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2"+
		"\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490"+
		"\u0491\7U\2\2\u0491\u0492\5V,\2\u0492\u04b0\3\2\2\2\u0493\u0495\5\26\f"+
		"\2\u0494\u0493\3\2\2\2\u0495\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0499\3\2\2\2\u0498\u0496\3\2\2\2\u0499\u049e\5f\64\2\u049a"+
		"\u049b\7\13\2\2\u049b\u049d\7\u0088\2\2\u049c\u049a\3\2\2\2\u049d\u04a0"+
		"\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04b0\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a3\5\26\f\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3"+
		"\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6"+
		"\u04a4\3\2\2\2\u04a7\u04ac\5f\64\2\u04a8\u04a9\7\13\2\2\u04a9\u04ab\5"+
		"f\64\2\u04aa\u04a8\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u0448\3\2"+
		"\2\2\u04af\u045e\3\2\2\2\u04af\u0474\3\2\2\2\u04af\u0485\3\2\2\2\u04af"+
		"\u0496\3\2\2\2\u04af\u04a4\3\2\2\2\u04b0a\3\2\2\2\u04b1\u04b2\7\u0088"+
		"\2\2\u04b2\u04b3\7\r\2\2\u04b3c\3\2\2\2\u04b4\u04b6\5b\62\2\u04b5\u04b4"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04bf\5f\64\2\u04b8"+
		"\u04ba\7\13\2\2\u04b9\u04bb\5b\62\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3"+
		"\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\5f\64\2\u04bd\u04b8\3\2\2\2\u04be"+
		"\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c8\3\2"+
		"\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c4\7\13\2\2\u04c3\u04c5\5h\65\2\u04c4"+
		"\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7\17"+
		"\2\2\u04c7\u04c9\7\u0088\2\2\u04c8\u04c2\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04cb\3\2\2\2\u04ca\u04b5\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04d2\3\2"+
		"\2\2\u04cc\u04ce\5h\65\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\7\17\2\2\u04d0\u04d2\7\u0088\2\2\u04d1\u04ca"+
		"\3\2\2\2\u04d1\u04cd\3\2\2\2\u04d2e\3\2\2\2\u04d3\u04d4\5h\65\2\u04d4"+
		"\u04d5\7\u0088\2\2\u04d5g\3\2\2\2\u04d6\u04d7\b\65\1\2\u04d7\u04f0\5j"+
		"\66\2\u04d8\u04d9\7\6\2\2\u04d9\u04dc\5h\65\2\u04da\u04db\7\13\2\2\u04db"+
		"\u04dd\5h\65\2\u04dc\u04da\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04dc\3\2"+
		"\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\7\2\2\u04e1"+
		"\u04f0\3\2\2\2\u04e2\u04e3\7-\2\2\u04e3\u04f0\5h\65\b\u04e4\u04e5\7K\2"+
		"\2\u04e5\u04f0\5h\65\7\u04e6\u04e7\7S\2\2\u04e7\u04f0\5h\65\6\u04e8\u04e9"+
		"\7)\2\2\u04e9\u04ea\7r\2\2\u04ea\u04eb\5h\65\2\u04eb\u04ec\7n\2\2\u04ec"+
		"\u04f0\3\2\2\2\u04ed\u04f0\5n8\2\u04ee\u04f0\7\20\2\2\u04ef\u04d6\3\2"+
		"\2\2\u04ef\u04d8\3\2\2\2\u04ef\u04e2\3\2\2\2\u04ef\u04e4\3\2\2\2\u04ef"+
		"\u04e6\3\2\2\2\u04ef\u04e8\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04ee\3\2"+
		"\2\2\u04f0\u0519\3\2\2\2\u04f1\u04f2\f\r\2\2\u04f2\u0518\7v\2\2\u04f3"+
		"\u04f4\f\f\2\2\u04f4\u0518\7h\2\2\u04f5\u04f6\f\13\2\2\u04f6\u04f8\7\n"+
		"\2\2\u04f7\u04f9\7\u0087\2\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u0500\3\2\2\2\u04fa\u04fc\7\13\2\2\u04fb\u04fd\7\u0087\2\2\u04fc\u04fb"+
		"\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fa\3\2\2\2\u04ff"+
		"\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2"+
		"\2\2\u0502\u0500\3\2\2\2\u0503\u0518\7\f\2\2\u0504\u0505\f\n\2\2\u0505"+
		"\u0506\7r\2\2\u0506\u050b\5h\65\2\u0507\u0508\7\13\2\2\u0508\u050a\5h"+
		"\65\2\u0509\u0507\3\2\2\2\u050a\u050d\3\2\2\2\u050b\u0509\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050b\3\2\2\2\u050e\u050f\7n"+
		"\2\2\u050f\u0518\3\2\2\2\u0510\u0513\f\t\2\2\u0511\u0512\7\13\2\2\u0512"+
		"\u0514\5h\65\2\u0513\u0511\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0513\3\2"+
		"\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u04f1\3\2\2\2\u0517"+
		"\u04f3\3\2\2\2\u0517\u04f5\3\2\2\2\u0517\u0504\3\2\2\2\u0517\u0510\3\2"+
		"\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"i\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u054d\7\21\2\2\u051d\u054d\7\22\2"+
		"\2\u051e\u054d\7\u0084\2\2\u051f\u054d\7\u0085\2\2\u0520\u054d\7\23\2"+
		"\2\u0521\u054d\7\24\2\2\u0522\u054d\7\25\2\2\u0523\u054d\7\26\2\2\u0524"+
		"\u054d\7\27\2\2\u0525\u054d\7\u0086\2\2\u0526\u054d\7\30\2\2\u0527\u054d"+
		"\7\31\2\2\u0528\u054d\7\32\2\2\u0529\u0535\7\33\2\2\u052a\u052b\7r\2\2"+
		"\u052b\u0530\5h\65\2\u052c\u052d\7\13\2\2\u052d\u052f\5h\65\2\u052e\u052c"+
		"\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531"+
		"\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0534\7n\2\2\u0534\u0536\3\2"+
		"\2\2\u0535\u052a\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u054d\3\2\2\2\u0537"+
		"\u0543\7\34\2\2\u0538\u0539\7r\2\2\u0539\u053e\5h\65\2\u053a\u053b\7\13"+
		"\2\2\u053b\u053d\5h\65\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e\3\2"+
		"\2\2\u0541\u0542\7n\2\2\u0542\u0544\3\2\2\2\u0543\u0538\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u054d\3\2\2\2\u0545\u054d\7\35\2\2\u0546\u054d\7"+
		"\36\2\2\u0547\u054d\7\37\2\2\u0548\u054d\7 \2\2\u0549\u054d\7!\2\2\u054a"+
		"\u054d\7\"\2\2\u054b\u054d\7#\2\2\u054c\u051c\3\2\2\2\u054c\u051d\3\2"+
		"\2\2\u054c\u051e\3\2\2\2\u054c\u051f\3\2\2\2\u054c\u0520\3\2\2\2\u054c"+
		"\u0521\3\2\2\2\u054c\u0522\3\2\2\2\u054c\u0523\3\2\2\2\u054c\u0524\3\2"+
		"\2\2\u054c\u0525\3\2\2\2\u054c\u0526\3\2\2\2\u054c\u0527\3\2\2\2\u054c"+
		"\u0528\3\2\2\2\u054c\u0529\3\2\2\2\u054c\u0537\3\2\2\2\u054c\u0545\3\2"+
		"\2\2\u054c\u0546\3\2\2\2\u054c\u0547\3\2\2\2\u054c\u0548\3\2\2\2\u054c"+
		"\u0549\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054dk\3\2\2\2"+
		"\u054e\u0552\7$\2\2\u054f\u0552\7%\2\2\u0550\u0552\7&\2\2\u0551\u054e"+
		"\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0550\3\2\2\2\u0552m\3\2\2\2\u0553"+
		"\u0558\7\u0088\2\2\u0554\u0555\7\3\2\2\u0555\u0557\7\u0088\2\2\u0556\u0554"+
		"\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055d\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d\5j\66\2\u055c\u0553\3\2"+
		"\2\2\u055c\u055b\3\2\2\2\u055do\3\2\2\2\u055e\u0579\5r:\2\u055f\u0579"+
		"\7g\2\2\u0560\u0579\7i\2\2\u0561\u0579\7h\2\2\u0562\u0579\7j\2\2\u0563"+
		"\u0579\7k\2\2\u0564\u0579\7l\2\2\u0565\u0579\7m\2\2\u0566\u0579\7n\2\2"+
		"\u0567\u0579\7p\2\2\u0568\u0579\7r\2\2\u0569\u0579\7q\2\2\u056a\u0579"+
		"\7s\2\2\u056b\u0579\7t\2\2\u056c\u0579\7u\2\2\u056d\u0579\7v\2\2\u056e"+
		"\u0579\7|\2\2\u056f\u0579\7w\2\2\u0570\u0579\7x\2\2\u0571\u0579\7y\2\2"+
		"\u0572\u0579\7z\2\2\u0573\u0579\7}\2\2\u0574\u0579\7~\2\2\u0575\u0579"+
		"\7\u0081\2\2\u0576\u0579\7\u0082\2\2\u0577\u0579\7\u0083\2\2\u0578\u055e"+
		"\3\2\2\2\u0578\u055f\3\2\2\2\u0578\u0560\3\2\2\2\u0578\u0561\3\2\2\2\u0578"+
		"\u0562\3\2\2\2\u0578\u0563\3\2\2\2\u0578\u0564\3\2\2\2\u0578\u0565\3\2"+
		"\2\2\u0578\u0566\3\2\2\2\u0578\u0567\3\2\2\2\u0578\u0568\3\2\2\2\u0578"+
		"\u0569\3\2\2\2\u0578\u056a\3\2\2\2\u0578\u056b\3\2\2\2\u0578\u056c\3\2"+
		"\2\2\u0578\u056d\3\2\2\2\u0578\u056e\3\2\2\2\u0578\u056f\3\2\2\2\u0578"+
		"\u0570\3\2\2\2\u0578\u0571\3\2\2\2\u0578\u0572\3\2\2\2\u0578\u0573\3\2"+
		"\2\2\u0578\u0574\3\2\2\2\u0578\u0575\3\2\2\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0577\3\2\2\2\u0579q\3\2\2\2\u057a\u057b\t\13\2\2\u057bs\3\2\2\2\u00ba"+
		"w\u0085\u0089\u0090\u0094\u009e\u00a8\u00ad\u00b2\u00bc\u00c5\u00c9\u00ce"+
		"\u00d4\u00db\u00e5\u00e9\u00ec\u00f1\u00f5\u00fa\u00ff\u010c\u0110\u0113"+
		"\u0118\u011c\u0125\u012f\u0133\u0136\u0140\u0145\u014c\u0150\u0156\u015e"+
		"\u0161\u0168\u0171\u0174\u0179\u0182\u0185\u018a\u018c\u0191\u0196\u01a0"+
		"\u01a7\u01ab\u01b0\u01b3\u01b9\u01be\u01c3\u01c7\u01cc\u01cf\u01d5\u01da"+
		"\u01e0\u01e3\u01e9\u01f2\u01f7\u01fb\u0207\u020f\u0217\u021c\u0221\u0225"+
		"\u022d\u0235\u0237\u023a\u0242\u024a\u024c\u0253\u0259\u025e\u026f\u0275"+
		"\u027a\u028d\u0299\u02a5\u02af\u02b5\u02b9\u02c1\u02cc\u02d1\u02d8\u02df"+
		"\u02e7\u02ed\u02f1\u02f9\u02fe\u0309\u030e\u0311\u0315\u0319\u031e\u0323"+
		"\u0326\u032b\u0334\u0337\u033a\u0342\u0345\u034e\u0352\u035b\u0366\u036e"+
		"\u0370\u0379\u037f\u0384\u0388\u0393\u03a0\u03a6\u03ac\u03b1\u03ec\u03ee"+
		"\u03fa\u0402\u0406\u0422\u042c\u0433\u043d\u0443\u0448\u0450\u0455\u0459"+
		"\u045e\u0466\u046b\u046f\u0474\u047c\u0485\u048d\u0496\u049e\u04a4\u04ac"+
		"\u04af\u04b5\u04ba\u04bf\u04c4\u04c8\u04ca\u04cd\u04d1\u04de\u04ef\u04f8"+
		"\u04fc\u0500\u050b\u0515\u0517\u0519\u0530\u0535\u053e\u0543\u054c\u0551"+
		"\u0558\u055c\u0578";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}