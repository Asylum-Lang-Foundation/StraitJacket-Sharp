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

            // New function.
            Function fn = new Function();
            fn.Extern = true;
            fn.Name = context.IDENTIFIER().GetText();
            fn.Scope = CTX.CurrentScope;
            fn.Scope.AddFunction(fn.Name, fn.Name, fn); // No mangling.
            EnterScope("%FN%_" + fn.Name);

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // Get modifiers.
            // TODO: ACCESS MODIFIERS!!!
            foreach (var p in context.extern_function_property()) {
                var res = p.Accept(this);
                if (res == null) continue;
                if (res.Modifier == Modifier.Async) fn.Async = true;
                else if (res.Modifier == Modifier.Static) fn.Static = true;
            }

            // Get parameters.
            if (context.variable_arguments() != null) {
                fn.Parameters = context.variable_arguments().Accept(this).Parameters;
                if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Type.Variadic) { fn.Variadic = true; } // Variadic check.
            } else {
                fn.Parameters = new List<VarParameter>();
            }
    
            // Get return type.
            if (context.variable_type() != null) {
                fn.ReturnType = context.variable_type().Accept(this).VariableType;
            } else {
                fn.ReturnType = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.Void };
            }

            // Finished.
            fn.Type = new VarType() {
                Type = VarTypeEnum.Primitive,
                Primitive = Primitives.Function,
                EmbeddedType = fn.ReturnType,
                Members = fn.Parameters.Select(x => x.Type).ToArray()
            };
            ExitScope();
            return new AsylumVisitResult() { Function = fn };

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

            // New function.
            Function fn = new Function();
            fn.Name = context.IDENTIFIER().GetText();
            fn.Scope = CTX.CurrentScope;

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
                if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Type.Variadic) { fn.Variadic = true; } // Variadic check.
            } else {
                fn.Parameters = new List<VarParameter>();
            }
    
            // Get return type.
            if (context.variable_type() != null) {
                fn.ReturnType = context.variable_type().Accept(this).VariableType;
            } else {
                fn.ReturnType = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.Void };
            }

            // Get code.
            EnterScope("%FN%_" + fn.ToString());
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

        }

        // TODO!!!
        public AsylumVisitResult VisitConstructor_definition([NotNull] AsylumParser.Constructor_definitionContext context)
        {
            
            // New function.
            Function fn = new Function();
            fn.Name = context.variable_type().GetText();
            fn.Scope = CTX.CurrentScope;

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
                if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Type.Variadic) { fn.Variadic = true; } // Variadic check.
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
            
        }

        // TODO!!!
        public AsylumVisitResult VisitOperator_definition([NotNull] AsylumParser.Operator_definitionContext context)
        {
            
            // New function.
            Function fn = new Function();
            fn.Name = context.variable_type().GetText();
            fn.Scope = CTX.CurrentScope;

            // Get attributes. TODO!!!
            foreach (var a in context.attribute()) {

            }

            // TODO: FIX OPERATOR!!!
            fn.Operator = context.@operator().Accept(this).Operator;
            
            // Return function.
            ExitScope();
            return new AsylumVisitResult() { Function = fn };

        }
    
    }

}