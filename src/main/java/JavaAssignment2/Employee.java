package JavaAssignment2;

public abstract class Employee {
    //  Fields (private)
    private int id ;
    private String name ;
    private double baseSalary ;
    // +5 point
    private static int employeeCount = 0 ;

    public Employee(int id ,String name , double baseSalary){
        this.id = id ;
        this.name = name ;
        this.baseSalary = baseSalary ;
        employeeCount ++ ;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public static int getEmployeeCount() {
        return employeeCount ;
    }
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
