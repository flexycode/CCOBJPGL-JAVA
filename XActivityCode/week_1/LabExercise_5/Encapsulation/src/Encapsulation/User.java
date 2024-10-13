package Encapsulation;

/**
 * Represents a user in the system.
 * This class encapsulates user data and provides methods for user authentication.
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String fullName;
    private String otp;

    /**
     * Constructor to create a new User object.
     * @param userId Unique identifier for the user
     * @param username User's login name
     * @param password User's password
     * @param fullName User's full name
     */
    public User(int userId, String username, String password, String fullName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    // Getter methods to access private fields
    /**
     * @return The user's unique identifier
     */
    public int getUserId() { return userId; }

    /**
     * @return The user's username
     */
    public String getUsername() { return username; }

    /**
     * @return The user's full name
     */
    public String getFullName() { return fullName; }

    /**
     * Updates the user's full name.
     * @param fullName The new full name to set
     */
    public void setFullName(String fullName) { this.fullName = fullName; }

    /**
     * Sets the OTP for this user.
     * @param otp The OTP to set
     */
    public void setOtp(String otp) { this.otp = otp; }

    /**
     * Validates the given OTP against the stored OTP.
     * @param inputOtp The OTP to validate
     * @return true if the OTP is valid, false otherwise
     */
    public boolean validateOtp(String inputOtp) { return this.otp.equals(inputOtp); }

    /**
     * Validates the given password against the stored password.
     * @param inputPassword The password to validate
     * @return true if the password is correct, false otherwise
     */
    public boolean validatePassword(String inputPassword) { return this.password.equals(inputPassword); }
}