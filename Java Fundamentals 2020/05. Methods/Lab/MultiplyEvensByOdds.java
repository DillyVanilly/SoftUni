import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        int number = Integer.parseInt(new Scanner(System.in).nextLine());

        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(Math.abs(result));
    }

    private static int getMultipleOfEvensAndOdds(int num) {
        int evenSum = 0;
        int oddSum = 0;

        int number = Math.abs(num);
        while (number > 0) {
            int n = number % 10;
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
            number /= 10;
        }
        return evenSum * oddSum;
    }
}