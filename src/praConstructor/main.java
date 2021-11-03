package praConstructor;

public class main {

    public static void main(String[] args) {

        car car1=new car("Toyota", 2018, 29.8, "black");

        System.out.println(car1.getBrand());

        System.out.println(car1.getYear());

        System.out.println(car1.toString());
        car1.carColor();


    }
}
