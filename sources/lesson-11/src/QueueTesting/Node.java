package QueueTesting;

public class Node {
    private int key;
    private Node next;

    public Node(int key, Node next) {
        this.key = key;
        this.next = next;
    }

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
