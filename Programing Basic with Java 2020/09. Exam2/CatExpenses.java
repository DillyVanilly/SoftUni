package Exam2;

import java.util.Scanner;

public class CatExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bed = Double.parseDouble(scanner.nextLine());
        double toilet = Double.parseDouble(scanner.nextLine());

        double food = (toilet * 1.25);
        double toys = (food / 2);
        double doc = (toys * 1.1);

        double totalMonth = toilet + food + toys + doc;

        double others = totalMonth * 0.05;

        double total = bed + ((totalMonth+others)*12);
        System.out.printf("%.2f lv.", total);
    }
}