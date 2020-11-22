import java.util.Calendar;
import java.util.Scanner;

public class DigitsLetters {
    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine();


        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        StringBuilder result3 = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                result1.append(input.charAt(i));
            }else if (Character.isLetter(input.charAt(i))) {
                result2.append(input.charAt(i));
            } else {
                result3.append(input.charAt(i));
            }
        }
        System.out.println(result1.toString());
        System.out.println(result2.toString());
        System.out.println(result3.toString());
    }
}