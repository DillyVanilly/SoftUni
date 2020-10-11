import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine().toLowerCase();

        checkPassword(input);
    }

    private static void checkPassword(String string) {

        boolean check1 = checkCountOfCharacters(string);
        boolean check2 = checkLettersAndDigits(string);
        boolean check3 = checkLastTwoDigits(string);

        if (check1 && check2 && check3) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkCountOfCharacters(String string) {
        boolean flag = false;
        if (6 <= string.length() && string.length() <= 10) {
            flag = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return flag;
    }

    private static boolean checkLettersAndDigits(String string) {
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (48 <= symbol && symbol <= 57
                    || 65 <= symbol && symbol <= 90
                    || 97 <= symbol && symbol <= 122) {
                flag = true;
            } else {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return flag;
    }

    private static boolean checkLastTwoDigits(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (Character.isDigit(symbol)) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}