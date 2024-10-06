package Abstraction;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create full-time employee object
        System.out.print("Enter full-time employee name: ");
        String fullTimeEmployeeName = scanner.nextLine();
        System.out.print("Enter full-time employee status: ");
        String fullTimeEmployeeStatus = scanner.nextLine();
        System.out.print("Enter full-time employee basic salary: ");
        double fullTimeEmployeeBasicSalary = scanner.nextDouble();
        System.out.print("Enter full-time employee allowance: ");
        double fullTimeEmployeeAllowance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        FullTimeEmp fullTimeEmployee = new FullTimeEmp(fullTimeEmployeeName, fullTimeEmployeeStatus, fullTimeEmployeeBasicSalary, fullTimeEmployeeAllowance);
        fullTimeEmployee.calculateEmpSalary();
        fullTimeEmployee.displayInfo();

        System.out.println(); // empty line for separation

        // Create part-time employee object
        System.out.print("Enter part-time employee name: ");
        String partTimeEmployeeName = scanner.nextLine();
        System.out.print("Enter part-time employee status: ");
        String partTimeEmployeeStatus = scanner.nextLine();
        System.out.print("Enter part-time employee hourly rate: ");
        double partTimeEmployeeHourlyRate = scanner.nextDouble();
        System.out.print("Enter part-time employee hours worked: ");
        double partTimeEmployeeHoursWorked = scanner.nextDouble();

        PartTimeEmp partTimeEmployee = new PartTimeEmp(partTimeEmployeeName, partTimeEmployeeStatus, partTimeEmployeeHourlyRate, partTimeEmployeeHoursWorked);
        partTimeEmployee.calculateEmpSalary();
        partTimeEmployee.displayInfo();

        scanner.close();
    }
}