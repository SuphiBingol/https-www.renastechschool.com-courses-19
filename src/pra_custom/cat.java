package pra_custom;

public class cat {

    String name;
    String color;
    int age;

    public void setCatInfo(String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public void setBirdInfo (String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;

    }
    public void sleep(int number){

        System.out.println("MY cat sleeps "+ number+ " hours");
    }

    public void eat(String food) {

        System.out.println("My cat loves "+ food);
    }

    public void drink(String drink) {

        System.out.println("My cat drinks " +drink+ " every day");
    }

    public void move(String move) {

        System.out.println("My cat moves very " + move);
    }

    public String toString() {

        return name+ "-" + color+ "-" + age;
    }



}
