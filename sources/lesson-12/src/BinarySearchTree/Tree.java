package BinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public void preorder();

    public void postorder();

    public void remove(E element);

    public TreeNode<E> find(E element);

    public int getSize();
}
