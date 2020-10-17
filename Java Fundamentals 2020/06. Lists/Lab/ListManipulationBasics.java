import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            int number = Integer.parseInt(commands[1]);
            int index;

            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(number);
                    break;
                case "RemoveAt":
                    index = number;
                    numbers.remove(index);
                    break;
                case "Insert":
                    index = Integer.parseInt(commands[2]);
                    numbers.add(index, number);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]}", ""));
    }
}