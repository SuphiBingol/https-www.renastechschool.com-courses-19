package SHallPresentation;

public class c1_MOintro {

    public static void sum(int a, int b) {

        System.out.println("The sum of numbers is " + (a+b)); }

        public static void sum (int a, int b, int c) {

            System.out.println("The sum of numbers is " + (a+b+c));

        }

        public static void sum(int a) {

            System.out.println(a);
        }

        public static void sum(double b) {

        }

        public static void method(String name, int number, double point) {

            System.out.println(name+"purchased a car for $ " +number + "and sold for $ " + point);
        }

        public static void method(int number, double point) {

            System.out.println("Ridvan purchased his car for $ " + number + "and sold for $ " +point);
        }


    public static void main(String[] args) {

        sum(1,2);
        sum(5,6,7);
        sum(6.5);
        method("Jessica", 5000, 6300.0);
        method(7000, 9800.0);
    }

}
