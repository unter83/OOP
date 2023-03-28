package Humans;

import Animals.Illable;

public class Human implements Illable {

    protected String name;
    protected boolean sex = true;
    private boolean sick = false;
    private boolean isSleep = false;

    public Human(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public Human(String name) {
        this(name, true);
    }

    public Human() {
        this("Unknown", true);
    }

    public void setIll() {
        System.out.println(this.name + " is sick");
        sick = true;
    }

    public boolean getIll() {
        return sick;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns sex of human
     * 
     * @return true if male and false if female
     */
    public boolean getSex() {
        return sex;
    }

    /**
     * Returns mr or ms of human
     * 
     * @return "Mr" if sex is male and "Ms" if human is female
     */
    public String getGender() {
        String gender;
        gender = this.sex ? "Mr" : "Ms";
        return gender;
    }

    public void SetSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public String toString() {
        return String.format("%s %s", getGender(), this.name);
    }

}
