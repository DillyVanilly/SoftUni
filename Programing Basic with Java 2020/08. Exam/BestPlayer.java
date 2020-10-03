package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int bestResult = 0;
        boolean isHatTrick = false;

        String playerName = scanner.nextLine();

        while (!playerName.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestResult) {
                bestResult = goals;
                bestPlayer = playerName;
                if (goals >= 3) {
                    isHatTrick = true;
                }
                if (goals >= 10) {
                    break;
                }
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);

        if (isHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestResult);
        } else {
            System.out.printf("He has scored %d goals.", bestResult);
        }
    }
}