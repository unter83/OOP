package Homework_1;

public class Fish extends Animal {

    public Fish(String name) {
        super(name, null, 0);
    }

    public Fish() {
        super(null, null, 0);
    }

    @Override
    public void toGo() {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't go becouse it's doesn't have legs");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }

    @Override
    public void toGo(int steps) {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't go becouse it's doesn't have legs");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }

    public void Fly() {
        if (super.GetStatus())
            System.out.println(this.GetType() + " can't fly...");
        else
            System.out.println(this.GetType() + " ZZzzz... ");
    }
}
