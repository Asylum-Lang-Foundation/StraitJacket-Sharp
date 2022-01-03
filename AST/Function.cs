using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using StraitJacket.Constructs;

// There is a lot that still needs to be done here, and __thiscall is not even implemented.
namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {
    
        // TODO!!!
        public AsylumVisitResult VisitExtern_function_definition([NotNull] AsylumParser.Extern_function_definitionContext context)
        {

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // Get modifiers.
            Modifier modifier = Modifier.None;
            foreach (var p in context.extern_function_property()) {
                var res = p.Accept(this);
                if (res == null) continue;
                modifier |= res.Modifier;
            }

            // Get parameters.
            List<VarParameter> parameters;
            if (context.variable_arguments() != null) {
                parameters = context.variable_arguments().Accept(this).Parameters;
            } else {
                parameters = new List<VarParameter>();
            }
    
            // Get return type.
            VarType returnType;
            if (context.variable_type() != null) {
                returnType = context.variable_type().Accept(this).VariableType;
            } else {
                returnType = new VarTypeSimplePrimitive(SimplePrimitives.Void);
            }

            // Finished.
            Builder.PushModifier(modifier);
            Builder.ExternFunction(context.IDENTIFIER().GetText(), returnType, parameters);
            Builder.PopModifier();
            return null;

        }

        public AsylumVisitResult VisitExtern_function_property([NotNull] AsylumParser.Extern_function_propertyContext context)
        {
            if (context.ASYNC() != null) {
                return new AsylumVisitResult() { Modifier = Constructs.Modifier.Async };
            } else if (context.STATIC() != null) {
                return new AsylumVisitResult() { Modifier = Constructs.Modifier.Static };
            }
            return null;
        }

        public AsylumVisitResult VisitAttribute([NotNull] AsylumParser.AttributeContext context)
        {
            throw new System.NotImplementedException();
        }

        // TODO!!!
        public AsylumVisitResult VisitFunction_definition([NotNull] AsylumParser.Function_definitionContext context)
        {

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // GET MODIFIERS TODO!!!
            Modifier modifier = Modifier.None;
            foreach (var p in context.function_property()) {
                if (p.INLINE() != null) modifier |= Modifier.Inline;
            }

            // GENERICS TODO!!!

            // Get parameters.
            List<VarParameter> parameters;
            if (context.variable_arguments() != null) {
                parameters = context.variable_arguments().Accept(this).Parameters;
            } else {
                parameters = new List<VarParameter>();
            }
    
            // Get return type.
            VarType returnType;
            if (context.variable_type() != null) {
                returnType = context.variable_type().Accept(this).VariableType;
            } else {
                returnType = new VarTypeSimplePrimitive(SimplePrimitives.Void);
            }

            // Get code.
            Builder.PushModifier(modifier);
            Builder.BeginFunction(context.IDENTIFIER().GetText(), returnType, parameters);
            Builder.PopModifier();
            CodeStatements definition = null;
            if (context.expression() != null) {
                if (returnType.Equals(new VarTypeSimplePrimitive(SimplePrimitives.Void))) { // Hack for accidentally returning a value instead of void which is illegal.
                    Builder.Code(context.expression().Accept(this).Expression);
                } else {
                    Builder.Code(new ReturnStatement(context.expression().Accept(this).Expression));
                }
            } else if (context.code_statement() != null) {
                foreach (var c in context.code_statement()) {
                    c.Accept(this); // Add code statements.
                }
            }

            // Finish.
            Builder.EndFunction();
            return null;

        }

        // TODO!!!
        public AsylumVisitResult VisitConstructor_definition([NotNull] AsylumParser.Constructor_definitionContext context)
        {
            throw new System.NotImplementedException();

            /*
            
            // New function.
            Function fn = new Function();
            fn.Name = context.variable_type().GetText();
            fn.Scope = CTX.CurrentScope;
            fn.ModulePath = CTX.ModuleName;

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // GET MODIFIERS TODO!!!
            foreach (var p in context.function_property()) {
                if (p.INLINE() != null) fn.Inline = true;
            }

            // GENERICS TODO!!!

            // Get parameters.
            if (context.variable_arguments() != null) {
                fn.Parameters = context.variable_arguments().Accept(this).Parameters;
                if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Value.Type.Variadic) { fn.Variadic = true; } // Variadic check.
            } else {
                fn.Parameters = new List<VarParameter>();
            }
    
            // Get return type.
            fn.ReturnType = context.variable_type().Accept(this).VariableType;

            // Get code.
            EnterScope("%FNCONST%_" + fn.ToString());
            fn.Scope.AddFunction(fn.Name, fn.ToString(), fn);
            if (context.expression() != null) {
                fn.Definition = new CodeStatements() {
                    Statements = new List<ICompileable>() {
                        new ReturnStatement() {
                            ReturnValue = context.expression().Accept(this).Expression
                        }
                    }
                };
            } else if (context.code_statement() != null) {
                fn.Definition = new CodeStatements();
                foreach (var c in context.code_statement()) {
                    fn.Definition.Statements.Add(c.Accept(this).CodeStatement);
                }
            }

            // Return function.
            ExitScope();
            return new AsylumVisitResult() { Function = fn };

            */
            
        }

        // TODO!!!
        public AsylumVisitResult VisitOperator_definition([NotNull] AsylumParser.Operator_definitionContext context)
        {
            throw new System.NotImplementedException();

            /*
            
            // New function.
            Function fn = new Function();
            fn.Name = context.variable_type().GetText();
            fn.Scope = CTX.CurrentScope;
            fn.ModulePath = CTX.ModuleName;

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // Get parameters.
            if (context.variable_arguments() != null) {
                fn.Parameters = context.variable_arguments().Accept(this).Parameters;
                if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Value.Type.Variadic) { fn.Variadic = true; } // Variadic check.
            } else {
                fn.Parameters = new List<VarParameter>();
            }
    
            // Get return type.
            fn.ReturnType = context.variable_type().Accept(this).VariableType;

            // TODO: FIX OPERATOR!!!
            fn.Operator = context.@operator().Accept(this).Operator;
            if (fn.Parameters.Count() == 1) {
                if (fn.Operator == Operator.Add) fn.Operator = Operator.Pos;
                else if (fn.Operator == Operator.Sub) fn.Operator = Operator.Neg;
                else if (fn.Operator == Operator.And) fn.Operator = Operator.Neg;
            }

            // Error check.

            // Get code.
            EnterScope("%FNOPERATOR%_" + fn.ToString());
            fn.Scope.AddFunction(fn.Name, fn.ToString(), fn);
            if (context.expression() != null) {
                fn.Definition = new CodeStatements() {
                    Statements = new List<ICompileable>() {
                        new ReturnStatement() {
                            ReturnValue = context.expression().Accept(this).Expression
                        }
                    }
                };
            } else if (context.code_statement() != null) {
                fn.Definition = new CodeStatements();
                foreach (var c in context.code_statement()) {
                    fn.Definition.Statements.Add(c.Accept(this).CodeStatement);
                }
            }
            
            // Return function.
            ExitScope();
            return new AsylumVisitResult() { Function = fn };

            */

        }
    
    }

}