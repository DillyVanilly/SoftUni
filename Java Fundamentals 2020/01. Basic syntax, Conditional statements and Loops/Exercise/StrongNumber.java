import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int totalSum = 0;
        int chekNum = num;

        while (chekNum > 0) {
            int factorial = chekNum % 10;

            int sumFactorial = 1;
            for (int j = 2; j <= factorial; j++) {
                sumFactorial *= j;
            }

            totalSum += sumFactorial;
            chekNum = chekNum / 10;
        }

        if (totalSum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}