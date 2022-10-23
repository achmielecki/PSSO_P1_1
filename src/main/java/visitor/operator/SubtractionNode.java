package visitor.operator;

import visitor.TreeNode;

public class SubtractionNode extends BinaryOperatorNode {
    public SubtractionNode(TreeNode left, TreeNode right) {
        super(left, right);
    }

    @Override
    public String getLabel() {
        return "-";
    }

    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
