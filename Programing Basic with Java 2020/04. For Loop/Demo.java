package ForLoopLab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            } else {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
        }

        System.out.printf("OddSum=%.2f,\n", oddSum);

        if (oddMin != 1000000000.0) {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        } else {
            System.out.println("OddMin=No,");
        }

        if (oddMax != -1000000000.0) {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        } else {
            System.out.println("OddMax=No,");
        }


        System.out.printf("EvenSum=%.2f,\n", evenSum);

        if (evenMin != 1000000000.0) {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        } else {
            System.out.println("EvenMin=No,");
        }

        if (evenMax != -1000000000.0) {
            System.out.printf("EvenMax=%.2f\n", evenMax);
        } else {
            System.out.println("EvenMax=No");
        }
    }
}