package BinarySearchTree;

import java.util.ArrayList;

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

    @Override
    public TreeNode<E> find(E element) {
        return find(element, root);
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

    protected TreeNode<E> find(E element, TreeNode<E> root) {
        if (root == null || root.element == element) {
            return root;
        } else if (root.element.compareTo(element) < 0) {
            return find(element, root.right);
        } else {
            return find(element, root.left);
        }
    }

    public TreeNode<E> findParentCurrent(E element) {
        return findParentCurrent(element, root);
    }

    protected TreeNode<E> findParentCurrent(E element, TreeNode<E> root) {
        if (root == null || root.right.element == element || root.left.element == element) {
            return root;
        } else if (root.element.compareTo(element) < 0) {
            return findParentCurrent(element, root.right);
        } else {
            return findParentCurrent(element, root.left);
        }
    }

    public boolean checkLeft(TreeNode<E> current, TreeNode<E> parent) {
        if (parent.left == current)  {
            return true;
        } else {
            return false;
        }
    }

    public TreeNode<E> findParentRightMost(TreeNode<E> current) {
        if (current.right.right == null) {
            return current;
        }
        return findParentRightMost(current.right);
    }

    public void removeNonRootNoLeft(TreeNode<E> current, TreeNode<E> parentCurrent, boolean checkLeft) {
        if (checkLeft) {
            parentCurrent.left = current.right;
        } else {
            parentCurrent.right = current.right;
        }
    }

    public void removeNonRootHaveLeft(TreeNode<E> current, TreeNode<E> parentCurrent, boolean checkLeft) {
        TreeNode<E> rightMostParent = findParentRightMost(current);
        TreeNode<E> rightMost = rightMostParent.right;
        TreeNode<E> leftChildRightMost = rightMost.left;
        rightMostParent.right = leftChildRightMost;
        rightMost.left = current.left;
        rightMost.right = current.right;
        if (checkLeft) {
            parentCurrent.left = rightMost;
        } else {
            parentCurrent.right = rightMost;
        }
    }

    public void removeNonRoot(TreeNode<E> current, boolean haveLeftChild) {
        TreeNode<E> parentCurrent = findParentCurrent(current.element);
        boolean checkLeft = checkLeft(current, parentCurrent);
        if (haveLeftChild) {
            removeNonRootNoLeft(current, parentCurrent, checkLeft);
        } else {
            removeNonRootHaveLeft(current, parentCurrent, checkLeft);
        }
    }

    public void removeRoot() {
        TreeNode<E> parentOfFarRightOfLeftTree = root.left;
        while (parentOfFarRightOfLeftTree.right.right !=null) {
            parentOfFarRightOfLeftTree = parentOfFarRightOfLeftTree.right;
        }
        root.element = parentOfFarRightOfLeftTree.right.element;
        parentOfFarRightOfLeftTree.right = null;
    }

    @Override
    public void remove(E element) {
       TreeNode<E> current = find(element);
       boolean haveLeftChild = (current.left != null);
       if (current != root) {
           removeNonRoot(current, haveLeftChild);
       } else {
           removeRoot();
       }
       size--;


//       if (current != root) {
//           TreeNode<E> parentCurrent = findParentCurrent(element);
//           boolean checkLeft = checkLeft(current, parentCurrent);
//           if (current.left == null) {
//               if (checkLeft) {
//                   parentCurrent.left = current.right;
//                   current = null;
//                   return;
//               } else {
//                   parentCurrent.right = current.right;
//                   current = null;
//                   return;
//               }
//           }
//
//           TreeNode<E> rightMostParent = findParentRightMost(current);
//           TreeNode<E> rightMost = rightMostParent.right;
//           TreeNode<E> leftChildRightMost = rightMost.left;
//           rightMostParent.right = leftChildRightMost;
//           rightMost.left = current.left;
//           rightMost.right = current.right;
//           if (checkLeft) {
//               parentCurrent.left = rightMost;
//               return;
//           } else {
//               parentCurrent.right = rightMost;
//               return;
//           }
//       }

    }
}
