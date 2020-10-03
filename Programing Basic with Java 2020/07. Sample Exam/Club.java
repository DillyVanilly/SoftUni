package SampleExam;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        double sumCocktails = 0;
        double totalSum = 0;
        boolean flag = false;

        String cocktailName = scanner.nextLine();

        while (!cocktailName.equals("Party!")) {
            if (totalSum >= profit) {
                System.out.println("Target acquired.%n");
                flag = true;
                break;
            }
            int count = Integer.parseInt(scanner.nextLine());
            int price = cocktailName.length();
            sumCocktails = price * count;
            if (sumCocktails % 2 != 0) {
                sumCocktails *= 0.75;
            }
            totalSum += sumCocktails;
            sumCocktails = 0;

            cocktailName = scanner.nextLine();
        }
        if (!flag) {
            System.out.printf("We need %.2f leva more.%n", profit - totalSum);
        }
        System.out.printf("Club income - %.2f leva.", totalSum);
    }
}
