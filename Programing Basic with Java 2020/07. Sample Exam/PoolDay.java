package SampleExam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double deckChair = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double allFee = people * fee;
        double totalDeckChairs = Math.ceil(people * 0.75) * deckChair;
        double totalUmbrella = Math.ceil(people * 1.0 / 2) * umbrella;

        double sum = allFee + totalDeckChairs + totalUmbrella;

        System.out.printf("%.2f lv.", sum);
    }
}
