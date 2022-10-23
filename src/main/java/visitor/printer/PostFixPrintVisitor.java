package visitor.printer;

import visitor.operator.BinaryOperatorNode;

public class PostFixPrintVisitor extends Visitor {
    @Override
    public void visit(BinaryOperatorNode node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        System.out.print(node.getLabel());
    }
}
