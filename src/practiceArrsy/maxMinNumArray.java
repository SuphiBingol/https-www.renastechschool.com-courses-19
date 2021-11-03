package practiceArrsy;

public class maxMinNumArray {


    public static void main(String[] args) {

        int numbers[]={1,2,3,8,4,5,6};

        int max=numbers[0];



        for(int i=0; i<=numbers.length-1; i++) {

            if(numbers[i]>max)  max=numbers[i];}

        System.out.println("the max number is " + max);


        int grades[]={90,76,38,29,67};

        int max1=grades[0];
        int min1=grades[0];

        for(int i=0; i<=grades.length-1; i++) {

            if (grades[i] > max1) max1 = grades[i];

            else if (grades[i] <min1)  min1=grades[i];}

        System.out.println(max1);
        System.out.println(min1);

        int values[]={9,4,3,5,2};

        int max2=values[0];
        int min2=values[0];

        for(int i=0; i<=values.length-1; i++) {

            if(values[i]>max2) max2=values[i];

            else if(values[i]<min2) min2=values[i];}

        System.out.println(max2);
        System.out.println(min2);
}}
