import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int power = scanner.nextInt();

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) == bombNumber) {
                int removeCount = 2 * power + 1;
                int start = i - power;
                for (int j = 0; j < removeCount; j++) {
                    if (start < numbers.size()) {
                        numbers.remove(start);
                    } else {
                        break;
                    }
                }
                i--;
            }
            i++;
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}