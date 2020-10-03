package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double spendMoney = 0.0;
        double spendSum = 0.0;

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double needSum = Double.parseDouble(scanner.nextLine());

            while (spendSum < needSum) {
                spendMoney = Double.parseDouble(scanner.nextLine());;
                spendSum += spendMoney;

                if (spendSum >= needSum) {
                    System.out.println("Going to " + destination +"!");
                    spendSum = 0;
                    break;
                }
            }
            destination = scanner.nextLine();
        }
    }
}