import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price;

        switch (dayType) {
            case "Weekday":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                } else {
                    price = -1;
                }
                break;
            case "Weekend":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                } else {
                    price = -1;
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (64 < age && age <= 122) {
                    price = 10;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else {
                    price = -1;
                }
                break;
            default:
                price = -1;
        }
        if (price == -1) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}