// Generated from /home/gota/Documents/C#/StraitJacket/Asylum/Grammar/Asylum.g4 by ANTLR 4.8
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
		INTERNAL=61, IS=62, LOOP=63, NAMEOF=64, NAMESPACE=65, NEW=66, OPERATOR=67, 
		PRIVATE=68, PROTECTED=69, PUBLIC=70, READONLY=71, RETURN=72, SET=73, SIZEOF=74, 
		STACKALLOC=75, STATIC=76, STRUCT=77, SWITCH=78, TYPEDEF=79, TYPEOF=80, 
		UNSAFE=81, UNION=82, USING=83, VOLATILE=84, WHILE=85, ASSIGN_OP_EQ=86, 
		ASSIGN_OP_ADD_EQ=87, ASSIGN_OP_SUB_EQ=88, ASSIGN_OP_EXP_EQ=89, ASSIGN_OP_MUL_EQ=90, 
		ASSIGN_OP_DIV_EQ=91, ASSIGN_OP_MOD_EQ=92, ASSIGN_OP_BITAND_EQ=93, ASSIGN_OP_BITOR_EQ=94, 
		ASSIGN_OP_XOR_EQ=95, ASSIGN_OP_BITFLIP_EQ=96, ASSIGN_OP_LSHIFT_EQ=97, 
		ASSIGN_OP_RSHIFT_EQ=98, ASSIGN_OP_AND_EQ=99, ASSIGN_OP_OR_EQ=100, ASSIGN_OP_NAND_EQ=101, 
		ASSIGN_OP_NOR_EQ=102, ASSIGN_OP_CHECK_NULL=103, OP_ADD=104, OP_ADDRESS_OF=105, 
		OP_AND=106, OP_BITWISE_OR=107, OP_CMP=108, OP_DIV=109, OP_EQ=110, OP_EXP=111, 
		OP_GE=112, OP_GT=113, OP_LAMBDA=114, OP_LE=115, OP_LSHIFT=116, OP_LT=117, 
		OP_MEMBER_ACCESS=118, OP_MINUS_MINUS=119, OP_MOD=120, OP_MUL=121, OP_NAND=122, 
		OP_NE=123, OP_NOR=124, OP_NOT=125, OP_NULL_CHECK=126, OP_OR=127, OP_PLUS_PLUS=128, 
		OP_RANGE=129, OP_RANGE_EQ=130, OP_REFERENCE_POINTER=131, OP_RET=132, OP_RSHIFT=133, 
		OP_SUB=134, OP_TILDE=135, UNSIGNED=136, SIGNED=137, FIXED=138, INTEGER=139, 
		IDENTIFIER=140, ESCAPE_SEQUENCE=141, STRING=142, LINE_COMMENT=143, COMMENT=144, 
		WHITESPACES=145;
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
		RULE_expression = 42, RULE_expr_comma = 43, RULE_expr_assignment = 44, 
		RULE_expr_lambda = 45, RULE_expr_ternary = 46, RULE_expr_nullcheck = 47, 
		RULE_expr_or = 48, RULE_expr_and = 49, RULE_expr_bit_or = 50, RULE_expr_bit_xor = 51, 
		RULE_expr_bit_and = 52, RULE_expr_equality_comparison = 53, RULE_expr_comparison = 54, 
		RULE_expr_three_way_comparison = 55, RULE_expr_shift = 56, RULE_expr_additive = 57, 
		RULE_expr_multiplicative = 58, RULE_expr_exponential = 59, RULE_expr_range = 60, 
		RULE_expr_unary = 61, RULE_expr_primary = 62, RULE_expr_parenthesis = 63, 
		RULE_expr_end = 64, RULE_access_modifier = 65, RULE_variable_assignment = 66, 
		RULE_variable_declaration = 67, RULE_label = 68, RULE_variable_arguments = 69, 
		RULE_variable_parameter = 70, RULE_variable_type = 71, RULE_primitives = 72, 
		RULE_defined_constants = 73, RULE_variable_or_function = 74, RULE_operator = 75, 
		RULE_assignment_operator = 76;
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
			"expr_comma", "expr_assignment", "expr_lambda", "expr_ternary", "expr_nullcheck", 
			"expr_or", "expr_and", "expr_bit_or", "expr_bit_xor", "expr_bit_and", 
			"expr_equality_comparison", "expr_comparison", "expr_three_way_comparison", 
			"expr_shift", "expr_additive", "expr_multiplicative", "expr_exponential", 
			"expr_range", "expr_unary", "expr_primary", "expr_parenthesis", "expr_end", 
			"access_modifier", "variable_assignment", "variable_declaration", "label", 
			"variable_arguments", "variable_parameter", "variable_type", "primitives", 
			"defined_constants", "variable_or_function", "operator", "assignment_operator"
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
			"'in'", "'inline'", "'interface'", "'internal'", "'is'", "'loop'", "'nameof'", 
			"'namespace'", "'new'", "'operator'", null, null, null, "'readonly'", 
			"'return'", "'set'", "'sizeof'", "'stackalloc'", "'static'", "'struct'", 
			"'switch'", "'typedef'", "'typeof'", "'unsafe'", "'union'", "'using'", 
			"'volatile'", "'while'", "'='", "'+='", "'-='", "'**='", "'*='", "'/='", 
			"'%='", "'&='", "'|='", "'^='", "'~='", "'<<='", "'>>='", "'&&='", "'||='", 
			"'!&='", "'!|='", "'??='", "'+'", "'&'", "'&&'", "'|'", "'<=>'", "'/'", 
			"'=='", "'**'", "'>='", "'>'", "'=>'", "'<='", "'<<'", "'<'", "'^'", 
			"'--'", "'%'", "'*'", "'!&'", "'!='", "'!|'", "'!'", "'??'", "'||'", 
			"'++'", "'..'", "'..='", "'@'", "'->'", "'>>'", "'-'", "'~'"
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
			"INTERNAL", "IS", "LOOP", "NAMEOF", "NAMESPACE", "NEW", "OPERATOR", "PRIVATE", 
			"PROTECTED", "PUBLIC", "READONLY", "RETURN", "SET", "SIZEOF", "STACKALLOC", 
			"STATIC", "STRUCT", "SWITCH", "TYPEDEF", "TYPEOF", "UNSAFE", "UNION", 
			"USING", "VOLATILE", "WHILE", "ASSIGN_OP_EQ", "ASSIGN_OP_ADD_EQ", "ASSIGN_OP_SUB_EQ", 
			"ASSIGN_OP_EXP_EQ", "ASSIGN_OP_MUL_EQ", "ASSIGN_OP_DIV_EQ", "ASSIGN_OP_MOD_EQ", 
			"ASSIGN_OP_BITAND_EQ", "ASSIGN_OP_BITOR_EQ", "ASSIGN_OP_XOR_EQ", "ASSIGN_OP_BITFLIP_EQ", 
			"ASSIGN_OP_LSHIFT_EQ", "ASSIGN_OP_RSHIFT_EQ", "ASSIGN_OP_AND_EQ", "ASSIGN_OP_OR_EQ", 
			"ASSIGN_OP_NAND_EQ", "ASSIGN_OP_NOR_EQ", "ASSIGN_OP_CHECK_NULL", "OP_ADD", 
			"OP_ADDRESS_OF", "OP_AND", "OP_BITWISE_OR", "OP_CMP", "OP_DIV", "OP_EQ", 
			"OP_EXP", "OP_GE", "OP_GT", "OP_LAMBDA", "OP_LE", "OP_LSHIFT", "OP_LT", 
			"OP_MEMBER_ACCESS", "OP_MINUS_MINUS", "OP_MOD", "OP_MUL", "OP_NAND", 
			"OP_NE", "OP_NOR", "OP_NOT", "OP_NULL_CHECK", "OP_OR", "OP_PLUS_PLUS", 
			"OP_RANGE", "OP_RANGE_EQ", "OP_REFERENCE_POINTER", "OP_RET", "OP_RSHIFT", 
			"OP_SUB", "OP_TILDE", "UNSIGNED", "SIGNED", "FIXED", "INTEGER", "IDENTIFIER", 
			"ESCAPE_SEQUENCE", "STRING", "LINE_COMMENT", "COMMENT", "WHITESPACES"
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ASYNC) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ENUM) | (1L << EXTERN) | (1L << FOR) | (1L << FUNCTION) | (1L << IF) | (1L << IMPL) | (1L << INLINE) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEDEF - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (USING - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
				{
				{
				setState(154);
				universal_statement();
				}
				}
				setState(159);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new UniversalUsingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				using_statement();
				}
				break;
			case 2:
				_localctx = new UniversalNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				namespace_statement();
				}
				break;
			case 3:
				_localctx = new UniversalExternFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				extern_function_definition();
				}
				break;
			case 4:
				_localctx = new UniversalFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				function_definition();
				}
				break;
			case 5:
				_localctx = new UniversalEnumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				enum_definition();
				}
				break;
			case 6:
				_localctx = new UniversalUnionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				union_definition();
				}
				break;
			case 7:
				_localctx = new UniversalStructContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				struct_definition();
				}
				break;
			case 8:
				_localctx = new UniversalInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				interface_definition();
				}
				break;
			case 9:
				_localctx = new UniversalImplementationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				implementation_definition();
				}
				break;
			case 10:
				_localctx = new UniversalTypedefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				typedef_definition();
				}
				break;
			case 11:
				_localctx = new UniversalTopLevelCodeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
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
			setState(173);
			match(USING);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(174);
				match(STATIC);
				}
			}

			setState(177);
			match(IDENTIFIER);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(178);
				match(T__0);
				setState(179);
				match(IDENTIFIER);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(185);
				match(T__1);
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
			setState(190);
			match(NAMESPACE);
			setState(191);
			match(IDENTIFIER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(192);
				match(T__0);
				setState(193);
				match(IDENTIFIER);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
			setState(201);
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
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(203);
				attribute();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(EXTERN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(210);
				access_modifier();
				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASYNC || _la==STATIC) {
				{
				{
				setState(213);
				extern_function_property();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(FUNCTION);
			setState(220);
			match(IDENTIFIER);
			setState(221);
			match(T__3);
			setState(222);
			variable_arguments();
			setState(223);
			match(T__4);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(224);
				match(OP_RET);
				setState(225);
				variable_type(0);
				}
			}

			setState(228);
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
			setState(230);
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
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(232);
				attribute();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(238);
				access_modifier();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ASYNC - 38)) | (1L << (INLINE - 38)) | (1L << (STATIC - 38)) | (1L << (UNSAFE - 38)))) != 0)) {
				{
				{
				setState(241);
				function_property();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(FUNCTION);
			setState(248);
			match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(249);
				generic_definition();
				}
			}

			setState(252);
			match(T__3);
			setState(253);
			variable_arguments();
			setState(254);
			match(T__4);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(255);
				match(OP_RET);
				setState(256);
				variable_type(0);
				}
			}

			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(259);
					match(OP_LAMBDA);
					setState(260);
					expression();
					setState(261);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(263);
					match(T__5);
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
						{
						{
						setState(264);
						code_statement();
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(270);
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
				setState(273);
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(276);
				attribute();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(282);
				access_modifier();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					function_property();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(291);
			variable_type(0);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(292);
				generic_definition();
				}
			}

			setState(295);
			match(T__3);
			setState(296);
			variable_arguments();
			setState(297);
			match(T__4);
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(298);
					match(OP_LAMBDA);
					setState(299);
					expression();
					setState(300);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(302);
					match(T__5);
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
						{
						{
						setState(303);
						code_statement();
						}
						}
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(309);
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
				setState(312);
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
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(315);
				attribute();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(321);
				match(INLINE);
				}
			}

			setState(324);
			match(OPERATOR);
			setState(325);
			operator();
			setState(326);
			match(T__3);
			setState(327);
			variable_arguments();
			setState(328);
			match(T__4);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RET) {
				{
				setState(329);
				match(OP_RET);
				setState(330);
				variable_type(0);
				}
			}

			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case OP_LAMBDA:
				{
				setState(345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_LAMBDA:
					{
					setState(333);
					match(OP_LAMBDA);
					setState(334);
					expression();
					setState(335);
					match(T__2);
					}
					break;
				case T__5:
					{
					setState(337);
					match(T__5);
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
						{
						{
						setState(338);
						code_statement();
						}
						}
						setState(343);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(344);
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
				setState(347);
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
			setState(350);
			match(T__7);
			setState(351);
			match(IDENTIFIER);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(352);
				match(T__3);
				setState(353);
				expression();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(354);
					match(T__8);
					setState(355);
					expression();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(T__4);
				}
			}

			setState(365);
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
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(367);
				attribute();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(373);
				access_modifier();
				}
			}

			setState(376);
			match(ENUM);
			setState(377);
			match(IDENTIFIER);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(378);
				match(T__10);
				setState(379);
				match(INTEGER);
				}
			}

			setState(382);
			match(T__5);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(383);
				enum_entry();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(384);
					match(T__8);
					setState(385);
					enum_entry();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(393);
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
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new EnumEntryPlainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(IDENTIFIER);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(396);
					match(ASSIGN_OP_EQ);
					setState(397);
					match(INTEGER);
					}
				}

				}
				break;
			case 2:
				_localctx = new EnumEntryDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(IDENTIFIER);
				setState(401);
				match(T__3);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					setState(402);
					variable_type(0);
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(403);
						match(T__8);
						setState(404);
						variable_type(0);
						}
						}
						setState(409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(412);
				match(T__4);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(413);
					match(ASSIGN_OP_EQ);
					setState(414);
					match(INTEGER);
					}
				}

				}
				break;
			case 3:
				_localctx = new EnumEntryStructsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(IDENTIFIER);
				setState(418);
				match(T__5);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					setState(419);
					variable_parameter();
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(420);
						match(T__8);
						setState(421);
						variable_parameter();
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(429);
				match(T__6);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP_EQ) {
					{
					setState(430);
					match(ASSIGN_OP_EQ);
					setState(431);
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
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(436);
				attribute();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(UNSAFE);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(443);
				access_modifier();
				}
			}

			setState(446);
			match(UNION);
			setState(447);
			match(IDENTIFIER);
			setState(448);
			match(T__5);
			setState(452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(449);
				variable_parameter();
				setState(450);
				match(T__2);
				}
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0) );
			setState(456);
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
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(458);
				attribute();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(464);
				access_modifier();
				}
			}

			setState(467);
			match(STRUCT);
			setState(468);
			match(IDENTIFIER);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(469);
				generic_definition();
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(472);
				type_implements();
				}
			}

			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(475);
				match(T__5);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST) | (1L << INTERNAL))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PRIVATE - 68)) | (1L << (PROTECTED - 68)) | (1L << (PUBLIC - 68)) | (1L << (READONLY - 68)) | (1L << (STATIC - 68)) | (1L << (VOLATILE - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					{
					setState(476);
					struct_entry();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				match(T__6);
				}
				break;
			case T__2:
				{
				setState(483);
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
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(486);
				attribute();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
				{
				setState(492);
				access_modifier();
				}
			}

			setState(495);
			match(INTERFACE);
			setState(496);
			match(IDENTIFIER);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(497);
				generic_definition();
				}
			}

			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(500);
				type_implements();
				}
			}

			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(503);
				match(T__5);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST) | (1L << INTERNAL))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PRIVATE - 68)) | (1L << (PROTECTED - 68)) | (1L << (PUBLIC - 68)) | (1L << (READONLY - 68)) | (1L << (STATIC - 68)) | (1L << (VOLATILE - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					{
					setState(504);
					struct_entry();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(T__6);
				}
				break;
			case T__2:
				{
				setState(511);
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
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public TerminalNode FOR() { return getToken(AsylumParser.FOR, 0); }
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
			setState(514);
			match(IMPL);
			setState(515);
			variable_type(0);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(516);
				match(FOR);
				setState(517);
				variable_type(0);
				}
			}

			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(520);
				generic_definition();
				}
			}

			setState(523);
			match(T__5);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ASYNC) | (1L << ATOMIC) | (1L << CONST) | (1L << EXPLICITCAST) | (1L << FUNCTION) | (1L << IMPLICITCAST) | (1L << INLINE) | (1L << INTERNAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OPERATOR - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (PUBLIC - 67)) | (1L << (READONLY - 67)) | (1L << (STATIC - 67)) | (1L << (UNSAFE - 67)) | (1L << (VOLATILE - 67)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
				{
				{
				setState(524);
				implementation_entry();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
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
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new ImplementationEntryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				function_definition();
				}
				break;
			case 2:
				_localctx = new ImplementationEntryConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				constructor_definition();
				}
				break;
			case 3:
				_localctx = new ImplementationEntryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				operator_definition();
				}
				break;
			case 4:
				_localctx = new ImplementationEntryCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
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
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(538);
				attribute();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INLINE) {
				{
				setState(544);
				match(INLINE);
				}
			}

			setState(547);
			_la = _input.LA(1);
			if ( !(_la==EXPLICITCAST || _la==IMPLICITCAST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(548);
			match(T__3);
			setState(549);
			variable_parameter();
			setState(550);
			match(T__4);
			setState(551);
			match(OP_RET);
			setState(552);
			variable_type(0);
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(553);
				match(T__5);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
					{
					{
					setState(554);
					code_statement();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				match(T__6);
				}
				break;
			case OP_LAMBDA:
				{
				setState(561);
				match(OP_LAMBDA);
				setState(562);
				expression();
				setState(563);
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
			setState(567);
			match(TYPEDEF);
			setState(568);
			variable_type(0);
			setState(569);
			match(IDENTIFIER);
			setState(570);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new StructDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
					{
					setState(572);
					access_modifier();
					}
				}

				setState(575);
				variable_parameter();
				setState(578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(576);
					match(T__2);
					}
					break;
				case T__5:
				case OP_LAMBDA:
					{
					setState(577);
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
				setState(580);
				access_modifier();
				setState(581);
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
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new PropertyGetSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(T__5);
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
						{
						setState(586);
						access_modifier();
						}
					}

					setState(589);
					match(GET);
					setState(603);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(590);
						match(T__2);
						}
						break;
					case T__5:
						{
						setState(591);
						match(T__5);
						setState(595);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
							{
							{
							setState(592);
							code_statement();
							}
							}
							setState(597);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(598);
						match(T__6);
						}
						break;
					case OP_LAMBDA:
						{
						setState(599);
						match(OP_LAMBDA);
						setState(600);
						expression();
						setState(601);
						match(T__2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)) | (1L << (SET - 61)))) != 0)) {
					{
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INTERNAL - 61)) | (1L << (PRIVATE - 61)) | (1L << (PROTECTED - 61)) | (1L << (PUBLIC - 61)))) != 0)) {
						{
						setState(607);
						access_modifier();
						}
					}

					setState(610);
					match(SET);
					setState(624);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(611);
						match(T__2);
						}
						break;
					case T__5:
						{
						setState(612);
						match(T__5);
						setState(616);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
							{
							{
							setState(613);
							code_statement();
							}
							}
							setState(618);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(619);
						match(T__6);
						}
						break;
					case OP_LAMBDA:
						{
						setState(620);
						match(OP_LAMBDA);
						setState(621);
						expression();
						setState(622);
						match(T__2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(628);
				match(T__6);
				}
				break;
			case OP_LAMBDA:
				_localctx = new PropertySetOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(OP_LAMBDA);
				setState(630);
				expression();
				setState(631);
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(T__5);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
					{
					{
					setState(636);
					code_statement();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
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
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				variable_declaration();
				setState(647);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				loop();
				}
				break;
			case 3:
				_localctx = new WhileLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				while_loop();
				}
				break;
			case 4:
				_localctx = new DoWhileLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				do_while_loop();
				}
				break;
			case 5:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				for_loop();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				break_statement();
				}
				break;
			case 7:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(654);
				continue_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(655);
				if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchCaseStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(656);
				switch_case();
				}
				break;
			case 10:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(657);
				expression();
				setState(658);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new IndentedStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(660);
					match(UNSAFE);
					}
				}

				setState(663);
				match(T__5);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << ATOMIC) | (1L << AWAIT) | (1L << BREAK) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (READONLY - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEOF - 64)) | (1L << (UNSAFE - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (SIGNED - 128)) | (1L << (FIXED - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
					{
					{
					setState(664);
					code_statement();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				match(T__6);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(671);
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
			setState(674);
			match(LOOP);
			setState(675);
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
			setState(677);
			match(WHILE);
			setState(678);
			expression();
			setState(679);
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
			setState(681);
			match(DO);
			setState(682);
			code_body();
			setState(683);
			match(WHILE);
			setState(684);
			expression();
			setState(685);
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
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new TraditionalForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(FOR);
				setState(688);
				match(T__3);
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(689);
					variable_assignment();
					}
					break;
				case 2:
					{
					setState(690);
					variable_declaration();
					}
					break;
				}
				setState(693);
				match(T__2);
				setState(694);
				expression();
				setState(695);
				match(T__2);
				setState(696);
				expression();
				setState(697);
				match(T__4);
				setState(698);
				code_body();
				}
				break;
			case 2:
				_localctx = new TraditionalForLoopNoParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(FOR);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(701);
					variable_assignment();
					}
					break;
				case 2:
					{
					setState(702);
					variable_declaration();
					}
					break;
				}
				setState(705);
				match(T__2);
				setState(706);
				expression();
				setState(707);
				match(T__2);
				setState(708);
				expression();
				setState(709);
				code_body();
				}
				break;
			case 3:
				_localctx = new ForEachLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				match(FOR);
				setState(712);
				match(T__3);
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(713);
					variable_parameter();
					}
					break;
				case 2:
					{
					setState(714);
					match(IDENTIFIER);
					}
					break;
				}
				setState(717);
				match(IN);
				setState(718);
				expression();
				setState(719);
				match(T__4);
				setState(720);
				code_body();
				}
				break;
			case 4:
				_localctx = new ForEachLoopNoParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(722);
				match(FOR);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(723);
					variable_parameter();
					}
					break;
				case 2:
					{
					setState(724);
					match(IDENTIFIER);
					}
					break;
				}
				setState(727);
				match(IN);
				setState(728);
				expression();
				setState(729);
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
			setState(733);
			match(BREAK);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(734);
				match(INTEGER);
				}
			}

			setState(737);
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
			setState(739);
			match(CONTINUE);
			setState(740);
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
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(742);
				match(CONST);
				}
			}

			setState(745);
			match(IF);
			setState(746);
			expression();
			setState(747);
			code_body();
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(748);
					match(ELIF);
					setState(749);
					expression();
					setState(750);
					code_body();
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(757);
				match(ELSE);
				setState(758);
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
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new SwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(SWITCH);
				setState(762);
				match(T__3);
				setState(763);
				variable_or_function();
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_LAMBDA) {
					{
					setState(764);
					match(OP_LAMBDA);
					setState(765);
					match(IDENTIFIER);
					}
				}

				setState(768);
				match(T__4);
				setState(769);
				match(T__5);
				setState(771); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(770);
					switch_rule();
					}
					}
					setState(773); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(775);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new SwitchCaseNoParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(SWITCH);
				setState(778);
				variable_or_function();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_LAMBDA) {
					{
					setState(779);
					match(OP_LAMBDA);
					setState(780);
					match(IDENTIFIER);
					}
				}

				setState(783);
				match(T__5);
				setState(785); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(784);
					switch_rule();
					}
					}
					setState(787); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(789);
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
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				_localctx = new CaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(793);
					match(CASE);
					setState(794);
					expression();
					setState(795);
					match(T__10);
					}
					}
					setState(799); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(801);
						code_statement();
						}
						} 
					}
					setState(806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(807);
				match(BREAK);
				setState(808);
				match(T__2);
				}
				break;
			case DEFAULT:
				_localctx = new CaseDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(DEFAULT);
				setState(811);
				match(T__10);
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(812);
						code_statement();
						}
						} 
					}
					setState(817);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(818);
				match(BREAK);
				setState(819);
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
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(822);
				match(AWAIT);
				}
			}

			setState(825);
			variable_or_function();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LT) {
				{
				setState(826);
				generic_specifier();
				}
			}

			setState(829);
			match(T__3);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << AWAIT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (TYPEOF - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
				{
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(830);
					label();
					}
					break;
				}
				setState(833);
				expression();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(834);
					match(T__8);
					setState(836);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(835);
						label();
						}
						break;
					}
					setState(838);
					expression();
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(846);
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
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(848);
				match(NEW);
				}
			}

			setState(851);
			variable_type(0);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(852);
				match(T__3);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << AWAIT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (TYPEOF - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
					{
					setState(853);
					expression();
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(854);
						match(T__8);
						setState(855);
						expression();
						}
						}
						setState(860);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(863);
				match(T__4);
				}
			}

			setState(866);
			match(T__5);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << AWAIT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (TYPEOF - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
				{
				setState(867);
				initializer_value();
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(868);
					match(T__8);
					setState(869);
					initializer_value();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(877);
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
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(879);
				match(IDENTIFIER);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(880);
					match(T__0);
					setState(881);
					match(IDENTIFIER);
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(887);
				match(T__10);
				}
				break;
			}
			setState(890);
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
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__33:
			case T__34:
			case T__35:
			case AWAIT:
			case DEFAULT:
			case NAMEOF:
			case NEW:
			case SIZEOF:
			case STACKALLOC:
			case TYPEOF:
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
			case INTEGER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				expression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(RETURN);
				setState(894);
				expression();
				setState(895);
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
			setState(899);
			match(T__10);
			setState(900);
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
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				_localctx = new TypeImplementsExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(903);
				match(T__3);
				setState(904);
				type_implements_extended_expression(0);
				setState(905);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new TypeImplementsExprSingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(907);
				variable_type(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(916);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						_localctx = new TypeImplementsExprOrContext(new Type_implements_extended_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_implements_extended_expression);
						setState(910);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(911);
						match(OP_BITWISE_OR);
						setState(912);
						type_implements_extended_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new TypeImplementsExprAndContext(new Type_implements_extended_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_implements_extended_expression);
						setState(913);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(914);
						match(T__8);
						setState(915);
						type_implements_extended_expression(3);
						}
						break;
					}
					} 
				}
				setState(920);
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
			setState(921);
			match(T__10);
			setState(922);
			variable_type(0);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(923);
				match(T__8);
				setState(924);
				variable_type(0);
				}
				}
				setState(929);
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
			setState(930);
			match(OP_LT);
			setState(931);
			match(IDENTIFIER);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(932);
				type_implements_extended();
				}
			}

			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(935);
				match(T__8);
				setState(936);
				match(IDENTIFIER);
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(937);
					type_implements_extended();
					}
				}

				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
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
			setState(947);
			match(OP_LT);
			setState(948);
			variable_type(0);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(949);
				match(T__8);
				setState(950);
				variable_type(0);
				}
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
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
	public static class ExprVisitCommaContext extends ExpressionContext {
		public Expr_commaContext expr_comma() {
			return getRuleContext(Expr_commaContext.class,0);
		}
		public ExprVisitCommaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expression);
		try {
			_localctx = new ExprVisitCommaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			expr_comma(0);
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

	public static class Expr_commaContext extends ParserRuleContext {
		public Expr_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comma; }
	 
		public Expr_commaContext() { }
		public void copyFrom(Expr_commaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCommaContext extends Expr_commaContext {
		public Expr_commaContext expr_comma() {
			return getRuleContext(Expr_commaContext.class,0);
		}
		public Expr_assignmentContext expr_assignment() {
			return getRuleContext(Expr_assignmentContext.class,0);
		}
		public ExprCommaContext(Expr_commaContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitAssignmentContext extends Expr_commaContext {
		public Expr_assignmentContext expr_assignment() {
			return getRuleContext(Expr_assignmentContext.class,0);
		}
		public ExprVisitAssignmentContext(Expr_commaContext ctx) { copyFrom(ctx); }
	}

	public final Expr_commaContext expr_comma() throws RecognitionException {
		return expr_comma(0);
	}

	private Expr_commaContext expr_comma(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_commaContext _localctx = new Expr_commaContext(_ctx, _parentState);
		Expr_commaContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr_comma, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitAssignmentContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(961);
			expr_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprCommaContext(new Expr_commaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_comma);
					setState(963);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(964);
					match(T__8);
					setState(965);
					expr_assignment();
					}
					} 
				}
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class Expr_assignmentContext extends ParserRuleContext {
		public Expr_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assignment; }
	 
		public Expr_assignmentContext() { }
		public void copyFrom(Expr_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAssignmentContext extends Expr_assignmentContext {
		public Expr_lambdaContext expr_lambda() {
			return getRuleContext(Expr_lambdaContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Expr_assignmentContext expr_assignment() {
			return getRuleContext(Expr_assignmentContext.class,0);
		}
		public ExprAssignmentContext(Expr_assignmentContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitLambdaContext extends Expr_assignmentContext {
		public Expr_lambdaContext expr_lambda() {
			return getRuleContext(Expr_lambdaContext.class,0);
		}
		public ExprVisitLambdaContext(Expr_assignmentContext ctx) { copyFrom(ctx); }
	}

	public final Expr_assignmentContext expr_assignment() throws RecognitionException {
		Expr_assignmentContext _localctx = new Expr_assignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_assignment);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new ExprVisitLambdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				expr_lambda(0);
				}
				break;
			case 2:
				_localctx = new ExprAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				expr_lambda(0);
				setState(973);
				assignment_operator();
				setState(974);
				expr_assignment();
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

	public static class Expr_lambdaContext extends ParserRuleContext {
		public Expr_lambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lambda; }
	 
		public Expr_lambdaContext() { }
		public void copyFrom(Expr_lambdaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitTernaryContext extends Expr_lambdaContext {
		public Expr_ternaryContext expr_ternary() {
			return getRuleContext(Expr_ternaryContext.class,0);
		}
		public ExprVisitTernaryContext(Expr_lambdaContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLambdaContext extends Expr_lambdaContext {
		public Expr_lambdaContext expr_lambda() {
			return getRuleContext(Expr_lambdaContext.class,0);
		}
		public TerminalNode OP_LAMBDA() { return getToken(AsylumParser.OP_LAMBDA, 0); }
		public Expr_ternaryContext expr_ternary() {
			return getRuleContext(Expr_ternaryContext.class,0);
		}
		public ExprLambdaContext(Expr_lambdaContext ctx) { copyFrom(ctx); }
	}

	public final Expr_lambdaContext expr_lambda() throws RecognitionException {
		return expr_lambda(0);
	}

	private Expr_lambdaContext expr_lambda(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_lambdaContext _localctx = new Expr_lambdaContext(_ctx, _parentState);
		Expr_lambdaContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr_lambda, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitTernaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(979);
			expr_ternary();
			}
			_ctx.stop = _input.LT(-1);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprLambdaContext(new Expr_lambdaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lambda);
					setState(981);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(982);
					match(OP_LAMBDA);
					setState(983);
					expr_ternary();
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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

	public static class Expr_ternaryContext extends ParserRuleContext {
		public Expr_ternaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_ternary; }
	 
		public Expr_ternaryContext() { }
		public void copyFrom(Expr_ternaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprTernaryContext extends Expr_ternaryContext {
		public Expr_nullcheckContext expr_nullcheck() {
			return getRuleContext(Expr_nullcheckContext.class,0);
		}
		public List<Expr_ternaryContext> expr_ternary() {
			return getRuleContexts(Expr_ternaryContext.class);
		}
		public Expr_ternaryContext expr_ternary(int i) {
			return getRuleContext(Expr_ternaryContext.class,i);
		}
		public ExprTernaryContext(Expr_ternaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitNullCheckContext extends Expr_ternaryContext {
		public Expr_nullcheckContext expr_nullcheck() {
			return getRuleContext(Expr_nullcheckContext.class,0);
		}
		public ExprVisitNullCheckContext(Expr_ternaryContext ctx) { copyFrom(ctx); }
	}

	public final Expr_ternaryContext expr_ternary() throws RecognitionException {
		Expr_ternaryContext _localctx = new Expr_ternaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr_ternary);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new ExprVisitNullCheckContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				expr_nullcheck(0);
				}
				break;
			case 2:
				_localctx = new ExprTernaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				expr_nullcheck(0);
				setState(991);
				match(T__11);
				setState(992);
				expr_ternary();
				setState(993);
				match(T__10);
				setState(994);
				expr_ternary();
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

	public static class Expr_nullcheckContext extends ParserRuleContext {
		public Expr_nullcheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_nullcheck; }
	 
		public Expr_nullcheckContext() { }
		public void copyFrom(Expr_nullcheckContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNullCheckContext extends Expr_nullcheckContext {
		public Expr_nullcheckContext expr_nullcheck() {
			return getRuleContext(Expr_nullcheckContext.class,0);
		}
		public TerminalNode OP_NULL_CHECK() { return getToken(AsylumParser.OP_NULL_CHECK, 0); }
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public ExprNullCheckContext(Expr_nullcheckContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitOrContext extends Expr_nullcheckContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public ExprVisitOrContext(Expr_nullcheckContext ctx) { copyFrom(ctx); }
	}

	public final Expr_nullcheckContext expr_nullcheck() throws RecognitionException {
		return expr_nullcheck(0);
	}

	private Expr_nullcheckContext expr_nullcheck(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_nullcheckContext _localctx = new Expr_nullcheckContext(_ctx, _parentState);
		Expr_nullcheckContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr_nullcheck, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(999);
			expr_or(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprNullCheckContext(new Expr_nullcheckContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_nullcheck);
					setState(1001);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1002);
					match(OP_NULL_CHECK);
					setState(1003);
					expr_or(0);
					}
					} 
				}
				setState(1008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	 
		public Expr_orContext() { }
		public void copyFrom(Expr_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprOrContext extends Expr_orContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public TerminalNode OP_OR() { return getToken(AsylumParser.OP_OR, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public ExprOrContext(Expr_orContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitAndContext extends Expr_orContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public ExprVisitAndContext(Expr_orContext ctx) { copyFrom(ctx); }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		return expr_or(0);
	}

	private Expr_orContext expr_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_orContext _localctx = new Expr_orContext(_ctx, _parentState);
		Expr_orContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1010);
			expr_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprOrContext(new Expr_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_or);
					setState(1012);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1013);
					match(OP_OR);
					setState(1014);
					expr_and(0);
					}
					} 
				}
				setState(1019);
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

	public static class Expr_andContext extends ParserRuleContext {
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	 
		public Expr_andContext() { }
		public void copyFrom(Expr_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAndContext extends Expr_andContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public TerminalNode OP_AND() { return getToken(AsylumParser.OP_AND, 0); }
		public Expr_bit_orContext expr_bit_or() {
			return getRuleContext(Expr_bit_orContext.class,0);
		}
		public ExprAndContext(Expr_andContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitBitOrContext extends Expr_andContext {
		public Expr_bit_orContext expr_bit_or() {
			return getRuleContext(Expr_bit_orContext.class,0);
		}
		public ExprVisitBitOrContext(Expr_andContext ctx) { copyFrom(ctx); }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		return expr_and(0);
	}

	private Expr_andContext expr_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_andContext _localctx = new Expr_andContext(_ctx, _parentState);
		Expr_andContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expr_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitBitOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1021);
			expr_bit_or(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAndContext(new Expr_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_and);
					setState(1023);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1024);
					match(OP_AND);
					setState(1025);
					expr_bit_or(0);
					}
					} 
				}
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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

	public static class Expr_bit_orContext extends ParserRuleContext {
		public Expr_bit_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bit_or; }
	 
		public Expr_bit_orContext() { }
		public void copyFrom(Expr_bit_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitBitXorContext extends Expr_bit_orContext {
		public Expr_bit_xorContext expr_bit_xor() {
			return getRuleContext(Expr_bit_xorContext.class,0);
		}
		public ExprVisitBitXorContext(Expr_bit_orContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitOrContext extends Expr_bit_orContext {
		public Expr_bit_orContext expr_bit_or() {
			return getRuleContext(Expr_bit_orContext.class,0);
		}
		public TerminalNode OP_BITWISE_OR() { return getToken(AsylumParser.OP_BITWISE_OR, 0); }
		public Expr_bit_xorContext expr_bit_xor() {
			return getRuleContext(Expr_bit_xorContext.class,0);
		}
		public ExprBitOrContext(Expr_bit_orContext ctx) { copyFrom(ctx); }
	}

	public final Expr_bit_orContext expr_bit_or() throws RecognitionException {
		return expr_bit_or(0);
	}

	private Expr_bit_orContext expr_bit_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_bit_orContext _localctx = new Expr_bit_orContext(_ctx, _parentState);
		Expr_bit_orContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expr_bit_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitBitXorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1032);
			expr_bit_xor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBitOrContext(new Expr_bit_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_bit_or);
					setState(1034);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1035);
					match(OP_BITWISE_OR);
					setState(1036);
					expr_bit_xor(0);
					}
					} 
				}
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class Expr_bit_xorContext extends ParserRuleContext {
		public Expr_bit_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bit_xor; }
	 
		public Expr_bit_xorContext() { }
		public void copyFrom(Expr_bit_xorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBitXorContext extends Expr_bit_xorContext {
		public Expr_bit_xorContext expr_bit_xor() {
			return getRuleContext(Expr_bit_xorContext.class,0);
		}
		public TerminalNode OP_MEMBER_ACCESS() { return getToken(AsylumParser.OP_MEMBER_ACCESS, 0); }
		public Expr_bit_andContext expr_bit_and() {
			return getRuleContext(Expr_bit_andContext.class,0);
		}
		public ExprBitXorContext(Expr_bit_xorContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitBitAndContext extends Expr_bit_xorContext {
		public Expr_bit_andContext expr_bit_and() {
			return getRuleContext(Expr_bit_andContext.class,0);
		}
		public ExprVisitBitAndContext(Expr_bit_xorContext ctx) { copyFrom(ctx); }
	}

	public final Expr_bit_xorContext expr_bit_xor() throws RecognitionException {
		return expr_bit_xor(0);
	}

	private Expr_bit_xorContext expr_bit_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_bit_xorContext _localctx = new Expr_bit_xorContext(_ctx, _parentState);
		Expr_bit_xorContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expr_bit_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitBitAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1043);
			expr_bit_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBitXorContext(new Expr_bit_xorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_bit_xor);
					setState(1045);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1046);
					match(OP_MEMBER_ACCESS);
					setState(1047);
					expr_bit_and(0);
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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

	public static class Expr_bit_andContext extends ParserRuleContext {
		public Expr_bit_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bit_and; }
	 
		public Expr_bit_andContext() { }
		public void copyFrom(Expr_bit_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBitAndContext extends Expr_bit_andContext {
		public Expr_bit_andContext expr_bit_and() {
			return getRuleContext(Expr_bit_andContext.class,0);
		}
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public Expr_equality_comparisonContext expr_equality_comparison() {
			return getRuleContext(Expr_equality_comparisonContext.class,0);
		}
		public ExprBitAndContext(Expr_bit_andContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitEqualityComparisonContext extends Expr_bit_andContext {
		public Expr_equality_comparisonContext expr_equality_comparison() {
			return getRuleContext(Expr_equality_comparisonContext.class,0);
		}
		public ExprVisitEqualityComparisonContext(Expr_bit_andContext ctx) { copyFrom(ctx); }
	}

	public final Expr_bit_andContext expr_bit_and() throws RecognitionException {
		return expr_bit_and(0);
	}

	private Expr_bit_andContext expr_bit_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_bit_andContext _localctx = new Expr_bit_andContext(_ctx, _parentState);
		Expr_bit_andContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expr_bit_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitEqualityComparisonContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1054);
			expr_equality_comparison(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1061);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBitAndContext(new Expr_bit_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_bit_and);
					setState(1056);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1057);
					match(OP_ADDRESS_OF);
					setState(1058);
					expr_equality_comparison(0);
					}
					} 
				}
				setState(1063);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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

	public static class Expr_equality_comparisonContext extends ParserRuleContext {
		public Expr_equality_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_equality_comparison; }
	 
		public Expr_equality_comparisonContext() { }
		public void copyFrom(Expr_equality_comparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprEqualityComparisonContext extends Expr_equality_comparisonContext {
		public Expr_equality_comparisonContext expr_equality_comparison() {
			return getRuleContext(Expr_equality_comparisonContext.class,0);
		}
		public Expr_comparisonContext expr_comparison() {
			return getRuleContext(Expr_comparisonContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(AsylumParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(AsylumParser.OP_NE, 0); }
		public ExprEqualityComparisonContext(Expr_equality_comparisonContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitComparisonContext extends Expr_equality_comparisonContext {
		public Expr_comparisonContext expr_comparison() {
			return getRuleContext(Expr_comparisonContext.class,0);
		}
		public ExprVisitComparisonContext(Expr_equality_comparisonContext ctx) { copyFrom(ctx); }
	}

	public final Expr_equality_comparisonContext expr_equality_comparison() throws RecognitionException {
		return expr_equality_comparison(0);
	}

	private Expr_equality_comparisonContext expr_equality_comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_equality_comparisonContext _localctx = new Expr_equality_comparisonContext(_ctx, _parentState);
		Expr_equality_comparisonContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expr_equality_comparison, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitComparisonContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1065);
			expr_comparison(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprEqualityComparisonContext(new Expr_equality_comparisonContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_equality_comparison);
					setState(1067);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1068);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1069);
					expr_comparison(0);
					}
					} 
				}
				setState(1074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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

	public static class Expr_comparisonContext extends ParserRuleContext {
		public Expr_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comparison; }
	 
		public Expr_comparisonContext() { }
		public void copyFrom(Expr_comparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprComparisonContext extends Expr_comparisonContext {
		public Expr_comparisonContext expr_comparison() {
			return getRuleContext(Expr_comparisonContext.class,0);
		}
		public Expr_three_way_comparisonContext expr_three_way_comparison() {
			return getRuleContext(Expr_three_way_comparisonContext.class,0);
		}
		public TerminalNode OP_LT() { return getToken(AsylumParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(AsylumParser.OP_GT, 0); }
		public TerminalNode OP_LE() { return getToken(AsylumParser.OP_LE, 0); }
		public TerminalNode OP_GE() { return getToken(AsylumParser.OP_GE, 0); }
		public TerminalNode IS() { return getToken(AsylumParser.IS, 0); }
		public TerminalNode AS() { return getToken(AsylumParser.AS, 0); }
		public ExprComparisonContext(Expr_comparisonContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitThreeWayComparisonContext extends Expr_comparisonContext {
		public Expr_three_way_comparisonContext expr_three_way_comparison() {
			return getRuleContext(Expr_three_way_comparisonContext.class,0);
		}
		public ExprVisitThreeWayComparisonContext(Expr_comparisonContext ctx) { copyFrom(ctx); }
	}

	public final Expr_comparisonContext expr_comparison() throws RecognitionException {
		return expr_comparison(0);
	}

	private Expr_comparisonContext expr_comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_comparisonContext _localctx = new Expr_comparisonContext(_ctx, _parentState);
		Expr_comparisonContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expr_comparison, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitThreeWayComparisonContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1076);
			expr_three_way_comparison(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprComparisonContext(new Expr_comparisonContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_comparison);
					setState(1078);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1079);
					_la = _input.LA(1);
					if ( !(_la==AS || _la==IS || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (OP_GE - 112)) | (1L << (OP_GT - 112)) | (1L << (OP_LE - 112)) | (1L << (OP_LT - 112)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1080);
					expr_three_way_comparison(0);
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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

	public static class Expr_three_way_comparisonContext extends ParserRuleContext {
		public Expr_three_way_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_three_way_comparison; }
	 
		public Expr_three_way_comparisonContext() { }
		public void copyFrom(Expr_three_way_comparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprThreeWayComparisonContext extends Expr_three_way_comparisonContext {
		public Expr_three_way_comparisonContext expr_three_way_comparison() {
			return getRuleContext(Expr_three_way_comparisonContext.class,0);
		}
		public Expr_shiftContext expr_shift() {
			return getRuleContext(Expr_shiftContext.class,0);
		}
		public TerminalNode OP_CMP() { return getToken(AsylumParser.OP_CMP, 0); }
		public ExprThreeWayComparisonContext(Expr_three_way_comparisonContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitShiftContext extends Expr_three_way_comparisonContext {
		public Expr_shiftContext expr_shift() {
			return getRuleContext(Expr_shiftContext.class,0);
		}
		public ExprVisitShiftContext(Expr_three_way_comparisonContext ctx) { copyFrom(ctx); }
	}

	public final Expr_three_way_comparisonContext expr_three_way_comparison() throws RecognitionException {
		return expr_three_way_comparison(0);
	}

	private Expr_three_way_comparisonContext expr_three_way_comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_three_way_comparisonContext _localctx = new Expr_three_way_comparisonContext(_ctx, _parentState);
		Expr_three_way_comparisonContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr_three_way_comparison, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitShiftContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1087);
			expr_shift(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1094);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprThreeWayComparisonContext(new Expr_three_way_comparisonContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_three_way_comparison);
					setState(1089);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(1090);
					match(OP_CMP);
					}
					setState(1091);
					expr_shift(0);
					}
					} 
				}
				setState(1096);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class Expr_shiftContext extends ParserRuleContext {
		public Expr_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_shift; }
	 
		public Expr_shiftContext() { }
		public void copyFrom(Expr_shiftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitAdditiveContext extends Expr_shiftContext {
		public Expr_additiveContext expr_additive() {
			return getRuleContext(Expr_additiveContext.class,0);
		}
		public ExprVisitAdditiveContext(Expr_shiftContext ctx) { copyFrom(ctx); }
	}
	public static class ExprShiftContext extends Expr_shiftContext {
		public Expr_shiftContext expr_shift() {
			return getRuleContext(Expr_shiftContext.class,0);
		}
		public Expr_additiveContext expr_additive() {
			return getRuleContext(Expr_additiveContext.class,0);
		}
		public TerminalNode OP_LSHIFT() { return getToken(AsylumParser.OP_LSHIFT, 0); }
		public TerminalNode OP_RSHIFT() { return getToken(AsylumParser.OP_RSHIFT, 0); }
		public ExprShiftContext(Expr_shiftContext ctx) { copyFrom(ctx); }
	}

	public final Expr_shiftContext expr_shift() throws RecognitionException {
		return expr_shift(0);
	}

	private Expr_shiftContext expr_shift(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_shiftContext _localctx = new Expr_shiftContext(_ctx, _parentState);
		Expr_shiftContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expr_shift, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitAdditiveContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1098);
			expr_additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprShiftContext(new Expr_shiftContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_shift);
					setState(1100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1101);
					_la = _input.LA(1);
					if ( !(_la==OP_LSHIFT || _la==OP_RSHIFT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1102);
					expr_additive(0);
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class Expr_additiveContext extends ParserRuleContext {
		public Expr_additiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_additive; }
	 
		public Expr_additiveContext() { }
		public void copyFrom(Expr_additiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitMultiplicativeContext extends Expr_additiveContext {
		public Expr_multiplicativeContext expr_multiplicative() {
			return getRuleContext(Expr_multiplicativeContext.class,0);
		}
		public ExprVisitMultiplicativeContext(Expr_additiveContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAdditiveContext extends Expr_additiveContext {
		public Expr_additiveContext expr_additive() {
			return getRuleContext(Expr_additiveContext.class,0);
		}
		public Expr_multiplicativeContext expr_multiplicative() {
			return getRuleContext(Expr_multiplicativeContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(AsylumParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(AsylumParser.OP_SUB, 0); }
		public ExprAdditiveContext(Expr_additiveContext ctx) { copyFrom(ctx); }
	}

	public final Expr_additiveContext expr_additive() throws RecognitionException {
		return expr_additive(0);
	}

	private Expr_additiveContext expr_additive(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_additiveContext _localctx = new Expr_additiveContext(_ctx, _parentState);
		Expr_additiveContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr_additive, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitMultiplicativeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1109);
			expr_multiplicative(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAdditiveContext(new Expr_additiveContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_additive);
					setState(1111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1112);
					_la = _input.LA(1);
					if ( !(_la==OP_ADD || _la==OP_SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1113);
					expr_multiplicative(0);
					}
					} 
				}
				setState(1118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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

	public static class Expr_multiplicativeContext extends ParserRuleContext {
		public Expr_multiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_multiplicative; }
	 
		public Expr_multiplicativeContext() { }
		public void copyFrom(Expr_multiplicativeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprMultiplicativeContext extends Expr_multiplicativeContext {
		public Expr_multiplicativeContext expr_multiplicative() {
			return getRuleContext(Expr_multiplicativeContext.class,0);
		}
		public Expr_exponentialContext expr_exponential() {
			return getRuleContext(Expr_exponentialContext.class,0);
		}
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(AsylumParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(AsylumParser.OP_MOD, 0); }
		public ExprMultiplicativeContext(Expr_multiplicativeContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitExponentialContext extends Expr_multiplicativeContext {
		public Expr_exponentialContext expr_exponential() {
			return getRuleContext(Expr_exponentialContext.class,0);
		}
		public ExprVisitExponentialContext(Expr_multiplicativeContext ctx) { copyFrom(ctx); }
	}

	public final Expr_multiplicativeContext expr_multiplicative() throws RecognitionException {
		return expr_multiplicative(0);
	}

	private Expr_multiplicativeContext expr_multiplicative(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_multiplicativeContext _localctx = new Expr_multiplicativeContext(_ctx, _parentState);
		Expr_multiplicativeContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expr_multiplicative, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitExponentialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1120);
			expr_exponential(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprMultiplicativeContext(new Expr_multiplicativeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_multiplicative);
					setState(1122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1123);
					_la = _input.LA(1);
					if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (OP_DIV - 109)) | (1L << (OP_MOD - 109)) | (1L << (OP_MUL - 109)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1124);
					expr_exponential(0);
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class Expr_exponentialContext extends ParserRuleContext {
		public Expr_exponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_exponential; }
	 
		public Expr_exponentialContext() { }
		public void copyFrom(Expr_exponentialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprExponentialContext extends Expr_exponentialContext {
		public Expr_exponentialContext expr_exponential() {
			return getRuleContext(Expr_exponentialContext.class,0);
		}
		public TerminalNode OP_EXP() { return getToken(AsylumParser.OP_EXP, 0); }
		public Expr_rangeContext expr_range() {
			return getRuleContext(Expr_rangeContext.class,0);
		}
		public ExprExponentialContext(Expr_exponentialContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitRangeContext extends Expr_exponentialContext {
		public Expr_rangeContext expr_range() {
			return getRuleContext(Expr_rangeContext.class,0);
		}
		public ExprVisitRangeContext(Expr_exponentialContext ctx) { copyFrom(ctx); }
	}

	public final Expr_exponentialContext expr_exponential() throws RecognitionException {
		return expr_exponential(0);
	}

	private Expr_exponentialContext expr_exponential(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_exponentialContext _localctx = new Expr_exponentialContext(_ctx, _parentState);
		Expr_exponentialContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expr_exponential, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitRangeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1131);
			expr_range(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprExponentialContext(new Expr_exponentialContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_exponential);
					setState(1133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1134);
					match(OP_EXP);
					setState(1135);
					expr_range(0);
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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

	public static class Expr_rangeContext extends ParserRuleContext {
		public Expr_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_range; }
	 
		public Expr_rangeContext() { }
		public void copyFrom(Expr_rangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitUnaryContext extends Expr_rangeContext {
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprVisitUnaryContext(Expr_rangeContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRangeContext extends Expr_rangeContext {
		public Expr_rangeContext expr_range() {
			return getRuleContext(Expr_rangeContext.class,0);
		}
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public TerminalNode OP_RANGE() { return getToken(AsylumParser.OP_RANGE, 0); }
		public TerminalNode OP_RANGE_EQ() { return getToken(AsylumParser.OP_RANGE_EQ, 0); }
		public ExprRangeContext(Expr_rangeContext ctx) { copyFrom(ctx); }
	}

	public final Expr_rangeContext expr_range() throws RecognitionException {
		return expr_range(0);
	}

	private Expr_rangeContext expr_range(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_rangeContext _localctx = new Expr_rangeContext(_ctx, _parentState);
		Expr_rangeContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expr_range, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprVisitUnaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1142);
			expr_unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprRangeContext(new Expr_rangeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_range);
					setState(1144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1145);
					_la = _input.LA(1);
					if ( !(_la==OP_RANGE || _la==OP_RANGE_EQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1146);
					expr_unary();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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

	public static class Expr_unaryContext extends ParserRuleContext {
		public Expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_unary; }
	 
		public Expr_unaryContext() { }
		public void copyFrom(Expr_unaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAsReferenceContext extends Expr_unaryContext {
		public TerminalNode OP_REFERENCE_POINTER() { return getToken(AsylumParser.OP_REFERENCE_POINTER, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprAsReferenceContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNegContext extends Expr_unaryContext {
		public TerminalNode OP_SUB() { return getToken(AsylumParser.OP_SUB, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprNegContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDereferenceContext extends Expr_unaryContext {
		public TerminalNode OP_MUL() { return getToken(AsylumParser.OP_MUL, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprDereferenceContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNotContext extends Expr_unaryContext {
		public TerminalNode OP_NOT() { return getToken(AsylumParser.OP_NOT, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprNotContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPosContext extends Expr_unaryContext {
		public TerminalNode OP_ADD() { return getToken(AsylumParser.OP_ADD, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprPosContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAwaitContext extends Expr_unaryContext {
		public TerminalNode AWAIT() { return getToken(AsylumParser.AWAIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprAwaitContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMemberAccessUnaryContext extends Expr_unaryContext {
		public TerminalNode OP_MEMBER_ACCESS() { return getToken(AsylumParser.OP_MEMBER_ACCESS, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprMemberAccessUnaryContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDefinedConstantContext extends Expr_unaryContext {
		public Defined_constantsContext defined_constants() {
			return getRuleContext(Defined_constantsContext.class,0);
		}
		public ExprDefinedConstantContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCastContext extends Expr_unaryContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExprCastContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPreIncrementContext extends Expr_unaryContext {
		public TerminalNode OP_PLUS_PLUS() { return getToken(AsylumParser.OP_PLUS_PLUS, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprPreIncrementContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitNotContext extends Expr_unaryContext {
		public TerminalNode OP_TILDE() { return getToken(AsylumParser.OP_TILDE, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprBitNotContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPreDecrementContext extends Expr_unaryContext {
		public TerminalNode OP_MINUS_MINUS() { return getToken(AsylumParser.OP_MINUS_MINUS, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprPreDecrementContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddressOfContext extends Expr_unaryContext {
		public TerminalNode OP_ADDRESS_OF() { return getToken(AsylumParser.OP_ADDRESS_OF, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public ExprAddressOfContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitPrimaryContext extends Expr_unaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public ExprVisitPrimaryContext(Expr_unaryContext ctx) { copyFrom(ctx); }
	}

	public final Expr_unaryContext expr_unary() throws RecognitionException {
		Expr_unaryContext _localctx = new Expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expr_unary);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				_localctx = new ExprVisitPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				expr_primary(0);
				}
				break;
			case 2:
				_localctx = new ExprPosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(OP_ADD);
				setState(1154);
				expr_unary();
				}
				break;
			case 3:
				_localctx = new ExprNegContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				match(OP_SUB);
				setState(1156);
				expr_unary();
				}
				break;
			case 4:
				_localctx = new ExprNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				match(OP_NOT);
				setState(1158);
				expr_unary();
				}
				break;
			case 5:
				_localctx = new ExprBitNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1159);
				match(OP_TILDE);
				setState(1160);
				expr_unary();
				}
				break;
			case 6:
				_localctx = new ExprPreIncrementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1161);
				match(OP_PLUS_PLUS);
				setState(1162);
				expr_unary();
				}
				break;
			case 7:
				_localctx = new ExprPreDecrementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1163);
				match(OP_MINUS_MINUS);
				setState(1164);
				expr_unary();
				}
				break;
			case 8:
				_localctx = new ExprMemberAccessUnaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1165);
				match(OP_MEMBER_ACCESS);
				setState(1166);
				expr_unary();
				}
				break;
			case 9:
				_localctx = new ExprCastContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1167);
				match(T__3);
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1168);
					variable_type(0);
					}
					break;
				case 2:
					{
					setState(1169);
					expression();
					}
					break;
				}
				setState(1172);
				match(T__4);
				setState(1173);
				expression();
				}
				break;
			case 10:
				_localctx = new ExprAwaitContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1175);
				match(AWAIT);
				setState(1176);
				expression();
				}
				break;
			case 11:
				_localctx = new ExprAddressOfContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1177);
				match(OP_ADDRESS_OF);
				setState(1178);
				expr_unary();
				}
				break;
			case 12:
				_localctx = new ExprAsReferenceContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1179);
				match(OP_REFERENCE_POINTER);
				setState(1180);
				expr_unary();
				}
				break;
			case 13:
				_localctx = new ExprDereferenceContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1181);
				match(OP_MUL);
				setState(1182);
				expr_unary();
				}
				break;
			case 14:
				_localctx = new ExprDefinedConstantContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1183);
				defined_constants();
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

	public static class Expr_primaryContext extends ParserRuleContext {
		public Expr_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_primary; }
	 
		public Expr_primaryContext() { }
		public void copyFrom(Expr_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDefaultOfContext extends Expr_primaryContext {
		public TerminalNode DEFAULT() { return getToken(AsylumParser.DEFAULT, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprDefaultOfContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSizeofContext extends Expr_primaryContext {
		public TerminalNode SIZEOF() { return getToken(AsylumParser.SIZEOF, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprSizeofContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMemberAccessContext extends Expr_primaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public Expr_parenthesisContext expr_parenthesis() {
			return getRuleContext(Expr_parenthesisContext.class,0);
		}
		public ExprMemberAccessContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIncrementContext extends Expr_primaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public TerminalNode OP_PLUS_PLUS() { return getToken(AsylumParser.OP_PLUS_PLUS, 0); }
		public ExprIncrementContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStackAllocContext extends Expr_primaryContext {
		public TerminalNode STACKALLOC() { return getToken(AsylumParser.STACKALLOC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStackAllocContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDecrementContext extends Expr_primaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public TerminalNode OP_MINUS_MINUS() { return getToken(AsylumParser.OP_MINUS_MINUS, 0); }
		public ExprDecrementContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprArrayAccessContext extends Expr_primaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprArrayAccessContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFunctionCallContext extends Expr_primaryContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public Generic_specifierContext generic_specifier() {
			return getRuleContext(Generic_specifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprFunctionCallContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVisitParenthesisContext extends Expr_primaryContext {
		public Expr_parenthesisContext expr_parenthesis() {
			return getRuleContext(Expr_parenthesisContext.class,0);
		}
		public ExprVisitParenthesisContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTypeofContext extends Expr_primaryContext {
		public TerminalNode TYPEOF() { return getToken(AsylumParser.TYPEOF, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprTypeofContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDefaultContext extends Expr_primaryContext {
		public TerminalNode DEFAULT() { return getToken(AsylumParser.DEFAULT, 0); }
		public ExprDefaultContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNewContext extends Expr_primaryContext {
		public TerminalNode NEW() { return getToken(AsylumParser.NEW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNewContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNameofContext extends Expr_primaryContext {
		public TerminalNode NAMEOF() { return getToken(AsylumParser.NAMEOF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNameofContext(Expr_primaryContext ctx) { copyFrom(ctx); }
	}

	public final Expr_primaryContext expr_primary() throws RecognitionException {
		return expr_primary(0);
	}

	private Expr_primaryContext expr_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_primaryContext _localctx = new Expr_primaryContext(_ctx, _parentState);
		Expr_primaryContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expr_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVisitParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1187);
				expr_parenthesis();
				}
				break;
			case 2:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1188);
				match(NEW);
				setState(1189);
				expression();
				}
				break;
			case 3:
				{
				_localctx = new ExprTypeofContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1190);
				match(TYPEOF);
				setState(1191);
				match(T__3);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1192);
					variable_type(0);
					}
					break;
				case 2:
					{
					setState(1193);
					expression();
					}
					break;
				}
				setState(1196);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new ExprDefaultOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1198);
				match(DEFAULT);
				setState(1199);
				match(T__3);
				setState(1202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1200);
					variable_type(0);
					}
					break;
				case 2:
					{
					setState(1201);
					expression();
					}
					break;
				}
				setState(1204);
				match(T__4);
				}
				break;
			case 5:
				{
				_localctx = new ExprDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1206);
				match(DEFAULT);
				}
				break;
			case 6:
				{
				_localctx = new ExprNameofContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1207);
				match(NAMEOF);
				setState(1208);
				match(T__3);
				setState(1209);
				expression();
				setState(1210);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new ExprSizeofContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1212);
				match(SIZEOF);
				setState(1213);
				match(T__3);
				setState(1216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1214);
					variable_type(0);
					}
					break;
				case 2:
					{
					setState(1215);
					expression();
					}
					break;
				}
				setState(1218);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new ExprStackAllocContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1220);
				match(STACKALLOC);
				setState(1221);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMemberAccessContext(new Expr_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_primary);
						setState(1224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1225);
						match(T__0);
						setState(1226);
						expr_parenthesis();
						}
						break;
					case 2:
						{
						_localctx = new ExprFunctionCallContext(new Expr_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_primary);
						setState(1227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OP_LT) {
							{
							setState(1228);
							generic_specifier();
							}
						}

						setState(1231);
						match(T__3);
						setState(1233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << AWAIT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (TYPEOF - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_ADDRESS_OF - 64)) | (1L << (OP_MEMBER_ACCESS - 64)) | (1L << (OP_MINUS_MINUS - 64)) | (1L << (OP_MUL - 64)) | (1L << (OP_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OP_PLUS_PLUS - 128)) | (1L << (OP_REFERENCE_POINTER - 128)) | (1L << (OP_SUB - 128)) | (1L << (OP_TILDE - 128)) | (1L << (INTEGER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING - 128)))) != 0)) {
							{
							setState(1232);
							expression();
							}
						}

						setState(1235);
						match(T__4);
						}
						break;
					case 3:
						{
						_localctx = new ExprArrayAccessContext(new Expr_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_primary);
						setState(1236);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1237);
						match(T__7);
						setState(1238);
						expression();
						setState(1239);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new ExprIncrementContext(new Expr_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_primary);
						setState(1241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1242);
						match(OP_PLUS_PLUS);
						}
						break;
					case 5:
						{
						_localctx = new ExprDecrementContext(new Expr_primaryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_primary);
						setState(1243);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1244);
						match(OP_MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(1249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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

	public static class Expr_parenthesisContext extends ParserRuleContext {
		public Expr_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_parenthesis; }
	 
		public Expr_parenthesisContext() { }
		public void copyFrom(Expr_parenthesisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVisitEndContext extends Expr_parenthesisContext {
		public Expr_endContext expr_end() {
			return getRuleContext(Expr_endContext.class,0);
		}
		public ExprVisitEndContext(Expr_parenthesisContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesisContext extends Expr_parenthesisContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParenthesisContext(Expr_parenthesisContext ctx) { copyFrom(ctx); }
	}

	public final Expr_parenthesisContext expr_parenthesis() throws RecognitionException {
		Expr_parenthesisContext _localctx = new Expr_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expr_parenthesis);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case IDENTIFIER:
			case STRING:
				_localctx = new ExprVisitEndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				expr_end();
				}
				break;
			case T__3:
				_localctx = new ExprParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				match(T__3);
				setState(1252);
				expression();
				setState(1253);
				match(T__4);
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

	public static class Expr_endContext extends ParserRuleContext {
		public Expr_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_end; }
	 
		public Expr_endContext() { }
		public void copyFrom(Expr_endContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprStringContext extends Expr_endContext {
		public TerminalNode STRING() { return getToken(AsylumParser.STRING, 0); }
		public ExprStringContext(Expr_endContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntegerContext extends Expr_endContext {
		public TerminalNode INTEGER() { return getToken(AsylumParser.INTEGER, 0); }
		public ExprIntegerContext(Expr_endContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVariableContext extends Expr_endContext {
		public TerminalNode IDENTIFIER() { return getToken(AsylumParser.IDENTIFIER, 0); }
		public ExprVariableContext(Expr_endContext ctx) { copyFrom(ctx); }
	}

	public final Expr_endContext expr_end() throws RecognitionException {
		Expr_endContext _localctx = new Expr_endContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expr_end);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ExprVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(IDENTIFIER);
				}
				break;
			case INTEGER:
				_localctx = new ExprIntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				match(INTEGER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
				match(STRING);
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
		enterRule(_localctx, 130, RULE_access_modifier);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				match(PUBLIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(PROTECTED);
				setState(1264);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				match(PRIVATE);
				setState(1266);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				match(PROTECTED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1269);
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
		enterRule(_localctx, 132, RULE_variable_assignment);
		int _la;
		try {
			int _alt;
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentUnpackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				variable_or_function();
				setState(1275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1273);
					match(T__8);
					setState(1274);
					variable_or_function();
					}
					}
					setState(1277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(1279);
				assignment_operator();
				setState(1280);
				expression();
				}
				break;
			case 2:
				_localctx = new VariableAssignmentNormalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				variable_or_function();
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1283);
						match(ASSIGN_OP_EQ);
						setState(1284);
						variable_or_function();
						}
						} 
					}
					setState(1289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				setState(1290);
				assignment_operator();
				setState(1291);
				expression();
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

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_variable_declaration);
		int _la;
		try {
			int _alt;
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				_localctx = new VariableDeclareWithInitializerExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1295);
					attribute();
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1301);
				variable_parameter();
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1302);
						match(ASSIGN_OP_EQ);
						setState(1303);
						variable_parameter();
						}
						} 
					}
					setState(1308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1309);
				match(ASSIGN_OP_EQ);
				setState(1310);
				expression();
				}
				break;
			case 2:
				_localctx = new VariableDeclareWithTupleInitializerExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1312);
					attribute();
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				variable_parameter();
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1319);
					match(T__8);
					setState(1320);
					variable_parameter();
					}
					}
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1326);
				match(ASSIGN_OP_EQ);
				setState(1327);
				expression();
				}
				break;
			case 3:
				_localctx = new VariableDeclareWithoutInitializerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1329);
					attribute();
					}
					}
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1335);
				variable_parameter();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1336);
					match(T__8);
					setState(1337);
					match(IDENTIFIER);
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new VariableDeclareWithoutInitializerMultipleTypesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1343);
					attribute();
					}
					}
					setState(1348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1349);
				variable_parameter();
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1350);
					match(T__8);
					setState(1351);
					variable_parameter();
					}
					}
					setState(1356);
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
		enterRule(_localctx, 136, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(IDENTIFIER);
			setState(1360);
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
		enterRule(_localctx, 138, RULE_variable_arguments);
		int _la;
		try {
			int _alt;
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new VariableArgsNoneOrSomeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					setState(1363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1362);
						label();
						}
						break;
					}
					setState(1365);
					variable_parameter();
					setState(1373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1366);
							match(T__8);
							setState(1368);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
							case 1:
								{
								setState(1367);
								label();
								}
								break;
							}
							setState(1370);
							variable_parameter();
							}
							} 
						}
						setState(1375);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					}
					setState(1382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8) {
						{
						setState(1376);
						match(T__8);
						setState(1378);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
							{
							setState(1377);
							variable_type(0);
							}
						}

						setState(1380);
						match(T__12);
						setState(1381);
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
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ATOMIC) | (1L << CONST))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (READONLY - 71)) | (1L << (STATIC - 71)) | (1L << (VOLATILE - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (UNSIGNED - 136)) | (1L << (SIGNED - 136)) | (1L << (FIXED - 136)) | (1L << (IDENTIFIER - 136)))) != 0)) {
					{
					setState(1386);
					variable_type(0);
					}
				}

				setState(1389);
				match(T__12);
				setState(1390);
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
		enterRule(_localctx, 140, RULE_variable_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			variable_type(0);
			setState(1394);
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
	public static class VarTypeReadOnlyContext extends Variable_typeContext {
		public TerminalNode READONLY() { return getToken(AsylumParser.READONLY, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public VarTypeReadOnlyContext(Variable_typeContext ctx) { copyFrom(ctx); }
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_variable_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				_localctx = new VarTypePrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1397);
				primitives();
				}
				break;
			case 2:
				{
				_localctx = new VarTypeTupleProperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1398);
				match(T__3);
				setState(1399);
				variable_type(0);
				setState(1402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1400);
					match(T__8);
					setState(1401);
					variable_type(0);
					}
					}
					setState(1404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(1406);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new VarTypeConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1408);
				match(CONST);
				setState(1409);
				variable_type(7);
				}
				break;
			case 4:
				{
				_localctx = new VarTypeStaticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1410);
				match(STATIC);
				setState(1411);
				variable_type(6);
				}
				break;
			case 5:
				{
				_localctx = new VarTypeVolatileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1412);
				match(VOLATILE);
				setState(1413);
				variable_type(5);
				}
				break;
			case 6:
				{
				_localctx = new VarTypeAtomicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1414);
				match(ATOMIC);
				setState(1415);
				match(OP_LT);
				setState(1416);
				variable_type(0);
				setState(1417);
				match(OP_GT);
				}
				break;
			case 7:
				{
				_localctx = new VarTypeReadOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1419);
				match(READONLY);
				setState(1420);
				variable_type(3);
				}
				break;
			case 8:
				{
				_localctx = new VarTypeCustomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1421);
				variable_or_function();
				}
				break;
			case 9:
				{
				_localctx = new VarTypeThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1422);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new VarTypePointerContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1425);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1426);
						match(OP_MUL);
						}
						break;
					case 2:
						{
						_localctx = new VarTypeReferenceContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1427);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1428);
						match(OP_ADDRESS_OF);
						}
						break;
					case 3:
						{
						_localctx = new VarTypeArrayContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1429);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1430);
						match(T__7);
						setState(1432);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTEGER) {
							{
							setState(1431);
							match(INTEGER);
							}
						}

						setState(1440);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(1434);
							match(T__8);
							setState(1436);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==INTEGER) {
								{
								setState(1435);
								match(INTEGER);
								}
							}

							}
							}
							setState(1442);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1443);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new VarTypeGenericsContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1444);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1445);
						match(OP_LT);
						setState(1446);
						variable_type(0);
						setState(1451);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(1447);
							match(T__8);
							setState(1448);
							variable_type(0);
							}
							}
							setState(1453);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1454);
						match(OP_GT);
						}
						break;
					case 5:
						{
						_localctx = new VarTypeTupleContext(new Variable_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_variable_type);
						setState(1456);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1459); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1457);
								match(T__8);
								setState(1458);
								variable_type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1461); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(1467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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
		enterRule(_localctx, 144, RULE_primitives);
		int _la;
		try {
			setState(1516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new PrimitiveStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new PrimitiveBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				match(T__15);
				}
				break;
			case UNSIGNED:
				_localctx = new PrimitiveUnsignedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				match(UNSIGNED);
				}
				break;
			case SIGNED:
				_localctx = new PrimitiveSignedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1471);
				match(SIGNED);
				}
				break;
			case T__16:
				_localctx = new PrimitiveHalfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1472);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new PrimitiveFloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1473);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new PrimitiveDoubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1474);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new PrimitiveExtendedContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1475);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new PrimitiveDecimalContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1476);
				match(T__20);
				}
				break;
			case FIXED:
				_localctx = new PrimitiveFixedContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1477);
				match(FIXED);
				}
				break;
			case T__21:
				_localctx = new PrimitiveVarLenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1478);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new PrimitiveObjectContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1479);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new PrimitiveVoidContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1480);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new PrimitiveFunctionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1481);
				match(T__24);
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(OP_LT);
					setState(1483);
					variable_type(0);
					setState(1488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(1484);
						match(T__8);
						setState(1485);
						variable_type(0);
						}
						}
						setState(1490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1491);
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
				setState(1495);
				match(T__25);
				setState(1507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1496);
					match(OP_LT);
					setState(1497);
					variable_type(0);
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(1498);
						match(T__8);
						setState(1499);
						variable_type(0);
						}
						}
						setState(1504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1505);
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
				setState(1509);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new PrimitiveWideCharContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1510);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new PrimitiveAutoVariableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1511);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new PrimitiveUnsignedAnyContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1512);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new PrimitiveSignedAnyContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1513);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new PrimitiveFloatingAnyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1514);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new PrimitiveFixedAnyContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1515);
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
		enterRule(_localctx, 146, RULE_defined_constants);
		try {
			setState(1521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new ConstantTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new ConstantFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new ConstantNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1520);
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
		enterRule(_localctx, 148, RULE_variable_or_function);
		try {
			int _alt;
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(IDENTIFIER);
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1524);
						match(T__0);
						setState(1525);
						match(IDENTIFIER);
						}
						} 
					}
					setState(1530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
				setState(1531);
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
		public TerminalNode OP_CMP() { return getToken(AsylumParser.OP_CMP, 0); }
		public TerminalNode OP_DIV() { return getToken(AsylumParser.OP_DIV, 0); }
		public TerminalNode OP_EQ() { return getToken(AsylumParser.OP_EQ, 0); }
		public TerminalNode OP_EXP() { return getToken(AsylumParser.OP_EXP, 0); }
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
		public TerminalNode OP_RANGE_EQ() { return getToken(AsylumParser.OP_RANGE_EQ, 0); }
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
		enterRule(_localctx, 150, RULE_operator);
		try {
			setState(1563);
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
				setState(1534);
				assignment_operator();
				}
				break;
			case OP_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1535);
				match(OP_ADD);
				}
				break;
			case OP_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1536);
				match(OP_AND);
				}
				break;
			case OP_ADDRESS_OF:
				enterOuterAlt(_localctx, 4);
				{
				setState(1537);
				match(OP_ADDRESS_OF);
				}
				break;
			case OP_BITWISE_OR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1538);
				match(OP_BITWISE_OR);
				}
				break;
			case OP_CMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1539);
				match(OP_CMP);
				}
				break;
			case OP_DIV:
				enterOuterAlt(_localctx, 7);
				{
				setState(1540);
				match(OP_DIV);
				}
				break;
			case OP_EQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(1541);
				match(OP_EQ);
				}
				break;
			case OP_EXP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1542);
				match(OP_EXP);
				}
				break;
			case OP_GE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1543);
				match(OP_GE);
				}
				break;
			case OP_GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(1544);
				match(OP_GT);
				}
				break;
			case OP_LE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1545);
				match(OP_LE);
				}
				break;
			case OP_LT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1546);
				match(OP_LT);
				}
				break;
			case OP_LSHIFT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1547);
				match(OP_LSHIFT);
				}
				break;
			case OP_MEMBER_ACCESS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1548);
				match(OP_MEMBER_ACCESS);
				}
				break;
			case OP_MINUS_MINUS:
				enterOuterAlt(_localctx, 16);
				{
				setState(1549);
				match(OP_MINUS_MINUS);
				}
				break;
			case OP_MOD:
				enterOuterAlt(_localctx, 17);
				{
				setState(1550);
				match(OP_MOD);
				}
				break;
			case OP_MUL:
				enterOuterAlt(_localctx, 18);
				{
				setState(1551);
				match(OP_MUL);
				}
				break;
			case OP_OR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1552);
				match(OP_OR);
				}
				break;
			case OP_NAND:
				enterOuterAlt(_localctx, 20);
				{
				setState(1553);
				match(OP_NAND);
				}
				break;
			case OP_NE:
				enterOuterAlt(_localctx, 21);
				{
				setState(1554);
				match(OP_NE);
				}
				break;
			case OP_NOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(1555);
				match(OP_NOR);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 23);
				{
				setState(1556);
				match(OP_NOT);
				}
				break;
			case OP_PLUS_PLUS:
				enterOuterAlt(_localctx, 24);
				{
				setState(1557);
				match(OP_PLUS_PLUS);
				}
				break;
			case OP_RANGE:
				enterOuterAlt(_localctx, 25);
				{
				setState(1558);
				match(OP_RANGE);
				}
				break;
			case OP_RANGE_EQ:
				enterOuterAlt(_localctx, 26);
				{
				setState(1559);
				match(OP_RANGE_EQ);
				}
				break;
			case OP_RSHIFT:
				enterOuterAlt(_localctx, 27);
				{
				setState(1560);
				match(OP_RSHIFT);
				}
				break;
			case OP_SUB:
				enterOuterAlt(_localctx, 28);
				{
				setState(1561);
				match(OP_SUB);
				}
				break;
			case OP_TILDE:
				enterOuterAlt(_localctx, 29);
				{
				setState(1562);
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
		enterRule(_localctx, 152, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ASSIGN_OP_EQ - 86)) | (1L << (ASSIGN_OP_ADD_EQ - 86)) | (1L << (ASSIGN_OP_SUB_EQ - 86)) | (1L << (ASSIGN_OP_EXP_EQ - 86)) | (1L << (ASSIGN_OP_MUL_EQ - 86)) | (1L << (ASSIGN_OP_DIV_EQ - 86)) | (1L << (ASSIGN_OP_MOD_EQ - 86)) | (1L << (ASSIGN_OP_BITAND_EQ - 86)) | (1L << (ASSIGN_OP_BITOR_EQ - 86)) | (1L << (ASSIGN_OP_XOR_EQ - 86)) | (1L << (ASSIGN_OP_BITFLIP_EQ - 86)) | (1L << (ASSIGN_OP_LSHIFT_EQ - 86)) | (1L << (ASSIGN_OP_RSHIFT_EQ - 86)) | (1L << (ASSIGN_OP_AND_EQ - 86)) | (1L << (ASSIGN_OP_OR_EQ - 86)) | (1L << (ASSIGN_OP_NAND_EQ - 86)) | (1L << (ASSIGN_OP_NOR_EQ - 86)) | (1L << (ASSIGN_OP_CHECK_NULL - 86)))) != 0)) ) {
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
		case 43:
			return expr_comma_sempred((Expr_commaContext)_localctx, predIndex);
		case 45:
			return expr_lambda_sempred((Expr_lambdaContext)_localctx, predIndex);
		case 47:
			return expr_nullcheck_sempred((Expr_nullcheckContext)_localctx, predIndex);
		case 48:
			return expr_or_sempred((Expr_orContext)_localctx, predIndex);
		case 49:
			return expr_and_sempred((Expr_andContext)_localctx, predIndex);
		case 50:
			return expr_bit_or_sempred((Expr_bit_orContext)_localctx, predIndex);
		case 51:
			return expr_bit_xor_sempred((Expr_bit_xorContext)_localctx, predIndex);
		case 52:
			return expr_bit_and_sempred((Expr_bit_andContext)_localctx, predIndex);
		case 53:
			return expr_equality_comparison_sempred((Expr_equality_comparisonContext)_localctx, predIndex);
		case 54:
			return expr_comparison_sempred((Expr_comparisonContext)_localctx, predIndex);
		case 55:
			return expr_three_way_comparison_sempred((Expr_three_way_comparisonContext)_localctx, predIndex);
		case 56:
			return expr_shift_sempred((Expr_shiftContext)_localctx, predIndex);
		case 57:
			return expr_additive_sempred((Expr_additiveContext)_localctx, predIndex);
		case 58:
			return expr_multiplicative_sempred((Expr_multiplicativeContext)_localctx, predIndex);
		case 59:
			return expr_exponential_sempred((Expr_exponentialContext)_localctx, predIndex);
		case 60:
			return expr_range_sempred((Expr_rangeContext)_localctx, predIndex);
		case 62:
			return expr_primary_sempred((Expr_primaryContext)_localctx, predIndex);
		case 71:
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
	private boolean expr_comma_sempred(Expr_commaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_lambda_sempred(Expr_lambdaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_nullcheck_sempred(Expr_nullcheckContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_or_sempred(Expr_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_and_sempred(Expr_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_bit_or_sempred(Expr_bit_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_bit_xor_sempred(Expr_bit_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_bit_and_sempred(Expr_bit_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_equality_comparison_sempred(Expr_equality_comparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_comparison_sempred(Expr_comparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_three_way_comparison_sempred(Expr_three_way_comparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_shift_sempred(Expr_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_additive_sempred(Expr_additiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_multiplicative_sempred(Expr_multiplicativeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_exponential_sempred(Expr_exponentialContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_range_sempred(Expr_rangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_primary_sempred(Expr_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 12);
		case 19:
			return precpred(_ctx, 11);
		case 20:
			return precpred(_ctx, 10);
		case 21:
			return precpred(_ctx, 9);
		case 22:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean variable_type_sempred(Variable_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 12);
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 10);
		case 26:
			return precpred(_ctx, 9);
		case 27:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0093\u0622\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ae\n\3\3\4\3\4\5"+
		"\4\u00b2\n\4\3\4\3\4\3\4\7\4\u00b7\n\4\f\4\16\4\u00ba\13\4\3\4\5\4\u00bd"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00c5\n\5\f\5\16\5\u00c8\13\5\3\5\3\5"+
		"\3\6\3\6\3\7\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\5\7\u00d6\n\7\3"+
		"\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e5"+
		"\n\7\3\7\3\7\3\b\3\b\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\5\t\u00f2"+
		"\n\t\3\t\7\t\u00f5\n\t\f\t\16\t\u00f8\13\t\3\t\3\t\3\t\5\t\u00fd\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0104\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u010c\n\t"+
		"\f\t\16\t\u010f\13\t\3\t\5\t\u0112\n\t\3\t\5\t\u0115\n\t\3\n\7\n\u0118"+
		"\n\n\f\n\16\n\u011b\13\n\3\n\5\n\u011e\n\n\3\n\7\n\u0121\n\n\f\n\16\n"+
		"\u0124\13\n\3\n\3\n\5\n\u0128\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0133\n\n\f\n\16\n\u0136\13\n\3\n\5\n\u0139\n\n\3\n\5\n\u013c\n\n"+
		"\3\13\7\13\u013f\n\13\f\13\16\13\u0142\13\13\3\13\5\13\u0145\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u014e\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u0156\n\13\f\13\16\13\u0159\13\13\3\13\5\13\u015c\n\13\3\13"+
		"\5\13\u015f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0167\n\f\f\f\16\f\u016a"+
		"\13\f\3\f\3\f\5\f\u016e\n\f\3\f\3\f\3\r\7\r\u0173\n\r\f\r\16\r\u0176\13"+
		"\r\3\r\5\r\u0179\n\r\3\r\3\r\3\r\3\r\5\r\u017f\n\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0185\n\r\f\r\16\r\u0188\13\r\5\r\u018a\n\r\3\r\3\r\3\16\3\16\3\16\5"+
		"\16\u0191\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0198\n\16\f\16\16\16\u019b"+
		"\13\16\5\16\u019d\n\16\3\16\3\16\3\16\5\16\u01a2\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u01a9\n\16\f\16\16\16\u01ac\13\16\5\16\u01ae\n\16\3\16\3"+
		"\16\3\16\5\16\u01b3\n\16\5\16\u01b5\n\16\3\17\7\17\u01b8\n\17\f\17\16"+
		"\17\u01bb\13\17\3\17\3\17\5\17\u01bf\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\6\17\u01c7\n\17\r\17\16\17\u01c8\3\17\3\17\3\20\7\20\u01ce\n\20\f\20"+
		"\16\20\u01d1\13\20\3\20\5\20\u01d4\n\20\3\20\3\20\3\20\5\20\u01d9\n\20"+
		"\3\20\5\20\u01dc\n\20\3\20\3\20\7\20\u01e0\n\20\f\20\16\20\u01e3\13\20"+
		"\3\20\3\20\5\20\u01e7\n\20\3\21\7\21\u01ea\n\21\f\21\16\21\u01ed\13\21"+
		"\3\21\5\21\u01f0\n\21\3\21\3\21\3\21\5\21\u01f5\n\21\3\21\5\21\u01f8\n"+
		"\21\3\21\3\21\7\21\u01fc\n\21\f\21\16\21\u01ff\13\21\3\21\3\21\5\21\u0203"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u0209\n\22\3\22\5\22\u020c\n\22\3\22\3"+
		"\22\7\22\u0210\n\22\f\22\16\22\u0213\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\5\23\u021b\n\23\3\24\7\24\u021e\n\24\f\24\16\24\u0221\13\24\3\24\5"+
		"\24\u0224\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u022e\n\24"+
		"\f\24\16\24\u0231\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u0238\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\5\26\u0240\n\26\3\26\3\26\3\26\5\26\u0245\n"+
		"\26\3\26\3\26\3\26\5\26\u024a\n\26\3\27\3\27\5\27\u024e\n\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0254\n\27\f\27\16\27\u0257\13\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u025e\n\27\5\27\u0260\n\27\3\27\5\27\u0263\n\27\3\27\3\27\3"+
		"\27\3\27\7\27\u0269\n\27\f\27\16\27\u026c\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0273\n\27\5\27\u0275\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u027c"+
		"\n\27\3\30\3\30\7\30\u0280\n\30\f\30\16\30\u0283\13\30\3\30\3\30\5\30"+
		"\u0287\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0298\n\31\3\31\3\31\7\31\u029c\n\31\f\31\16\31\u029f"+
		"\13\31\3\31\3\31\5\31\u02a3\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u02b6\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02c2\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02ce\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u02d8\n\35\3\35\3\35\3\35\3\35\5\35\u02de"+
		"\n\35\3\36\3\36\5\36\u02e2\n\36\3\36\3\36\3\37\3\37\3\37\3 \5 \u02ea\n"+
		" \3 \3 \3 \3 \3 \3 \3 \7 \u02f3\n \f \16 \u02f6\13 \3 \3 \5 \u02fa\n "+
		"\3!\3!\3!\3!\3!\5!\u0301\n!\3!\3!\3!\6!\u0306\n!\r!\16!\u0307\3!\3!\3"+
		"!\3!\3!\3!\5!\u0310\n!\3!\3!\6!\u0314\n!\r!\16!\u0315\3!\3!\5!\u031a\n"+
		"!\3\"\3\"\3\"\3\"\6\"\u0320\n\"\r\"\16\"\u0321\3\"\7\"\u0325\n\"\f\"\16"+
		"\"\u0328\13\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0330\n\"\f\"\16\"\u0333\13"+
		"\"\3\"\3\"\5\"\u0337\n\"\3#\5#\u033a\n#\3#\3#\5#\u033e\n#\3#\3#\5#\u0342"+
		"\n#\3#\3#\3#\5#\u0347\n#\3#\7#\u034a\n#\f#\16#\u034d\13#\5#\u034f\n#\3"+
		"#\3#\3$\5$\u0354\n$\3$\3$\3$\3$\3$\7$\u035b\n$\f$\16$\u035e\13$\5$\u0360"+
		"\n$\3$\5$\u0363\n$\3$\3$\3$\3$\7$\u0369\n$\f$\16$\u036c\13$\5$\u036e\n"+
		"$\3$\3$\3%\3%\3%\7%\u0375\n%\f%\16%\u0378\13%\3%\5%\u037b\n%\3%\3%\3&"+
		"\3&\3&\3&\3&\5&\u0384\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u038f\n(\3("+
		"\3(\3(\3(\3(\3(\7(\u0397\n(\f(\16(\u039a\13(\3)\3)\3)\3)\7)\u03a0\n)\f"+
		")\16)\u03a3\13)\3*\3*\3*\5*\u03a8\n*\3*\3*\3*\5*\u03ad\n*\7*\u03af\n*"+
		"\f*\16*\u03b2\13*\3*\3*\3+\3+\3+\3+\7+\u03ba\n+\f+\16+\u03bd\13+\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3-\3-\7-\u03c9\n-\f-\16-\u03cc\13-\3.\3.\3.\3.\3."+
		"\5.\u03d3\n.\3/\3/\3/\3/\3/\3/\7/\u03db\n/\f/\16/\u03de\13/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u03e7\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\7\61\u03ef\n\61\f\61\16\61\u03f2\13\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u03fa\n\62\f\62\16\62\u03fd\13\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u0405\n\63\f\63\16\63\u0408\13\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\7\64\u0410\n\64\f\64\16\64\u0413\13\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\7\65\u041b\n\65\f\65\16\65\u041e\13\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u0426\n\66\f\66\16\66\u0429\13\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\7\67\u0431\n\67\f\67\16\67\u0434\13\67\38\38\38\38\38\38\78\u043c\n8"+
		"\f8\168\u043f\138\39\39\39\39\39\39\79\u0447\n9\f9\169\u044a\139\3:\3"+
		":\3:\3:\3:\3:\7:\u0452\n:\f:\16:\u0455\13:\3;\3;\3;\3;\3;\3;\7;\u045d"+
		"\n;\f;\16;\u0460\13;\3<\3<\3<\3<\3<\3<\7<\u0468\n<\f<\16<\u046b\13<\3"+
		"=\3=\3=\3=\3=\3=\7=\u0473\n=\f=\16=\u0476\13=\3>\3>\3>\3>\3>\3>\7>\u047e"+
		"\n>\f>\16>\u0481\13>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\5?\u0495\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04a3\n?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\5@\u04ad\n@\3@\3@\3@\3@\3@\3@\5@\u04b5\n@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04c3\n@\3@\3@\3@\3@\5@\u04c9\n@\3@\3"+
		"@\3@\3@\3@\5@\u04d0\n@\3@\3@\5@\u04d4\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\7@\u04e0\n@\f@\16@\u04e3\13@\3A\3A\3A\3A\3A\5A\u04ea\nA\3B\3B\3B\5B"+
		"\u04ef\nB\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04f9\nC\3D\3D\3D\6D\u04fe\nD\rD"+
		"\16D\u04ff\3D\3D\3D\3D\3D\3D\7D\u0508\nD\fD\16D\u050b\13D\3D\3D\3D\5D"+
		"\u0510\nD\3E\7E\u0513\nE\fE\16E\u0516\13E\3E\3E\3E\7E\u051b\nE\fE\16E"+
		"\u051e\13E\3E\3E\3E\3E\7E\u0524\nE\fE\16E\u0527\13E\3E\3E\3E\7E\u052c"+
		"\nE\fE\16E\u052f\13E\3E\3E\3E\3E\7E\u0535\nE\fE\16E\u0538\13E\3E\3E\3"+
		"E\7E\u053d\nE\fE\16E\u0540\13E\3E\7E\u0543\nE\fE\16E\u0546\13E\3E\3E\3"+
		"E\7E\u054b\nE\fE\16E\u054e\13E\5E\u0550\nE\3F\3F\3F\3G\5G\u0556\nG\3G"+
		"\3G\3G\5G\u055b\nG\3G\7G\u055e\nG\fG\16G\u0561\13G\3G\3G\5G\u0565\nG\3"+
		"G\3G\5G\u0569\nG\5G\u056b\nG\3G\5G\u056e\nG\3G\3G\5G\u0572\nG\3H\3H\3"+
		"H\3I\3I\3I\3I\3I\3I\6I\u057d\nI\rI\16I\u057e\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0592\nI\3I\3I\3I\3I\3I\3I\3I\5I\u059b\n"+
		"I\3I\3I\5I\u059f\nI\7I\u05a1\nI\fI\16I\u05a4\13I\3I\3I\3I\3I\3I\3I\7I"+
		"\u05ac\nI\fI\16I\u05af\13I\3I\3I\3I\3I\3I\6I\u05b6\nI\rI\16I\u05b7\7I"+
		"\u05ba\nI\fI\16I\u05bd\13I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\7J\u05d1\nJ\fJ\16J\u05d4\13J\3J\3J\5J\u05d8\nJ\3J\3J\3J\3J"+
		"\3J\7J\u05df\nJ\fJ\16J\u05e2\13J\3J\3J\5J\u05e6\nJ\3J\3J\3J\3J\3J\3J\3"+
		"J\5J\u05ef\nJ\3K\3K\3K\5K\u05f4\nK\3L\3L\3L\7L\u05f9\nL\fL\16L\u05fc\13"+
		"L\3L\5L\u05ff\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u061e\nM\3N\3N\3N\2\25NX\\`bdfh"+
		"jlnprtvxz~\u0090O\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\2\f\4\2((NN\6\2"+
		"((==NNSS\4\2\64\64;;\4\2pp}}\7\2\'\'@@rsuuww\4\2vv\u0087\u0087\4\2jj\u0088"+
		"\u0088\4\2ooz{\3\2\u0083\u0084\3\2Xi\2\u070a\2\u009f\3\2\2\2\4\u00ad\3"+
		"\2\2\2\6\u00af\3\2\2\2\b\u00c0\3\2\2\2\n\u00cb\3\2\2\2\f\u00d0\3\2\2\2"+
		"\16\u00e8\3\2\2\2\20\u00ed\3\2\2\2\22\u0119\3\2\2\2\24\u0140\3\2\2\2\26"+
		"\u0160\3\2\2\2\30\u0174\3\2\2\2\32\u01b4\3\2\2\2\34\u01b9\3\2\2\2\36\u01cf"+
		"\3\2\2\2 \u01eb\3\2\2\2\"\u0204\3\2\2\2$\u021a\3\2\2\2&\u021f\3\2\2\2"+
		"(\u0239\3\2\2\2*\u0249\3\2\2\2,\u027b\3\2\2\2.\u0286\3\2\2\2\60\u02a2"+
		"\3\2\2\2\62\u02a4\3\2\2\2\64\u02a7\3\2\2\2\66\u02ab\3\2\2\28\u02dd\3\2"+
		"\2\2:\u02df\3\2\2\2<\u02e5\3\2\2\2>\u02e9\3\2\2\2@\u0319\3\2\2\2B\u0336"+
		"\3\2\2\2D\u0339\3\2\2\2F\u0353\3\2\2\2H\u037a\3\2\2\2J\u0383\3\2\2\2L"+
		"\u0385\3\2\2\2N\u038e\3\2\2\2P\u039b\3\2\2\2R\u03a4\3\2\2\2T\u03b5\3\2"+
		"\2\2V\u03c0\3\2\2\2X\u03c2\3\2\2\2Z\u03d2\3\2\2\2\\\u03d4\3\2\2\2^\u03e6"+
		"\3\2\2\2`\u03e8\3\2\2\2b\u03f3\3\2\2\2d\u03fe\3\2\2\2f\u0409\3\2\2\2h"+
		"\u0414\3\2\2\2j\u041f\3\2\2\2l\u042a\3\2\2\2n\u0435\3\2\2\2p\u0440\3\2"+
		"\2\2r\u044b\3\2\2\2t\u0456\3\2\2\2v\u0461\3\2\2\2x\u046c\3\2\2\2z\u0477"+
		"\3\2\2\2|\u04a2\3\2\2\2~\u04c8\3\2\2\2\u0080\u04e9\3\2\2\2\u0082\u04ee"+
		"\3\2\2\2\u0084\u04f8\3\2\2\2\u0086\u050f\3\2\2\2\u0088\u054f\3\2\2\2\u008a"+
		"\u0551\3\2\2\2\u008c\u0571\3\2\2\2\u008e\u0573\3\2\2\2\u0090\u0591\3\2"+
		"\2\2\u0092\u05ee\3\2\2\2\u0094\u05f3\3\2\2\2\u0096\u05fe\3\2\2\2\u0098"+
		"\u061d\3\2\2\2\u009a\u061f\3\2\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00ae\5\6\4\2\u00a3\u00ae\5\b\5\2"+
		"\u00a4\u00ae\5\f\7\2\u00a5\u00ae\5\20\t\2\u00a6\u00ae\5\30\r\2\u00a7\u00ae"+
		"\5\34\17\2\u00a8\u00ae\5\36\20\2\u00a9\u00ae\5 \21\2\u00aa\u00ae\5\"\22"+
		"\2\u00ab\u00ae\5(\25\2\u00ac\u00ae\5\60\31\2\u00ad\u00a2\3\2\2\2\u00ad"+
		"\u00a3\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2"+
		"\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\5\3\2\2\2"+
		"\u00af\u00b1\7U\2\2\u00b0\u00b2\7N\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b8\7\u008e\2\2\u00b4\u00b5\7\3\2"+
		"\2\u00b5\u00b7\7\u008e\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bd\7\4\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\7\3\2\2\2\u00c0\u00c1\7C\2\2"+
		"\u00c1\u00c6\7\u008e\2\2\u00c2\u00c3\7\3\2\2\u00c3\u00c5\7\u008e\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\5\2\2\u00ca"+
		"\t\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\13\3\2\2\2\u00cd\u00cf\5\26\f\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\65\2\2\u00d4"+
		"\u00d6\5\u0084C\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da"+
		"\3\2\2\2\u00d7\u00d9\5\n\6\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\67\2\2\u00de\u00df\7\u008e\2\2\u00df\u00e0\7\6\2\2"+
		"\u00e0\u00e1\5\u008cG\2\u00e1\u00e4\7\7\2\2\u00e2\u00e3\7\u0086\2\2\u00e3"+
		"\u00e5\5\u0090I\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\5\2\2\u00e7\r\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9"+
		"\17\3\2\2\2\u00ea\u00ec\5\26\f\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f2\5\u0084C\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2"+
		"\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\5\16\b\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\67\2\2\u00fa\u00fc\7\u008e\2\2"+
		"\u00fb\u00fd\5R*\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\5\u008cG\2\u0100\u0103\7\7\2"+
		"\2\u0101\u0102\7\u0086\2\2\u0102\u0104\5\u0090I\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0114\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107"+
		"\5V,\2\u0107\u0108\7\5\2\2\u0108\u0112\3\2\2\2\u0109\u010d\7\b\2\2\u010a"+
		"\u010c\5\60\31\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\7\t\2\2\u0111\u0105\3\2\2\2\u0111\u0109\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0115\7\5\2\2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\21\3\2\2\2\u0116\u0118\5\26\f\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\5\u0084C\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2"+
		"\2\u011e\u0122\3\2\2\2\u011f\u0121\5\16\b\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5\u0090I\2\u0126\u0128\5R*\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\6"+
		"\2\2\u012a\u012b\5\u008cG\2\u012b\u013b\7\7\2\2\u012c\u012d\7t\2\2\u012d"+
		"\u012e\5V,\2\u012e\u012f\7\5\2\2\u012f\u0139\3\2\2\2\u0130\u0134\7\b\2"+
		"\2\u0131\u0133\5\60\31\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\7\t\2\2\u0138\u012c\3\2\2\2\u0138\u0130\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013c\7\5\2\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\23\3\2\2\2\u013d\u013f\5\26\f\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0145\7=\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7E\2\2\u0147\u0148\5\u0098M\2\u0148"+
		"\u0149\7\6\2\2\u0149\u014a\5\u008cG\2\u014a\u014d\7\7\2\2\u014b\u014c"+
		"\7\u0086\2\2\u014c\u014e\5\u0090I\2\u014d\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u015e\3\2\2\2\u014f\u0150\7t\2\2\u0150\u0151\5V,\2\u0151"+
		"\u0152\7\5\2\2\u0152\u015c\3\2\2\2\u0153\u0157\7\b\2\2\u0154\u0156\5\60"+
		"\31\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7\t"+
		"\2\2\u015b\u014f\3\2\2\2\u015b\u0153\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015f\7\5\2\2\u015e\u015b\3\2\2\2\u015e\u015d\3\2\2\2\u015f\25\3\2\2"+
		"\2\u0160\u0161\7\n\2\2\u0161\u016d\7\u008e\2\2\u0162\u0163\7\6\2\2\u0163"+
		"\u0168\5V,\2\u0164\u0165\7\13\2\2\u0165\u0167\5V,\2\u0166\u0164\3\2\2"+
		"\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\7\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0162\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\f"+
		"\2\2\u0170\27\3\2\2\2\u0171\u0173\5\26\f\2\u0172\u0171\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0179\5\u0084C\2\u0178\u0177\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\63\2\2\u017b\u017e\7\u008e"+
		"\2\2\u017c\u017d\7\r\2\2\u017d\u017f\7\u008d\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0189\7\b\2\2\u0181\u0186\5\32"+
		"\16\2\u0182\u0183\7\13\2\2\u0183\u0185\5\32\16\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\t\2\2\u018c\31\3\2\2\2\u018d\u0190\7\u008e"+
		"\2\2\u018e\u018f\7X\2\2\u018f\u0191\7\u008d\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u01b5\3\2\2\2\u0192\u0193\7\u008e\2\2\u0193\u019c"+
		"\7\6\2\2\u0194\u0199\5\u0090I\2\u0195\u0196\7\13\2\2\u0196\u0198\5\u0090"+
		"I\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0194\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\7\7\2\2\u019f"+
		"\u01a0\7X\2\2\u01a0\u01a2\7\u008d\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01b5\3\2\2\2\u01a3\u01a4\7\u008e\2\2\u01a4\u01ad\7\b\2"+
		"\2\u01a5\u01aa\5\u008eH\2\u01a6\u01a7\7\13\2\2\u01a7\u01a9\5\u008eH\2"+
		"\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\7\t\2\2\u01b0\u01b1\7X"+
		"\2\2\u01b1\u01b3\7\u008d\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u018d\3\2\2\2\u01b4\u0192\3\2\2\2\u01b4\u01a3\3\2"+
		"\2\2\u01b5\33\3\2\2\2\u01b6\u01b8\5\26\f\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01be\7S\2\2\u01bd\u01bf\5\u0084C\2\u01be\u01bd\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7T\2\2\u01c1"+
		"\u01c2\7\u008e\2\2\u01c2\u01c6\7\b\2\2\u01c3\u01c4\5\u008eH\2\u01c4\u01c5"+
		"\7\5\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7\t"+
		"\2\2\u01cb\35\3\2\2\2\u01cc\u01ce\5\26\f\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d4\5\u0084C\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7O\2\2\u01d6\u01d8\7\u008e\2"+
		"\2\u01d7\u01d9\5R*\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01dc\5P)\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01e6\3\2\2\2\u01dd\u01e1\7\b\2\2\u01de\u01e0\5*\26\2\u01df\u01de\3\2"+
		"\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\7\t\2\2\u01e5\u01e7\7\5"+
		"\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\37\3\2\2\2\u01e8\u01ea"+
		"\5\26\f\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0"+
		"\5\u0084C\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2"+
		"\2\u01f1\u01f2\7>\2\2\u01f2\u01f4\7\u008e\2\2\u01f3\u01f5\5R*\2\u01f4"+
		"\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\5P"+
		")\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0202\3\2\2\2\u01f9"+
		"\u01fd\7\b\2\2\u01fa\u01fc\5*\26\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0203\7\t\2\2\u0201\u0203\7\5\2\2\u0202\u01f9\3\2"+
		"\2\2\u0202\u0201\3\2\2\2\u0203!\3\2\2\2\u0204\u0205\7:\2\2\u0205\u0208"+
		"\5\u0090I\2\u0206\u0207\7\66\2\2\u0207\u0209\5\u0090I\2\u0208\u0206\3"+
		"\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\5R*\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\7\b"+
		"\2\2\u020e\u0210\5$\23\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0215\7\t\2\2\u0215#\3\2\2\2\u0216\u021b\5\20\t\2\u0217\u021b"+
		"\5\22\n\2\u0218\u021b\5\24\13\2\u0219\u021b\5&\24\2\u021a\u0216\3\2\2"+
		"\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b%"+
		"\3\2\2\2\u021c\u021e\5\26\f\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2"+
		"\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u0224\7=\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\t\4\2\2\u0226\u0227\7\6\2\2\u0227\u0228\5\u008e"+
		"H\2\u0228\u0229\7\7\2\2\u0229\u022a\7\u0086\2\2\u022a\u0237\5\u0090I\2"+
		"\u022b\u022f\7\b\2\2\u022c\u022e\5\60\31\2\u022d\u022c\3\2\2\2\u022e\u0231"+
		"\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0238\7\t\2\2\u0233\u0234\7t\2\2\u0234\u0235\5V,"+
		"\2\u0235\u0236\7\5\2\2\u0236\u0238\3\2\2\2\u0237\u022b\3\2\2\2\u0237\u0233"+
		"\3\2\2\2\u0238\'\3\2\2\2\u0239\u023a\7Q\2\2\u023a\u023b\5\u0090I\2\u023b"+
		"\u023c\7\u008e\2\2\u023c\u023d\7\5\2\2\u023d)\3\2\2\2\u023e\u0240\5\u0084"+
		"C\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\5\u008eH\2\u0242\u0245\7\5\2\2\u0243\u0245\5,\27\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u024a\3\2\2\2\u0246\u0247\5\u0084C"+
		"\2\u0247\u0248\7\r\2\2\u0248\u024a\3\2\2\2\u0249\u023f\3\2\2\2\u0249\u0246"+
		"\3\2\2\2\u024a+\3\2\2\2\u024b\u025f\7\b\2\2\u024c\u024e\5\u0084C\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u025d\78"+
		"\2\2\u0250\u025e\7\5\2\2\u0251\u0255\7\b\2\2\u0252\u0254\5\60\31\2\u0253"+
		"\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025e\7\t\2\2\u0259"+
		"\u025a\7t\2\2\u025a\u025b\5V,\2\u025b\u025c\7\5\2\2\u025c\u025e\3\2\2"+
		"\2\u025d\u0250\3\2\2\2\u025d\u0251\3\2\2\2\u025d\u0259\3\2\2\2\u025e\u0260"+
		"\3\2\2\2\u025f\u024d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0274\3\2\2\2\u0261"+
		"\u0263\5\u0084C\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0272\7K\2\2\u0265\u0273\7\5\2\2\u0266\u026a\7\b\2\2\u0267"+
		"\u0269\5\60\31\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3"+
		"\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d"+
		"\u0273\7\t\2\2\u026e\u026f\7t\2\2\u026f\u0270\5V,\2\u0270\u0271\7\5\2"+
		"\2\u0271\u0273\3\2\2\2\u0272\u0265\3\2\2\2\u0272\u0266\3\2\2\2\u0272\u026e"+
		"\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0262\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u027c\7\t\2\2\u0277\u0278\7t\2\2\u0278\u0279\5V,"+
		"\2\u0279\u027a\7\5\2\2\u027a\u027c\3\2\2\2\u027b\u024b\3\2\2\2\u027b\u0277"+
		"\3\2\2\2\u027c-\3\2\2\2\u027d\u0281\7\b\2\2\u027e\u0280\5\60\31\2\u027f"+
		"\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0287\7\t\2\2\u0285"+
		"\u0287\5\60\31\2\u0286\u027d\3\2\2\2\u0286\u0285\3\2\2\2\u0287/\3\2\2"+
		"\2\u0288\u0289\5\u0088E\2\u0289\u028a\7\5\2\2\u028a\u02a3\3\2\2\2\u028b"+
		"\u02a3\5\62\32\2\u028c\u02a3\5\64\33\2\u028d\u02a3\5\66\34\2\u028e\u02a3"+
		"\58\35\2\u028f\u02a3\5:\36\2\u0290\u02a3\5<\37\2\u0291\u02a3\5> \2\u0292"+
		"\u02a3\5@!\2\u0293\u0294\5V,\2\u0294\u0295\7\5\2\2\u0295\u02a3\3\2\2\2"+
		"\u0296\u0298\7S\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029d\7\b\2\2\u029a\u029c\5\60\31\2\u029b\u029a\3\2\2\2"+
		"\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a3\7\t\2\2\u02a1\u02a3\5J&\2\u02a2"+
		"\u0288\3\2\2\2\u02a2\u028b\3\2\2\2\u02a2\u028c\3\2\2\2\u02a2\u028d\3\2"+
		"\2\2\u02a2\u028e\3\2\2\2\u02a2\u028f\3\2\2\2\u02a2\u0290\3\2\2\2\u02a2"+
		"\u0291\3\2\2\2\u02a2\u0292\3\2\2\2\u02a2\u0293\3\2\2\2\u02a2\u0297\3\2"+
		"\2\2\u02a2\u02a1\3\2\2\2\u02a3\61\3\2\2\2\u02a4\u02a5\7A\2\2\u02a5\u02a6"+
		"\5.\30\2\u02a6\63\3\2\2\2\u02a7\u02a8\7W\2\2\u02a8\u02a9\5V,\2\u02a9\u02aa"+
		"\5.\30\2\u02aa\65\3\2\2\2\u02ab\u02ac\7\60\2\2\u02ac\u02ad\5.\30\2\u02ad"+
		"\u02ae\7W\2\2\u02ae\u02af\5V,\2\u02af\u02b0\7\5\2\2\u02b0\67\3\2\2\2\u02b1"+
		"\u02b2\7\66\2\2\u02b2\u02b5\7\6\2\2\u02b3\u02b6\5\u0086D\2\u02b4\u02b6"+
		"\5\u0088E\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2"+
		"\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\7\5\2\2\u02b8\u02b9\5V,\2\u02b9\u02ba"+
		"\7\5\2\2\u02ba\u02bb\5V,\2\u02bb\u02bc\7\7\2\2\u02bc\u02bd\5.\30\2\u02bd"+
		"\u02de\3\2\2\2\u02be\u02c1\7\66\2\2\u02bf\u02c2\5\u0086D\2\u02c0\u02c2"+
		"\5\u0088E\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\5\2\2\u02c4\u02c5\5V,\2\u02c5\u02c6"+
		"\7\5\2\2\u02c6\u02c7\5V,\2\u02c7\u02c8\5.\30\2\u02c8\u02de\3\2\2\2\u02c9"+
		"\u02ca\7\66\2\2\u02ca\u02cd\7\6\2\2\u02cb\u02ce\5\u008eH\2\u02cc\u02ce"+
		"\7\u008e\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf\3\2\2"+
		"\2\u02cf\u02d0\7<\2\2\u02d0\u02d1\5V,\2\u02d1\u02d2\7\7\2\2\u02d2\u02d3"+
		"\5.\30\2\u02d3\u02de\3\2\2\2\u02d4\u02d7\7\66\2\2\u02d5\u02d8\5\u008e"+
		"H\2\u02d6\u02d8\7\u008e\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02da\7<\2\2\u02da\u02db\5V,\2\u02db\u02dc\5.\30"+
		"\2\u02dc\u02de\3\2\2\2\u02dd\u02b1\3\2\2\2\u02dd\u02be\3\2\2\2\u02dd\u02c9"+
		"\3\2\2\2\u02dd\u02d4\3\2\2\2\u02de9\3\2\2\2\u02df\u02e1\7+\2\2\u02e0\u02e2"+
		"\7\u008d\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2"+
		"\2\u02e3\u02e4\7\5\2\2\u02e4;\3\2\2\2\u02e5\u02e6\7.\2\2\u02e6\u02e7\7"+
		"\5\2\2\u02e7=\3\2\2\2\u02e8\u02ea\7-\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\79\2\2\u02ec\u02ed\5V,\2\u02ed"+
		"\u02f4\5.\30\2\u02ee\u02ef\7\61\2\2\u02ef\u02f0\5V,\2\u02f0\u02f1\5.\30"+
		"\2\u02f1\u02f3\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f9\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f8\7\62\2\2\u02f8\u02fa\5.\30\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3"+
		"\2\2\2\u02fa?\3\2\2\2\u02fb\u02fc\7P\2\2\u02fc\u02fd\7\6\2\2\u02fd\u0300"+
		"\5\u0096L\2\u02fe\u02ff\7t\2\2\u02ff\u0301\7\u008e\2\2\u0300\u02fe\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\7\7\2\2\u0303"+
		"\u0305\7\b\2\2\u0304\u0306\5B\"\2\u0305\u0304\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030a\7\t\2\2\u030a\u031a\3\2\2\2\u030b\u030c\7P\2\2\u030c\u030f\5\u0096"+
		"L\2\u030d\u030e\7t\2\2\u030e\u0310\7\u008e\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\7\b\2\2\u0312\u0314\5B"+
		"\"\2\u0313\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0313\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7\t\2\2\u0318\u031a\3\2"+
		"\2\2\u0319\u02fb\3\2\2\2\u0319\u030b\3\2\2\2\u031aA\3\2\2\2\u031b\u031c"+
		"\7,\2\2\u031c\u031d\5V,\2\u031d\u031e\7\r\2\2\u031e\u0320\3\2\2\2\u031f"+
		"\u031b\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0326\3\2\2\2\u0323\u0325\5\60\31\2\u0324\u0323\3\2\2\2\u0325"+
		"\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2"+
		"\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7+\2\2\u032a\u032b\7\5\2\2\u032b"+
		"\u0337\3\2\2\2\u032c\u032d\7/\2\2\u032d\u0331\7\r\2\2\u032e\u0330\5\60"+
		"\31\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0335\7+"+
		"\2\2\u0335\u0337\7\5\2\2\u0336\u031f\3\2\2\2\u0336\u032c\3\2\2\2\u0337"+
		"C\3\2\2\2\u0338\u033a\7*\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033d\5\u0096L\2\u033c\u033e\5T+\2\u033d\u033c\3"+
		"\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u034e\7\6\2\2\u0340"+
		"\u0342\5\u008aF\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343"+
		"\3\2\2\2\u0343\u034b\5V,\2\u0344\u0346\7\13\2\2\u0345\u0347\5\u008aF\2"+
		"\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a"+
		"\5V,\2\u0349\u0344\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0341\3\2"+
		"\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\7\7\2\2\u0351"+
		"E\3\2\2\2\u0352\u0354\7D\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0362\5\u0090I\2\u0356\u035f\7\6\2\2\u0357\u035c"+
		"\5V,\2\u0358\u0359\7\13\2\2\u0359\u035b\5V,\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0363\7\7\2\2\u0362\u0356\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u036d\7\b\2\2\u0365\u036a\5H%\2\u0366\u0367"+
		"\7\13\2\2\u0367\u0369\5H%\2\u0368\u0366\3\2\2\2\u0369\u036c\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2"+
		"\2\2\u036d\u0365\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\7\t\2\2\u0370G\3\2\2\2\u0371\u0376\7\u008e\2\2\u0372\u0373\7\3"+
		"\2\2\u0373\u0375\7\u008e\2\2\u0374\u0372\3\2\2\2\u0375\u0378\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u0376\3\2"+
		"\2\2\u0379\u037b\7\r\2\2\u037a\u0371\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037d\5V,\2\u037dI\3\2\2\2\u037e\u0384\5V,\2\u037f"+
		"\u0380\7J\2\2\u0380\u0381\5V,\2\u0381\u0382\7\5\2\2\u0382\u0384\3\2\2"+
		"\2\u0383\u037e\3\2\2\2\u0383\u037f\3\2\2\2\u0384K\3\2\2\2\u0385\u0386"+
		"\7\r\2\2\u0386\u0387\5N(\2\u0387M\3\2\2\2\u0388\u0389\b(\1\2\u0389\u038a"+
		"\7\6\2\2\u038a\u038b\5N(\2\u038b\u038c\7\7\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038f\5\u0090I\2\u038e\u0388\3\2\2\2\u038e\u038d\3\2\2\2\u038f\u0398"+
		"\3\2\2\2\u0390\u0391\f\5\2\2\u0391\u0392\7m\2\2\u0392\u0397\5N(\6\u0393"+
		"\u0394\f\4\2\2\u0394\u0395\7\13\2\2\u0395\u0397\5N(\5\u0396\u0390\3\2"+
		"\2\2\u0396\u0393\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399O\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039c\7\r\2\2"+
		"\u039c\u03a1\5\u0090I\2\u039d\u039e\7\13\2\2\u039e\u03a0\5\u0090I\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2Q\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5\7w\2\2\u03a5\u03a7"+
		"\7\u008e\2\2\u03a6\u03a8\5L\'\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2"+
		"\2\u03a8\u03b0\3\2\2\2\u03a9\u03aa\7\13\2\2\u03aa\u03ac\7\u008e\2\2\u03ab"+
		"\u03ad\5L\'\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2"+
		"\2\2\u03ae\u03a9\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\7s"+
		"\2\2\u03b4S\3\2\2\2\u03b5\u03b6\7w\2\2\u03b6\u03bb\5\u0090I\2\u03b7\u03b8"+
		"\7\13\2\2\u03b8\u03ba\5\u0090I\2\u03b9\u03b7\3\2\2\2\u03ba\u03bd\3\2\2"+
		"\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb"+
		"\3\2\2\2\u03be\u03bf\7s\2\2\u03bfU\3\2\2\2\u03c0\u03c1\5X-\2\u03c1W\3"+
		"\2\2\2\u03c2\u03c3\b-\1\2\u03c3\u03c4\5Z.\2\u03c4\u03ca\3\2\2\2\u03c5"+
		"\u03c6\f\3\2\2\u03c6\u03c7\7\13\2\2\u03c7\u03c9\5Z.\2\u03c8\u03c5\3\2"+
		"\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"Y\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03d3\5\\/\2\u03ce\u03cf\5\\/\2\u03cf"+
		"\u03d0\5\u009aN\2\u03d0\u03d1\5Z.\2\u03d1\u03d3\3\2\2\2\u03d2\u03cd\3"+
		"\2\2\2\u03d2\u03ce\3\2\2\2\u03d3[\3\2\2\2\u03d4\u03d5\b/\1\2\u03d5\u03d6"+
		"\5^\60\2\u03d6\u03dc\3\2\2\2\u03d7\u03d8\f\3\2\2\u03d8\u03d9\7t\2\2\u03d9"+
		"\u03db\5^\60\2\u03da\u03d7\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2"+
		"\2\2\u03dc\u03dd\3\2\2\2\u03dd]\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e7"+
		"\5`\61\2\u03e0\u03e1\5`\61\2\u03e1\u03e2\7\16\2\2\u03e2\u03e3\5^\60\2"+
		"\u03e3\u03e4\7\r\2\2\u03e4\u03e5\5^\60\2\u03e5\u03e7\3\2\2\2\u03e6\u03df"+
		"\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e7_\3\2\2\2\u03e8\u03e9\b\61\1\2\u03e9"+
		"\u03ea\5b\62\2\u03ea\u03f0\3\2\2\2\u03eb\u03ec\f\3\2\2\u03ec\u03ed\7\u0080"+
		"\2\2\u03ed\u03ef\5b\62\2\u03ee\u03eb\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1a\3\2\2\2\u03f2\u03f0\3\2\2\2"+
		"\u03f3\u03f4\b\62\1\2\u03f4\u03f5\5d\63\2\u03f5\u03fb\3\2\2\2\u03f6\u03f7"+
		"\f\3\2\2\u03f7\u03f8\7\u0081\2\2\u03f8\u03fa\5d\63\2\u03f9\u03f6\3\2\2"+
		"\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fcc"+
		"\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\b\63\1\2\u03ff\u0400\5f\64\2"+
		"\u0400\u0406\3\2\2\2\u0401\u0402\f\3\2\2\u0402\u0403\7l\2\2\u0403\u0405"+
		"\5f\64\2\u0404\u0401\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407e\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040a\b\64\1\2"+
		"\u040a\u040b\5h\65\2\u040b\u0411\3\2\2\2\u040c\u040d\f\3\2\2\u040d\u040e"+
		"\7m\2\2\u040e\u0410\5h\65\2\u040f\u040c\3\2\2\2\u0410\u0413\3\2\2\2\u0411"+
		"\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412g\3\2\2\2\u0413\u0411\3\2\2\2"+
		"\u0414\u0415\b\65\1\2\u0415\u0416\5j\66\2\u0416\u041c\3\2\2\2\u0417\u0418"+
		"\f\3\2\2\u0418\u0419\7x\2\2\u0419\u041b\5j\66\2\u041a\u0417\3\2\2\2\u041b"+
		"\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041di\3\2\2\2"+
		"\u041e\u041c\3\2\2\2\u041f\u0420\b\66\1\2\u0420\u0421\5l\67\2\u0421\u0427"+
		"\3\2\2\2\u0422\u0423\f\3\2\2\u0423\u0424\7k\2\2\u0424\u0426\5l\67\2\u0425"+
		"\u0422\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428k\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042b\b\67\1\2\u042b\u042c"+
		"\5n8\2\u042c\u0432\3\2\2\2\u042d\u042e\f\3\2\2\u042e\u042f\t\5\2\2\u042f"+
		"\u0431\5n8\2\u0430\u042d\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2"+
		"\2\u0432\u0433\3\2\2\2\u0433m\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436"+
		"\b8\1\2\u0436\u0437\5p9\2\u0437\u043d\3\2\2\2\u0438\u0439\f\3\2\2\u0439"+
		"\u043a\t\6\2\2\u043a\u043c\5p9\2\u043b\u0438\3\2\2\2\u043c\u043f\3\2\2"+
		"\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043eo\3\2\2\2\u043f\u043d"+
		"\3\2\2\2\u0440\u0441\b9\1\2\u0441\u0442\5r:\2\u0442\u0448\3\2\2\2\u0443"+
		"\u0444\f\3\2\2\u0444\u0445\7n\2\2\u0445\u0447\5r:\2\u0446\u0443\3\2\2"+
		"\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449q"+
		"\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\b:\1\2\u044c\u044d\5t;\2\u044d"+
		"\u0453\3\2\2\2\u044e\u044f\f\3\2\2\u044f\u0450\t\7\2\2\u0450\u0452\5t"+
		";\2\u0451\u044e\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454s\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\b;\1\2\u0457"+
		"\u0458\5v<\2\u0458\u045e\3\2\2\2\u0459\u045a\f\3\2\2\u045a\u045b\t\b\2"+
		"\2\u045b\u045d\5v<\2\u045c\u0459\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045fu\3\2\2\2\u0460\u045e\3\2\2\2\u0461"+
		"\u0462\b<\1\2\u0462\u0463\5x=\2\u0463\u0469\3\2\2\2\u0464\u0465\f\3\2"+
		"\2\u0465\u0466\t\t\2\2\u0466\u0468\5x=\2\u0467\u0464\3\2\2\2\u0468\u046b"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046aw\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046d\b=\1\2\u046d\u046e\5z>\2\u046e\u0474\3\2\2"+
		"\2\u046f\u0470\f\3\2\2\u0470\u0471\7q\2\2\u0471\u0473\5z>\2\u0472\u046f"+
		"\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"y\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0478\b>\1\2\u0478\u0479\5|?\2\u0479"+
		"\u047f\3\2\2\2\u047a\u047b\f\3\2\2\u047b\u047c\t\n\2\2\u047c\u047e\5|"+
		"?\2\u047d\u047a\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480{\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u04a3\5~@\2\u0483"+
		"\u0484\7j\2\2\u0484\u04a3\5|?\2\u0485\u0486\7\u0088\2\2\u0486\u04a3\5"+
		"|?\2\u0487\u0488\7\177\2\2\u0488\u04a3\5|?\2\u0489\u048a\7\u0089\2\2\u048a"+
		"\u04a3\5|?\2\u048b\u048c\7\u0082\2\2\u048c\u04a3\5|?\2\u048d\u048e\7y"+
		"\2\2\u048e\u04a3\5|?\2\u048f\u0490\7x\2\2\u0490\u04a3\5|?\2\u0491\u0494"+
		"\7\6\2\2\u0492\u0495\5\u0090I\2\u0493\u0495\5V,\2\u0494\u0492\3\2\2\2"+
		"\u0494\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\7\7\2\2\u0497\u0498"+
		"\5V,\2\u0498\u04a3\3\2\2\2\u0499\u049a\7*\2\2\u049a\u04a3\5V,\2\u049b"+
		"\u049c\7k\2\2\u049c\u04a3\5|?\2\u049d\u049e\7\u0085\2\2\u049e\u04a3\5"+
		"|?\2\u049f\u04a0\7{\2\2\u04a0\u04a3\5|?\2\u04a1\u04a3\5\u0094K\2\u04a2"+
		"\u0482\3\2\2\2\u04a2\u0483\3\2\2\2\u04a2\u0485\3\2\2\2\u04a2\u0487\3\2"+
		"\2\2\u04a2\u0489\3\2\2\2\u04a2\u048b\3\2\2\2\u04a2\u048d\3\2\2\2\u04a2"+
		"\u048f\3\2\2\2\u04a2\u0491\3\2\2\2\u04a2\u0499\3\2\2\2\u04a2\u049b\3\2"+
		"\2\2\u04a2\u049d\3\2\2\2\u04a2\u049f\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3"+
		"}\3\2\2\2\u04a4\u04a5\b@\1\2\u04a5\u04c9\5\u0080A\2\u04a6\u04a7\7D\2\2"+
		"\u04a7\u04c9\5V,\2\u04a8\u04a9\7R\2\2\u04a9\u04ac\7\6\2\2\u04aa\u04ad"+
		"\5\u0090I\2\u04ab\u04ad\5V,\2\u04ac\u04aa\3\2\2\2\u04ac\u04ab\3\2\2\2"+
		"\u04ad\u04ae\3\2\2\2\u04ae\u04af\7\7\2\2\u04af\u04c9\3\2\2\2\u04b0\u04b1"+
		"\7/\2\2\u04b1\u04b4\7\6\2\2\u04b2\u04b5\5\u0090I\2\u04b3\u04b5\5V,\2\u04b4"+
		"\u04b2\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\7\7"+
		"\2\2\u04b7\u04c9\3\2\2\2\u04b8\u04c9\7/\2\2\u04b9\u04ba\7B\2\2\u04ba\u04bb"+
		"\7\6\2\2\u04bb\u04bc\5V,\2\u04bc\u04bd\7\7\2\2\u04bd\u04c9\3\2\2\2\u04be"+
		"\u04bf\7L\2\2\u04bf\u04c2\7\6\2\2\u04c0\u04c3\5\u0090I\2\u04c1\u04c3\5"+
		"V,\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7\7\2\2\u04c5\u04c9\3\2\2\2\u04c6\u04c7\7M\2\2\u04c7\u04c9\5V,"+
		"\2\u04c8\u04a4\3\2\2\2\u04c8\u04a6\3\2\2\2\u04c8\u04a8\3\2\2\2\u04c8\u04b0"+
		"\3\2\2\2\u04c8\u04b8\3\2\2\2\u04c8\u04b9\3\2\2\2\u04c8\u04be\3\2\2\2\u04c8"+
		"\u04c6\3\2\2\2\u04c9\u04e1\3\2\2\2\u04ca\u04cb\f\16\2\2\u04cb\u04cc\7"+
		"\3\2\2\u04cc\u04e0\5\u0080A\2\u04cd\u04cf\f\r\2\2\u04ce\u04d0\5T+\2\u04cf"+
		"\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\7\6"+
		"\2\2\u04d2\u04d4\5V,\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04e0\7\7\2\2\u04d6\u04d7\f\f\2\2\u04d7\u04d8\7\n\2\2\u04d8"+
		"\u04d9\5V,\2\u04d9\u04da\7\f\2\2\u04da\u04e0\3\2\2\2\u04db\u04dc\f\13"+
		"\2\2\u04dc\u04e0\7\u0082\2\2\u04dd\u04de\f\n\2\2\u04de\u04e0\7y\2\2\u04df"+
		"\u04ca\3\2\2\2\u04df\u04cd\3\2\2\2\u04df\u04d6\3\2\2\2\u04df\u04db\3\2"+
		"\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\177\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04ea\5\u0082"+
		"B\2\u04e5\u04e6\7\6\2\2\u04e6\u04e7\5V,\2\u04e7\u04e8\7\7\2\2\u04e8\u04ea"+
		"\3\2\2\2\u04e9\u04e4\3\2\2\2\u04e9\u04e5\3\2\2\2\u04ea\u0081\3\2\2\2\u04eb"+
		"\u04ef\7\u008e\2\2\u04ec\u04ef\7\u008d\2\2\u04ed\u04ef\7\u0090\2\2\u04ee"+
		"\u04eb\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ed\3\2\2\2\u04ef\u0083\3\2"+
		"\2\2\u04f0\u04f9\7H\2\2\u04f1\u04f2\7G\2\2\u04f2\u04f9\7?\2\2\u04f3\u04f4"+
		"\7F\2\2\u04f4\u04f9\7G\2\2\u04f5\u04f9\7F\2\2\u04f6\u04f9\7G\2\2\u04f7"+
		"\u04f9\7?\2\2\u04f8\u04f0\3\2\2\2\u04f8\u04f1\3\2\2\2\u04f8\u04f3\3\2"+
		"\2\2\u04f8\u04f5\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f7\3\2\2\2\u04f9"+
		"\u0085\3\2\2\2\u04fa\u04fd\5\u0096L\2\u04fb\u04fc\7\13\2\2\u04fc\u04fe"+
		"\5\u0096L\2\u04fd\u04fb\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u04fd\3\2\2"+
		"\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\5\u009aN\2\u0502"+
		"\u0503\5V,\2\u0503\u0510\3\2\2\2\u0504\u0509\5\u0096L\2\u0505\u0506\7"+
		"X\2\2\u0506\u0508\5\u0096L\2\u0507\u0505\3\2\2\2\u0508\u050b\3\2\2\2\u0509"+
		"\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u0509\3\2"+
		"\2\2\u050c\u050d\5\u009aN\2\u050d\u050e\5V,\2\u050e\u0510\3\2\2\2\u050f"+
		"\u04fa\3\2\2\2\u050f\u0504\3\2\2\2\u0510\u0087\3\2\2\2\u0511\u0513\5\26"+
		"\f\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u051c\5\u008e"+
		"H\2\u0518\u0519\7X\2\2\u0519\u051b\5\u008eH\2\u051a\u0518\3\2\2\2\u051b"+
		"\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2"+
		"\2\2\u051e\u051c\3\2\2\2\u051f\u0520\7X\2\2\u0520\u0521\5V,\2\u0521\u0550"+
		"\3\2\2\2\u0522\u0524\5\26\f\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2"+
		"\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525"+
		"\3\2\2\2\u0528\u052d\5\u008eH\2\u0529\u052a\7\13\2\2\u052a\u052c\5\u008e"+
		"H\2\u052b\u0529\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0531\7X"+
		"\2\2\u0531\u0532\5V,\2\u0532\u0550\3\2\2\2\u0533\u0535\5\26\f\2\u0534"+
		"\u0533\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u0539\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u053e\5\u008eH\2\u053a"+
		"\u053b\7\13\2\2\u053b\u053d\7\u008e\2\2\u053c\u053a\3\2\2\2\u053d\u0540"+
		"\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0550\3\2\2\2\u0540"+
		"\u053e\3\2\2\2\u0541\u0543\5\26\f\2\u0542\u0541\3\2\2\2\u0543\u0546\3"+
		"\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u054c\5\u008eH\2\u0548\u0549\7\13\2\2\u0549\u054b"+
		"\5\u008eH\2\u054a\u0548\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2"+
		"\2\u054c\u054d\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0514"+
		"\3\2\2\2\u054f\u0525\3\2\2\2\u054f\u0536\3\2\2\2\u054f\u0544\3\2\2\2\u0550"+
		"\u0089\3\2\2\2\u0551\u0552\7\u008e\2\2\u0552\u0553\7\r\2\2\u0553\u008b"+
		"\3\2\2\2\u0554\u0556\5\u008aF\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2"+
		"\2\u0556\u0557\3\2\2\2\u0557\u055f\5\u008eH\2\u0558\u055a\7\13\2\2\u0559"+
		"\u055b\5\u008aF\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055e\5\u008eH\2\u055d\u0558\3\2\2\2\u055e\u0561\3\2\2"+
		"\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0568\3\2\2\2\u0561\u055f"+
		"\3\2\2\2\u0562\u0564\7\13\2\2\u0563\u0565\5\u0090I\2\u0564\u0563\3\2\2"+
		"\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\7\17\2\2\u0567"+
		"\u0569\7\u008e\2\2\u0568\u0562\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b"+
		"\3\2\2\2\u056a\u0555\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u0572\3\2\2\2\u056c"+
		"\u056e\5\u0090I\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f"+
		"\3\2\2\2\u056f\u0570\7\17\2\2\u0570\u0572\7\u008e\2\2\u0571\u056a\3\2"+
		"\2\2\u0571\u056d\3\2\2\2\u0572\u008d\3\2\2\2\u0573\u0574\5\u0090I\2\u0574"+
		"\u0575\7\u008e\2\2\u0575\u008f\3\2\2\2\u0576\u0577\bI\1\2\u0577\u0592"+
		"\5\u0092J\2\u0578\u0579\7\6\2\2\u0579\u057c\5\u0090I\2\u057a\u057b\7\13"+
		"\2\2\u057b\u057d\5\u0090I\2\u057c\u057a\3\2\2\2\u057d\u057e\3\2\2\2\u057e"+
		"\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7\7"+
		"\2\2\u0581\u0592\3\2\2\2\u0582\u0583\7-\2\2\u0583\u0592\5\u0090I\t\u0584"+
		"\u0585\7N\2\2\u0585\u0592\5\u0090I\b\u0586\u0587\7V\2\2\u0587\u0592\5"+
		"\u0090I\7\u0588\u0589\7)\2\2\u0589\u058a\7w\2\2\u058a\u058b\5\u0090I\2"+
		"\u058b\u058c\7s\2\2\u058c\u0592\3\2\2\2\u058d\u058e\7I\2\2\u058e\u0592"+
		"\5\u0090I\5\u058f\u0592\5\u0096L\2\u0590\u0592\7\20\2\2\u0591\u0576\3"+
		"\2\2\2\u0591\u0578\3\2\2\2\u0591\u0582\3\2\2\2\u0591\u0584\3\2\2\2\u0591"+
		"\u0586\3\2\2\2\u0591\u0588\3\2\2\2\u0591\u058d\3\2\2\2\u0591\u058f\3\2"+
		"\2\2\u0591\u0590\3\2\2\2\u0592\u05bb\3\2\2\2\u0593\u0594\f\16\2\2\u0594"+
		"\u05ba\7{\2\2\u0595\u0596\f\r\2\2\u0596\u05ba\7k\2\2\u0597\u0598\f\f\2"+
		"\2\u0598\u059a\7\n\2\2\u0599\u059b\7\u008d\2\2\u059a\u0599\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u05a2\3\2\2\2\u059c\u059e\7\13\2\2\u059d\u059f\7"+
		"\u008d\2\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2"+
		"\u05a0\u059c\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05ba\7\f\2\2\u05a6"+
		"\u05a7\f\13\2\2\u05a7\u05a8\7w\2\2\u05a8\u05ad\5\u0090I\2\u05a9\u05aa"+
		"\7\13\2\2\u05aa\u05ac\5\u0090I\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\3\2\2"+
		"\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05ad"+
		"\3\2\2\2\u05b0\u05b1\7s\2\2\u05b1\u05ba\3\2\2\2\u05b2\u05b5\f\n\2\2\u05b3"+
		"\u05b4\7\13\2\2\u05b4\u05b6\5\u0090I\2\u05b5\u05b3\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9"+
		"\u0593\3\2\2\2\u05b9\u0595\3\2\2\2\u05b9\u0597\3\2\2\2\u05b9\u05a6\3\2"+
		"\2\2\u05b9\u05b2\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u0091\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05ef\7\21"+
		"\2\2\u05bf\u05ef\7\22\2\2\u05c0\u05ef\7\u008a\2\2\u05c1\u05ef\7\u008b"+
		"\2\2\u05c2\u05ef\7\23\2\2\u05c3\u05ef\7\24\2\2\u05c4\u05ef\7\25\2\2\u05c5"+
		"\u05ef\7\26\2\2\u05c6\u05ef\7\27\2\2\u05c7\u05ef\7\u008c\2\2\u05c8\u05ef"+
		"\7\30\2\2\u05c9\u05ef\7\31\2\2\u05ca\u05ef\7\32\2\2\u05cb\u05d7\7\33\2"+
		"\2\u05cc\u05cd\7w\2\2\u05cd\u05d2\5\u0090I\2\u05ce\u05cf\7\13\2\2\u05cf"+
		"\u05d1\5\u0090I\2\u05d0\u05ce\3\2\2\2\u05d1\u05d4\3\2\2\2\u05d2\u05d0"+
		"\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5"+
		"\u05d6\7s\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05cc\3\2\2\2\u05d7\u05d8\3\2"+
		"\2\2\u05d8\u05ef\3\2\2\2\u05d9\u05e5\7\34\2\2\u05da\u05db\7w\2\2\u05db"+
		"\u05e0\5\u0090I\2\u05dc\u05dd\7\13\2\2\u05dd\u05df\5\u0090I\2\u05de\u05dc"+
		"\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e3\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05e4\7s\2\2\u05e4\u05e6\3\2"+
		"\2\2\u05e5\u05da\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05ef\3\2\2\2\u05e7"+
		"\u05ef\7\35\2\2\u05e8\u05ef\7\36\2\2\u05e9\u05ef\7\37\2\2\u05ea\u05ef"+
		"\7 \2\2\u05eb\u05ef\7!\2\2\u05ec\u05ef\7\"\2\2\u05ed\u05ef\7#\2\2\u05ee"+
		"\u05be\3\2\2\2\u05ee\u05bf\3\2\2\2\u05ee\u05c0\3\2\2\2\u05ee\u05c1\3\2"+
		"\2\2\u05ee\u05c2\3\2\2\2\u05ee\u05c3\3\2\2\2\u05ee\u05c4\3\2\2\2\u05ee"+
		"\u05c5\3\2\2\2\u05ee\u05c6\3\2\2\2\u05ee\u05c7\3\2\2\2\u05ee\u05c8\3\2"+
		"\2\2\u05ee\u05c9\3\2\2\2\u05ee\u05ca\3\2\2\2\u05ee\u05cb\3\2\2\2\u05ee"+
		"\u05d9\3\2\2\2\u05ee\u05e7\3\2\2\2\u05ee\u05e8\3\2\2\2\u05ee\u05e9\3\2"+
		"\2\2\u05ee\u05ea\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ed\3\2\2\2\u05ef\u0093\3\2\2\2\u05f0\u05f4\7$\2\2\u05f1\u05f4\7%\2"+
		"\2\u05f2\u05f4\7&\2\2\u05f3\u05f0\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f2"+
		"\3\2\2\2\u05f4\u0095\3\2\2\2\u05f5\u05fa\7\u008e\2\2\u05f6\u05f7\7\3\2"+
		"\2\u05f7\u05f9\7\u008e\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa"+
		"\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05ff\3\2\2\2\u05fc\u05fa\3\2"+
		"\2\2\u05fd\u05ff\5\u0092J\2\u05fe\u05f5\3\2\2\2\u05fe\u05fd\3\2\2\2\u05ff"+
		"\u0097\3\2\2\2\u0600\u061e\5\u009aN\2\u0601\u061e\7j\2\2\u0602\u061e\7"+
		"l\2\2\u0603\u061e\7k\2\2\u0604\u061e\7m\2\2\u0605\u061e\7n\2\2\u0606\u061e"+
		"\7o\2\2\u0607\u061e\7p\2\2\u0608\u061e\7q\2\2\u0609\u061e\7r\2\2\u060a"+
		"\u061e\7s\2\2\u060b\u061e\7u\2\2\u060c\u061e\7w\2\2\u060d\u061e\7v\2\2"+
		"\u060e\u061e\7x\2\2\u060f\u061e\7y\2\2\u0610\u061e\7z\2\2\u0611\u061e"+
		"\7{\2\2\u0612\u061e\7\u0081\2\2\u0613\u061e\7|\2\2\u0614\u061e\7}\2\2"+
		"\u0615\u061e\7~\2\2\u0616\u061e\7\177\2\2\u0617\u061e\7\u0082\2\2\u0618"+
		"\u061e\7\u0083\2\2\u0619\u061e\7\u0084\2\2\u061a\u061e\7\u0087\2\2\u061b"+
		"\u061e\7\u0088\2\2\u061c\u061e\7\u0089\2\2\u061d\u0600\3\2\2\2\u061d\u0601"+
		"\3\2\2\2\u061d\u0602\3\2\2\2\u061d\u0603\3\2\2\2\u061d\u0604\3\2\2\2\u061d"+
		"\u0605\3\2\2\2\u061d\u0606\3\2\2\2\u061d\u0607\3\2\2\2\u061d\u0608\3\2"+
		"\2\2\u061d\u0609\3\2\2\2\u061d\u060a\3\2\2\2\u061d\u060b\3\2\2\2\u061d"+
		"\u060c\3\2\2\2\u061d\u060d\3\2\2\2\u061d\u060e\3\2\2\2\u061d\u060f\3\2"+
		"\2\2\u061d\u0610\3\2\2\2\u061d\u0611\3\2\2\2\u061d\u0612\3\2\2\2\u061d"+
		"\u0613\3\2\2\2\u061d\u0614\3\2\2\2\u061d\u0615\3\2\2\2\u061d\u0616\3\2"+
		"\2\2\u061d\u0617\3\2\2\2\u061d\u0618\3\2\2\2\u061d\u0619\3\2\2\2\u061d"+
		"\u061a\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061c\3\2\2\2\u061e\u0099\3\2"+
		"\2\2\u061f\u0620\t\13\2\2\u0620\u009b\3\2\2\2\u00c6\u009f\u00ad\u00b1"+
		"\u00b8\u00bc\u00c6\u00d0\u00d5\u00da\u00e4\u00ed\u00f1\u00f6\u00fc\u0103"+
		"\u010d\u0111\u0114\u0119\u011d\u0122\u0127\u0134\u0138\u013b\u0140\u0144"+
		"\u014d\u0157\u015b\u015e\u0168\u016d\u0174\u0178\u017e\u0186\u0189\u0190"+
		"\u0199\u019c\u01a1\u01aa\u01ad\u01b2\u01b4\u01b9\u01be\u01c8\u01cf\u01d3"+
		"\u01d8\u01db\u01e1\u01e6\u01eb\u01ef\u01f4\u01f7\u01fd\u0202\u0208\u020b"+
		"\u0211\u021a\u021f\u0223\u022f\u0237\u023f\u0244\u0249\u024d\u0255\u025d"+
		"\u025f\u0262\u026a\u0272\u0274\u027b\u0281\u0286\u0297\u029d\u02a2\u02b5"+
		"\u02c1\u02cd\u02d7\u02dd\u02e1\u02e9\u02f4\u02f9\u0300\u0307\u030f\u0315"+
		"\u0319\u0321\u0326\u0331\u0336\u0339\u033d\u0341\u0346\u034b\u034e\u0353"+
		"\u035c\u035f\u0362\u036a\u036d\u0376\u037a\u0383\u038e\u0396\u0398\u03a1"+
		"\u03a7\u03ac\u03b0\u03bb\u03ca\u03d2\u03dc\u03e6\u03f0\u03fb\u0406\u0411"+
		"\u041c\u0427\u0432\u043d\u0448\u0453\u045e\u0469\u0474\u047f\u0494\u04a2"+
		"\u04ac\u04b4\u04c2\u04c8\u04cf\u04d3\u04df\u04e1\u04e9\u04ee\u04f8\u04ff"+
		"\u0509\u050f\u0514\u051c\u0525\u052d\u0536\u053e\u0544\u054c\u054f\u0555"+
		"\u055a\u055f\u0564\u0568\u056a\u056d\u0571\u057e\u0591\u059a\u059e\u05a2"+
		"\u05ad\u05b7\u05b9\u05bb\u05d2\u05d7\u05e0\u05e5\u05ee\u05f3\u05fa\u05fe"+
		"\u061d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}