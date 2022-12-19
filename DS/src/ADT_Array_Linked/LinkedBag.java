package ADT_Array_Linked;

public class LinkedBag <T> {

    int numberOfEntries = 0;
    Node <T> firstNode = new Node <T> (null);

    public boolean add(T newEntry) {
        Node <T> newNode = new Node <T> (newEntry);
        newNode.next = firstNode; //newNode가 전에 있던 firstNode를 가리키게 함

        firstNode = newNode; //newNode가 새로운 firstNode가 됨
        numberOfEntries++;

        return true;
    }

    public T[] toArray() {

        T[] result = (T[])new Object[numberOfEntries];

        int index = 0;
        Node <T> currentNode = firstNode;

        while ((index < numberOfEntries)&&(currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }
        return result;
    }

    public int getFrequencyOf(T anEntry) {

        int frequency = 0;
        int counter = 0;
        Node <T> currentNode = firstNode;

        while ((counter < numberOfEntries)&&(currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                frequency++;
            }
            counter++;
            currentNode = currentNode.next;
        }

        return frequency;
    }

    public boolean contains (T anEntry) {
        boolean found = false;
        Node <T> currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    public T remove () {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next; // firstNode의 다음 Node를 firstNode로 만들면서 기존 firstNode는 GC가 collect해가게 함
            numberOfEntries--;
        }

        return result;
    }

    private Node <T> getReferenceTo(T anEntry){
        boolean found = false;
        Node <T> currentNode = firstNode;

        while(!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

    public boolean isEmpty() {

        return numberOfEntries == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
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
