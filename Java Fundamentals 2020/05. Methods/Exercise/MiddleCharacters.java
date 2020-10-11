import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        printMiddleCharacter(str);
    }

    private static void printMiddleCharacter(String str) {
        String result;
        if (str.length() % 2 != 0) {
            result = String.valueOf(str.charAt(str.length() / 2));
        } else {
            char two = str.charAt(str.length() / 2);
            char one = str.charAt(str.length() / 2 - 1);
            result = "" + one + two;
        }
        System.out.println(result);
    }
}