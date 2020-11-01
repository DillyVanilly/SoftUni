import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] commands = input.split(" - ");
            String command = commands[0];
            String item = commands[1];

            switch (command) {
                case "Collect":
                    if (!itemsList.contains(item)) {
                        itemsList.add(item);
                    }
                    break;
                case "Drop":
                    itemsList.remove(item);
                    break;
                case "Combine Items":
                    String[] comb = item.split(":");
                    String oldItem = comb[0];
                    String newItem = comb[1];
                    if (itemsList.contains(oldItem)) {
                        int index = itemsList.indexOf(oldItem);
                        itemsList.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (itemsList.contains(item)) {
                        int index = itemsList.indexOf(item);
                        String tmp = itemsList.get(index);
                        itemsList.remove(index);
                        itemsList.add(tmp);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.print(itemsList.get(i));
            if (i < itemsList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}