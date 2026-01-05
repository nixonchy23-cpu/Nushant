package Week09;


public class PermanentEmployee extends Employees {
    protected double HRA;
    protected double DA;
    public PermanentEmployee(int employeeID,String name,double basicSalary,double HRA,double DA){
        super(employeeID,name,basicSalary);
        this.HRA=HRA;
        this.DA=DA;

    }
    double calculateTotalSalary(){
        double total=basicSalary+HRA+DA+super.calculateBonus();
        return total;
    }


}
