import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listInt = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "swap":
                    swapInList(listInt, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "multiply":
                    multiplyInList(listInt, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "decrease":
                    decreaseInList(listInt);
                    break;
            }
            input = scanner.nextLine();
        }
        printList(listInt, ", ");
    }

    private static void printList(List<Integer> listInt, String separator) {
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i));
            if (i < listInt.size() - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }

    static void decreaseInList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - 1);
        }
    }

    static void multiplyInList(List<Integer> list, int index1, int index2) {
        list.set(index1, list.get(index1) * list.get(index2));
    }

    static void swapInList(List<Integer> list, int index1, int index2) {
        int tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}