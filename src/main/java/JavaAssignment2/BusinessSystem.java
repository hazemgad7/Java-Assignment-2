package JavaAssignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BusinessSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Employee> employees = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. View Total Payroll");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Employee Type (1=Manager, 2=SalesPerson, 3=Intern): ");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Base Salary: ");
                double baseSalary = scanner.nextDouble();
                scanner.nextLine();

                Employee emp = null;

                if (type == 1) {
                    System.out.print("Enter Bonus: ");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine();
                    emp = new Manager(id, name, baseSalary, bonus);
                } else if (type == 2) {
                    System.out.print("Enter Commission: ");
                    double commission = scanner.nextDouble();
                    scanner.nextLine();
                    emp = new SalesPerson(id, name, baseSalary, commission);
                } else if (type == 3) {
                    emp = new Intern(id, name, baseSalary);
                } else {
                    System.out.println("Invalid employee type.");
                    continue;
                }

                employees.put(id, emp);
                System.out.println("Employee added.");
            } else if (choice == 2) {
                if (employees.isEmpty()) {
                    System.out.println("No employees found.");
                } else {
                    for (Employee emp : employees.values()) {
                        emp.displayInfo();
                        System.out.println("Calculated Salary: " + emp.calculateSalary());
                        if (emp instanceof Manager) System.out.println("Role: Manager");
                        else if (emp instanceof SalesPerson) System.out.println("Role: SalesPerson");
                        else if (emp instanceof Intern) System.out.println("Role: Intern");
                        System.out.println("------------------");
                    }
                }
            } else if (choice == 3) {
                double total = 0;
                for (Employee emp : employees.values()) {
                    total += emp.calculateSalary();
                }
                System.out.println("Total Payroll: " + total);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println();
        }

        scanner.close();
    }
}