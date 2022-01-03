using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace StraitJacketLib {

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

        // Current file name.
        public static string CurrentFileName = "NULL FILE";

        // Warnings.
        public enum Warnings {
            Unknown
        }

        // Errors.
        public enum Errors {
            InvalidSyntax,
            NotImplemented,
            MultipleTopLevelStatements,
            MainWithTopLevelStatements
        }

        // Warning IDs.
        public static readonly Dictionary<Warnings, string> WarningIds = new Dictionary<Warnings, string>() {
            { Warnings.Unknown, "???" }
        };
        
        // Error IDs.
        public static readonly Dictionary<Errors, string> ErrorIds = new Dictionary<Errors, string>() {
            { Errors.InvalidSyntax, "Invalid Syntax - You can't write code that doesn't follow the syntactical guidelines, that's insane!" },
            { Errors.NotImplemented, "Not Implemented - In an ironic twist of fate, there's something wrong with the compiler. We're insane!" },
            { Errors.MultipleTopLevelStatements, "Multiple Files With Top Level Statements - Only one file compiled can have top-level statements, otherwise how would we know where it begins? That's insane!" },
            { Errors.MainWithTopLevelStatements, "Main With Top Level Statements - You can't define a main entrypoint if top level statements exist, as the top level statements are the main entrypoint! This redefinition is insane!" }
        };

        // Throw warning.
        public static void ThrowWarning(Warnings warningNum, FileContext context) {
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("WARNING: " + WarningIds[warningNum] + " - \"" + context.Context + "\" In " + context.FileName + ", Line " + context.LineNum + ":" + context.ColumnNum + ".");
            Console.ForegroundColor = ConsoleColor.White;
        }

        // Throw error.
        public static void ThrowError(Errors errorNum, FileContext context) {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("ERROR: " + ErrorIds[errorNum]);
            Console.WriteLine("\t\"" + context.Context + "\" In " + context.FileName + ", Line " + context.LineNum + ":" + context.ColumnNum + ".");
            Console.ForegroundColor = ConsoleColor.White;
            Valid = false;
            if (Debugger.IsAttached) {
                throw new Exception("ERROR ENCOUNTERED!!!");
            }
        }

    }

}