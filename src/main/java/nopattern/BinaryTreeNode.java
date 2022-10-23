package nopattern;
//Tree node that contains two children

import java.util.Objects;

public class BinaryTreeNode extends TreeNode {

    public BinaryTreeNode(String label) {
        super(label);
        left = right = null;
    }

    public BinaryTreeNode(String label, TreeNode left, TreeNode right) {
        super(label);
        this.left = left;
        this.right = right;
    }


    public void inFixPrint() {
        if (!Objects.isNull(left))
            left.inFixPrint();
        System.out.print(label);
        if (!Objects.isNull(right))
            right.inFixPrint();
    }

    @Override
    public void preFixPrint() {
        System.out.print(label);
        if (!Objects.isNull(left)) {
            left.preFixPrint();
        }
        if (!Objects.isNull(right))
            right.preFixPrint();
    }

    @Override
    public void postFixPrint() {
        if (!Objects.isNull(left))
            left.postFixPrint();
        if (!Objects.isNull(right))
            right.postFixPrint();
        System.out.print(label);
    }

    @Override
    public Double evaluate() {
        return switch (label) {
            case "*" -> left.evaluate() * right.evaluate();
            case "/" -> left.evaluate() / right.evaluate();
            case "+" -> left.evaluate() + right.evaluate();
            case "-" -> left.evaluate() - right.evaluate();
            case "%" -> left.evaluate() % right.evaluate();
            default -> 0d;
        };
    }

    private TreeNode left, right;

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}