import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> queues = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (queues.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queues.pollFirst());
                }
            } else {
                queues.offer(input);
            }
            input = scanner.nextLine();
        }

        for (String queue : queues) {
            System.out.println(queue);
        }
    }
}