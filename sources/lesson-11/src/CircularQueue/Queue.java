package CircularQueue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Queue() {
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int key) {
        Node node = new Node(key);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.setLink(node);
            rear = rear.getLink();
            rear.setLink(front);
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is null");
        } else {
            if (front == rear) {
                front = rear = null;
            } else {
                rear.setLink(front.getLink());
                Node temp = front;
                front = front.getLink();
                temp = null;
            }
        }
    }

    public void displayQueue() {
        Node navi = front;
        System.out.print(navi.getData() + " ");
        navi = navi.getLink();
        while (navi != front) {
            System.out.print(navi.getData() + " ");
            navi = navi.getLink();
        }
    }
}
