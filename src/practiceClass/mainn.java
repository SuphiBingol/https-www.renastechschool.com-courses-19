package practiceClass;

import java.util.Arrays;

public class mainn {

    public static void main(String[] args) {

        car car1=new car();

        car1.setCarInfo("Toyota", "Highlander");
        car1.printBrand();
        car1.drive();
        car1.stop();

        System.out.println(car1.toString());




         /*task1
// create a class called slipper
//Attributes:
//   brand, size , color
//Actions:
//   wear(), setSlipperInfo,  toString;
//
//create a slipper object class to set 5 slipper object and print slipper info
//  */

        slipper slipper1=new slipper();
        slipper slipper2=new slipper();
        slipper slipper3=new slipper();
        slipper slipper4=new slipper();
        slipper slipper5=new slipper();


        slipper1.setSlipperInfo("nike", 9, "blue");
        slipper1.getSlipperInfo();
        slipper2.setSlipperInfo("adidas", 10, "red");
        slipper2.getSlipperInfo();
        slipper3.setSlipperInfo("uniqol", 8, "yellow");
        slipper3.getSlipperInfo();
        slipper4.setSlipperInfo("hako", 11, "purple");
        slipper4.getSlipperInfo();
        slipper5.setSlipperInfo("namo", 7, "brown");
        slipper5.getSlipperInfo();

       slipper [] slippers={slipper1, slipper2, slipper3, slipper4, slipper5};

        System.out.println(Arrays.toString(slippers));

        for (int i=0; i< slippers.length; i++) {

            slippers[i].getSlipperInfo();
        }

// /*
// /*task2
// create a class called Car
//Attributes:
//   brand, model
//Actions:
//   printBrand(), -- to print car brand
//   drive() , -- to print person drive car brand
//   stop() -- to print person stopped the car brand
//   //setCarinfo() to set car brand and model
//   //toString to print car brand and model with -
//  */
// /*

        /*
 create a class called SDET
Attributes:
   name, employeeID, Salary , companyName
Actions:
   setInfo(), testing(),  creatingTicket(boolean isBug);
  */
 /*
practice task:
 create a custom class for bank account
   attrubutes: accountHolder(String), accountNumber(long), balance(double)
   actions: totalBalance(), withDraw( amount ), deposit( amount )
     toString()

create a class called bankAccountObject to call BankAccount methods,variables.
Ex : if i deposit 50 dollars my balance should increase 50 dollars
   : if i withdraw 100 dollars my balance should decrease for 100 dollars
   : to check the balance use totalBalance method
  */
       
    }
}
