package Overloading;

public class Employee {
    String name;
    int employeeId;

    // Constructor with no parameters
    public Employee() {
        this.name = "Unknown Employee";
        this.employeeId = 0;
    }

    // Constructor with only employee name
    public Employee(String name) {
        this.name = name;
        this.employeeId = 911111;
    }

    // Constructor with both employee name and ID
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println(STR."Employee Information: \{name}, \{employeeId}");
    }
}