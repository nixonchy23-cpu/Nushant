package Week09;


public class BankAccount {
    protected  int accountNumber;
    protected String accountholderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountholderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountholderName = accountholderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    double getBalance() {
        return balance;
    }
}
