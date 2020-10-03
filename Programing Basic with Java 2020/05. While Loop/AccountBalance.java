package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        String input = scanner.nextLine();

        while (!"NoMoreMoney".equals(input)) {
            double currentAmount = Double.parseDouble(input);
            if (currentAmount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", currentAmount);
            balance += currentAmount;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);

    }
}