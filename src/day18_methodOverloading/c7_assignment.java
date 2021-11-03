package day18_methodOverloading;

   import java.util.Arrays;
   import java.time.LocalDate;

public class c7_assignment {

    /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store their birthdays in the same order
    3. use for loop to print out your friends' names and their birthdays
     */

    public static void main(String[] args) {


        String[] friends = {"Obama", "Biden", "Pelosi", "Cortez", "Cafer"};

        LocalDate [] birthdays= {LocalDate.of(1961,03,18), LocalDate.of(1952,8,19),
                LocalDate.of(1954,07,05), LocalDate.of(1977,05,26),
                LocalDate.of(1988,10,11)};

        for(int i=0; i<=friends.length-1; i++) {

            System.out.println(friends[i] +" was born in " + birthdays[i]);
        }


    }
}
