package ConditionalStatementsExe;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dohod = Double.parseDouble(scanner.nextLine());
        double uspeh = Double.parseDouble(scanner.nextLine());
        double minZaplata = Double.parseDouble(scanner.nextLine());

        double socStip = 0.35 * minZaplata;
        double uspStip = uspeh * 25;

        if (dohod > minZaplata && uspeh < 5.5) {
            System.out.println("You cannot get a scholarship!");
        } else if (dohod < minZaplata && uspeh < 4.5) {
            System.out.println("You cannot get a scholarship!");
        } else if (dohod < minZaplata && uspeh >= 4.5 && uspeh <= 5.5) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStip);
        } else if (dohod < minZaplata && uspeh >= 4.5 && socStip > uspStip) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStip);
        } else if (dohod < minZaplata && uspeh >= 5.5 && uspStip > socStip) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", uspStip);
        } else if (dohod >= minZaplata && uspeh >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(uspStip));
        }
    }
}