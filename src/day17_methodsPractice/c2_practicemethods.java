package day17_methodsPractice;

import java.util.Scanner;

public class c2_practicemethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if (number == 1) {
            printSpring();}

        if(number==2) {
            printsummer();
        }

        if(number==3) {
            printFall();
        }

        if(number==4) {
            printWinter();
        }

        }

        public static void printSpring () {

            System.out.println("Spring is beauriful");
        }

        public static void printsummer () {

            System.out.println("Summer is very hot");

        }

        public static void printFall() {

            System.out.println("Fall is very colorfull");
        }

        public static void printWinter() {

            System.out.println("winter is very snowy");
        }

    }
