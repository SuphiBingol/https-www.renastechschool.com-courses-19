package pra_custom;

public class bird {

    String name;
    String color;
    int age;

    public void setBirdInfo (String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;

    }
    public void sleep(int number){

        System.out.println("MY bird sleeps "+ number+ " hours");
    }

    public void eat(String food) {

        System.out.println("My bird loves "+ food);
    }

    public void drink(String drink) {

        System.out.println("My bird drinks " +drink+ " every day");
    }

    public void move(String fly) {

        System.out.println("My cat moves very " + fly);
    }

    public String toString() {

        return name+ "-" + color+ "-" + age;
    }

}
