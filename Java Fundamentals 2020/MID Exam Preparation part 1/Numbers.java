import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }

        double average = sum * 1.0 / arr.length;

        List<Integer> numbers = new ArrayList<>();
        for (int j : arr) {
            if (j > average) {
                numbers.add(j);
            }
        }
        if (numbers.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(numbers);
            Collections.reverse(numbers);

            for (int i = 0; i < Math.min(numbers.size(), 5); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}