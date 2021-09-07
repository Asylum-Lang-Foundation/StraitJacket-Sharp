using System;
using System.Collections.Generic;

namespace StraitJacket {

    // File context.
    public class FileContext {
        public string Context;
        public string FileName;
        public int LineNum;
        public int ColumnNum;
    }

    // For error handling/warnings.
    public static class ErrorHandler {

        // Valid.
        public static bool Valid = true;

        // Warning IDs.
        public static Dictionary<int, string> WarningIds = new Dictionary<int, string>() {
            { 0, "???" }
        };
        
        // Error IDs.
        public static Dictionary<int, string> ErrorIds = new Dictionary<int, string>() {
            { 0, "Invalid Syntax - You can't write code that doesn't follow the syntactical guidelines, that's insane!" },
            { 1, "Not Implemented - In an ironic twist of fate, there's something wrong with the compiler. We're insane!" }
        };

        // Throw warning.
        public static void ThrowWarning(int warningNum, FileContext context) {
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("WARNING: " + WarningIds[warningNum] + " - \"" + context.Context + "\" In " + context.FileName + ", Line " + context.LineNum + ":" + context.ColumnNum + ".");
            Console.ForegroundColor = ConsoleColor.White;
        }

        // Throw error.
        public static void ThrowError(int errorNum, FileContext context) {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("ERROR: " + ErrorIds[errorNum]);
            Console.WriteLine("\t\"" + context.Context + "\" In " + context.FileName + ", Line " + context.LineNum + ":" + context.ColumnNum + ".");
            Console.ForegroundColor = ConsoleColor.White;
            Valid = false;
        }

    }

}