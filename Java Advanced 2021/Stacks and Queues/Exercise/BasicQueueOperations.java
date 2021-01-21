import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer>queue = new ArrayDeque<>();

        int[] numInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numInput[0];
        int s = numInput[1];
        int x = numInput[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(numbers[i]);
        }

        if (!queue.isEmpty()) {
            for (int i = 0; i < s; i++) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(x)) {
            System.out.println("true");
        } else {
            int smallest = Collections.min(queue);
            System.out.println(smallest);
        }
    }
}