package SampleExam;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                p1Count++;
            }
            if (number % 3 == 0) {
                p2Count++;
            }
            if (number % 4 == 0) {
                p3Count++;
            }
        }
        double p1 = p1Count * 1.0 / n * 100;
        double p2 = p2Count * 1.0 / n * 100;
        double p3 = p3Count * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
