package Stack;

public class Stack_Linked <T> {

    Node <T> topNode = new Node <T> (null);

    public void push(T newEntry) {

        Node <T> newNode = new Node <T> (newEntry, topNode);
        topNode = newNode;

    }

    public T pop() {

        T top = peak();
        if (topNode != null) {
            topNode = topNode.next;
        }
        return top;

    }

    public T peak() {

        T top = null;
        if (topNode != null) {
            top = topNode.data;
        }
        return top;
    }

}


class Node <T> {
    public T data; //entry
    public Node next; // link to next node

    public Node (T dataPortion) {
        this (dataPortion, null);
    }
    public Node (T dataPortion, Node nextNode) {
        data = dataPortion;
        next = nextNode;
    }
}