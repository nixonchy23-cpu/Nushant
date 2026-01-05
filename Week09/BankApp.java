package Week09;


public class BankApp {
    public static void main(String[] args) {
        SavingAccount SA=new SavingAccount(1234,"Prabesh",4000000,9);
        currentAccount cA=new currentAccount(12345,"Rahul",6000000,20000);
        SA.deposit(500000);
        System.out.println("Current Amount: "+SA.getBalance());
        cA.deposit(5000);
        boolean result=cA.withdraw(50000);
        if(result){
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Withdraw Failed");
        }
        System.out.println("Current Amount: "+cA.getBalance());

    }
}
