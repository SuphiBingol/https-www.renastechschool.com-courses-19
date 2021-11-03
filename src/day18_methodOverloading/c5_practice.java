package day18_methodOverloading;

public class c5_practice {

    public static void main(String[] args) {
        analys("John", 95);
        analys(90);
        analys("Lorik");
    }

    public static void analys(String name, int score) {

        System.out.println(name + " got a good point: " +score);

    }

    public static void analys(int score) {

        System.out.println("a great scoree " + score);
    }

    public static void analys(String name) {

        System.out.println(name +" knows what he is doing");
    }
}
