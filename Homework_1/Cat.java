package Homework_1;

public class Cat extends Animal {

    @Override
    public void Speak() {
        System.out.println(" Meow! ");
    }

    // private void WakeUp() {
    // System.out.println(this.GetType() + " is waking up...");
    // }

    // private void FindFood() {
    // System.out.println(this.GetType() + " is searching for food...");
    // }

    // private void Feed() {
    // System.out.println(this.GetType() + " is eating...");
    // }

    public void Hunt() {
        super.WakeUp();
        super.FindFood();
        super.Feed();
    }

    @Override
    public void Fly() {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't fly...");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }

}
