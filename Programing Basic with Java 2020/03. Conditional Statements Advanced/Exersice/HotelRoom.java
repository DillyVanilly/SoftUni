package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String months = scanner.nextLine();
        int numOfNights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0;
        double priceStudio = 0;

        switch (months) {
            case "May":
            case "October":
                if (numOfNights <= 7) {
                    priceApartment = numOfNights * 65.0;
                    priceStudio = numOfNights * 50.0;
                } else if (numOfNights <= 14) {
                    priceApartment = numOfNights * 65.0;
                    priceStudio = (numOfNights * 50) * 0.95;
                } else {
                    priceApartment = (numOfNights * 65) * 0.90;
                    priceStudio = (numOfNights * 50) * 0.70;
                }
                break;
            case "June":
            case "September":
                if (numOfNights <= 14) {
                    priceApartment = numOfNights * 68.70;
                    priceStudio = numOfNights * 75.2;
                } else {
                    priceApartment = (numOfNights * 68.70) * 0.90;
                    priceStudio = (numOfNights * 75.2) * 0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = numOfNights * 76.0;
                if (numOfNights > 14) {
                    priceApartment = (numOfNights * 77.0) * 0.90;
                } else {
                    priceApartment = numOfNights * 77.0;
                }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
