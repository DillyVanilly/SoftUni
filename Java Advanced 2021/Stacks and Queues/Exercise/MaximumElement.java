import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            switch (command[0]) {
                case 1:
                    stack.push(command[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int max = Collections.max(stack);
                    System.out.println(max);
                    break;
            }
        }
    }
}