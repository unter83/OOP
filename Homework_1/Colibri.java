package Homework_1;

public class Colibri extends Animal {
    public Colibri(String name) {
        super(name, null, 2);
    }

    public Colibri() {
        super(null, null, 2);
    }

    @Override
    public void Swim() {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't swim...");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }
}
