package utils;

public class InputValidator {
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isValidAvailability(String status) {
        return status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Checked Out");
    }
}
