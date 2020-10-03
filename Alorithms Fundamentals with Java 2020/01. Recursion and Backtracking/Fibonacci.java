package RecursionBacktracking;

import java.io.*;
import java.util.Scanner;

public class Fibonacci {

    public static long[] fibArray = new long[100];

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n <= 1) {
            return 1;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(fibonacci(n));
    }
}