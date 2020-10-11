import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        double result = factorialDivide(first, second);
        System.out.printf("%.2f", result);
    }

    private static long factorialDivide(int first, int second) {
        return calculateFactorial(first) / calculateFactorial(second);
    }

    private static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}