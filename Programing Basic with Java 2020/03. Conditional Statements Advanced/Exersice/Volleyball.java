package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsInProvince = Integer.parseInt(scanner.nextLine());

        int allWeekends = 48;
        int weekendsInSofia = allWeekends - weekendsInProvince;
        double weekendAtWork = weekendsInSofia / 4.0;

        double gameInSofia = weekendsInSofia - weekendAtWork;
        double gameInHoliday = (holidays / 3.0) * 2;
        double gameInProvince = weekendsInProvince * 1.0;

        int allGame = 0;

        switch (typeYear) {
            case "leap":
                allGame = (int) Math.floor((gameInSofia + gameInProvince + gameInHoliday) * 1.15);
                break;
            case "normal":
                allGame = (int) Math.floor(gameInSofia + gameInProvince + gameInHoliday);
                break;
        }
        System.out.println(allGame);

    }
}
