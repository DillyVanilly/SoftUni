package ForLoopLab;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        double p1count = 0;
        double p2count = 0;
        double p3count = 0;
        double p4count = 0;
        double p5count = 0;

        for (int i = 0; i < countNumbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1count++;
            } else if (num < 400) {
                p2count++;
            } else if (num < 600) {
                p3count++;
            } else if (num < 800) {
                p4count++;
            } else {
                p5count++;
            }
        }
        p1count = p1count / countNumbers * 100;
        p2count = p2count / countNumbers * 100;
        p3count = p3count / countNumbers * 100;
        p4count = p4count / countNumbers * 100;
        p5count = p5count / countNumbers * 100;

        System.out.printf("%.2f%%\n" + "%.2f%%\n" + "%.2f%%\n" + "%.2f%%\n" + "%.2f%%",
                p1count, p2count, p3count, p4count, p5count);

    }
}
