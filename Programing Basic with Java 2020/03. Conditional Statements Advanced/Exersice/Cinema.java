package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double pricePremiere = 12.00;
        double priceNormal = 7.50;
        double priceDiscount = 5.00;

        double income = 0;

        if ("Premiere".equals(type)) {
            income = r * c * pricePremiere;
        } else if ("Normal".equals(type)) {
            income = r * c * priceNormal;
        } else if ("Discount".equals(type)) {
            income = r * c * priceDiscount;
        }
        System.out.printf("%.2f", income);
    }
}