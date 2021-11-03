package praAbsAssignment;

public abstract class phone {


    public String brand;
    public int model;
    public double price;
    public char size;



    public abstract void calling();
    public abstract void texting();

    public String toString() {
        return brand+model+price+size;
    }
}
