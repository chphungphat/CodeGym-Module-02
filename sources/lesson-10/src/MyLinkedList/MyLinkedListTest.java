package MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myList = new MyLinkedList(10);
        for (int numb = 11; numb <= 15; numb++) {
            myList.addFirst(numb);
        }
        myList.printList();
        System.out.println();
        myList.add(2, 9);
        myList.add(4, 8);
        myList.printList();
    }
}
