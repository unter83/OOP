package Homework_1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, null, 4);
    }

    @Override
    public void Speak() {
        if (super.GetStatus())
            System.out.println(" Woof! ");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }

    @Override
    public void Fly() {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't fly...");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }

}
