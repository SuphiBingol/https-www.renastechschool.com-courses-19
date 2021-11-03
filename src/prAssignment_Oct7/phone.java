package prAssignment_Oct7;

public class phone {


    String brand;
    String model;
    double price;
    String country;

    public void call(String person) {
        System.out.println(person+" calls me everyday");
    }

    public void text(int number) {
        System.out.println("Rodin texts me "+ number+ " time in a day");
    }

    public String toString() {

        return brand+"-"+model+"-"+price+"-"+country;
    }



    //                methods: call, text,  toString
}
