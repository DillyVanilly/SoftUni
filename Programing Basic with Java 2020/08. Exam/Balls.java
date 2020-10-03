package Exam;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBalls = Integer.parseInt(scanner.nextLine());

        int pointsRed = 0;
        int pointsOrange = 0;
        int pointsYellow = 0;
        int pointsWhite = 0;
        int countDivBlack = 0;
        int countOtherColor = 0;

        int total = 0;

        for (int i = 1; i <= numBalls; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    pointsRed++;
                    total += 5;
                    break;
                case "orange":
                    pointsOrange++;
                    total += 10;
                    break;
                case "yellow":
                    pointsYellow++;
                    total += 15;
                    break;
                case "white":
                    pointsWhite++;
                    total += 20;
                    break;
                case "black":
                    countDivBlack++;
                    total /= 2;
                    break;
                default:
                    countOtherColor++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", total);
        System.out.printf("Points from red balls: %d%n", pointsRed);
        System.out.printf("Points from orange balls: %d%n", pointsOrange);
        System.out.printf("Points from yellow balls: %d%n", pointsYellow);
        System.out.printf("Points from white balls: %d%n", pointsWhite);
        System.out.printf("Other colors picked: %d%n", countOtherColor);
        System.out.printf("Divides from black balls: %d%n", countDivBlack);
    }
}
