using StraitJacketLib.Constructs;

namespace StraitJacketLib.Builder { 

    // Asylum program builder.
    public partial class ProgramBuilder {
        string CurrFile = null;
        string TopLevelFile;
        Constructs.AST AST = null;

        // Start appending to a source file.
        public void BeginFile(string sourcePath) {
            if (CurrFile != null) throw new System.Exception("Can't begin file: " + sourcePath + " has not been closed.");
            if (!ASTs.ContainsKey(sourcePath)) {
                ASTs.Add(sourcePath, new Constructs.AST());
            }
            AST = ASTs[sourcePath];
            CurrFile = sourcePath;
        }

        // Stop appending to a source file.
        public void EndFile() {
            FileCheck();
            if (TopLevel.Statements.Count > 0) { // Do not allow top-level statements across multiple files.
                CurrStatements = null;
                TopLevelFile = CurrFile;
            }
            CurrFile = null;
            AST = null;
        }

        // Check the file.
        private void FileCheck() {
            if (AST == null) {
                throw new System.Exception("There is currently no file open!");
            }
        }

    }

}