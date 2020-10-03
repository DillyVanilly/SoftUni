package ConditionalStatAdvancedExe;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hoursArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int totalExamTime = hoursExam * 60 + minExam;
        int totalArriveTime = hoursArrive * 60 + minArrive;

        if (totalArriveTime > totalExamTime) {
            System.out.println("late");
            int lateMin = totalArriveTime - totalExamTime;
            if (lateMin < 60) {
                System.out.printf("%d minutes after the start", lateMin);
            } else {
                int hours = lateMin / 60;
                int min = lateMin % 60;
                System.out.printf("%d:%02d hours after the start", hours, min);
            }
        } else if (totalArriveTime == totalExamTime || totalExamTime - totalArriveTime <= 30) {
            System.out.println("On time");
            int onTime = totalExamTime - totalArriveTime;
            if (onTime <= 30 && totalExamTime != totalArriveTime) {
                System.out.printf("%d minutes before the start", onTime);
            }
        } else if (totalExamTime - totalArriveTime > 30) {
            System.out.println("Early");
            int earlyTime = totalExamTime - totalArriveTime;
            if (earlyTime < 60) {
                System.out.printf("%d minutes before the start", earlyTime);
            } else {
                int earlyHours = earlyTime / 60;
                int earlyMin = earlyTime % 60;
                System.out.printf("%d:%02d hours before the start", earlyHours, earlyMin);
            }
        }
    }
}