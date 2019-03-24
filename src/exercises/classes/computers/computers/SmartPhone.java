package exercises.classes.computers.computers;

public class SmartPhone extends Computer {

    private String name;
    private int screenSize;
    private double weight;

    public SmartPhone(int screenSize, double weight) {
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
