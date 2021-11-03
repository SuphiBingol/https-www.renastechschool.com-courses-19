package practiceSetterGetter;

public class main {

    public static void main(String[] args) {

        class1 car1=new class1();

        car1.setColor("Blue");
        System.out.println(car1.getColor());

        car1.setBrand("Mercedes");
        System.out.println(car1.getBrand());

        car1.setEngine(1.6);
        System.out.println(car1.getEngine());

        car1.setDoors(4);
        System.out.println(car1.getDoors());

        car1.decision();

    }

}
