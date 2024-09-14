package MidtermExam;

public class Regular extends Student {
    // Constructor to initialize regular student
    public Regular(String name, String degree, double grade) {
        super(name, degree, grade);
        // Validate grade
        if (grade < 85) {
            throw new IllegalArgumentException("Regular student's grade must be at least 85");
        }
    }

    // Method to display Regular student information :)
    public void displayStudentInfo() {
        System.out.println("Regular Student Information:");
        System.out.println("Name: " + getName());
        System.out.println("Degree: " + getDegree());
        System.out.println("Grade: " + getGrade());
    }
}
