package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class BetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        String symbol = scanner.nextLine();

        int result = 0;

        switch (symbol) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", num1, num2, result);
                }
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d - %d = %d - odd", num1, num2, result);
                }
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d * %d = %d - odd", num1, num2, result);
                }
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double division = num1*1.0 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, division);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    int number = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, number);
                    break;
                }
        }
    }
}