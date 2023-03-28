package Animals.impl;

import Animals.Animal;
import Animals.Flyable;
import Animals.Speakable;

public class Eagle extends Animal implements Flyable, Speakable {

    private String name = super.getName();
    private boolean flyable = true;

    public Eagle() {
        super(String.format("Eagle #%d", ++animalCount), "Unknown", 2);
    }

    public Eagle(String name) {
        super(name, "Unknown", 2);
    }

    public Eagle(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public int getFlySpeed() {
        // TODO Auto-generated method stub
        return 100;
    }

    @Override
    public void speak() {
        System.out.println("Yeewww!");
    }

    @Override
    public void hunt() {
        super.wakeUp();
        super.findFood();
        super.feed();
    }

    public void fly() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " is flying... ");
    }

    @Override
    public boolean getFlyable() {
        return this.flyable;
    }

}
