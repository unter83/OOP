package Homework_3.drugs;

import java.util.Comparator;
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

    public String getComponentsName() {
        String componentName = "";
        for (Component item : components) {
            componentName = componentName + item.getName();
        }
        return componentName;
    }

    @Override
    public int compareTo(Drug o) {
        if (Integer.compare(getDrugPower(), o.getDrugPower()) != 0)
            return Integer.compare(getDrugPower(), o.getDrugPower());
        else
            return Comparator.comparing(Drug::getComponentsName).compare(this, o);

    }

    @Override
    public String toString() {
        return String.format("%s {components: %s, power: %s}%n ", getClass().getSimpleName(), components,
                getDrugPower());
    }

}
