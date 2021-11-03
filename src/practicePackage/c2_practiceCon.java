package practicePackage;

import java.util.Scanner;

public class c2_practiceCon {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();

        if(number==1)
            printMuslera();
        if(number==2)
            printAltay();
        if(number==3)
            printErsin();
        if(number==4)
            printUgurcan();

    }

    public static void printMuslera() {

        System.out.println("Muslera plays for GS");
    }

    public static void printAltay() {

        System.out.println("Altay plays for FB");
    }

    public static void printErsin() {

        System.out.println("Ersin plays for BJK");
    }

    public static void printUgurcan() {

        System.out.println("Ugurcan plays for TS");
    }

}
