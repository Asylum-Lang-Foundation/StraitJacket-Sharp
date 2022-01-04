using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacketLib.Builder;
using StraitJacketLib.Constructs;

namespace Asylum.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {
        public ProgramBuilder Builder = new ProgramBuilder();

        public AsylumVisitResult VisitInit([NotNull] AsylumParser.InitContext context)
        {
            for (int i = 0; i < context.universal_statement().Length; i++) {
                context.universal_statement()[i].Accept(this);
            }
            return null;
        }

        public AsylumVisitResult VisitUniversalExternFunction([NotNull] AsylumParser.UniversalExternFunctionContext context)
        {
            var ret = context.extern_function_definition().Accept(this);
            return ret;
        }

        public AsylumVisitResult VisitUniversalFunction([NotNull] AsylumParser.UniversalFunctionContext context)
        {
            var ret = context.function_definition().Accept(this);
            return ret;
        }

        public AsylumVisitResult VisitUniversalTypedef([NotNull] AsylumParser.UniversalTypedefContext context)
        {
            return context.typedef_definition().Accept(this);
        }

        public AsylumVisitResult VisitUniversalStruct([NotNull] AsylumParser.UniversalStructContext context)
        {
            return context.struct_definition().Accept(this);
        }

        public AsylumVisitResult VisitUniversalImplementation([NotNull] AsylumParser.UniversalImplementationContext context)
        {
            throw new System.NotImplementedException();
            /*
            if (CTX.VisitMode != Compiler.VisitMode.GetCode) return null;
            var ret = context.implementation_definition().Accept(this);
            CTX.CurrentAST.Universals.Add(ret.Implementation);
            return ret;*/
        }

        public AsylumVisitResult VisitUniversalTopLevelCode([NotNull] AsylumParser.UniversalTopLevelCodeContext context)
        {
            context.code_statement().Accept(this);
            return null;
        }

    }

}