package ConditionalStatAdvanceLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)) {
            if (s >= 0 && s <= 500) {
                System.out.printf("%.2f", s * 0.05);

            } else if (s > 500 && s <= 1000) {
                System.out.printf("%.2f", s * 0.07);

            } else if (s > 1000 && s <= 10000) {
                System.out.printf("%.2f", s * 0.08);

            } else if (s > 10000) {
                System.out.printf("%.2f", s * 0.12);

            } else {
                System.out.println("error");
            }
        } else if ("Varna".equals(city)) {
            if (s >= 0 && s <= 500) {
                System.out.printf("%.2f", s * 0.045);

            } else if (s > 500 && s <= 1000) {
                System.out.printf("%.2f", s * 0.075);

            } else if (s > 1000 && s <= 10000) {
                System.out.printf("%.2f", s * 0.10);

            } else if (s > 10000) {
                System.out.printf("%.2f", s * 0.13);

            } else {
                System.out.println("error");
            }
        } else if ("Plovdiv".equals(city)) {
            if (s >= 0 && s <= 500) {
                System.out.printf("%.2f", s * 0.055);

            } else if (s > 500 && s <= 1000) {
                System.out.printf("%.2f", s * 0.08);

            } else if (s > 1000 && s <= 10000) {
                System.out.printf("%.2f", s * 0.12);

            } else if (s > 10000) {
                System.out.printf("%.2f", s * 0.145);

            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
