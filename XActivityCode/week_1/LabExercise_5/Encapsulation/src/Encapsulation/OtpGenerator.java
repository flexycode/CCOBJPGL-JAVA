package Encapsulation;

import java.security.SecureRandom;

/**
 * Utility class for generating One-Time Passwords (OTPs).
 */

public class OtpGenerator {
    private static final String OTP_CHARS = "0123456789";
    private static final int OTP_LENGTH = 6;

    /**
     * Generates a random OTP of specified length.
     * @return A string representing the generated OTP
     */
    public static String generateOtp() {
        StringBuilder otp = new StringBuilder(OTP_LENGTH);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(OTP_CHARS.charAt(random.nextInt(OTP_CHARS.length())));
        }

        return otp.toString();
    }
}
