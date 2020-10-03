package WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Повторение: въвеждане на цели числа
        //Действие: търси най-голямото число
        //До кога:"Stop"

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num > max) {
                max = num;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);


    }
}
