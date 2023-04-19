package BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
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
    }
}
