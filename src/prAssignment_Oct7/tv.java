package prAssignment_Oct7;

public class tv {


    String brand;
    int    model;
    double price;
    String country;

    public void watch(String brand, int model, double price, String country) {
        System.out.println("I watch " + model + brand + " TV that I bought for $" + price + " from"+ country);
    }

    public String toString() {

        return brand + "-" + model+"-"+price+"-"+country;
    }

//                methods: watch, toString
//
}
