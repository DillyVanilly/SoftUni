//     1. Convert Meters to Kilometers
//
//        You will be given an integer that will be distance in meters. Write a program that converts meters to kilometers
//        formatted to the second decimal point.
//
//        Examples
//        Input Output
//        1852   1.85
//        798    0.80

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();

        double distance = input / 1000.0;

        System.out.printf("%.2f", distance);
    }
}