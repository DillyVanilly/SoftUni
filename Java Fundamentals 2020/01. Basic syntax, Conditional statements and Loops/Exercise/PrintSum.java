import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNum; i <= stopNum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d%n", sum);
    }
}