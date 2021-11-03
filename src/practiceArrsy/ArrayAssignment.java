package practiceArrsy;

import java.util.Scanner;

public class ArrayAssignment {

    //Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.

    public static void main(String[] args) {

        int numArray[]=new int[15];

    int alpha[]= new int[10];

        System.out.println(alpha[9]);

        alpha[4]=35;

        int sum=numArray[5]+numArray[12];

        numArray[8]=sum;


//Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.

       String days[]={"Sunday", "Tuesday", "Monday", "Wednesday", "Thursday", "Friday", "Saturday"};


       for(int i=0; i<days.length; i++) {

       }
        System.out.println(days[5]);

       for(String day:days) {

           System.out.print(day+" ");
       }


       //write a program that can return the average number from an array of integers
//            ex:
//                [20, 25, 15]
//                average: 20

        int noms[]={20,25,15};

        int ave=noms[0];

        for(int i=0; i<=noms.length-1; i++) {

            ave+=noms[i]/noms.length-1;

            System.out.println(ave);
        }

        //Question 6
//
//Write a Java program to find the largest and smallest element of an array.

        int numors[]={1,2,3,4,5,6,7};

        int max=numors[0];
        int min=numors[0];

        for(int i=0; i<=numors.length-1; i++) {

            if(numors[i]>max) max=numors[i];

            else if(numors[i]<min)  min=numors[i];
        }

        System.out.println(max);
        System.out.println(min);



//      // create a logic that will store 5 employees salaries (double) from scanner input
//    and print each salaries


        double salaries[]=new double[5];

     Scanner input3=new Scanner(System.in);
        System.out.println("Enter salaries");

     for(int i=0; i<=salaries.length-1; i++) {

     salaries[i]=input3.nextInt();

         System.out.println(salaries[i]);

     }

//Output :
//
//Enter the salaries of 5 employees.
//234
//789
//123
//456
//453
//The salaries are:
//234.0
//789.0
//123.0
//456.0
//453.0
//task2






//write a program that can return the sum of number from an array of integers
//            ex:
//                [20, 25, 15]
//                sum: 60
//write a program that can return the min  number from an array of integers
//            ex:
//                [20, 25, 15]
//                min: 15
//write a program that can return the max  number from an array of integers
//            ex:
//                [20, 25, 15]
//                max: 25




//Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.


        System.out.println("***************************");

        final int size=10;

        int nums[]=new int[size];


        Scanner input=new Scanner(System.in);

        for(int i=0; i<size; i++) {

            nums[i]=input.nextInt();}

            int sum1=0;

        for (int i=0; i<size; i++) {

            sum1+=nums[i]; }








//Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.

        int list1[]=new int[5];

        Scanner input1=new Scanner(System.in);


        int list2[]=new int[5];

        list1=list2;




//Question 5
//
//Write a Java program to reverse the element of an integer  array.

        int elements[]={1,2,3,4,5};

        for(int i=elements.length-1; i>0; i--) {

            System.out.println(elements[i]);
        }


    } }