package praConstructor;

public class car {

    String brand;
    int year;
    double price;
    String color;

    public car(String brand, int year, double price, String color) {
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;

    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {

        return year;
    }

    public void carColor() {

        System.out.println("This is a beautiful car");
    }

    public String toString() {
        return brand+ "-" + year + "-"+ price+ "-"+color;
    }

}
