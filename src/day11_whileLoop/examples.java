package day11_whileLoop;

import java.util.Scanner;

public class examples {

    public static void main(String[] args) {

        int sum = 0;
        int nums = 0;

        for (int i = 0; i <= 28; i++) {

            sum += i;
        }

        System.out.println(sum);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {

            System.out.println("Square of number " + i + " is " + i * i);


        }

    }
}