
import java.util.List;

import Animals.Animal;
import Animals.Flyable;
import Animals.Illable;
import Animals.Speakable;
import Animals.Swimable;
import Animals.impl.Cat;
import Animals.impl.Dog;
import Animals.impl.Duck;
import Animals.impl.Eagle;
import Animals.impl.Fish;
import Humans.Doctor;
import Veterenary.Clinic;

public class Main {
    public static void main(String[] args) {

        Clinic vetClinic = new Clinic();
        Doctor d = new Doctor("Albert", "Gore");
        vetClinic
                .addAnimal(new Cat("Murzik", "Ginger"))
                .addAnimal(new Dog("Bobik", "White"))
                .addAnimal(new Duck("Donald", "Black"))
                .addAnimal(new Fish("Robbert", "Gold"))
                .addAnimal(new Eagle("Max", "White"))
                .addDoctor(new Doctor("Albert", "Gore", true))
                .addDoctor(new Doctor("Elisabeth", "Born", false));

        List<Animal> animals = vetClinic.getAnimals();

        System.out.println("\nList of all  animals:");
        System.out.println(animals);

        List<Illable> illableList = vetClinic.getIllableAnimals();

        System.out.println("\nList of all illable animals:");
        System.out.println(illableList);

        List<Flyable> flyableList = vetClinic.getFlyableAnimals();

        // while (count < vetClinic.getAnimals().size()) {
        // try {
        // flyableList.add((Flyable) vetClinic.getAnimal(count));
        // count++;
        // } catch (ClassCastException e) {
        // count++;
        // }
        // }

        System.out.println("\nList of all flyable animals:");
        System.out.println(flyableList);

        List<Swimable> swimableList = vetClinic.getSwimableAnimals();

        System.out.println("\nList of all swimable animals:");
        System.out.println(swimableList);

        List<Speakable> speakableList = vetClinic.getSpeakableAnimals();

        System.out.println("\nList of all speakable animals:");
        System.out.println(speakableList);

    }

}
