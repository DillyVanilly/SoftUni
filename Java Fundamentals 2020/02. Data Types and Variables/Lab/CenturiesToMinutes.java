//  9.	Centuries to Minutes
//      Write program to enter an integer number of centuries and convert it to years, days, hours and minutes.

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {

        int centuries = new Scanner(System.in).nextInt();

        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
    }
}