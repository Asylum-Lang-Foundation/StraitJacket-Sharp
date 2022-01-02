using StraitJacket.Constructs;

namespace StraitJacket.Builder { 

    // Asylum program builder.
    public partial class Builder {
        string CurrFile = null;
        Constructs.AST AST = null;

        // Start appending to a source file.
        public void BeginFile(string sourcePath) {
            if (CurrFile != null) throw new System.Exception("Can't begin file: " + sourcePath + " has not been closed.");
            CurrFile = sourcePath;
            if (!ASTs.ContainsKey(sourcePath)) {
                ASTs.Add(sourcePath, new Constructs.AST());
            }
            AST = ASTs[sourcePath];
        }

        // Stop appending to a source file.
        public void EndFile() {
            FileCheck();
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