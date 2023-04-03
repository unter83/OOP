package Homework_3.drugs;

import java.util.Iterator;
import java.util.List;

public class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    private int index;

    public Drug(List<Component> component) {
        this.components = component;
    }

    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }

            public Component next() {
                return components.get(index++);
            }
        };
    }

    public int getDrugPower() {
        int power = 0;
        for (Component item : components) {
            power = power + item.getPower();
        }
        return power;
    }

    @Override
    public int compareTo(Drug o) {
        return Integer.compare(getDrugPower(), o.getDrugPower());
    }

    @Override
    public String toString() {
        return String.format("%s {components: %s, power: %s}%n ", getClass().getSimpleName(), components,
                getDrugPower());
    }

}
