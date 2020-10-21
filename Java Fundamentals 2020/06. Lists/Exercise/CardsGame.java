import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = readListInt(scanner);
        List<Integer> player2 = readListInt(scanner);

        int i = 0;
        while (i < player1.size() && i < player2.size()) {

            if (player1.get(i) > player2.get(i)) {
                player1.add(player1.get(i));
                player1.add(player2.get(i));
                player1.remove(i);
                player2.remove(i);

            } else if (player1.get(i) < player2.get(i)) {
                player2.add(player2.get(i));
                player2.add(player1.get(i));
                player2.remove(i);
                player1.remove(i);

            } else {
                player1.remove(i);
                player2.remove(i);
            }
        }
        int sum = 0;
        String winner = "";
        if (player1.size() > player2.size()) {
            for (Integer num : player1) {
                sum += num;
                winner = "one";
            }
        } else {
            for (Integer num : player2) {
                sum += num;
                winner = "two";
            }
        }
        System.out.printf("Player %s wins! Sum: %d", winner, sum);
    }

    private static List<Integer> readListInt(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
