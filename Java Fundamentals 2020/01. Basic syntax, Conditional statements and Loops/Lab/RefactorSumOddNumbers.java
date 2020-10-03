import java.util.Scanner;

public class RefactorSumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = 2 * i + 1;
            System.out.println(num);
            sum += num;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}