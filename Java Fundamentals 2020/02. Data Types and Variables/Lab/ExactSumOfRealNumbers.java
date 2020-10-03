//3.	Exact Sum of Real Numbers
//        Write program to enter n numbers and calculate and print their exact sum (without rounding).
//
//        Hints
//        Use BigDecimal to not lose precision.


import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal input = new BigDecimal(scanner.nextLine());
            sum = sum.add(input);
        }
        System.out.print(sum);
    }
}