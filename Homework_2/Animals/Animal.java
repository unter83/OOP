package Animals;

public abstract class Animal implements Illable {
    private String name;
    private String color;
    private int pawCount = 4;
    public boolean sick = false;
    private boolean isSleep = false;

    protected static int animalCount = 0;

    public Animal(String name, String color, int pawCount) {
        this.name = name;
        this.color = color;
        this.pawCount = pawCount;
        animalCount++;
    }

    public Animal(String name) {
        this(name, "Unknown", 4);
    }

    public Animal() {
        this(String.format("Animal #%d", animalCount), "Unknown", 4);

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

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.name);
    }

    public void setIll() {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " is sick");
        sick = true;
    }

    public boolean getSick() {
        return sick;
    }

    public void setCured() {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " is cured");
        this.sick = false;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void wakeUp() {
        isSleep = false;
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " waking up...");
    }

    public void findFood() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " searching for food...");
    }

    public void feed() {
        if (!isSleeping())
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " eating...");
    }

    public void sleep() {
        if (!isSleeping()) {
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " goes to sleep...");
            isSleep = true;
        }
    }

    public abstract void hunt();

    protected boolean isSleeping() {
        if (isSleep) {
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " is sleeping");
            return true;
        } else
            return false;
    }

}