package SampleExam;

import java.util.Scanner;

public class SampleExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        int counter = 0;

        String name = scanner.nextLine();

        while (!name.equals("Stop")) {
            double currentPrice = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                currentPrice *= 0.5;
            }
            totalPrice += currentPrice;
            if (budget < totalPrice) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", totalPrice - budget);
                break;
            }
            name = scanner.nextLine();
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
        }
    }
}