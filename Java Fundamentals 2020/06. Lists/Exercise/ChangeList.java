import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
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
            int element = Integer.parseInt(commands[1]);

            switch (command) {
                case "Delete":
                    int i = 0;
                    while (i < numbers.size()) {
                        if (numbers.get(i) == element) {
                            numbers.remove(Integer.valueOf(element));
                            i = 0;
                        } else {
                            i++;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    numbers.add(index,element);
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}