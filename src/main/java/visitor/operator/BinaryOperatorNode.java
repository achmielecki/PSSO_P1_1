package visitor.operator;

import visitor.TreeNode;
import visitor.printer.Visitor;

public class BinaryOperatorNode implements TreeNode {
    private final TreeNode left;
    private final TreeNode right;

    protected BinaryOperatorNode() {
        left = right = null;
    }

    protected BinaryOperatorNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getLabel() {
        throw new RuntimeException("xd");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int compute(int a, int b) {
        throw new RuntimeException("xd");
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
