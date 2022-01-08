using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Comma operator, which separates and returns multiple expressions.
    public class ExpressionComma : Expression {
        public List<Expression> Expressions;
        private VarType RetType;

        // Construct a comma expression given a list of expressions, and automatically split commas.
        public ExpressionComma(List<Expression> expressions) {
            Type = ExpressionType.Comma;
            Expressions = new List<Expression>();
            foreach (var e in expressions) {
                if (e.Type == ExpressionType.Comma) {
                    Expressions.AddRange((e as ExpressionComma).Expressions);
                } else {
                    Expressions.Add(e);
                }
            }
        }

        // Just resolve variables for internal expressions.
        public override void ResolveVariables() {
            foreach (var e in Expressions) {
                e.ResolveVariables();
            }
        }

        // Resolve types for internal expressions, and figure out the return type.
        public override void ResolveTypes() {
            List<VarType> memberTypes = new List<VarType>();
            foreach (var e in Expressions) {
                e.ResolveTypes();
                memberTypes.Add(e.ReturnType());
            }
            RetType = new VarTypeTuple(memberTypes);
        }

        // Get the return type.
        public override VarType GetReturnType() {
            return RetType;
        }

        // A comma expression always returns multiple values.
        public override bool IsPlural() {
            return true;
        }

        // Store a single value into the tuple. This means we are splitting a tuple into distinct parts.
        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            
            // Let us think of the following example:
            // u32, (string, u8) a = 7, ("h", 3);
            // u32 b;
            // string, u8 c;
            // b, c = a;
            // We are interested in the bottom expression here.

            // In this case:
            // Dest - Multiple expression values.
            // Src - A single value that we can load tuple data from.
            
            // Iterate for every expression.
            for (int i = 0; i < Expressions.Count; i++) {
            
                // Get the element from "a", and get the pointer of where to store.
                ReturnValue element = src.Rets[i];
                LLVMValueRef storeArea = builder.BuildStructGEP(dest.Val, (uint)i, "SJ_GetTupleElement" + i + "Ptr");

                // Case 1: The element is a single value (like the "7" in a).
                if (element.ReturnType == ReturnValueType.Value) {

                    // Now all we have to do is get the ptr to the elent index to store, and store it.
                    builder.BuildStore(element.Val, storeArea);

                }

                // Case 2: Element has more tuples.
                else {
                    throw new System.NotImplementedException();
                }

            }

        }

        // Store each value of a tuple into a corresponding part.
        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException();
        }

        // Compile the internal expressions, and add them to the return value.
        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            List<ReturnValue> rets = new List<ReturnValue>();
            foreach (var e in Expressions) {
                var val = e.Compile(mod, builder, param);
                if (e.LValue) val = new ReturnValue(builder.BuildLoad(val.Val, "SJ_LoadVal")); // Load if needed as with all L values.
                rets.Add(val);
            }
            return new ReturnValue(rets);
        }

        public override string ToString() {
            string ret = "(";
            foreach (var e in Expressions) {
                ret += e.ToString();
                if (e != Expressions.Last()) {
                    ret += ", ";
                }
            }
            return ret + ")";
        }

    }

}