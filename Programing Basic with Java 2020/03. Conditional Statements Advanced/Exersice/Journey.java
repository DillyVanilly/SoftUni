package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeVacation = "";
        double spentMoney = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if ("summer".equals(season)) {
                spentMoney = budget * 0.3;
                typeVacation = "Camp";
            } else {
                spentMoney = budget * 0.7;
                typeVacation = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if ("summer".equals(season)) {
                spentMoney = budget * 0.4;
                typeVacation = "Camp";
            } else {
                spentMoney = budget * 0.8;
                typeVacation = "Hotel";
            }

        } else if (budget > 1000) {
            destination = "Europe";
            spentMoney = budget * 0.9;
            typeVacation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeVacation, spentMoney);
    }
}
