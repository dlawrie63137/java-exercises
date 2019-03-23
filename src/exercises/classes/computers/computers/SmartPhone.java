package exercises.classes.computers.computers;

public class SmartPhone extends Computer {

    private String name;
    private String manufacturer;
    private String ramType;
    private int ramSize;
    private String cpuType;
    private int hddSize;
    private int screenSize;
    private double weight;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String getRamType() {
        return ramType;
    }

    @Override
    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    @Override
    public int getRamSize() {
        return ramSize;
    }

    @Override
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String getCpuType() {
        return cpuType;
    }

    @Override
    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    @Override
    public int getHddSize() {
        return hddSize;
    }

    @Override
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
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

    public SmartPhone(String name) {
        this.name = name;
    }
}
