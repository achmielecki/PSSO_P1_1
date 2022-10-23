package visitor.printer;

import visitor.NumericNode;
import visitor.operator.BinaryOperatorNode;

import java.util.Stack;

public class EvaluateVisitor extends Visitor {
    private Stack<Integer> stack = new Stack<>();

    @Override
    public void visit(BinaryOperatorNode node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        int b = stack.pop();
        stack.push(node.compute(stack.pop(), b));
    }

    @Override
    public void visit(NumericNode node) {
        stack.push(node.getValue());
    }

    public int getValue() {
        return stack.pop();
    }
}
