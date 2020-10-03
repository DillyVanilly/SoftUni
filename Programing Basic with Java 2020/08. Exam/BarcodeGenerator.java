package Exam;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int n1s1 = number1 / 1000;
        int n1s2 = number1 / 100 % 10;
        int n1s3 = number1 / 10 % 10;
        int n1s4 = number1 % 10;

        int n2s1 = number2 / 1000;
        int n2s2 = number2 / 100 % 10;
        int n2s3 = number2 / 10 % 10;
        int n2s4 = number2 % 10;

        for (int s1 = n1s1; s1 <= n2s1; s1++) {
            for (int s2 = n1s2; s2 <= n2s2; s2++) {
                for (int s3 = n1s3; s3 <= n2s3; s3++) {
                    for (int s4 = n1s4; s4 <= n2s4; s4++) {
                        if (s1 % 2 != 0 && s2 % 2 != 0 && s3 % 2 != 0 && s4 % 2 != 0) {
                            System.out.printf("%d%d%d%d ", s1, s2, s3, s4);
                        }
                    }
                }
            }
        }
    }
}