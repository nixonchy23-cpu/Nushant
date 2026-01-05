package Week09;

public class Staff extends Person {
    protected int workingHours;
    protected double ratePerHour;

    public Staff(int ID, String name, double basicSalary, int workingHours, double ratePerHour) {
        super(ID, name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    double calculateSalary() {
        return workingHours*ratePerHour;
    }
}
