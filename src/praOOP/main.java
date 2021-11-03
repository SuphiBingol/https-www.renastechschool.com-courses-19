package praOOP;

public class main {

    public static void main(String[] args) {

     iphone iphone1=new iphone();
     samsung samsung1=new samsung();

     iphone1.call();
     iphone1.setIp(1234567);
     iphone1.setNumber(675987678);


        System.out.println("iphone1 = " +iphone1.getIp());
        System.out.println(iphone1.getNumber());

        samsung1.call();
        iphone1.text();



    }
}
