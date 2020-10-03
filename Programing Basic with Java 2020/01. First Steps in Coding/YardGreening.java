package FirstStepsLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 7.61;
        int discount = 18;

        double area = Double.parseDouble(scanner.nextLine());

        double sum = area*price;
        double sumOfDiscount = sum*18/100;
        double finalSum = sum-sumOfDiscount;

        System.out.printf("The final price is: %.2f lv.%n", finalSum);
        System.out.printf("The discount is: %f lv.", sumOfDiscount);
    }
}
