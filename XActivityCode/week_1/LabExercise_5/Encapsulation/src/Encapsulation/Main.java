package Encapsulation;

import java.util.Scanner;

/**
 * Main class to demonstrate the user management system functionality.
 */

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Management System");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Attempt to authenticate the user
        if (userManagement.authenticateUser(username, password)) {
            System.out.println("Authentication successful. OTP has been sent.");
            System.out.print("Enter OTP: ");
            String otp = scanner.nextLine();

            // Validate the OTP
            if (userManagement.validateOtp(username, otp)) {
                System.out.println("OTP validated successfully.");
                User user = userManagement.getUser(username);
                System.out.println("Welcome, " + user.getFullName() + "!");
                // Add more functionality here
            } else {
                System.out.println("Invalid OTP. Access denied.");
            }
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }

        scanner.close();
    }
}