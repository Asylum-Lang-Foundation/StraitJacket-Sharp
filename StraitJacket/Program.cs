using System;
using System.IO;
using LLVMSharp;
using Asylum;
using Asylum.AST;
using StraitJacketLib.Constructs;

namespace StraitJacket {
    class Program {

        // For now, this is just a very simple compiler that can only compile a file in the tests folder with only the name you feed it.
        static void Main(string[] args) {

            // For now create defeault arguments.
            if (args.Length == 0) {
                args = new string[] { "Dummy.asy" };
            }
            
            // Get flags, then compile.
            AsylumCompilationFlags flags = GetFlags(args);
            AsylumCompiler c = new AsylumCompiler();
            c.SetRootFolder(flags.RootDir);
            AddFilesToCompile(c, args);
            c.Compile(flags);

        }

        // Interpret arguments.
        public static AsylumCompilationFlags GetFlags(string[] args) {
            AsylumCompilationFlags flags = new AsylumCompilationFlags() {
                UseSTDC = true,
                UseSTDCPP = true,
                RootDir = System.Environment.CurrentDirectory + "/Tests"
            };
            return flags;
        }

        // Get additional files to compile.
        public static void AddFilesToCompile(AsylumCompiler c, string[] args) {
            // TODO!
            c.AddFile(args[0]);
        }

    }

}
