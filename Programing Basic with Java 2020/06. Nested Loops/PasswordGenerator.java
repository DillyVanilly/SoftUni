package NestedLoops;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int s1 = 1; s1 <= n; s1++) {
            for (int s2 = 1; s2 <= n; s2++) {
                for (char s3 = 'a'; s3 < 'a' + l; s3++) {
                    for (char s4 = 'a'; s4 < 'a' + l; s4++) {
                        for (int s5 = 1; s5 <= n; s5++) {
                            if (s5 > s1 && s5 > s2) {
                                System.out.printf("%d%d%c%c%d ", s1, s2, s3, s4, s5);
                            }
                        }
                    }
                }
            }
        }
    }
}
