package Animals.impl;

import Animals.Animal;
import Animals.Flyable;
import Animals.Speakable;
import Animals.Swimable;

public class Duck extends Animal implements Flyable, Swimable, Speakable {

    private String name = super.getName();
    private int pawCount = 2;
    private boolean flyable = true;

    public Duck() {
        super(String.format("Duck #%d", ++animalCount), "Unknown", 2);
    }

    public Duck(String name) {
        super(name, "Unknown", 2);
    }

    public Duck(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    public void fly() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " is flying... ");
    }

    public void swim() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " is swiming... ");
    }

    @Override
    public void hunt() {
        super.wakeUp();
        super.findFood();
        super.feed();
    }

    @Override
    public int getFlySpeed() {
        return 50;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public boolean getFlyable() {
        return this.flyable;
    }

}
