using System.Collections.Generic;
using System.Linq;
using StraitJacket.Constructs;

namespace StraitJacket.Builder {

    // If statement context.
    public class IfStatementContext {
        public CodeStatements BakStatements;
        public Expression Condition;
        public CodeStatements Then;
        public List<IfStatementContext> ElseIfContext = new List<IfStatementContext>();
        public CodeStatements Else;
    }

    // Asylum program builder.
    public partial class ProgramBuilder {
        Stack<IfStatementContext> IfStack = new Stack<IfStatementContext>();
        Stack<CodeStatements> LoopStack = new Stack<CodeStatements>();
        IfStatementContext CurrIf;

        // Build a code statement.
        public void Code(ICompileable statement) {
            if (CurrStatements == null) throw new System.Exception("Can not have top-level statements across multiple files!");
            CurrStatements.Statements.Add(statement);
        }

        // Start an if statement.
        public void BeginIf(Expression condition) {

            // Push the if statement, then set the condition, code statements, and then start writing then.
            IfStack.Push(CurrIf);
            CurrIf = new IfStatementContext();
            CurrIf.BakStatements = CurrStatements;
            CurrIf.Condition = condition;
            CurrIf.Then = new CodeStatements();
            CurrStatements = CurrIf.Then;

        }

        // An else if statement.
        public void ElseIf(Expression condition) {
            if (IfStack.Count <= 0) throw new System.Exception("Can't else if to an if statement while not in one!");

            // Create a new else if block and write to its then block.
            IfStatementContext elif = new IfStatementContext();
            elif.Condition = condition;
            elif.Then = new CodeStatements();
            CurrStatements = elif.Then;
            CurrIf.ElseIfContext.Add(elif);

        }

        // Else statement.
        public void Else() {
            if (IfStack.Count <= 0) throw new System.Exception("Can't else an if statement while not in one!");

            // Write to the else block.
            CurrIf.Else = new CodeStatements();
            CurrStatements = CurrIf.Else;

        }

        // End an if statement.
        public void EndIf() {
            if (IfStack.Count <= 0) throw new System.Exception("Can't end an if statement while not in one!");

            // Fix the stack.
            IfStatementContext c = CurrIf;
            CurrStatements = c.BakStatements;
            CurrIf = IfStack.Pop();

            // Build the conditional.
            CodeStatements thenBlock = c.Then;
            CodeStatements elseBlock = c.Else;
            c.ElseIfContext.Reverse();
            foreach (var elif in c.ElseIfContext) {
                var bakElse = elseBlock;
                elseBlock = new CodeStatements();
                elseBlock.Statements.Add(new Condition(
                    elif.Condition,
                    elif.Then,
                    bakElse
                ));
            }
            CurrStatements.Statements.Add(new Condition(
                c.Condition,
                thenBlock,
                elseBlock
            ));

        }

        // Start a loop.
        public void BeginLoop() {
            LoopStack.Push(CurrStatements);
            CurrStatements = new CodeStatements();
        }

        // End a loop.
        public void EndLoop() {
            if (LoopStack.Count <= 0) throw new System.Exception("Can't end a loop while not in one!");
            Loop l = new Loop(CurrStatements);
            CurrStatements = LoopStack.Pop();
            Code(l);
        }

        // Start a while loop.
        public void BeginWhileLoop(Expression condition) {
            BeginLoop();
            BeginIf(condition);
            Else();
            Code(new Break(1));
            EndIf();
        }

        // End a while loop.
        public void EndWhileLoop() {
            EndLoop();
        }

        // Start a do while loop.
        public void BeginDoWhileLoop() {
            BeginLoop();
        }

        // End a do while loop.
        public void EndDoWhileLoop(Expression condition) {
            BeginIf(condition);
            Else();
            Code(new Break(1));
            EndIf();
            EndLoop();
        }

        // Start a for loop.
        public void BeginForLoop(ICompileable statement, Expression condition) {
            if (statement != null) Code(statement);
            BeginLoop();
            if (condition != null) {
                BeginIf(condition);
                Else();
                Code(new Break(1));
                EndIf();
            }
        }

        // End a for loop.
        public void EndForLoop(Expression after) {
            if (after != null) Code(after);
            EndLoop();
        }

        // Multiple expressions.
        public ExpressionComma Multiple(params Expression[] expressions) {
            return new ExpressionComma(expressions.ToList());
        }
        
    }

}