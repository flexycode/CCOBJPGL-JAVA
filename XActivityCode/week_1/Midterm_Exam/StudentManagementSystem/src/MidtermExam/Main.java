package MidtermExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt User for student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Prompt User for Student degree
        System.out.print("Enter student degree: ");
        String degree = scanner.nextLine();

        // Prompt User for Student grade
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        try {
            // Try to create a Regular student object with the input values
            Regular regular = new Regular(name, degree, grade);
            regular.displayStudentInfo();
        } catch (IllegalArgumentException e) {
            try {
                // If Regular student creation fails, try to create an Irregular student object
                Irregular irregular = new Irregular(name, degree, grade);
                irregular.displayStudentInfo();
            } catch (IllegalArgumentException ex) {
                System.out.println("Invalid grade. Please try again.");
            }
        }
    }
}