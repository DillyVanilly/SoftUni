import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Change":
                    if (numbers.contains(Integer.parseInt(commands[1]))) {
                        int index = numbers.indexOf(Integer.parseInt(commands[1]));
                        numbers.set(index, Integer.parseInt(commands[2]));
                    }
                    break;
                case "Hide":
                    if (numbers.contains(Integer.parseInt(commands[1]))) {
                        numbers.remove((Integer) Integer.parseInt(commands[1]));
                    }
                    break;
                case "Switch":
                    int index1 = numbers.indexOf(Integer.parseInt(commands[1]));
                    int index2 = numbers.indexOf(Integer.parseInt(commands[2]));
                    if (0 <= index1 && index1 < numbers.size() && 0 <= index2 && index2 < numbers.size()) {
                        int tmp = numbers.get(index1);
                        numbers.set(index1, numbers.get(index2));
                        numbers.set(index2, tmp);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[1]) + 1;
                    if (0 <= index && index < numbers.size()) {
                        numbers.add(index, Integer.parseInt(commands[2]));
                    }
                    break;
                case "Reverse":
                    Collections.reverse(numbers);
                    break;
            }
            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}