package Homework_1;

public class Duck extends Animal {

    private String name = super.getName();
    private int pawCount = 2;

    public Duck(String name) {
        super(name, null, 2);
    }

    @Override
    public void Speak() {
        System.out.println(" Quack! ");
    }

    public void Fly() {
        System.out.println(this.GetType() + " is flying... ");
    }
}
