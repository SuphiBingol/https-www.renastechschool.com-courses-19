package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c1_assignment {


    public static void main(String[] args) {

      int[] numbers={5,9,8,27,34,56};

        System.out.println(numbers[4]);

      int max=numbers[0];
      int min=numbers[0];

      for( int i=1; i<=numbers.length-1; i++) {

          if (numbers[i] >max) {

          max=numbers[i]; }

          System.out.println(max);

          if(numbers[i]<min) {

          min=numbers[i];}

          System.out.println(min);

      }

     String[] names={"Suphi", "Mahmut", "Serdal"};

        System.out.println(Arrays.toString(names));




    }

}