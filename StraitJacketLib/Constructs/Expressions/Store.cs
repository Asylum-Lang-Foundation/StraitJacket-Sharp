using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Store a value somewhere. Operates different depending on how many values are returned.
    public class ExpressionStore : Expression {
        public Expression Src;
        public Expression Dest;

        public ExpressionStore(Expression src, Expression dest) {
            Src = src;
            Dest = dest;
        }

        public override void ResolveVariables() {
            Src.ResolveVariables();
            Dest.ResolveVariables();
        }

        public override void ResolveTypes() {

            // Resolve types.
            LValue = false;
            Src.ResolveTypes();
            Dest.ResolveTypes();

            // Exact match.
            if (Src.ReturnType().Equals(Dest.ReturnType())) {
                // Good!
            }
            
            // Add an implicit cast.
            else if (Src.ReturnType().CanImplicitlyCastTo(Dest.ReturnType())) {
                ExpressionCast cast = new ExpressionCast(Src, Dest.ReturnType());
                Src = cast;
                Src.ResolveTypes();
            }
            
            // Can not convert...
            else {
                throw new System.Exception("NONMATCHING RETURN TYPES!!!");
            }

        }

        // A store operation has no return type.
        public override VarType GetReturnType() {
            return new VarTypeSimplePrimitive(SimplePrimitives.Void);
        }

        // We pass on the source to the next expression on the left. An example is `u32 a = u32 b = 7;` We are b here.
        public override bool IsPlural() {
            return Src.IsPlural();
        }

        // We pass on the value from the source to the destination. Now we are b.
        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            Dest.StoreSingle(src, dest, srcType, destType, mod, builder, param);
        }

        // We pass on the value from the source to the destination. Now we are b.
        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            Dest.StorePlural(src, dest, srcType, destType, mod, builder, param);
        }

        // Compile the store, but return nothing.
        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            
            // Get the values from the source and destination.
            ReturnValue src = Src.Compile(mod, builder, param);
            if (Src.LValue) src = new ReturnValue(builder.BuildLoad(src.Val, "SJ_LoadVal"));
            ReturnValue dest = Dest.Compile(mod, builder, param);

            // How does one do this?
            // u32 a = 5;                   Dest = Variable, Src = ConstInt
            // u32 a = b;                   Dest = Variable, Src = Variable
            // (u32, s8) tmp = 5, -1;       Dest = Variable, Src = Comma
            // u32 a, s8 b = 5, =1;         Dest = Comma, Src = Comma
            // *(((u32, s8)*)&5) = 2, 1;    Dest = Dereference, Src = Comma
            
            // Answer- function to determine if an expression results in a singular or plural value.
            // Each expression type must have a function to store singular or plural values.

            // Now using the plurality method:
            // u32 a = 5;                   Dest = Singular, Src = Singular
            // u32 a = b;                   Dest = Singular, Src = Singular
            // (u32, s8) tmp = 5, -1;       Dest = Singular, Src = Plural
            // u32 a, s8 b = 5, =1;         Dest = Plural, Src = Plural
            // *(((u32, s8)*)&5) = 2, 1;    Dest = Singular, Src = Plural
            // We can see that the simplification works for any combination of expressions.

            // Use plurality.
            bool srcPlural = Src.IsPlural();
            if (srcPlural) {
                Dest.StorePlural(src, dest, Src.ReturnType(), Dest.ReturnType(), mod, builder, param);
            } else {
                Dest.StoreSingle(src, dest, Src.ReturnType(), Dest.ReturnType(), mod, builder, param);
            }

            // Finish the return.
            return null;
            
        }
        
    }

}