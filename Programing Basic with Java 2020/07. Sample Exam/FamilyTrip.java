package SampleExam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentOtherCost = Integer.parseInt(scanner.nextLine());

        double sumNights = (nights * pricePerNight);
        double sumOthers = budget * percentOtherCost / 100;

        if (nights > 7) {
            sumNights *= 0.95;
        }
        double totalSum = sumNights + sumOthers;

        if (budget >= totalSum) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        } else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}
