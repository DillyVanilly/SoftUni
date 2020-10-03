package ConditionalStatAdvanceLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        switch (city) {
            case "Sofia":
                if ("coffee".equals(product)) {
                    sum = amount * 0.50;
                } else if ("water".equals(product)) {
                    sum = amount * 0.80;
                } else if ("beer".equals(product)) {
                    sum = amount * 1.20;
                } else if ("sweets".equals(product)) {
                    sum = amount * 1.45;
                } else if ("peanuts".equals(product)) {
                    sum = amount * 1.60;
                }
                System.out.println(sum);
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        sum = amount*0.40;
                        break;
                    case "water":
                        sum = amount*0.70;
                        break;
                    case "beer":
                        sum = amount*1.15;
                        break;
                    case "sweets":
                        sum = amount*1.30;
                        break;
                    case "peanuts":
                        sum = amount*1.50;
                        break;
                }
                System.out.println(sum);
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        sum = amount*0.45;
                        break;
                    case "water":
                        sum = amount*0.70;
                        break;
                    case "beer":
                        sum = amount*1.10;
                        break;
                    case "sweets":
                        sum = amount*1.35;
                        break;
                    case "peanuts":
                        sum = amount*1.55;
                        break;
                }
                System.out.println(sum);
                break;
        }
    }
}