package Week09;

public class Person {
    protected int ID;
    static String collegeName="Islington College";
    protected String name;
    protected double basicSalary;

    public Person(int ID, String name, double basicSalary) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
    }
     double calculateAnnualSalary() {
        return basicSalary*12;
    }

}
