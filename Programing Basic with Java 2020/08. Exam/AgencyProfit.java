package Exam;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airCompany = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double netPriceAdultTicket = Double.parseDouble(scanner.nextLine());
        double otherPrice = Double.parseDouble(scanner.nextLine());

        double netPriceKidTicket = netPriceAdultTicket*0.30;
        double brutPriceAdultTicket = netPriceAdultTicket+otherPrice;
        double brutPriceKidTicket = netPriceKidTicket+otherPrice;

        double total=(kidTickets*brutPriceKidTicket)+(adultTickets*brutPriceAdultTicket);

        double profit = total*0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airCompany, profit);
    }
}
