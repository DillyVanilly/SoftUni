import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] allCommands = input.split(" ");
            String command = allCommands[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(allCommands[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String typeNum = allCommands[1];
                    for (Integer num : numbers) {
                        switch (typeNum) {
                            case "even":
                                if (num % 2 == 0) {
                                    System.out.print(num + " ");
                                }
                                break;
                            case "odd":
                                if (num % 2 != 0) {
                                    System.out.print(num + " ");
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer num : numbers) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = allCommands[1];
                    int num = Integer.parseInt(allCommands[2]);
                    for (Integer n : numbers) {
                        switch (condition) {
                            case ">":
                                if (n > num) {
                                    System.out.print(n + " ");
                                }
                                break;
                            case "<":
                                if (n < num) {
                                    System.out.print(n + " ");
                                }
                                break;
                            case ">=":
                                if (n >= num) {
                                    System.out.print(n + " ");
                                }
                                break;
                            case "<=":
                                if (n <= num) {
                                    System.out.print(n + " ");
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
