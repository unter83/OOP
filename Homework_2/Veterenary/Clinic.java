package Veterenary;

import java.util.ArrayList;
import java.util.List;
import Lesson_1.Animal;
import Lesson_1.Flyable;
import Lesson_1.Illable;
import Lesson_1.Speakable;
import Lesson_1.Swimable;
import Lesson_2.Doctor;

public class Clinic {

    private final List<Animal> animals;
    private final List<Doctor> doctors;

    public Clinic() {
        this.animals = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public Clinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public Clinic addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
        return this;
    }

    public Animal getAnimal(int i) {
        return animals.get(i);
    }

    public Doctor getDoctor(int i) {
        return doctors.get(i);
    }

    public List<Doctor> getDoctors() {
        return this.doctors;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public List<Illable> getIllableAnimals() {
        List<Illable> illableList = new ArrayList<>();
        int count = 0;
        while (count < this.animals.size()) {
            try {
                illableList.add((Illable) this.getAnimal(count));
                count++;
            } catch (ClassCastException e) {
                count++;
            }
        }
        return illableList;
    }

    public List<Flyable> getFlyableAnimals() {
        List<Flyable> flyableList = new ArrayList<>();
        int count = 0;
        while (count < this.animals.size()) {
            try {
                flyableList.add((Flyable) this.getAnimal(count));
                count++;
            } catch (ClassCastException e) {
                count++;
            }
        }
        return flyableList;
    }

    public List<Swimable> getSwimableAnimals() {
        List<Swimable> swimableList = new ArrayList<>();
        int count = 0;
        while (count < this.animals.size()) {
            try {
                swimableList.add((Swimable) this.getAnimal(count));
                count++;
            } catch (ClassCastException e) {
                count++;
            }
        }
        return swimableList;
    }

    public List<Speakable> getSpeakableAnimals() {
        List<Speakable> speakableList = new ArrayList<>();
        int count = 0;
        while (count < this.animals.size()) {
            try {
                speakableList.add((Speakable) this.getAnimal(count));
                count++;
            } catch (ClassCastException e) {
                count++;
            }
        }
        return speakableList;
    }
}
