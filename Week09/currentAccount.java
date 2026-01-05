package Week09;


public class currentAccount extends BankAccount{
    protected double overdraftLimit;

    public currentAccount(int accountNumber, String accountholderName, double balance, double overdraftLimit) {
        super(accountNumber, accountholderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    boolean withdraw(double amount){
        if (amount <= balance+overdraftLimit){
            balance = balance - amount;
            return true;
        }
        return false;
    }

}
