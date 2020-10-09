import java.util.Scanner;

public class PrintingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            printNumbers(i);
        }
        for (int i = num - 1; i >= 1; i--) {
            printNumbers(i);
        }
    }

    private static void printNumbers(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            System.out.print(i);
            if (i < maxNum) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}