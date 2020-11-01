import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = scanner.nextInt();
        int courseLecture = scanner.nextInt();
        int additionalBonus = scanner.nextInt();

        double maxBonus = 0;
        int currStudentAttendances = 0;

        for (int i = 0; i < studentsCount; i++) {
            int studentAttendances = scanner.nextInt();
            double totalBonus = studentAttendances / (double) courseLecture * (5 + additionalBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                currStudentAttendances = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n", (int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.%n", currStudentAttendances);
    }
}
