import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int count = word.length();
            result.append(word.repeat(count));
        }
        System.out.print(result);
    }
}