package practicePackage;

public class day19_wrapper {

    public static void main(String[] args) {

        Integer myint=197;

        String str=myint.toString();

        System.out.println(str);

        System.out.println(str.length());

        Integer yourInt=365;

        String kijo=yourInt.toString();

        System.out.println(kijo);

        String s="10";

        System.out.println(s+5);

        int number=Integer.parseInt(s);

        System.out.println(number+5);

        int number2=Integer.parseInt(s);

        System.out.println(number2+8);

        int number3=Integer.parseInt("7");

        System.out.println(number3+3);

        //to turn integer to string..see below

        int k=5;

        System.out.println(Integer.toString(k)+6);
        System.out.println(Integer.toString(k)+8);

        String u="age:42";

        u=u.replaceAll("\\D+","");

        System.out.println(u);

        String m="cars:27";

        m=m.replaceAll("\\D+","");

        System.out.println(m);
    }
}
