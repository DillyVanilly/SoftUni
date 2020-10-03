package Exam;
import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOverBag = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countBag = Integer.parseInt(scanner.nextLine());

        double sumBags = 0;

        if (kg < 10) {
            sumBags = priceOverBag * 0.20;
        } else if (kg <= 20) {
            sumBags = priceOverBag * 0.50;
        } else {
            sumBags = priceOverBag;
        }

        if (days<7){
            sumBags*=1.40;
        }else if (days<=30){
            sumBags*=1.15;
        }else {
            sumBags*=1.1;
        }

        double total = sumBags*countBag;
        System.out.printf("The total price of bags is: %.2f lv.", total);
    }
}