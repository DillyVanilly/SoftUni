package ConditionalStatAdvanceLab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        int priceRoomOneNight = 18;
        int priceApartOneNight = 25;
        int pricePresidentApartOneNight = 35;

        double sum = 0;

        if ("room for one person".equals(typeOfRoom)) {
            sum = priceRoomOneNight * (days - 1);
        } else if ("apartment".equals(typeOfRoom)) {
            if (days < 10) {
                sum = (priceApartOneNight * (days - 1)) * 0.70;
            } else if (days <= 15) {
                sum = (priceApartOneNight * (days - 1)) * 0.65;
            } else {
                sum = (priceApartOneNight * (days - 1)) * 0.50;
            }
        } else if ("president apartment".equals(typeOfRoom)) {
            if (days < 10) {
                sum = (pricePresidentApartOneNight * (days - 1)) * 0.90;
            } else if (days <= 15) {
                sum = (pricePresidentApartOneNight * (days - 1)) * 0.85;
            } else {
                sum = (pricePresidentApartOneNight * (days - 1)) * 0.80;
            }
        }
        switch (rating) {
            case "positive":
                System.out.printf("%.2f", sum * 1.25);
                break;
            case "negative":
                System.out.printf("%.2f", sum * 0.90);
                break;
        }
    }
}

