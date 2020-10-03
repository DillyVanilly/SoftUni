import java.util.Scanner;

public class SumChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            sum += input;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}