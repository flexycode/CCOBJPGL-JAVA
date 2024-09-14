package MidtermExam;

// Private fields to store a student information
public class Student {
    private String name;
    private String degree;
    private double grade;

    // Constructor to initialize student information
    public Student(String name, String degree, double grade) {
        this.name = name;
        this.degree = degree;
        this.grade = grade;
    }

    // Getter method to retrieve student name
    public String getName() {
        return name;
    }

    // Getter method to retrieve student degree
    public String getDegree() {
        return degree;
    }

    // Getter method to retrieve student grade
    public double getGrade() {
        return grade;
    }
}
