package pra_bankAccount;

public class bankAccount {

    private long accountNumber;
    public String accountHolder;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance+=money;
    }

    public void showBalance(double balance) {
    }

    public String toString() {
        return "Rodin has $" + getBalance();
    }

// create sub class of BankAccount and name it SavingAccount
//       variables: accountNumber, accountHolder, balance, interestRate
//       methods: deposit, showBalance
//
// create sub class of BankAccount and name it checkingAccount
//       variables: accountNumber, accountHolder, balance
//       methods: deposit, withDraw, showBalance
//then create a class called AccountObject
//          create objects for SavingAccount and checkingAccount class and do practice on methods and variables

}
