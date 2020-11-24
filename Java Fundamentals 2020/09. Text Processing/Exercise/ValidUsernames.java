import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String userName : usernames) {
            if (isValidateUsername(userName)) {
                System.out.println(userName);
            }
        }
    }

    private static boolean isValidateUsername(String userName) {
        if (userName.length() < 3 || userName.length() > 16) {
            return false;
        }
        for (int i = 0; i < userName.length(); i++) {
            char symbol = userName.charAt(i);
            if (!Character.isLetterOrDigit(symbol)
                    && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
