import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = scanner.nextInt();
        int courseLecture = scanner.nextInt();
        int additionalBonus = scanner.nextInt();

        int[] studentAttendances = new int[countStudents];
        double[] studentsBonus = new double[countStudents];
        for (int i = 0; i < studentAttendances.length; i++) {
            studentAttendances[i] = scanner.nextInt();
            studentsBonus[i] = studentAttendances[i] / (double) courseLecture * (5 + additionalBonus);
        }

        double maxBonus = 0;
        int currStudentAttendances = 0;
        for (int i = 0; i < studentsBonus.length; i++) {
            if (studentsBonus[i] > maxBonus) {
                maxBonus = studentsBonus[i];
                currStudentAttendances = studentAttendances[i];
            }
        }
        System.out.printf("Max Bonus: %d.%n", (int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.%n", currStudentAttendances);
    }
}