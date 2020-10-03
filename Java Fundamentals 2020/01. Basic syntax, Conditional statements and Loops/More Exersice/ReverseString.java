import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();

        StringBuilder rev = new StringBuilder(text);
        rev.reverse();
        String reverseText = rev.toString();
        System.out.println(reverseText);
    }
}