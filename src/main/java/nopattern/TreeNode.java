package nopattern;//abstract superclass of tree element types

public abstract class TreeNode {

    protected TreeNode(String label) {
        this.label = label;
    }

    public abstract void inFixPrint();

    public abstract void preFixPrint();

    public abstract void postFixPrint();

    public abstract Double evaluate();

    public abstract TreeNode getRight();

    public abstract TreeNode getLeft();

    protected String label;
}