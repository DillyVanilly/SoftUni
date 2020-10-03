package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0.0;

        switch (flowerType) {
            case "Roses":
                finalPrice = flowerCount * 5.00;
                if (flowerCount > 80) {
                    finalPrice *= 0.90;
                }
                break;
            case "Dahlias":
                finalPrice = flowerCount * 3.80;
                if (flowerCount > 90) {
                    finalPrice *= 0.85;
                }
                break;
            case "Tulips":
                finalPrice = flowerCount * 2.80;
                if (flowerCount > 80) {
                    finalPrice *= 0.85;
                }
                break;
            case "Narcissus":
                finalPrice = flowerCount * 3.00;
                if (flowerCount < 120) {
                    finalPrice *= 1.15;
                }
                break;
            case "Gladiolus":
                finalPrice = flowerCount * 2.50;
                if (flowerCount < 80) {
                    finalPrice *= 1.2;
                }
                break;
        }

        if (finalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - finalPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (finalPrice - budget));
        }
    }
}