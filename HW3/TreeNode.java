public class TreeNode<T>{
    T value;
    TreeNode<T> left;
    TreeNode<T> right;
    private TreeNode<T> parent;

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public TreeNode(T value){
        this.value = value;
    }
    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right){
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public boolean isLeaf() {
        return left == null && right == null;
    }
    public boolean isRoot() {
        return parent == null;
    }
}