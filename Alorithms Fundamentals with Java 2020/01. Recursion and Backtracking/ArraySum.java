package RecursionBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = sumNumbers(array, array.length-1);
        System.out.println(sum);
    }

    public static int sumNumbers(int[] numbers, int index) {
        if (index <0) {
            return 0;
        }
        return numbers[index] + sumNumbers(numbers, index - 1);
    }
}