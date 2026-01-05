package Week09;


public class SavingAccount extends BankAccount{
    protected double InterestRate;

    public SavingAccount(int accountNumber, String accountholderName, double balance, double InterestRate) {
        super(accountNumber, accountholderName, balance);
        this.InterestRate = InterestRate;
    }
    double calculateInterest(){
        return super.getBalance() * InterestRate / 100;
    }
}
