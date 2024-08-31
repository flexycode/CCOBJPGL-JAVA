package Overloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Case #1: Default constructor
        Employee employee1 = new Employee();
        System.out.println("Employee Name:_");
        System.out.println("Employee ID no.:_");
        employee1.displayInfo();

        // Test Case #2: Parameterized constructor with name and ID
        System.out.println("\nEnter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        Employee employee2 = new Employee(name, employeeId);
        System.out.println(STR."\nEmployee Name: \{name}");
        System.out.println(STR."Employee ID no.:\{employeeId}");
        employee2.displayInfo();

        // Test Case #3: Constructor with only name
        System.out.println("\nEnter employee name:");
        name = scanner.nextLine();
        Employee employee3 = new Employee(name);
        System.out.println(STR."\nEmployee Name: \{name}");
        System.out.println("Employee ID no.:");
        employee3.displayInfo();

        // Test Case #4: Constructor with only name
        System.out.println("\nEnter employee name:");
        name = scanner.nextLine();
        Employee employee4 = new Employee(name);
        System.out.println(STR."\nEmployee Name: \{name}");
        System.out.println("Employee ID no.:");
        employee4.displayInfo();
    }
}
