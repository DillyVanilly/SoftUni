//     2. Pounds to Dollars
//        Write a program that converts British pounds to US dollars formatted to 3th decimal point.
//        1 British Pound = 1.31 Dollars

//        Examples
//        Input Output
//        80    104.800
//        39    51.090

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        final double fixing = 1.31;

        double input = new Scanner(System.in).nextDouble();

        double output = input * fixing;

        System.out.printf("%.3f", output);
    }
}