package week81;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.display();

        st1.setName("Anushreet");
        st1.setId(111);

        employee emp = new employee(50000);

        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());

        bankAccount account = new bankAccount("12345", "Alice", 1000.0);

        account.deposit(500);
        double balanceAfterDeposit = account.getBalance();

        boolean successWithdraw = account.withdraw(300);
        double balanceAfterWithdraw = account.getBalance();

        boolean failedWithdraw = account.withdraw(2000);
        double balanceAfterFailedWithdraw = account.getBalance();

        System.out.println("Balance after deposit: " + balanceAfterDeposit);
        System.out.println("Withdraw 300 successful? " + successWithdraw);
        System.out.println("Balance after withdraw: " + balanceAfterWithdraw);
        System.out.println("Withdraw 2000 successful? " + failedWithdraw);
        System.out.println("Balance after failed withdraw: " + balanceAfterFailedWithdraw);
        
        ShoppingCart cart = new ShoppingCart("Wireless Mouse", 25.99, 2);
        cart.displayCart();
        cart.setQuantity(3);
        System.out.println("\nUpdated Quantity: " + cart.getQuantity());
        cart.displayCart();
        double discountPercent = 10.0;
        double discountedTotal = cart.calculateDiscountedTotal(discountPercent);
        System.out.println("\nDiscounted Total (" + discountPercent + "% off): $" + discountedTotal);
        
         ElectricityBill bill= new ElectricityBill("Nixon", 135);
        bill.displayBill(); bill.setUnitsConsumed(160);
        System.out.println("\nUpdated Units: " + bill.getUnitsConsumed());
        bill.displayBill(); 
    
    }
}
