import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");

        Deque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }
}