import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharactersInRange(first, second);
    }

    private static void printCharactersInRange(char input1, char input2) {
        char start;
        char stop;
        if (input1 < input2) {
            start = (char) (input1+1);
            stop = input2;
        } else {
            start = (char) (input2+1);
            stop = input1;
        }
        for (char i = start; i < stop; i++) {
            System.out.print(i + " ");
        }
    }
}