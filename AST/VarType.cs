using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitTypedef_definition([NotNull] AsylumParser.Typedef_definitionContext context)
        {
            CTX.CurrentScope.AddType(context.IDENTIFIER().GetText(), context.variable_type().Accept(this).VariableType);
            return null;
        }

        public AsylumVisitResult VisitVarTypePrimitive([NotNull] AsylumParser.VarTypePrimitiveContext context)
        {
            return context.primitives().Accept(this);
        }

        public AsylumVisitResult VisitPrimitiveFunction([NotNull] AsylumParser.PrimitiveFunctionContext context)
        {

            // Setup function type.
            int numParams = context.variable_type().Length;
            VarType ret = new VarType();
            ret.Type = VarTypeEnum.Primitive;
            ret.Primitive = Primitives.Function;

            // Get the return type.
            if (numParams == 0) {
                ret.EmbeddedType = new VarType() {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Void
                };
            } else {
                ret.EmbeddedType = context.variable_type()[0].Accept(this).VariableType;
            }

            // Get parameters if needed.
            if (numParams > 1) {
                ret.Members = new VarType[numParams - 1];
                for (int i = 0; i < numParams - 1; i++) {
                    ret.Members[i] = context.variable_type()[i + 1].Accept(this).VariableType;
                }
            } else {
                ret.Members = new VarType[0];
            }

            // Finish.
            return new AsylumVisitResult() { VariableType = ret };

        }

        public AsylumVisitResult VisitPrimitiveChar([NotNull] AsylumParser.PrimitiveCharContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Char
                }
            };
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

        public AsylumVisitResult VisitPrimitiveObject([NotNull] AsylumParser.PrimitiveObjectContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Primitive,
                    Primitive = Primitives.Object
                }
            };
        }     

        public AsylumVisitResult VisitVarTypePointer([NotNull] AsylumParser.VarTypePointerContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Pointer,
                    EmbeddedType = context.variable_type().Accept(this).VariableType
                }
            };
        }

        public AsylumVisitResult VisitVarTypeReference([NotNull] AsylumParser.VarTypeReferenceContext context)
        {
            return new AsylumVisitResult() {
                VariableType = new VarType()
                {
                    Type = VarTypeEnum.Reference,
                    EmbeddedType = context.variable_type().Accept(this).VariableType
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
                VariableType = CTX.Implementation.Type
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