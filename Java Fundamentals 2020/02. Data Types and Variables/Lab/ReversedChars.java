//7.	Reversed Chars
//Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",third,second,first);
    }
}