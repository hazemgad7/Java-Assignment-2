package JavaAssignment2;

public class Intern extends Employee {
    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 3000;

    }
}
