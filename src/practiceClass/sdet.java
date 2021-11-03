package practiceClass;

public class sdet {

            /*
 create a class called SDET
Attributes:
   name, employeeID, Salary , companyName
Actions:
   setInfo(), testing(),  creatingTicket(boolean isBug);

             */

    String name;
    String ID;
    double salary;
    String companyName;

    public void setSdetInfo(String name, String ID, double salary, String companyName) {
        this.name=name;
        this.ID=ID;
        this.salary=salary;
        this.companyName=companyName;

    }

    public void testing() {

        System.out.println("This product has a bug"); }

    public void creatingTicket() {

        System.out.println("Boolean is bug");

    }

}
