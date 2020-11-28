import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char previousChar = input.charAt(0);
        sb.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != previousChar) {
                sb.append(current);
                previousChar = current;
            }
        }
        System.out.println(sb.toString());
    }
}