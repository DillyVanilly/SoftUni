import java.util.Scanner;

public class PrintPartASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int stop = scanner.nextInt();

        for (int i = start; i <= stop; i++) {
            System.out.print((char) i + " ");
        }
    }
}