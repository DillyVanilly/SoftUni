import java.util.Scanner;

public class SignOrInteger {

    public static void printInteger(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(new Scanner(System.in).nextLine());

        printInteger(number);

    }
}