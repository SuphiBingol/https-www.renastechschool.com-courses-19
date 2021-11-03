package practicePackage;

import java.util.ArrayList;

public class day19_arrayList {

    public static void main(String[] args) {

        ArrayList<String> nameList=new ArrayList<>();

        nameList.add("Nesrin");
        nameList.add("Suphi");
        nameList.add("MAhmut");

        for(int i=0; i<nameList.size(); i++) {

            System.out.println("namelist.get("+i+")" + nameList.get(i)+", ");

            System.out.println(nameList.size());
        }
    }
}
