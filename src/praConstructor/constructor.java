package praConstructor;

public class constructor {

    public constructor() {

        System.out.println("Just started");
    }

    public constructor(String hi) {

        System.out.println("Hello hello " +hi);
    }

    public constructor(int a, String mom) {

        System.out.println("I miss my mom whose name is " +mom);
    }

    public static void main(String[] args) {

        constructor constructor1=new constructor();
        constructor constructor2=new constructor("merhaba");
        constructor constructor3=new constructor(12, "Suphiye");

    }
}
