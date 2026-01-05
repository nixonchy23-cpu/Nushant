package Week09;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Prabesh", 20000, "Science", 2000);
        Staff s = new Staff(2, "Rahul", 10000, 20, 500);

        System.out.println("Total annual salary of Teacher is: " + t.calculateAnnualSalary());
        System.out.println("Total salary of Staff is: " + s.calculateSalary());
        System.out.println("College Name = " + Person.collegeName);
    }
}
