package visitor;

import visitor.printer.Visitor;

public interface TreeNode {
    String getLabel();
    void accept(Visitor visitor);
}