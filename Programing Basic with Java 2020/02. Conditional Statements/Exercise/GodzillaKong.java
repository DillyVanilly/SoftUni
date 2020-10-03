package ConditionalStatementsExe;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double finalSumClothing = countStatists * clothingPrice;

        if (countStatists > 150) {
            finalSumClothing *= 0.9;
        }
        double decorAndClothing = decor + finalSumClothing;
        if (decorAndClothing > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", decorAndClothing - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget-decorAndClothing);
        }
    }
}