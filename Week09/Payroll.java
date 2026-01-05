package Week09;


public class Payroll {
    public static void main(String[] args) {
        PermanentEmployee pE=new PermanentEmployee(1,"Prabesh",20000,1000,2000);
        ContractEmployee cE=new ContractEmployee(2,"Rahul",30000,20);
        pE.displayEmployee();;
        System.out.println("Total Salary is: "+pE.calculateTotalSalary());
        cE.displayEmployee();
        System.out.println("Total Salary is: "+cE.calculateTotalSalary());
    }
}
