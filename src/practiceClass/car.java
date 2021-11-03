package practiceClass;

public class car {

     /*task2
// create a class called Car
//Attributes:
//   brand, model
//Actions:
//   printBrand(), -- to print car brand
//   drive() , -- to print person drive car brand
//   stop() -- to print person stopped the car brand
//   //setCarinfo() to set car brand and model
//   //toString to print car brand and model with -
//  */
// /*

    String brand;
    String model;

    public void printBrand() {

        System.out.println("This is a " + brand);
    }

    public void drive() {

        System.out.println("Rodin drives " + brand + " brand car");}

    public void stop() {

        System.out.println("Rodin stops the " + brand);

    }

    public void setCarInfo(String brand, String model) {

    this.brand=brand;
    this.model=model; }

    public String toString() {
        return brand+"-" +model;
    }

}
