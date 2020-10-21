import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] allCommands = input.split("\\s+");
            String command = allCommands[0];
            int number;
            int index;

            switch (command) {
                case "Add":
                    number = Integer.parseInt(allCommands[1]);
                    numbers.add(number);
                    break;
                case "Remove":
                    index = Integer.parseInt(allCommands[1]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    number = Integer.parseInt(allCommands[1]);
                    index = Integer.parseInt(allCommands[2]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = allCommands[1];
                    int count = Integer.parseInt(allCommands[2]);
                    shift(numbers, direction, count);
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void shift(List<Integer> numbers, String direction, int count) {
        int lastIndex = numbers.size() - 1;
        if (direction.equals("left")) {
            for (int i = 0; i < count; i++) {
                int num = numbers.get(0);
                numbers.remove(0);
                numbers.add(lastIndex, num);
            }
        } else {
            for (int i = 0; i < count; i++) {
                int num = numbers.get(lastIndex);
                numbers.remove(lastIndex);
                numbers.add(0, num);
            }
        }
    }
}