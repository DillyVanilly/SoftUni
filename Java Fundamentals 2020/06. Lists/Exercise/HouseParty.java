import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfComments = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>(countOfComments);

        for (int i = 0; i < countOfComments; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];

            if (guestList.contains(name)) {
                if ("going!".equals(input[2])) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestList.remove(name);
                }
            } else {
                if ("going!".equals(input[2])) {
                        guestList.add(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
                }
            }
            for (String name : guestList) {
                System.out.println(name);
            }
        }
    }