package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        int boatRental = 0;
        double finalPrice = 0;

        if ("Spring".equals(season)) {
            boatRental = 3000;
            finalPrice += boatRental;
        } else if ("Summer".equals(season) || "Autumn".equals(season)) {
            boatRental = 4200;
            finalPrice += boatRental;
        } else if ("Winter".equals(season)) {
            boatRental = 2600;
            finalPrice += boatRental;
        }

        if (fishermen <= 6) {
            finalPrice *= 0.90;
        } else if (fishermen <= 11) {
            finalPrice *= 0.85;
        } else {
            finalPrice *= 0.75;
        }

        if (!"Autumn".equals(season) && fishermen % 2 == 0) {
            finalPrice *= 0.95;
        }
        if (finalPrice <= budget) {
            double leftMoney = budget - finalPrice;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else { //budget < rent
            double needMoney = finalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }
    }
}
