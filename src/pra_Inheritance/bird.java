package pra_Inheritance;

public class bird extends cat {

    public String name;
    public String color;
    public int age;

    public void sleep() {

        System.out.println(name + " sleeps on " + color + " bed");

    }

    public void eat() {

        System.out.println(name + " eats food");

    }

    public void drink() {

        System.out.println(name + " drinks water");
    }

    ;

    public void fly() {

        System.out.println(name + "fly very fast");
    }


}