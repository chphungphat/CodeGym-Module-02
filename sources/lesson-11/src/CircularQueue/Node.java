package CircularQueue;

public class Node {
    private int data;
    private Node link;

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public Node() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
