package Homework_4.list;

import java.util.Iterator;

public class GBItreator<E> extends GBLinkedList {
    private int count = 0;

    @Override
    public boolean hasNext() {
        return count < super.size() - 1;
    }

    @Override
    public E next() {
        Node<E> temp = super.findNode(count);
        temp = temp.next;
        count++;
        return temp.item;
    }

}
