package pra_Inheritance;

public class animalObject {

   /* cat class:
    data/attributes:  instance variables
    name, color, age

    actions: instance methods
    sleep(), eat(), drink() , move()

    bird class

    data/attributes:  instance variables
    name, color, age

    actions: instance methods
    sleep(), eat(), drink() ,fly()
            */

    public static void main(String[] args) {

        cat cat1=new cat();

        bird bird1=new bird();

        cat1.name="Hatice";
        cat1.color="black";
        cat1.age=3;

        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.move();

        bird1.name="Cemal";
        bird1.color="black";
        bird1.age=3;
        bird1.eat();
        bird1.drink();
        bird1.sleep();
        bird1.fly();




    }
}
