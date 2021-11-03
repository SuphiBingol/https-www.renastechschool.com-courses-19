package pra_custom;

public class assignment {

    public static void main(String[] args) {

        cat cat1=new cat();

        cat1.setCatInfo("Abuzer", "black", 4);
        cat1.sleep(8);
        cat1.eat("meat");
        cat1.drink("water");
        cat1.move("fast");
        System.out.println(cat1.toString());

        bird bird1=new bird();

        bird1.setBirdInfo("Lulu", "green", 2);
        bird1.sleep(5);


    }


}
