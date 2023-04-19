package BinarySearchTree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] object) {
        for (int index = 0; index < object.length; index++) {
            insert(object[index]);
        }
    }

    @Override
    public boolean insert(E element) {
        if (root == null) {
            root = new TreeNode<E>(element);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null) {
                if (element.compareTo((current.element)) < 0) {
                    parent = current;
                    current = current.left;
                } else if (element.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (element.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<E>(element);
            } else {
                parent.right = new TreeNode<E>(element);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
}
