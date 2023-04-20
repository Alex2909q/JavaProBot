package academy.prog.javaprobot;

public class Utils {
    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 12) {
            return false;
        }

        if (!phoneNumber.startsWith("380")) {
            return false;
        }

        for (int i = 4; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
}
