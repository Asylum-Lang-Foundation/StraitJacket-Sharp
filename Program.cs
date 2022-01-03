using System;
using System.IO;
using Antlr4.Runtime;
using LLVMSharp;
using StraitJacket.AST;
using StraitJacket.Constructs;

namespace StraitJacket {
    class Program {

        // For now, this is just a very simple compiler that can only compile a file in the tests folder with only the name you feed it.
        static void Main(string[] args) {

            // For now create defeault arguments.
            if (args.Length == 0) {
                args = new string[] { "Dummy.asy" };
            }
            
            // Get flags, then compile.
            CompilationFlags flags = GetFlags(args);
            Compiler c = new Compiler();
            c.SetRootFolder(flags.RootDir);
            AddFilesToCompile(c, args);
            c.Compile(flags);

        }

        // Interpret arguments.
        public static CompilationFlags GetFlags(string[] args) {
            CompilationFlags flags = new CompilationFlags() {
                UseSTDC = true,
                UseSTDCPP = true,
                RootDir = System.Environment.CurrentDirectory + "/Tests"
            };
            return flags;
        }

        // Get additional files to compile.
        public static void AddFilesToCompile(Compiler c, string[] args) {
            // TODO!
            c.AddFile(args[0]);
        }

    }

}
