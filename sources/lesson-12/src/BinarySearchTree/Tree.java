package BinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public void preorder();

    public void postorder();

    public int getSize();
}
