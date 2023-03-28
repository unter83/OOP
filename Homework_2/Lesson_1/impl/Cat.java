package Lesson_1.impl;

import Lesson_1.Animal;
import Lesson_1.Runable;
import Lesson_1.Speakable;

public class Cat extends Animal implements Runable, Speakable {

    private String name = super.getName();

    public Cat() {
        super(String.format("Cat #%d", ++animalCount), "Unknown", 4);
    }

    public Cat(String name) {
        super(name, "Unknown", 4);
    }

    public Cat(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.println(" Mewo! ");
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
