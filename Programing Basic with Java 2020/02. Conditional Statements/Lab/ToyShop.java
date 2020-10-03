package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numAllToys = puzzles + talkingDolls + teddyBears + minions + trucks;

        double sumAllToys = (puzzles * 2.6) + (talkingDolls * 3)
                + (teddyBears * 4.1) + (minions * 8.2) + (trucks * 2);

        double finalSum;

        if (numAllToys >= 50) {
            finalSum = sumAllToys * 0.75;
        } else {
            finalSum = sumAllToys;
        }

        double shopRent = finalSum * 0.1;
        finalSum -= shopRent;

        double rest;
        double notEnough;

        if (finalSum >= excursion) {
            rest = finalSum - excursion;
            System.out.printf("Yes! %.2f lv left.%n", rest);
        } else {
            notEnough = excursion - finalSum;
            System.out.printf("Not enough money! %.2f lv needed.%n", notEnough);
        }
    }
}