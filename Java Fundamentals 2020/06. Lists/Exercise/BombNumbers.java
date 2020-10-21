import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readListInt(scanner);

        int bombNumber = scanner.nextInt();
        int power = scanner.nextInt();

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) == bombNumber) {
                i -= power;
                if (0 <= i && i < numbers.size()) {
                    for (int j = 0; j < power * 2 + 1; j++) {
                        numbers.remove(i);
                    }
                }
            }
            i++;
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static List<Integer> readListInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}