package ConditionalStatementsExe;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userSpeed = Double.parseDouble(scanner.nextLine());

        if (userSpeed <= 10) {
            System.out.println("slow");
        } else if (userSpeed <= 50) {
            System.out.println("average");
        } else if (userSpeed <= 150) {
            System.out.println("fast");
        } else if (userSpeed <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
