import java.util.Scanner;

public class SmallestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        System.out.println(findSmallestNumber(first, second, third));
    }

    private static int findSmallestNumber(int first, int second, int third) {
        if (first < second) {
            return first;
        } else if (second < third) {
            return second;
        }
        return third;
    }
}