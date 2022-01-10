using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;

namespace Asylum.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult Visit(IParseTree tree)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitAccess_modifier([NotNull] AsylumParser.Access_modifierContext context)
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

        public AsylumVisitResult VisitForEachLoop([NotNull] AsylumParser.ForEachLoopContext context)
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

        public AsylumVisitResult VisitVariableDeclareWithoutInitializerMultipleTypes([NotNull] AsylumParser.VariableDeclareWithoutInitializerMultipleTypesContext context)
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

        public AsylumVisitResult VisitVarTypeGenerics([NotNull] AsylumParser.VarTypeGenericsContext context)
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

        public AsylumVisitResult VisitCast_definition([NotNull] AsylumParser.Cast_definitionContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitForEachLoopNoParens([NotNull] AsylumParser.ForEachLoopNoParensContext context)
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

        public AsylumVisitResult VisitVarTypeReadOnly([NotNull] AsylumParser.VarTypeReadOnlyContext context)
        {
            throw new System.NotImplementedException();
        }

    }

}