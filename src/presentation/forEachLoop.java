package presentation;

import java.util.ArrayList;

public class forEachLoop {

    public static void main(String[] args) {


    for (int i=0; i<10; i++) {

        System.out.println(i);
    }

    String[] names={"Ceren", "Derya", "Bawer", "Sercan", "Huseyin", "Mert"};

    for (int i=0; i< names.length; i++) {

        System.out.println(names[i]);
    }

    for(String name:names) {

        System.out.println(name+" "); }


        System.out.println("***************");


     //creata a java program that will print count off odd numbers and even numbers from int array

        int []numberList={3,7,11,5,62,18,23,19};

        int evenCount=0;
        int oddCount=0;

        for (int number : numberList){
            if (number %2 ==0) {
                evenCount++;
            }else {
                oddCount++; } }

                System.out.println(evenCount);
                System.out.println(oddCount);





    } }
