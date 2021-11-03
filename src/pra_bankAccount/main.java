package pra_bankAccount;

public class main {

    public static void main(String[] args) {

        bankAccount bankAccount1=new bankAccount();
        savingAccount savingAccount1=new savingAccount();

        savingAccount1.setAccountHolder("Suphi Bingol");
        savingAccount1.getAccountHolder();

        System.out.println("Account holder name is " +savingAccount1.getAccountHolder());


        bankAccount1.getBalance();
    }



//Task BankAccount
//create a class called BankAccount
//       variables:  accountNumber, accountHolder, Balance
//       methods: deposit, showBalance, toString
//
//
//
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

//
//
//
//
// create a class called school:
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



}
