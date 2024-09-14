package MidtermExam;

public class Irregular extends Student {
    // Constructor to initialize Irregular student
    public Irregular(String name, String degree, double grade) {
        super(name, degree, grade);
        // Validate Grade
        if (grade >= 85) {
            throw new IllegalArgumentException("Irregular student's grade must be less than 85");
        }
    }

    // Method to display Irregular Student Information :)
    public void displayStudentInfo() {
        System.out.println("Irregular Student Information:");
        System.out.println("Name: " + getName());
        System.out.println("Degree: " + getDegree());
        System.out.println("Grade: " + getGrade());
    }
}