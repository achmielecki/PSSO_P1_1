package nopattern;
//Define tree element with no children

public class SimpleTreeNode extends TreeNode {

    public SimpleTreeNode(String label) {
        super(label);
    }

    public void inFixPrint() {
        System.out.print(label);
    }

    @Override
    public void preFixPrint() {
        System.out.print(label);
    }

    @Override
    public void postFixPrint() {
        System.out.print(label);
    }

    @Override
    public Double evaluate() {
        return Double.valueOf(label);
    }

    @Override
    public TreeNode getRight() {
        return null;
    }

    @Override
    public TreeNode getLeft() {
        return null;
    }

}