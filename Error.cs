using System;
using System.Collections.Generic;
using System.Diagnostics;
using Antlr4.Runtime;

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

        // Current file name.
        public static string CurrentFileName = "NULL FILE";

        // Warnings.
        public enum Warnings {
            Unknown
        }

        // Errors.
        public enum Errors {
            InvalidSyntax,
            NotImplemented
        }

        // Warning IDs.
        public static readonly Dictionary<Warnings, string> WarningIds = new Dictionary<Warnings, string>() {
            { Warnings.Unknown, "???" }
        };
        
        // Error IDs.
        public static readonly Dictionary<Errors, string> ErrorIds = new Dictionary<Errors, string>() {
            { Errors.InvalidSyntax, "Invalid Syntax - You can't write code that doesn't follow the syntactical guidelines, that's insane!" },
            { Errors.NotImplemented, "Not Implemented - In an ironic twist of fate, there's something wrong with the compiler. We're insane!" }
        };

        // Fetch a context.
        public static FileContext GetFileContext(ParserRuleContext context) {
            FileContext ret = new FileContext();
            ret.ColumnNum = context.Start.Column;
            ret.LineNum = context.Start.Line;
            ret.Context = context.GetText();
            ret.FileName = CurrentFileName;
            return ret;
        }

        // Throw warning.
        public static void ThrowWarning(Warnings warningNum, FileContext context) {
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("WARNING: " + WarningIds[warningNum] + " - \"" + context.Context + "\" In " + context.FileName + ", Line " + context.LineNum + ":" + context.ColumnNum + ".");
            Console.ForegroundColor = ConsoleColor.White;
        }

        // Throw warning.
        public static void ThrowWarning(Warnings warningNum, ParserRuleContext context) {
            ThrowWarning(warningNum, GetFileContext(context));
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

        // Throw error.
        public static void ThrowError(Errors errorNum, ParserRuleContext context) {
            ThrowError(errorNum, GetFileContext(context));
        }

    }

}