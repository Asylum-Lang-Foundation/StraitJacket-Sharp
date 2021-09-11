using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult Visit(IParseTree tree)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitAccess_modifier([NotNull] AsylumParser.Access_modifierContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitBreakStatement([NotNull] AsylumParser.BreakStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitBreak_statement([NotNull] AsylumParser.Break_statementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitCaseDefault([NotNull] AsylumParser.CaseDefaultContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitCaseExpression([NotNull] AsylumParser.CaseExpressionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitChildren(IRuleNode node)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitCode_body([NotNull] AsylumParser.Code_bodyContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitConstantFalse([NotNull] AsylumParser.ConstantFalseContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitConstantNull([NotNull] AsylumParser.ConstantNullContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitConstantTrue([NotNull] AsylumParser.ConstantTrueContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitConstructor_with_initializers([NotNull] AsylumParser.Constructor_with_initializersContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitDoWhileLoopStatement([NotNull] AsylumParser.DoWhileLoopStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitDo_while_loop([NotNull] AsylumParser.Do_while_loopContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitEnumEntryData([NotNull] AsylumParser.EnumEntryDataContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitEnumEntryPlain([NotNull] AsylumParser.EnumEntryPlainContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitEnumEntryStructs([NotNull] AsylumParser.EnumEntryStructsContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitEnum_definition([NotNull] AsylumParser.Enum_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitErrorNode(IErrorNode node)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprAdditive([NotNull] AsylumParser.ExprAdditiveContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprAnd([NotNull] AsylumParser.ExprAndContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprBitAnd([NotNull] AsylumParser.ExprBitAndContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprBitOr([NotNull] AsylumParser.ExprBitOrContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprCode([NotNull] AsylumParser.ExprCodeContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprComparison([NotNull] AsylumParser.ExprComparisonContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprEqualityComparison([NotNull] AsylumParser.ExprEqualityComparisonContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprLambda([NotNull] AsylumParser.ExprLambdaContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprMultiplicative([NotNull] AsylumParser.ExprMultiplicativeContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprNullCheck([NotNull] AsylumParser.ExprNullCheckContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprOr([NotNull] AsylumParser.ExprOrContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprParenthesis([NotNull] AsylumParser.ExprParenthesisContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprRange([NotNull] AsylumParser.ExprRangeContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprShift([NotNull] AsylumParser.ExprShiftContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprSubprimary([NotNull] AsylumParser.ExprSubprimaryContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprTernary([NotNull] AsylumParser.ExprTernaryContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprXor([NotNull] AsylumParser.ExprXorContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitForEachLoop([NotNull] AsylumParser.ForEachLoopContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitForLoopStatement([NotNull] AsylumParser.ForLoopStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitFunction_property([NotNull] AsylumParser.Function_propertyContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitGeneric_definition([NotNull] AsylumParser.Generic_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitGeneric_specifier([NotNull] AsylumParser.Generic_specifierContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitIfStatement([NotNull] AsylumParser.IfStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitIf_statement([NotNull] AsylumParser.If_statementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitIndentedStatement([NotNull] AsylumParser.IndentedStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitInitializer_value([NotNull] AsylumParser.Initializer_valueContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitInterface_definition([NotNull] AsylumParser.Interface_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitLabel([NotNull] AsylumParser.LabelContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitLoop([NotNull] AsylumParser.LoopContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitLoopStatement([NotNull] AsylumParser.LoopStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitNamespace_statement([NotNull] AsylumParser.Namespace_statementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveAutoVariable([NotNull] AsylumParser.PrimitiveAutoVariableContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveBool([NotNull] AsylumParser.PrimitiveBoolContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveChar([NotNull] AsylumParser.PrimitiveCharContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveDecimal([NotNull] AsylumParser.PrimitiveDecimalContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveEvent([NotNull] AsylumParser.PrimitiveEventContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveExtended([NotNull] AsylumParser.PrimitiveExtendedContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveFixed([NotNull] AsylumParser.PrimitiveFixedContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveFixedAny([NotNull] AsylumParser.PrimitiveFixedAnyContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveFunction([NotNull] AsylumParser.PrimitiveFunctionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveObject([NotNull] AsylumParser.PrimitiveObjectContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveVarLen([NotNull] AsylumParser.PrimitiveVarLenContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveVoid([NotNull] AsylumParser.PrimitiveVoidContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPrimitiveWideChar([NotNull] AsylumParser.PrimitiveWideCharContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPropertyGetSet([NotNull] AsylumParser.PropertyGetSetContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitPropertySetOnly([NotNull] AsylumParser.PropertySetOnlyContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitReturnStatement([NotNull] AsylumParser.ReturnStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitReturn_value([NotNull] AsylumParser.Return_valueContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitStructAccess([NotNull] AsylumParser.StructAccessContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitStructData([NotNull] AsylumParser.StructDataContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitStruct_definition([NotNull] AsylumParser.Struct_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitSwitchCaseStatement([NotNull] AsylumParser.SwitchCaseStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitSwitch_case([NotNull] AsylumParser.Switch_caseContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTerminal(ITerminalNode node)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTraditionalForLoop([NotNull] AsylumParser.TraditionalForLoopContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTypeImplementsExprAnd([NotNull] AsylumParser.TypeImplementsExprAndContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTypeImplementsExprOr([NotNull] AsylumParser.TypeImplementsExprOrContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTypeImplementsExprParenthesis([NotNull] AsylumParser.TypeImplementsExprParenthesisContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTypeImplementsExprSingle([NotNull] AsylumParser.TypeImplementsExprSingleContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitType_implements([NotNull] AsylumParser.Type_implementsContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitType_implements_extended([NotNull] AsylumParser.Type_implements_extendedContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUnion_definition([NotNull] AsylumParser.Union_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalEnum([NotNull] AsylumParser.UniversalEnumContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalInterface([NotNull] AsylumParser.UniversalInterfaceContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalNamespace([NotNull] AsylumParser.UniversalNamespaceContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalStruct([NotNull] AsylumParser.UniversalStructContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalUnion([NotNull] AsylumParser.UniversalUnionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUniversalUsing([NotNull] AsylumParser.UniversalUsingContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitUsing_statement([NotNull] AsylumParser.Using_statementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableAssignmentUnpack([NotNull] AsylumParser.VariableAssignmentUnpackContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableDeclareWithoutInitializer([NotNull] AsylumParser.VariableDeclareWithoutInitializerContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableDeclareWithoutInitializerMultipleTypes([NotNull] AsylumParser.VariableDeclareWithoutInitializerMultipleTypesContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableDeclareWithTupleInitializer([NotNull] AsylumParser.VariableDeclareWithTupleInitializerContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeArray([NotNull] AsylumParser.VarTypeArrayContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeAtomic([NotNull] AsylumParser.VarTypeAtomicContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeConstant([NotNull] AsylumParser.VarTypeConstantContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeDietPointer([NotNull] AsylumParser.VarTypeDietPointerContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeGenerics([NotNull] AsylumParser.VarTypeGenericsContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeRawPointer([NotNull] AsylumParser.VarTypeRawPointerContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeStatic([NotNull] AsylumParser.VarTypeStaticContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeTuple([NotNull] AsylumParser.VarTypeTupleContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeTupleProper([NotNull] AsylumParser.VarTypeTupleProperContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVarTypeVolatile([NotNull] AsylumParser.VarTypeVolatileContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitWhileLoopStatement([NotNull] AsylumParser.WhileLoopStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitWhile_loop([NotNull] AsylumParser.While_loopContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitCast_definition([NotNull] AsylumParser.Cast_definitionContext context)
        {
            throw new System.NotImplementedException();
        }
        
        public AsylumVisitResult VisitContinueStatement([NotNull] AsylumParser.ContinueStatementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitTraditionalForLoopNoParens([NotNull] AsylumParser.TraditionalForLoopNoParensContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitForEachLoopNoParens([NotNull] AsylumParser.ForEachLoopNoParensContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitContinue_statement([NotNull] AsylumParser.Continue_statementContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitSwitchCase([NotNull] AsylumParser.SwitchCaseContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitSwitchCaseNoParens([NotNull] AsylumParser.SwitchCaseNoParensContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprComma([NotNull] AsylumParser.ExprCommaContext context)
        {
            throw new System.NotImplementedException();
        }

    }

}