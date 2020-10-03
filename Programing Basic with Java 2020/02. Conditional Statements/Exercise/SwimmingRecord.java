package ConditionalStatementsExe;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecond = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeForDistance = distanceInMeters * timeInSeconds;

        double waterDelay = Math.floor(distanceInMeters / 15) * 12.5;

        timeForDistance += waterDelay;
        if (timeForDistance < recordInSecond) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeForDistance);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForDistance - recordInSecond);
        }
    }
}
