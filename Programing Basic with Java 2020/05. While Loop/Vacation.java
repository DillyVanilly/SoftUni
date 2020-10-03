package WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spendDay = 0;
        int countDay = 0;

        double needMoney = Double.parseDouble(scanner.nextLine());
        double owenMoney = Double.parseDouble(scanner.nextLine());

        while (spendDay < 5 && owenMoney < needMoney) {
            String operation = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            countDay++;
            if ("save".equals(operation)) {
                owenMoney += amount;
                spendDay=0;
            } else if ("spend".equals(operation)) {
                owenMoney -= amount;
                spendDay++;
                if (owenMoney < 0) {
                    owenMoney = 0;
                }
            }
        }

        if (spendDay == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDay);
        }
        if (owenMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", countDay);
        }
    }
}