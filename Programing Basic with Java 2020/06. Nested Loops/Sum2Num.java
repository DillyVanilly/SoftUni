package NestedLoops;

import java.io.PrintStream;
import java.util.Scanner;

public class Sum2Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean flag = false;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                counter++;
                if (i + j == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
