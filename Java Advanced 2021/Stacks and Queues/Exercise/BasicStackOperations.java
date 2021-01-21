import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int[] numInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numInput[0];
        int s = numInput[1];
        int x = numInput[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        if (!stack.isEmpty()) {
            for (int i = 0; i < s; i++) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            int smallest = Collections.min(stack);
            System.out.println(smallest);
        }
    }
}