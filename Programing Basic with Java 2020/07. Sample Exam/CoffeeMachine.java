package SampleExam;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countOfDrink = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        total = (countOfDrink * 0.90) * 0.65;
                        break;
                    case "Normal":
                        total = countOfDrink * 1.0;
                        break;
                    case "Extra":
                        total = countOfDrink * 1.20;
                        break;
                }
                if (countOfDrink >= 5) {
                    total *= 0.75;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        total = (countOfDrink * 1.00) * 0.65;
                        break;
                    case "Normal":
                        total = countOfDrink * 1.20;
                        break;
                    case "Extra":
                        total = countOfDrink * 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        total = (countOfDrink * 0.50) * 0.65;
                        break;
                    case "Normal":
                        total = countOfDrink * 0.60;
                        break;
                    case "Extra":
                        total = countOfDrink * 0.70;
                        break;
                }
                break;
        }
        if (total>15){
            total*=0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countOfDrink, drink, total);


    }
}
