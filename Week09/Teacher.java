package Week09;

public class Teacher extends Person {
    private String subject;
    protected double bonus;

    public Teacher(int ID, String name, double basicSalary, String subject, double bonus) {
        super(ID, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }
    @Override
    double calculateAnnualSalary(){
        return super.calculateAnnualSalary()+bonus;

    }

}
