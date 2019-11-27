package zadanie20191123.Lista;

public class Node {
    private String value;
    private Node next;

    public Node(String element) {
        value=element;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
