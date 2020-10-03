import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        int biggerDivision = 0;

        if (number % 2 == 0) {
            biggerDivision = 2;
        }
        if (number % 3 == 0) {
            biggerDivision = 3;
        }
        if (number % 6 == 0) {
            biggerDivision = 6;
        }
        if (number % 7 == 0) {
            biggerDivision = 7;
        }
        if (number % 10 == 0) {
            biggerDivision = 10;
        }

        if (biggerDivision == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", biggerDivision);
        }
    }
}