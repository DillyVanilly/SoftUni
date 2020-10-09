import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int power = scanner.nextInt();

        System.out.println(new DecimalFormat("0.####")
                .format(calculateNumPower(number, power)));
    }

    private static double calculateNumPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result*=number;
        }
        return result;
    }
}