import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num2 > 10) {
            System.out.printf("%d X %d = %d%n", num, num2, num * num2);
        } else {
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num * i);
            }
        }
    }
}