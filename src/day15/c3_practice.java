package day15;

import java.util.Scanner;

public class c3_practice {


    public static void factoriel() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int number= input.nextInt();
        int factri=2;

        while(number>0) {

            factri*=number;
            number--;

        }
        System.out.println(factri);

    }

    public static void aile(String name) {

        System.out.println("Ailenin en buyugu " + name);


    }

    public static void main(String[] args) {

    factoriel();
    aile("Suphi");

    }
}
