import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(first, operator, second)));
    }

    private static double calculate(int first, String operator, int second) {
        double result = 0;
        switch (operator) {
            case "/":
                result = first * 1.0 / second;
                break;
            case "*":
                result = first * second;
                break;
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
        }
        return result;
    }
}