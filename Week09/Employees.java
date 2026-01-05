package Week09;


public class Employees {
    protected int employeeID;
    protected String name;
    protected double basicSalary;

    public Employees(int employeeID, String name, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    double calculateBonus(){
        return basicSalary*0.1;
    }
    void displayEmployee(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
