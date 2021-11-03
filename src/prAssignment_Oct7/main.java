package prAssignment_Oct7;

import practiceClass.student;

public class main {



    public static void main(String[] args) {


        device device1 = new device();

        System.out.println(device1.toString());


        tv tv1 = new tv();
        tv1.watch("Sony", 2020, 209.9, "Japan");

        System.out.println(tv1.toString());

        phone phone1=new phone();

        phone1.call("Rodin");
        phone1.text(5);

        person person1=new person();

        person1.eat("fish");
        person1.walk(5);
        person1.gender("boy");



    }}

class person {

    String name;
    int age;
    String gender;

    public void setPersonInfo(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void eat(String food) {

        System.out.println("Rodin likes "+food);
    }

    public void walk(int miles) {

        System.out.println("Rodin walks 5 "+ miles+" miles");
    }

    public void gender(String boy) {

        System.out.println("Roidin is a handsome " + boy);
    }

    class employee {

        String name;
        int age;
        String gender;
        double salary;
        int employeeID;
        String jobTitle;

        public void setEmployeeInfo(String name, int age, String gender, double salary, int employeeID, String jobTitle) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
        }

        public void work(int hours) {
            System.out.println("Rodin works" + hours + "hours");
        }

        public String toString() {
            return name + "-" + age + "-" + gender + "-" + salary + "-" + employeeID + "-" + jobTitle;
        }
    }
//
   class student {

    String name;
    int age;
    String gender;
    int studentID;
    int countCode=0;

    String attend;

         public void attendClass() {

             if(attend=="yes") {
                 System.out.println("The student attend the class");
             }
             else {
                 System.out.println("The student doesn't attend the class");
             }
         }

         public void setStudentInfo(String name, int age, String gender, int studentID) {
             this.name=name;
             this.age=age;
             this.gender=gender;
             this.studentID=studentID;

         }


         }

         public String toString() {
             return name+"-"+age+"-"+gender;
         }
}
//
//        create a class called school:
//                    create 3 objects of student and set their info
//                    create a an ArrayList of students to store all student objects
//                    use for each loop to print out each students' name and studentID
//
//        create a class called company:
//                    create 3 objects of employee and set their info
//                    create an array of employees and store all those employee objects
//                    use regular for loop to print out each employee' name and employeeID



//
//

//Task BankAccount
//create a class called BankAccount
//       variables:  accountNumber, accountHolder, Balance
//       methods: deposit, showBalance, toString
//
// create sub class of BankAccount and name it SavingAccount
//       variables: accountNumber, accountHolder, balance, interestRate
//       methods: deposit, showBalance
//
// create sub class of BankAccount and name it checkingAccount
//       variables: accountNumber, accountHolder, balance
//       methods: deposit, withDraw, showBalance
//then create a class called AccountObject
//          create objects for SavingAccount and checkingAccount class and do practice on methods and variables





