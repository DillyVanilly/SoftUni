import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commends = input.split(" ");

            if (commends[0].equals("Add")) {
                int passengers = Integer.parseInt(commends[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(commends[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int allPassengers = wagons.get(i) + passengers;
                    if (allPassengers <= maxCapacity) {
                        wagons.set(i, allPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}