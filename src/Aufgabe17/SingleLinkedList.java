package Aufgabe17;

public class SingleLinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public T removeFromFront() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    // Implementiere weitere Operationen wie Knoten am Ende hinzufügen und über die komplette Liste iterieren.
}
