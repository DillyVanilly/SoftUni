import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int i = 0;
        while (i < numbers.size()-1) {
            double current = numbers.get(i);
            double next = numbers.get(i + 1);
            if (current == next) {
                numbers.set(i, current + next);
                numbers.remove(i + 1);
                i=0;
            } else {
                i++;
            }
        }
        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> numbers, String delimiter) {
        String output = "";
        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number) + delimiter);
        }
        return output;
    }
}