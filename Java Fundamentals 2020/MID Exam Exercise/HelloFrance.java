import java.util.Scanner;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        double budget = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        double spendMoney = 0;

        for (int i = 0; i < input.length; i++) {
            boolean canBay = true;
            String[] data = input[i].split("->");
            String product = data[0];
            double price = Double.parseDouble(data[1]);

            switch (product) {
                case "Clothes":
                    if (price > 50) {
                        canBay = false;
                    }
                    break;
                case "Shoes":
                    if (price > 35) {
                        canBay = false;
                    }
                    break;
                case "Accessories":
                    if (price > 20.5) {
                        canBay = false;
                    }
                    break;
            }
            if (canBay) {
                if (price > budget) {
                    break;
                }
                budget -= price;
                spendMoney += price;

                System.out.printf("%.2f ", price * 1.4);
                sum += price * 1.4;
            }
        }
        System.out.println();
        System.out.printf("Profit: %.2f%n", sum - spendMoney);

        if (budget + sum >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }
}
