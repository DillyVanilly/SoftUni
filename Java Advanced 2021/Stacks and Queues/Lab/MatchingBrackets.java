import java.util.*;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> indexes = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '(') {
                indexes.push(i);
            } else if (symbol == ')') {
                System.out.println(input.substring(indexes.pop(), i + 1));
            }
        }
    }
}