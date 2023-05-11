package Homework_3.drugs;

public class Component {

    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s мг, %d", name, weight, power);
    }

    public boolean equals(Component component2) {
        if (this == component2)
            return true;
        if (this.getClass() != component2.getClass())
            return false;
        return this.name.equals(component2.name) &&
                this.weight.equals(component2.weight) &&
                this.power == component2.power && this.hashCode() == component2.hashCode();
    }

    @Override
    public int hashCode() {
        int result;
        result = name.hashCode() + weight.hashCode() + power;
        return result;
    }

}
