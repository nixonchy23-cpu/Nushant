package Week09;


public class ContractEmployee extends Employees {
    protected int workingDays;

    public ContractEmployee(int employeeID, String name, double basicSalary, int workingDays) {
        super(employeeID, name, basicSalary);
        this.workingDays = workingDays;
    }
    double calculateTotalSalary(){
        double total=basicSalary*workingDays;
        return total;
    }
}
