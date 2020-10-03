package Exam2;

import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countAirCompany = Integer.parseInt(scanner.nextLine());
        int maxAverage = 0;
        String maxCompany = "";

        for (int i = 0; i < countAirCompany; i++) {
            String name = scanner.nextLine();
            int allPassengers = 0;
            int counter = 0;
            int average = 0;

            String input = scanner.nextLine();

            while (!input.equals("Finish")) {
                int passengers = Integer.parseInt(input);
                allPassengers += passengers;
                counter++;
                input = scanner.nextLine();
            }
            average = allPassengers / counter;
            System.out.printf("%s: %d passengers.%n", name, average);
            if (average > maxAverage) {
                maxAverage = average;
                maxCompany = name;
            }
        }
        System.out.printf("%s has most passengers per flight: %d", maxCompany, maxAverage);
    }
}
