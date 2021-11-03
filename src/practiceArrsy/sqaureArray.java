package practiceArrsy;

public class sqaureArray {

    public static void main(String[] args) {

        int square[]=new int[100];

        for(int i=0; i<=99; i++) {

            square[i]=i*i;

            System.out.println("sqaure of the number " +i+ " is " + square[i]);
        }
    }
}
