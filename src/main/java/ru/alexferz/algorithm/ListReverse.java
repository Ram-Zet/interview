package ru.alexferz.algorithm;

public class ListReverse {
    public static void main(String[] args) {
        Node head = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        head.setNext(B);
        B.setNext(C);
        C.setNext(D);

        Node newHead = reverseList(head);
        Node current = newHead;
        while(current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    private static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node temp = current.getNext();
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static class Node {
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
