package BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
        tree.insert(55);
        tree.insert(23);
        tree.insert(39);
        System.out.print("Inorder: ");
        tree.inorder();
        System.out.println();
        System.out.print("Preorder: ");
        tree.preorder();
        System.out.println();
        System.out.print("Postorder: ");
        tree.postorder();
        System.out.println();
        System.out.println("The number of nodes is " + tree.getSize());
        TreeNode<Integer> nodeFind1 = tree.find(35);
        TreeNode<Integer> nodeFind2 = tree.find(90);
        if (nodeFind2 == null) {
            System.out.println("Not found 90");
        }
        if (nodeFind1 == null) {
            System.out.println("Not found 35");
        } else {
            System.out.println("Found " + nodeFind1.element);
        }
        tree.remove(27);
        tree.inorder();
        System.out.println();
        System.out.println("The number of nodes is " + tree.getSize());
    }
}
