package practiceSetterGetter;

public class class1 {

    private String color;
    private String brand;
    private double engine;
    private int doors;

    public void setColor(String color) {
        this.color=color;
    }

    public String getColor() {
        return this.color;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public String getBrand() {

        return this.brand;
    }

    public void setEngine(double engine) {
    this.engine=engine; }

    public double getEngine() {

        return this.engine;
    }

    public void setDoors (int doors) {

        this.doors=doors;
    }

    public int getDoors() {

        return this.doors;
    }

    public void decision() {
        System.out.println("I'm not sure about thr car");
    }
}
