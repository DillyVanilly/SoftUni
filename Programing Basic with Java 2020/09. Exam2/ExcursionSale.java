package Exam2;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        int profit = 0;
        boolean finishSea = false;
        boolean finishMountain = false;

        String namePacket = scanner.nextLine();

        while (!namePacket.equals("Stop")) {
            if ("sea".equals(namePacket)) {
                if (sea > 0) {
                    profit += 680;
                    --sea;
                }
                if (sea == 0) {
                    finishSea = true;
                }
            } else if ("mountain".equals(namePacket)) {
                if (mountain > 0) {
                    profit += 499;
                    --mountain;
                }
                if (mountain == 0) {
                    finishMountain = true;
                }
            }
            if (finishMountain && finishSea) {
                System.out.println("Good job! Everything is sold.");
                System.out.printf("Profit: %d leva.", profit);
                break;
            } else {
                namePacket = scanner.nextLine();
            }
        }
        if (namePacket.equals("Stop")) {
            System.out.printf("Profit: %d leva.", profit);
        }
    }
}