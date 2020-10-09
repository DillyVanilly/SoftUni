import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculateTotalPrice(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    public static void calculateTotalPrice(String products, int quantity) {
        double totalPrice = 0;
        switch (products) {
            case "coffee":
                totalPrice = quantity * 1.50;
                break;
            case "water":
                totalPrice = quantity * 1.00;
                break;
            case "coke":
                totalPrice = quantity * 1.40;
                break;
            case "snacks":
                totalPrice = quantity * 2.00;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}