package pra_bankAccount;

public class savingAccount {

    private long accountNumber;
    public String accountHolder;
    private double balance;
    public double interestRate;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder=accountHolder;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber=accountNumber; }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
//       methods: deposit, showBalance

}
