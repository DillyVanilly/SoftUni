package SampleExam;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double dayFee = 0;
        double totalFee = 0;
        for (int day = 1; day <= allDays; day++) {
            for (int h = 1; h <= hoursPerDay; h++) {
                if (day % 2 == 0 && h % 2 != 0) {
                    dayFee += 2.50;
                } else if (day % 2 != 0 && h % 2 == 0) {
                    dayFee += 1.25;
                } else {
                    dayFee += 1.00;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, dayFee);
            totalFee+=dayFee;
            dayFee = 0;
        }
        System.out.printf("Total: %.2f leva", totalFee);
    }
}
