package NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1111; number <= 9999; number++) {
            int firstDigit = number / 1000;
            int secondDigit = number / 100 % 10;
            int thirdDigit = number / 10 % 10;
            int forthDigit = number % 10;

            boolean check1 = n % firstDigit == 0;
            boolean check2 = secondDigit != 0 && n % secondDigit == 0;
            boolean check3 = thirdDigit != 0 && n % thirdDigit == 0;
            boolean check4 = forthDigit != 0 && n % forthDigit == 0;

            if (check1 && check2 && check3 && check4) {
                System.out.print(number + " ");
            }
        }
    }
}
