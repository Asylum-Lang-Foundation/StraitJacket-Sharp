using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitTypedef_definition([NotNull] AsylumParser.Typedef_definitionContext context)
        {
            Builder.Typedef(context.variable_type().Accept(this).VariableType, context.IDENTIFIER().GetText());
            return null;
        }

        public AsylumVisitResult VisitStruct_definition([NotNull] AsylumParser.Struct_definitionContext context)
        {
            List<VarType> members = new List<VarType>(); // NOT WORKING!!!
            foreach (var e in context.struct_entry()) {
                e.Accept()
            }
            CTX.CurrentScope.AddType(context.IDENTIFIER().GetText(), new VarTypeStruct(
                CTX.CurrentScope,
                context.IDENTIFIER().GetText(),
                members
            ));
        }

        public AsylumVisitResult VisitVarTypePrimitive([NotNull] AsylumParser.VarTypePrimitiveContext context)
        {
            return context.primitives().Accept(this);
        }

        public AsylumVisitResult VisitPrimitiveFunction([NotNull] AsylumParser.PrimitiveFunctionContext context)
        {

            // Setup function type.
            int numParams = context.variable_type().Length;
            VarType ret = null;
            List<VarType> members = new List<VarType>();

            // Get the return type.
            if (numParams == 0) {
                ret = new VarTypeSimplePrimitive(SimplePrimitives.Void);
            } else {
                ret = context.variable_type()[0].Accept(this).VariableType;
            }

            // Get parameters if needed.
            if (numParams > 1) {
                for (int i = 0; i < numParams - 1; i++) {
                    members.Add(context.variable_type()[i + 1].Accept(this).VariableType);
                }
            }

            // Finish.
            return new AsylumVisitResult() { VariableType = new VarTypeFunction(ret, members) };

        }

        public AsylumVisitResult VisitPrimitiveChar([NotNull] AsylumParser.PrimitiveCharContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.Char)
            };
        }

        public AsylumVisitResult VisitPrimitiveString([NotNull] AsylumParser.PrimitiveStringContext context)
        {
            // TEMPORARY!!!
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.ConstString)
            };
        }

        public AsylumVisitResult VisitPrimitiveUnsigned([NotNull] AsylumParser.PrimitiveUnsignedContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeInteger(false, uint.Parse(context.UNSIGNED().GetText().Substring(1)))
            };
        }

        public AsylumVisitResult VisitPrimitiveSigned([NotNull] AsylumParser.PrimitiveSignedContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeInteger(true, uint.Parse(context.SIGNED().GetText().Substring(1)))
            };
        }

        public AsylumVisitResult VisitPrimitiveHalf([NotNull] AsylumParser.PrimitiveHalfContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.Half)
            };
        }

        public AsylumVisitResult VisitPrimitiveFloat([NotNull] AsylumParser.PrimitiveFloatContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.Float)
            };
        }

        public AsylumVisitResult VisitPrimitiveDouble([NotNull] AsylumParser.PrimitiveDoubleContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.Double)
            };
        }

        public AsylumVisitResult VisitPrimitiveSignedAny([NotNull] AsylumParser.PrimitiveSignedAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.SignedAny)
            };
        }

        public AsylumVisitResult VisitPrimitiveUnsignedAny([NotNull] AsylumParser.PrimitiveUnsignedAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.UnsignedAny)
            };
        }

        public AsylumVisitResult VisitPrimitiveFloatingAny([NotNull] AsylumParser.PrimitiveFloatingAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.FloatingAny)
            };
        }

        public AsylumVisitResult VisitPrimitiveObject([NotNull] AsylumParser.PrimitiveObjectContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeSimplePrimitive(SimplePrimitives.Object)
            };
        }     

        public AsylumVisitResult VisitVarTypePointer([NotNull] AsylumParser.VarTypePointerContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypePointer(context.variable_type().Accept(this).VariableType)
            };
        }

        public AsylumVisitResult VisitVarTypeReference([NotNull] AsylumParser.VarTypeReferenceContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeReference(context.variable_type().Accept(this).VariableType)
            };
        }

        public AsylumVisitResult VisitVarTypeCustom([NotNull] AsylumParser.VarTypeCustomContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarTypeCustom(context.variable_or_function().Accept(this).VariableOrFunction)
            };
        }

        public AsylumVisitResult VisitVarTypeThis([NotNull] AsylumParser.VarTypeThisContext context)
        {
            return new AsylumVisitResult() {
                VariableType = Builder.ThisType()
            };
        }

        public AsylumVisitResult VisitVarTypeConstant([NotNull] AsylumParser.VarTypeConstantContext context)
        {
            var ret = context.variable_type().Accept(this).VariableType;
            ret.Constant = true;
            return new AsylumVisitResult() { VariableType = ret };
        }

    }
    
}