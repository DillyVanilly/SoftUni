import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        printNxN(n);
    }

    private static void printNxN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}