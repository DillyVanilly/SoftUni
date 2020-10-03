package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int movieTickets = 0;
        int totalBayTickets = 0;

        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            int seatInTheHall = Integer.parseInt(scanner.nextLine());

            while (movieTickets < seatInTheHall) {
                String ticketType = scanner.nextLine();
                if ("student".equals(ticketType)) {
                    studentTickets++;
                } else if ("standard".equals(ticketType)) {
                    standardTickets++;
                } else if ("kid".equals(ticketType)) {
                    kidTickets++;
                } else {
                    break;
                }
                movieTickets++;
                totalBayTickets++;
            }
            double percentBayTickets = movieTickets * 1.0 / seatInTheHall * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentBayTickets);

            movieTickets = 0;
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalBayTickets);
        double percentStudTickets = studentTickets * 1.0 / totalBayTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudTickets);
        double percentStandardTickets = standardTickets * 1.0 / totalBayTickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        double percentKidTickets = kidTickets * 1.0 / totalBayTickets * 100;
        System.out.printf("%.2f%% kids tickets.", percentKidTickets);
    }
}