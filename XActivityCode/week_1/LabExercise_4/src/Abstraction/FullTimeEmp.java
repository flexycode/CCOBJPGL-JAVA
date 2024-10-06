package Abstraction;

/**
 * This class represents a full-time employee and implements the Employee interface.
 */
public class FullTimeEmp implements Employee {
    // Private fields to store employee information
    private final String employeeName;
    private final String employeeStatus;
    private final double basicSalary;
    private final double allowance;
    private double deduction;
    private double grossPay;
    private double netSalary;

    /**
     * Constructor to initialize a full-time employee object.
     *
     * @param employeeName   the employee's name
     * @param employeeStatus the employee's status (full-time)
     * @param basicSalary   the basic salary
     * @param allowance     the allowance
     */

    public FullTimeEmp(String employeeName, String employeeStatus, double basicSalary, double allowance) {
        this.employeeName = employeeName;
        this.employeeStatus = employeeStatus;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    /**
     * Calculates the full-time employee's salary.
     * This method calculates the gross pay by adding the basic salary and allowance,
     * then calculates the deduction (10% of the gross pay), and finally calculates
     * the net salary by subtracting the deduction from the gross pay.
     */
    @Override
    public void calculateEmpSalary() {
        grossPay = basicSalary + allowance;
        deduction = grossPay * 0.10; // 10% tax deduction
        netSalary = grossPay - deduction;
    }

    /**
     * Displays the full-time employee's information.
     * This method prints out the employee's name, status, basic salary, allowance,
     * gross pay, deduction, and net salary.
     */

    @Override
    public void displayInfo() {
        System.out.println("Full-time Employee Information:");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Status: " + employeeStatus);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deduction (10% tax): " + deduction);
        System.out.println("Net Salary: " + netSalary);
    }
}