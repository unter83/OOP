package Humans;

public class Doctor extends Human {
    String secondName;

    public Doctor(String name, String secondName, boolean sex) {
        super.name = name;
        this.secondName = secondName;
        super.sex = sex;
    }

    public Doctor(String name, String secondName) {
        this(name, secondName, true);
    }

    public Doctor(String name) {
        this(name, "Unknown", true);
    }

    public Doctor() {
        this("Unknown", "Unknown", true);
    }

    public String toString() {
        return String.format("%s %s %s", getGender(), this.name, this.secondName);
    }

}
