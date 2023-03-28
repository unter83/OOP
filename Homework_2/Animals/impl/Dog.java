package Animals.impl;

import Animals.Animal;
import Animals.Runable;
import Animals.Speakable;

public class Dog extends Animal implements Runable, Speakable {

    private String name = super.getName();

    public Dog() {
        super(String.format("Dog #%d", ++animalCount), "Unknown", 4);
    }

    public Dog(String name) {
        super(name, "Unknown", 4);
    }

    public Dog(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.println("Wow!");
    }

    @Override
    public void hunt() {
        super.wakeUp();
        super.findFood();
        super.feed();
    }

    public void run() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " is running... ");
    }

    public int getRunSpeed() {
        return 20;
    }

}
