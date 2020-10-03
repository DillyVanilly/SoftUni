import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = 0;
        double totalMoney = 0;

        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 1.0 || coins == 2.0 || coins == 0.5 ||
                    coins == 0.2 || coins == 0.1) {
                totalMoney += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.00;
                    break;
                case "Water":
                    price = 0.70;
                    break;
                case "Crisps":
                    price = 1.50;
                    break;
                case "Soda":
                    price = 0.80;
                    break;
                case "Coke":
                    price = 1.00;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            if (totalMoney >= price) {
                System.out.printf("Purchased %s%n", input);
                totalMoney -= price;
            } else {
                System.out.println("Sorry, not enough money");
            }
            input = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}