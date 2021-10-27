using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

/*

    Expressions:
        So there are many different types of expressions that can be created.
        The purpose of this file is to control the contruction, evaluation, and compilation of these.
    
    Expression Types:

        String:
            Purpose: Global string data value to convert into a global string pointer.
            Val: Compiler "string" type.

*/

namespace StraitJacket.Constructs {

    // Variable or function.
    public class VariableOrFunction {
        public string Path;
        public Scope Scope;

        public Function ResolveFunction() {
            return Scope.ResolveFunction(this);
        }

        public Variable ResolveVariable() {
            return Scope.ResolveVariable(this);
        }
        
    }

    public class Cast : ICompileable {
        public bool Implicit;
        public VarType DestType;
        public Expression ToCast;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            ToCast.ResolveVariables();
        }

        public void ResolveTypes() {
            ToCast.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            LLVMValueRef expr = ToCast.Compile(mod, builder, param);
            if (ToCast.EvaluatesTo.Type == VarTypeEnum.Primitive && ToCast.EvaluatesTo.Primitive == Primitives.Object) {
                return expr; // Do nothing and hope it works.
            } else if (ToCast.EvaluatesTo.Type == VarTypeEnum.Primitive && (ToCast.EvaluatesTo.Primitive == Primitives.Unsigned || ToCast.EvaluatesTo.Primitive == Primitives.Signed)) {
                if (DestType.Type == VarTypeEnum.Primitive && (DestType.Primitive == Primitives.Unsigned || DestType.Primitive == Primitives.Signed)) {
                    if (DestType.BitWidth < ToCast.EvaluatesTo.BitWidth) {

                    } else if (DestType.BitWidth > ToCast.EvaluatesTo.BitWidth && ToCast.EvaluatesTo.Primitive == Primitives.Unsigned) {
                        return builder.BuildZExt(expr, DestType.GetLLVMType());
                    }
                }
            }
            throw new System.Exception("AHHHHHHH");
        }

    }

    // Value types.
    public enum ExpressionType {
        String,
        Integer,
        Variable,
        UnknownFunctionCall,
        Cast,
        EvaluatedFunctionCall,
        Assignment,
        Comma
    }

    // Operator.
    public enum Operator {
        Add,
        Sub,
        Mul,
        Div,
        Mod,
        Exp,
        Range,
        BitAnd,
        BitOr,
        BitXor,
        BitNot,
        LShift,
        RShift,
        Pos,
        Neg,
        Inc,
        Dec,
        Member,
        Dereference,
        AddressOf,
        AsAddress,
        And,
        Or,
        Nand,
        Nor,
        Not,
        Eq,
        Neq,
        Gt,
        Lt,
        Ge,
        Le,
        Cond,
        Null,
        Comma,
        AssignAdd,
        AssignSub,
        AssignMul,
        AssignDiv,
        AssignMod,
        AssignExp,
        AssignBitAnd,
        AssignBitOr,
        AssignBitXor,
        AssignBitNot,
        AssignLShift,
        AssignRShift,
        AssignCond,
        AssignNull,
        AssignEq
    }

    // Context for resolution.
    public class TypeResolutionContext {
        public VarType PreferredType; // What the expression is in total.
        public List<VarType> OtherRelations = new List<VarType>(); // What the other operand's types is to choose.

        // Given a list of possible types to choose from, choose the one that matches. May return null.
        public VarType ChooseType(List<VarType> options) {

            // Match count.
            int matchCount = 0;
            VarType lastMatch = null;

            // Try for exact match.
            foreach (var t in OtherRelations) {
                foreach (var o in options) {
                    if (t.Equals(o)) {
                        matchCount++;
                        lastMatch = t;
                    }
                }
            }

            // Check for ambiguity.
            if (matchCount > 1) return null;
            else if (matchCount == 1) return lastMatch;

            // Ok, no takers, try to see if casting is an option.
            foreach (var t in OtherRelations) {
                foreach (var o in options) {
                    if (o.CanImplicitlyCastTo(t)) {
                        matchCount++;
                        lastMatch = t;
                    }
                }
            }

            // Check for ambiguity.
            if (matchCount > 1) return null;
            else if (matchCount == 1) return lastMatch;

            // No types matched, so go by the preferred type.
            foreach (var o in options) {
                if (o.CanImplicitlyCastTo(PreferredType)) {
                    return o;
                }
            }

            // Don't know what to choose.
            return null;

        }

    }

    // For resolving expressions.
    public class ExpressionResolutionContext {
        
    }

    // Expression. TODO: Improve how context is shared throughout expressions.
    public abstract class Expression : ICompileable {
        public ExpressionType Type;
        public ExpressionResolutionContext Ctx;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        // Vfunctions.
        public virtual void ResolveVariables() {}
        public virtual void ResolveTypes() {}
        public abstract VarType ReturnType();
        public abstract ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param);
        
    }

}