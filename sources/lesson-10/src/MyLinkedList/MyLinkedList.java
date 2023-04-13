package MyLinkedList;

public class MyLinkedList {
    Node head;
    int numNodes;

    public MyLinkedList(Node head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        numNodes++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int count = 0; count < index - 1 && temp.next != null; count++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int count = 0; count < index; count++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty list");
        } else {
            for (int count = 0; count < numNodes; count++) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
