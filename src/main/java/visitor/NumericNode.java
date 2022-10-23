package visitor;

import visitor.printer.Visitor;

public class NumericNode implements TreeNode{
    private final int value;

    public NumericNode(int value) {
        this.value = value;
    }

    @Override
    public String getLabel() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
