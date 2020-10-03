import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();
        double priceHeadset = scanner.nextDouble();
        double priceMouse = scanner.nextDouble();
        double priceKeyboard =scanner.nextDouble();
        double priceDisplay = scanner.nextDouble();

        double amountTrashHeadset = Math.floor(lostGames * 1.0 / 2) * priceHeadset;
        double amountTrashMouse = Math.floor(lostGames * 1.0 / 3) * priceMouse;
        double amountTrashKeyboard = Math.floor(lostGames * 1.0 / 6) * priceKeyboard;
        double amountTrashDisplay = Math.floor(lostGames * 1.0 / 12) * priceDisplay;

        double totalAmount = amountTrashDisplay + amountTrashHeadset + amountTrashKeyboard + amountTrashMouse;
        System.out.printf("Rage expenses: %.2f lv.", totalAmount);
    }
}
