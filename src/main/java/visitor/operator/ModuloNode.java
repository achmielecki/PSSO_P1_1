package visitor.operator;

import visitor.TreeNode;

public class ModuloNode extends BinaryOperatorNode {

    public ModuloNode(TreeNode left, TreeNode right) {
        super(left, right);
    }

    @Override
    public String getLabel() {
        return "%";
    }

    @Override
    public int compute(int a, int b) {
        return a % b;
    }
}
