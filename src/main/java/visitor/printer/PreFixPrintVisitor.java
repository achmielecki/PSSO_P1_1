package visitor.printer;

import visitor.operator.BinaryOperatorNode;

public class PreFixPrintVisitor extends Visitor {

    @Override
    public void visit(BinaryOperatorNode node) {
        System.out.print(node.getLabel());
        node.getLeft().accept(this);
        node.getRight().accept(this);
    }
}
