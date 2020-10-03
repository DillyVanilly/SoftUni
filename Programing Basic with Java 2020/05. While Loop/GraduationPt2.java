package WhileLoop;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = 1;
        double sum = 0;
        int count = 0;
        boolean isExcluded = false;

        String name = scanner.nextLine();

        while (grade <= 12) {
            double currentMark = Double.parseDouble(scanner.nextLine());
            if (currentMark < 4) {
                count++;
                if (count == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    isExcluded = true;
                    break;
                }
                continue;
            }
            sum += currentMark;
            grade++;
        }
        if (!isExcluded) {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}