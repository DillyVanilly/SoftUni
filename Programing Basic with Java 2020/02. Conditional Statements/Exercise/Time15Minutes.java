package ConditionalStatementsExe;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int min = minute + 15;

        if (min > 59) {
            min = min % 60;
            hour += 1;
            if (hour > 23) {
                hour = 0;
            }
        }
            System.out.printf("%d:%02d", hour, min);
    }
}
