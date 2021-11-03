package practiceArrsy;

public class twoDimensionArray {

    public static void main(String[] args) {

        int revenue[][]=new int[12][2];

        revenue[0][0]=1;
        revenue[1][0]=2;
        revenue[2][0]=3;
        revenue[3][0]=4;
        revenue[4][0]=5;
        revenue[5][0]=6;
        revenue[6][0]=7;
        revenue[7][0]=8;
        revenue[8][0]=9;
        revenue[9][0]=10;
        revenue[10][0]=11;
        revenue[11][0]=12;


        revenue[0][0]=34;
        revenue[1][1]=44;
        revenue[2][1]=23;
        revenue[3][1]=76;
        revenue[4][1]=65;
        revenue[5][1]=98;
        revenue[6][1]=123;
        revenue[7][1]=102;
        revenue[8][1]=87;
        revenue[9][1]=103;
        revenue[10][1]=109;
        revenue[11][1]=108;


        for (int i=0; i<=revenue.length-1; i++) {



        System.out.println("For month number" +revenue[i][0] + " is $" + revenue[i][1]  ); }
    }
}
