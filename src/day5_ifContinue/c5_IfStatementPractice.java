package day5_ifContinue;


import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class c5_IfStatementPractice<fullName10> {

    private static String Bngl;

    public static void main(String[] args) {

        String str = "Hello";
        //01234

        char letter1 = str.charAt(1);
        System.out.println(letter1);

        String word = "hello world";

        System.out.println(word.charAt(8));

        String firstName = "Rodin";
        String lastName = "Bingol";

        System.out.println(firstName.concat(" ").concat(lastName));
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

        int point = 99;

        System.out.println(firstName.concat(" ").concat(lastName).concat(" ").concat("grade is ").concat(" " + point));

        String word1 = "Happy Birthday";

        System.out.println(word1.contains("B"));

        int x = 200;
        int y = 400;
        int z = 300;


        boolean xMin = x < y && x < z;
        boolean yMIn = y < x && y < z;
        boolean zMin = z < x && z < y;

        if (xMin) {
            System.out.println("The minimum number is x");
        }

        if (x < y && x < z) {
            System.out.println("x is the minimum");
        }

        if (y < x && y < z) {
            System.out.println("y is the minimum");
        }

        if (z < x && z < y) {
            System.out.println("z is the minimum");
        }


        int x1 = 25;
        int y1 = 39;

        if (x != y) {
            System.out.println(x1 + " != " + y1);
        }

        if (x < y) {

            System.out.println(x1 + "< " + y1);
        }

        if (x <= y) {
            System.out.println(x1 + "<=" + y1);
        }

        int ab = 10;
        int cd = 20;

        if (ab == cd) {

            System.out.println("NUmbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        int x2 = 10;

        if (x % 2 == 0) {
            System.out.println("x2 is even number");
        }

        if (x % 2 != 0) {

            System.out.println("x2 is odd number");
        }

        int s = 0;


//                     if (s==0) {
//
//                         System.out.println("I am at starting point");
//
//                         else if(s==10)  {
//
//                             System.out.println("I am at ending point");
//                         }
//
//                         else if (0<s && s<10) {
//                     }

        int t = 10;
        int r = 5;

        int xyz;

        xyz = (t < r) ? t : r;

        System.out.println(xyz);

        int a12 = 45;

        String result1 = (a12 % 2 == 0) ? "The number is even" : "The number is odd";
        System.out.println(result1);

        int f = 8;

        String result2 = (f % 2 == 0) ? "The number is even" : "The number is odd";
        System.out.println(result2);


        int nmr1=5;
        int nmr2=10;
      int resultt = nmr1*nmr2;
        if (resultt % 3==0) {
            System.out.println("result is divisible 3");
        }else if (resultt % 5==0) {
            System.out.println("result is divisible by 5");
        }

       boolean divisibleby3by5= (nmr1*nmr2) % 3 == 0 && (nmr1*nmr2) % 5==0 ? true : false;
        System.out.println("the result is " + divisibleby3by5 );

        String firsName="Sph";
        String  lasName="Bng";
        String  scoree="90";



            System.out.println(firsName.concat(" ").concat(lasName).concat(" ").concat("score is: ").concat(" ").concat(""+scoree));

            String sentence="weather is beautiful";

            System.out.println(sentence.contains("at"));
            System.out.println(sentence.contains("s "));
            System.out.println(sentence.contains("au"));

            String sentencee="Hello world java is here ";

            System.out.println(sentencee.charAt(4));

            System.out.println(sentencee.indexOf("la"));

            System.out.println(sentencee.indexOf("llo")+1);

            System.out.println(sentencee.indexOf("e "));

            System.out.println("*************");

        String sentence5="Hello world java is here lololo ";

        System.out.println(sentence5.lastIndexOf("l"));

        System.out.println(sentence5.lastIndexOf("e"));

      String word3="k";

     boolean b1=word3.isEmpty();

     System.out.println(b1);

     String word7="elbisten";
     System.out.println(word7.replace("e", "a"));


     String letters= "Hello world Java";
        System.out.println(letters.substring(3, 10+1));

        String fullName10="   ibraHIm       KarAAgac   ";
        System.out.println(fullName10.substring(0,1).toUpperCase().concat(fullName10.substring(1,6+1).toLowerCase().concat(" ").concat (fullName10.substring(8,9).toUpperCase().concat(fullName10.substring(9).toLowerCase()))));

        System.out.println(fullName10.trim());

        System.out.println(fullName10.replace(" ", " "));

        String sentence8="I am studying at stttudio";

        System.out.println(sentence8.indexOf("t sttt")+2);

        System.out.println(sentence8.indexOf("tt")+1);

        System.out.println(sentence8.isEmpty());

        String sentence9="lolo";

        System.out.println(sentence9.length());

        System.out.println(sentence8.replace("t", "y"));

        System.out.println(sentence8.replace("o", "a"));

        String newword="Today is beautiful, day is aut";

        System.out.println(newword.charAt(3));

        System.out.println(newword.charAt(6));

        System.out.println(newword.indexOf("l"));

        System.out.println(newword.lastIndexOf("a"));

        System.out.println(newword.lastIndexOf("s"));

        System.out.println(newword.length());

        System.out.println(newword.replace("a", "o"));

        System.out.println(newword.replace("i", "e"));

        System.out.println(newword.replaceFirst("is", "are"));

        System.out.println(newword.replaceFirst("day", "week"));

       String newsentence="I am a student, students have to study";

         boolean    b11= newsentence.startsWith("study") || newsentence.endsWith("study");
         boolean    b22= newsentence.startsWith("study") && newsentence.endsWith("study");

        System.out.println(b22);

      String sentence6= "Java is not hard; hard is not java.";

      boolean   bb=sentence6.startsWith("Java") || sentence6.endsWith("Java");
      boolean   cc=sentence6.startsWith("Java") && sentence6.endsWith("Java");

        System.out.println(cc);

        System.out.println(sentence6.substring(0,(15+1)));
        System.out.println(sentence6.substring(18,34+1));
        System.out.println(sentence6.substring(18,21+1));
       String firstNamee="suphi";
       String      lastNamee="bingol";
       String      fullNamee="      suphi bingol    ";

        System.out.println(fullNamee.trim());

        String nword="Ajavaa";

        System.out.println(nword.substring(0,1));
        System.out.println(nword.replace("a ", ""));




        }








    }



