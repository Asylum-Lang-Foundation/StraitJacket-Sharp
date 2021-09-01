using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Code statement type.
    public enum CodeStatementType {
        FunctionCall,
        ReturnStatement,
        VariableDeclaration,
        VariableAssignment
    }

    // Code statements.
    public class CodeStatements {
        public List<CodeStatement> Statements = new List<CodeStatement>();

        public void ResolveVariables() {
            foreach (var c in Statements) {
                c.ResolveVariables();
            }
        }

        public void ResolveCalls() {
            foreach (var c in Statements) {
                c.ResolveCalls();
            }
        }

        public void ResolveTypes() {
            foreach (var c in Statements) {
                c.ResolveTypes();
            }
        }

        // TODO: RETURN TYPE MECHANISM!!!
        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, bool expectReturn = false) {
            foreach (var s in Statements) {
                s.Compile(mod, builder);
            }
            return expectReturn ? builder.BuildRetVoid() : null;
        }
    }

    // Code statement.
    public class CodeStatement {
        public CodeStatementType Type;
        public FunctionCall FunctionCall;
        public ReturnStatement ReturnStatement;
        public VariableDefinition VariableDefinition;
        public VariableAssignment VariableAssignment;

        public void ResolveVariables() {
            switch (Type) {
                case CodeStatementType.FunctionCall:
                    FunctionCall.ResolveVariables();
                    break;
                case CodeStatementType.ReturnStatement:
                    ReturnStatement.ResolveVariables();
                    break;
                case CodeStatementType.VariableDeclaration:
                    VariableDefinition.ResolveVariables();
                    break;
                case CodeStatementType.VariableAssignment:
                    VariableAssignment.ResolveVariables();
                    break;
            }
        }

        public void ResolveCalls() {
            switch (Type) {
                case CodeStatementType.FunctionCall:
                    FunctionCall.ResolveCalls();
                    break;
                case CodeStatementType.ReturnStatement:
                    ReturnStatement.ResolveCalls();
                    break;
                case CodeStatementType.VariableDeclaration:
                    VariableDefinition.ResolveCalls();
                    break;
                case CodeStatementType.VariableAssignment:
                    VariableAssignment.ResolveCalls();
                    break;
            }
        }

        public void ResolveTypes() {
            switch (Type) {
                case CodeStatementType.FunctionCall:
                    FunctionCall.ResolveTypes();
                    break;
                case CodeStatementType.ReturnStatement:
                    ReturnStatement.ResolveTypes();
                    break;
                case CodeStatementType.VariableDeclaration:
                    VariableDefinition.ResolveTypes();
                    break;
                case CodeStatementType.VariableAssignment:
                    VariableAssignment.ResolveTypes();
                    break;
            }
        }

        public void Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            switch (Type) {
                case CodeStatementType.FunctionCall:
                    FunctionCall.Compile(mod, builder);
                    return;
                case CodeStatementType.VariableDeclaration:
                    VariableDefinition.Compile(mod, builder);
                    return;
                case CodeStatementType.VariableAssignment:
                    VariableAssignment.Compile(mod, builder);
                    break;
            }
        }
    }

    // Call a function.
    public class FunctionCall {
        public Scope Scope;
        public bool Await;
        public VariableOrFunction Function;
        public Function ResolvedFunction;
        // TODO: GENERICS.
        // TODO: LABELS.
        public List<Expression> Parameters = new List<Expression>();

        public void ResolveCalls() {
            ResolvedFunction = Scope.ResolveFunction(Function);
            foreach (var p in Parameters) {
                p.ResolveCalls();
            }
        }

        public void ResolveVariables() {
            foreach (var p in Parameters) {
                p.ResolveVariables();
            }
        }

        public void ResolveTypes() {
            foreach (var p in Parameters) {
                p.ResolveTypes();
            }
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            if (ResolvedFunction.Equals(AsyLLVM.Function)) {
                return AsyLLVM.CompileCall(mod, builder, Parameters);
            }
            if (!ResolvedFunction.Compiled) ResolvedFunction.Compile(mod, builder);
            LLVMValueRef[] args = new LLVMValueRef[Parameters.Count];
            for (int i = 0; i < Parameters.Count; i++) {
                args[i] = Parameters[i].Compile(mod, builder);
            }
            if (ResolvedFunction.Inline) {
                return ResolvedFunction.Definition.Compile(mod, builder);
            } else {
                return builder.BuildCall(ResolvedFunction.LLVMVal, args, "");
            }
        }
    }

    // Return statement.
    public class ReturnStatement {
        public Expression ReturnValue;

        public void ResolveCalls() {
            ReturnValue.ResolveCalls();
        }

        public void ResolveVariables() {
            ReturnValue.ResolveVariables();
        }

        public void ResolveTypes() {
            ReturnValue.ResolveTypes();
        }

    }

    // Variable definition.
    public class VariableDefinition {
        public List<Variable> Variables = new List<Variable>();
        public Expression Definition;

        public void ResolveCalls() {
            Definition.ResolveCalls();
        }

        public void ResolveVariables() {
            Definition.ResolveVariables();
        }

        public void ResolveTypes() {
            Definition.ResolveTypes();
        }

        public void Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            LLVMValueRef expr = Definition.Compile(mod, builder);
            foreach (var v in Variables) {
                v.LLVMValue = builder.BuildAlloca(v.Type.GetLLVMType(), v.Name);
                LLVMValueRef toStore = expr;
                LLVMTypeRef varType = v.Type.GetLLVMType();
                if (varType.Kind == LLVMTypeKind.LLVMIntegerTypeKind) {
                    if (expr.TypeOf.Kind == LLVMTypeKind.LLVMIntegerTypeKind) {
                        if (expr.TypeOf.IntWidth < varType.IntWidth) {
                            toStore = builder.BuildZExt(toStore, LLVMTypeRef.CreateInt(varType.IntWidth));
                            // TODO: SIGN!!! ALSO MOVE TO DEDICATED CASTING SECTION!
                        } else if (expr.TypeOf.IntWidth > varType.IntWidth) {
                            toStore = builder.BuildTrunc(toStore, LLVMTypeRef.CreateInt(varType.IntWidth));
                        }
                    }
                }
                builder.BuildStore(toStore, v.LLVMValue);
            }
        }

    }

    // Variable assignment.
    public class VariableAssignment {
        public List<VariableOrFunction> Variables = new List<VariableOrFunction>();
        public List<Variable> ResolvedVariables = new List<Variable>();
        public Operators AssignmentOperator;
        public Expression Definition;

        public void ResolveCalls() {
            Definition.ResolveCalls();
        }

        public void ResolveVariables() {
            Definition.ResolveVariables();
            foreach (var v in Variables) {
                ResolvedVariables.Add(v.ResolveVariable());
            }
        }

        public void ResolveTypes() {
            Definition.ResolveTypes();
        }

        public void Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            throw new System.Exception("AHHHHHHHHHHHHHHHHHH");
        }
        
    }

}