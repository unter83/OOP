package Homework_4;

import Homework_4.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gbl = new GBLinkedList();
        gbl.add(1);
        gbl.add(2);
        gbl.add(3, 1);
        gbl.add(4);
        gbl.add(5);
        System.out.println(gbl.size());
        for (int i = 0; i < gbl.size(); i++) {
            System.out.print(gbl.get(i) + " ");
        }
        System.out.println();
        System.out.println("Удаление - " + gbl.remove(1));
        for (int i = 0; i < gbl.size(); i++) {
            System.out.print(gbl.get(i) + " ");
        }
        System.out.println();
        for (Integer item : gbl) {
            System.out.println(item);
        }
        System.out.println();
        while (gbl.hasNext())
            System.out.println(gbl.next());

    }
}
