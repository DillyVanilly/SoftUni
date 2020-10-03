package SampleExam;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalNylon = (nylon + 2) * 1.50;
        double totalPaint = (paint * 1.1) * 14.50;
        double totalThinner = thinner * 5;

        double materials = totalNylon + totalPaint + totalThinner + 0.40;

        double masters = hours * (materials * 0.30);

        System.out.printf("Total expenses: %.2f lv.", materials + masters);

    }
}