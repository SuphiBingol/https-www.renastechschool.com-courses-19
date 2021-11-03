package day15;

import java.util.Arrays;
import java.util.Scanner;

public class c1_assignment {

    public static void main(String[] args) {

    String sentence= "Where is puppy";

    String[] splitedSEntence=sentence.split(" ");

        System.out.println(Arrays.toString(splitedSEntence));
        
        String reverseSentence="";
        
        for(int i= splitedSEntence.length-1; i>=0; i--) {
            
            reverseSentence+=splitedSEntence[i] +" "; }

        System.out.println(reverseSentence);

        String sentence2="Where is puppy";

        String[] splitedSentence2=sentence2.split("");

        String reverseSentence2="";

        for(int i=sentence2.length()-1; i>=0; i--) {

            reverseSentence2+=splitedSentence2[i] +" "; }

        System.out.println(reverseSentence2);

        System.out.println("**************");

        String [] []  names= {{"Suphi", "Mahmut", "Serdal"}, {"Fatos", "Cigdem", "Sedat"}};

        String nameMahmut=names[0][1];
        String namesSedat=names[0][2];

        int [][] number1={{1,2,3}, {3,4}};

        System.out.println(Arrays.toString(number1));

        System.out.println(Arrays.deepToString(number1));






    }


}





//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:

//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array




//(Array) Find Minimum
//Write a method that can find the maximum number from an int Array

//(Array) Concat two arrays
//Write a return method that can concate two arrays

