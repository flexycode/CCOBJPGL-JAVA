package Abstraction;

/**
 * This class represents a part-time employee and implements the Employee interface.
 */
public class PartTimeEmp implements Employee {
    // Private fields to store employee information
    private final String employeeName;
    private final String employeeStatus;
    private final double hourlyRate;
    private final double hoursWorked;
    private double grossPay;
    private double deduction;
    private double netSalary;

    /**
     * Constructor to initialize a part-time employee object.
     *
     * @param employeeName   the employee's name
     * @param employeeStatus the employee's status (part-time)
     * @param hourlyRate    the hourly rate
     * @param hoursWorked   the hours worked
     */

    public PartTimeEmp(String employeeName, String employeeStatus, double hourlyRate, double hoursWorked) {
        this.employeeName = employeeName;
        this.employeeStatus = employeeStatus;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates the part-time employee's salary.
     * This method calculates the gross pay by multiplying the hourly rate and hours
     * worked, then calculates the deduction (5% of the gross pay), and finally
     * calculates the net salary by subtracting the deduction from the gross pay.
     */
    @Override
    public void calculateEmpSalary() {
        grossPay = hourlyRate * hoursWorked;
        deduction = grossPay * 0.05; // 5% tax deduction
        netSalary = grossPay - deduction;
    }

    /**
     * Displays the part-time employee's information.
     * This method prints out the employee's name, status, hourly rate, hours worked,
     * gross pay, deduction, and net salary.
     */

    @Override
    public void displayInfo() {
        System.out.println("Part-time Employee Information:");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Status: " + employeeStatus);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deduction (5% tax): " + deduction);
        System.out.println("Net Salary: " + netSalary);
    }
}
