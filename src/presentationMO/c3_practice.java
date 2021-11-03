package presentationMO;

public class c3_practice {

    public static void method(String a, int b, double c) {

        System.out.println(a+ "bought a car for $ " +b + "and sold" +c);
    }

    public static void method (String a, int b) {

        System.out.println(a+ "bought a car for $ " +b);
    }

    public static void method(int b, double c) {

        System.out.println("The car is bought for $ " +b+ "and sold for $ " +c);
    }

    public static void main(String[] args) {

        method("Rodin", 5000, 4995.5);
        method("Erkan", 3000);
        method(7000, 8654.3);


    }
}
