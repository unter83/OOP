package Lesson_1;

import java.util.ArrayList;
import java.util.List;

import Lesson_1.impl.Cat;
import Lesson_1.impl.Dog;

public class Main {
    public static void Main(String[] args) {
        // Animal animal_01 = new Animal("null", "null", 2);
        // System.out.println(animal_01.getPawCount());

        Dog bobikdog = new Dog("Bobik");
        System.out.println(bobikdog.getPawCount());
        System.out.println(bobikdog.getType());
        // bobikdog.Speak();
        Cat murziCat = new Cat("Murzik");

        System.out.println(murziCat.getType());
        System.out.println(murziCat.getName());
        // murziCat.Speak();

        murziCat.setName("Murzik");

        murziCat.hunt();

        // List<Animal> animals = new ArrayList<>();
        // animals.add(murziCat);
        // animals.add(bobikdog);
        // animals.add(new Duck("krya-krya"));

        // animals.forEach(a -> System.out.println(a));

        // animals.forEach(Animal::Speak);

        // for (Animal a : animals) {
        // if (a instanceof Duck) {
        // ((Duck) a).Fly();
        // }
        // System.out.println(a.getPawCount());
        // }

    }
}
