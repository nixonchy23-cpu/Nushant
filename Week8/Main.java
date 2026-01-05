package Week8;

public class Main {
    public static void main(String[] args) {
        Student st1 = new student();
        st1.display();

        st1.setName("Nixon");
        st1.setId(111);

        Employee emp = new Employee(50000);

        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
    }
}
