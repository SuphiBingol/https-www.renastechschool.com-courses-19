package practicePackage;

import java.util.Scanner;

public class c4_moreMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");

        int number= input.nextInt();

        if(number==1)

        cafeGround();

        if(number==2)
        cafePerfect();

        if(number==3)
        cafeOracle();

    }

    public static void cafeGround() {

        System.out.println("Suphi is at Groundswell");
    }

    public static void cafePerfect() {

        System.out.println("Suphi is at Perfect cup");
    }

    public static void cafeOracle() {

        System.out.println("Suphi is at Oracle");
    }
}
