package visitor.printer;

import visitor.NumericNode;
import visitor.operator.BinaryOperatorNode;

public class Visitor {
    public void visit(BinaryOperatorNode node) {
        throw new UnsupportedOperationException();
    }

    public void visit(NumericNode node) {
        System.out.print(node.getLabel());
    }
}
