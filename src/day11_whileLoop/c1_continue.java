package day11_whileLoop;


import java.util.Scanner;

public class c1_continue {

  public static void main(String[] args) {


      for (int i=1; i<=4; i++) {

          System.out.println("Suphi");

          if(i==3) {

              continue;
          }
          System.out.println("Serdal");
      }

      for(int i=0; i<=20; i++) {

          if(i%2==0) {

            break;
          }
          System.out.print(i + " ");
      }

    String bag[]= {"apple", "orange", "bluberry", "plum", "bread"};

      System.out.println(bag[2]);

      int pot[]= {3, 5,7,9,10,98};

    System.out.println(pot[4]);

    String whiteBag[] = {"eggs", "banana", "melon", "sugar", "cheese"};

    System.out.println(whiteBag[4]);

     int pot2[]= new int[5];

     pot2[0]=1;
     pot2[1]=2;
     pot2[2]=3;
     pot2[3]=4;
     pot2[4]=5;

    System.out.println(pot2[4]);


    int numbers[]={3,4,8,12,19,21};

    for (int i=0; i<numbers.length-1; i++)

      System.out.println(numbers[4]);

    boolean [] booleans1={true, false, true, false, false, true, true};

       for(int i=0; i<=booleans1.length-1; i++) {

       if(booleans1[i]){
           System.out.println("Passed");}

           else {

           System.out.println("Failed");
       }

           System.out.println("****************************");




           }
  }

}




