package Encapsulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages user accounts and authentication processes.
 */

public class UserManagement {
    private Map<String, User> users;

    /**
     * Constructor initializes the user management system with a default admin user.
     */
    public UserManagement() {
        users = new HashMap<>();
        // Initialize with the admin user
        addUser(new User(1, "Admin", "SeniorProg1234", "Administrator"));
        addUser(new User(1, "LukaDoncic", "DallasMavericks77", "Luka Doncic"));
    }

    /**
     * Adds a new user to the system.
     * @param user The User object to add
     */
    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    /**
     * Authenticates a user based on username and password.
     * If successful, generates and sets an OTP for the user.
     * @param username The username to authenticate
     * @param password The password to verify
     * @return true if authentication is successful, false otherwise
     */
    public boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        if (user != null && user.validatePassword(password)) {
            String otp = OtpGenerator.generateOtp();
            user.setOtp(otp);
            System.out.println("OTP sent to user: " + otp); // In a real scenario, this would be sent via email or SMS
            return true;
        }
        return false;
    }

    /**
     * Validates the OTP for a given user.
     * @param username The username of the user
     * @param otp The OTP to validate
     * @return true if the OTP is valid, false otherwise
     */
    public boolean validateOtp(String username, String otp) {
        User user = users.get(username);
        return user != null && user.validateOtp(otp);
    }

    /**
     * Retrieves a User object by username.
     * @param username The username to look up
     * @return The User object if found, null otherwise
     */
    public User getUser(String username) {
        return users.get(username);
    }
}