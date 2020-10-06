import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr1[i] = scanner.nextInt();
                arr2[i] = scanner.nextInt();
            } else {
                arr2[i] = scanner.nextInt();
                arr1[i] = scanner.nextInt();
            }
        }

        for (int j : arr1) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int k : arr2) {
            System.out.print(k + " ");
        }
    }
}