package Exam;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int units = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (units < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (type) {
            case "90X130":
                price = units * 110;
                if (units > 30 && units < 60) {
                    price *= 0.95;
                } else if (units > 60) {
                    price *= 0.92;
                }
                break;
            case "100X150":
                price = units * 140;
                if (units > 40 && units < 80) {
                    price *= 0.94;
                } else if (units > 80) {
                    price *= 0.90;
                }
                break;
            case "130X180":
                price = units * 190;
                if (units > 20 && units < 50) {
                    price *= 0.93;
                } else if (units > 50) {
                    price *= 0.88;
                }
                break;
            case "200X300":
                price = units * 250;
                if (units > 25 && units < 50) {
                    price *= 0.91;
                } else if (units > 50) {
                    price *= 0.86;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            price += 60;
        }
        if (units > 99) {
            price *= 0.96;
        }

        System.out.printf("%.2f BGN", price);
    }
}

