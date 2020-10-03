package Exam2;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        char gender = scanner.nextLine().charAt(0);
        int catMonths = 0;

        switch (gender) {
            case 'm':
                if ("British Shorthair".equals(breed)) {
                    catMonths = (13 * 12) / 6;
                } else if ("Siamese".equals(breed)) {
                    catMonths = (15 * 12) / 6;
                } else if ("Persian".equals(breed)) {
                    catMonths = (14 * 12) / 6;
                } else if ("Ragdoll".equals(breed)) {
                    catMonths = (16 * 12) / 6;
                } else if ("American".equals(breed) || "Shorthair".equals(breed)) {
                    catMonths = (12 * 12) / 6;
                } else if ("Siberian".equals(breed)) {
                    catMonths = (11 * 12) / 6;
                } else {
                    System.out.printf("%s is invalid cat!", breed);
                    break;
                }
                System.out.printf("%d cat months", catMonths);
                break;
            case 'f':
                if ("British Shorthair".equals(breed)) {
                    catMonths = (14 * 12) / 6;
                } else if ("Siamese".equals(breed)) {
                    catMonths = (16 * 12) / 6;
                } else if ("Persian".equals(breed)) {
                    catMonths = (15 * 12) / 6;
                } else if ("Ragdoll".equals(breed)) {
                    catMonths = (17 * 12) / 6;
                } else if ("American".equals(breed) || "Shorthair".equals(breed)) {
                    catMonths = (13 * 12) / 6;
                } else if ("Siberian".equals(breed)) {
                    catMonths = (12 * 12) / 6;
                } else {
                    System.out.printf("%s is invalid cat!", breed);
                    break;
                }
                System.out.printf("%d cat months", catMonths);
                break;
        }
    }
}