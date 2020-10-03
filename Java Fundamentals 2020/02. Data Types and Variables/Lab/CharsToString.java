//6.	Chars to String
//      Write a program that reads 3 lines of input. On each line you get a single character.
//       Combine all the characters into one string and print it on the console.

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char input = scanner.nextLine().charAt(0);
            text.append(input);

        }
        System.out.print(text);
    }
}