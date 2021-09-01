using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitTypedef_definition([NotNull] AsylumParser.Typedef_definitionContext context)
        {
            CTX.CurrentScope.Types.Add(context.IDENTIFIER().GetText(), context.variable_type().Accept(this).VariableType);
            return null;
        }

        public AsylumVisitResult VisitVarTypePrimitive([NotNull] AsylumParser.VarTypePrimitiveContext context)
        {
            return context.primitives().Accept(this);
        }

        public AsylumVisitResult VisitPrimitiveString([NotNull] AsylumParser.PrimitiveStringContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.String
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveUnsigned([NotNull] AsylumParser.PrimitiveUnsignedContext context)
        {
             return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Unsigned,
                    BitWidth = uint.Parse(context.UNSIGNED().GetText().Substring(1))
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveSigned([NotNull] AsylumParser.PrimitiveSignedContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Signed,
                    BitWidth = uint.Parse(context.SIGNED().GetText().Substring(1))
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveHalf([NotNull] AsylumParser.PrimitiveHalfContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Half
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveFloat([NotNull] AsylumParser.PrimitiveFloatContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Float
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveDouble([NotNull] AsylumParser.PrimitiveDoubleContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Double
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveSignedAny([NotNull] AsylumParser.PrimitiveSignedAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.SignedAny
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveUnsignedAny([NotNull] AsylumParser.PrimitiveUnsignedAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.UnsignedAny
                }
            };
        }

        public AsylumVisitResult VisitPrimitiveFloatingAny([NotNull] AsylumParser.PrimitiveFloatingAnyContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.FloatingAny
                }
            };
        }

        public AsylumVisitResult VisitVarTypeCustom([NotNull] AsylumParser.VarTypeCustomContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Scope = CTX.CurrentScope,
                    Type = VarTypeEnum.Custom,
                    ToResolve = context.variable_or_function().Accept(this).VariableOrFunction
                }
            };
        }

        public AsylumVisitResult VisitVarTypeThis([NotNull] AsylumParser.VarTypeThisContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType() {
                    Scope = CTX.CurrentScope,
                    Type = VarTypeEnum.Custom,
                    ToResolve = CTX.Implementation.Type
                }
            };
        }

    }
    
}