package Lesson_1.impl;

import Lesson_1.Animal;
import Lesson_1.Swimable;

public class Fish extends Animal implements Swimable {

    private String name = super.getName();

    public Fish() {
        super(String.format("Fish #%d", ++animalCount), "Unknown", 0);

    }

    public Fish(String name) {
        super(name, "Unknown", 0);
    }

    public Fish(String name, String color) {
        super(name, color, 0);
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
    public int getSwimSpeed() {
        return 20;
    }

}
