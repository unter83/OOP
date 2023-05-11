package Homework_4.list;

import java.util.Iterator;

public class GBLinkedList<E> implements Iterable<E>, Iterator<E> {
    private int size = 0;
    private Node<E> header = new Node<E>(null, null, null);
    private int count = 0;

    public GBLinkedList() {
        header.next = header.prev = header;
    }

    public boolean add(E item) {
        Node<E> newNode = new Node<E>(item, header, header.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
        return true;
    }

    public boolean add(E item, int index) {
        Node<E> temp = findNode(index);
        Node<E> newNode = new Node<E>(item, temp, temp.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
        return true;
    }

    protected Node findNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> temp = header;

        if (index < (size >> 1)) {
            for (int i = 0; i <= index; i++)
                temp = temp.next;
        } else {
            for (int i = size; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public E remove(int index) {
        Node<E> temp = findNode(index);
        E result = temp.item;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return result;
    }

    public E get(int index) {
        Node<E> temp = findNode(index);
        E result = temp.item;
        return result;
    }

    public E get() {
        Node<E> temp = findNode(size);
        E result = temp.item;
        return result;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size - 1;
            }

            @Override
            public E next() {
                Node<E> temp = findNode(index);
                temp = temp.next;
                index++;
                return temp.item;
            }

        };
    }

    @Override
    public boolean hasNext() {
        return count < size - 1;
    }

    @Override
    public E next() {
        Node<E> temp = findNode(count);
        temp = temp.next;
        count++;
        return temp.item;
    }

}
