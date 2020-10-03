import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double spendMoney = 0;
        boolean flag = true;

        String gameName = scanner.nextLine();
        while (!gameName.equals("Game Time")) {
            flag = true;
            switch (gameName) {
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    price = 39.99;
                    break;
                default:
                    flag = false;
                    break;
            }
            if (flag && currentBalance >= price) {
                System.out.printf("Bought %s%n", gameName);
                currentBalance -= price;
                spendMoney += price;
            } else if (flag && currentBalance < price) {
                System.out.println("Too Expensive");
            } else if (!flag) {
                System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                flag = false;
                break;
            } else {
                gameName = scanner.nextLine();
            }
        }
        if (flag) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, currentBalance);
        }
    }
}