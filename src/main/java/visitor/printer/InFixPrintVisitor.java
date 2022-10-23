package visitor.printer;

import visitor.operator.BinaryOperatorNode;

public class InFixPrintVisitor extends Visitor {
    @Override
    public void visit(BinaryOperatorNode node) {
        node.getLeft().accept(this);
        System.out.print(node.getLabel());
        node.getRight().accept(this);
    }
}
