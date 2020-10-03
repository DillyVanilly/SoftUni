//  10.	Special Numbers
//      A number is special when its sum of digits is 5, 7 or 11.
//      Write a program to read an integer n and for all numbers in the range 1…n to print the number
//      and if it is special or not (True / False).

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            int current = i;
            int sum = 0;
            while (current > 0) {
                sum += current % 10;
                current = current / 10;
            }

            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}