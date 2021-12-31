using System.Collections.Generic;
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
    public partial class Builder {
        Stack<IfStatementContext> IfStack = new Stack<IfStatementContext>();
        IfStatementContext CurrIf;

        // Build a code statement.
        public void Code(ICompileable statement) {
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
            IfStatementContext c = new IfStatementContext();
            CurrIf = IfStack.Pop();
            CurrStatements = c.BakStatements;

            // Build the conditional.
            CodeStatements thenBlock = c.Then;
            CodeStatements elseBlock = c.Else;
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
        
    }

}