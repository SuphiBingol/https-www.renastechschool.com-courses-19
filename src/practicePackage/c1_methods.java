package practicePackage;

import java.util.Scanner;

public class c1_methods {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");

        int season=input.nextInt();

        if(season==1)
            printSpring();
        if(season==2)
            printSummer();
        if(season==3)
            printFall();
        if(season==4)
            printWinter();

    }

    public static void printSpring() {



        System.out.println("Flowers are blooming");
    }

    public static void printSummer() {

        System.out.println("Summer is very hot");
    }

    public static void printFall() {

        System.out.println("Fall is very colorfull");
    }

    public static void printWinter() {

        System.out.println("Winter is very snowy");
    }
}
