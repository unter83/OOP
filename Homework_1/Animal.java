package Homework_1;

public class Animal {
    private String name;
    private String color;
    private int pawCount = 4;
    private boolean isAnimalWakeUp = false;

    public Animal(String name, String color, int pawCount) {
        this.name = name;
        this.color = color;
        this.pawCount = pawCount;
    }

    public Animal(String name) {
        this(name, null, 4);
    }

    public Animal() {
        this(null, null, 4);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawCount() {
        return pawCount;
    }

    public String GetType() {
        return this.getClass().getSimpleName();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Имя: %s Цвет: %s", this.name, this.color);
    }

    public void Speak() {
        if (isAnimalWakeUp)
            System.out.println(" Silance... ");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void toGo(int steps) {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " making " + steps + " steps");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void toGo() {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " making " + 1 + " step");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void Fly() {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " flying...");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void Swim() {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " swiming...");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void WakeUp() {
        isAnimalWakeUp = true;
        System.out.println(this.GetType() + " is waking up...");
    }

    public void Sleep() {
        isAnimalWakeUp = false;
        System.out.println(this.GetType() + " is going to sleep...");
    }

    public void FindFood() {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " is searching for food...");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public void Feed() {
        if (isAnimalWakeUp)
            System.out.println(this.GetType() + " is eating...");
        else
            System.out.println(this.GetType() + " ZZZzzz...");
    }

    public boolean GetStatus() {
        return isAnimalWakeUp;
    }
}