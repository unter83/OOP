package Homework_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Animal animal_01 = new Animal("null", "null", 2);
        System.out.println(animal_01.getPawCount());

        Dog bobikdog = new Dog("Bobik");
        Cat murziCat = new Cat();
        murziCat.setName("Murzik");
        // murziCat.Hunt();
        murziCat.WakeUp();
        murziCat.FindFood();
        bobikdog.Speak();
        bobikdog.WakeUp();
        bobikdog.Speak();
        bobikdog.Fly();

        Fish bulfish = new Fish();
        System.out.println(bulfish.GetType());
        bulfish.Fly();
        bulfish.WakeUp();
        bulfish.Fly();

        Colibri tinybird = new Colibri();
        tinybird.Feed();
        tinybird.WakeUp();
        tinybird.Feed();
        tinybird.Sleep();
        tinybird.Feed();
    }
}
