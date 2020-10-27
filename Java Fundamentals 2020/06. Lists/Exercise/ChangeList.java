import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];
            int element = Integer.parseInt(commands[1]);

            switch (command) {
                case "Delete":
                    int i = 0;
                    while (i < numbers.size()) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                            i = 0;
                        } else {
                            i++;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.add(index, element);
                        break;
                    }
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}