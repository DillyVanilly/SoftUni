package FirstStepsLab;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        int spaceOfSquare = a*a;

        System.out.println(spaceOfSquare);
    }
}
