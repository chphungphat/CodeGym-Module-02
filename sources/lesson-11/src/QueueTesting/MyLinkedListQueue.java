package QueueTesting;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        } else {
            this.tail.setNext(temp);
            this.tail = temp;
        }
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        } else {
            Node temp = this.head;
            this.head = this.head.getNext();
            if (this.head == null) {
                this.tail = null;
            }
            return temp;
        }
    }
}
