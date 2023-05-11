package Homework_4.list;

public class Node<E> {

    E item;
    Node<E> next;
    Node<E> prev;

    Node(E item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
