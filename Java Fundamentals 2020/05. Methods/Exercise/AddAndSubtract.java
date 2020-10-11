import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        sum(first, second, third);
    }

    private static void sum(int first, int second, int third) {
        int sum = (first + second) - third;
        System.out.println(sum);
    }
}
