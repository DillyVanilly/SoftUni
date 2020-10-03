package Exam2;

import java.util.Scanner;

public class CatShirt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double arms = Double.parseDouble(scanner.nextLine());
        double front = Double.parseDouble(scanner.nextLine());
        String plat = scanner.nextLine();
        String tai = scanner.nextLine();

        double size = (arms * 2) + (front * 2);
        size = size * 1.1;
        size = size / 100;

        double price = 0;

        switch (plat) {
            case "Linen":
                price = (size * 15) + 10;
                break;
            case "Cotton":
                price = (size * 12) + 10;
                break;
            case "Denim":
                price = (size * 20) + 10;
                break;
            case "Twill":
                price = (size * 16) + 10;
                break;
            case "Flannel":
                price = (size * 11) + 10;
                break;
        }
        if (tai.equals("Yes")) {
            price *= 1.20;
        }
        System.out.printf("The price of the shirt is: %.2flv.", price);
    }
}