package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumRangeAll = 0;
        int counterRanges = 0;

        int juries = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double sumRangePresentation = 0;
        while (!"Finish".equals(presentationName)) {
            for (int i = 1; i <= juries; i++) {
                double range = Double.parseDouble(scanner.nextLine());
                counterRanges++;
                sumRangePresentation += range;
            }
            double averageRangePresentation = sumRangePresentation / juries;
            System.out.printf("%s - %.2f.%n", presentationName, averageRangePresentation);
            sumRangeAll += sumRangePresentation;
            sumRangePresentation = 0;
            presentationName = scanner.nextLine();
        }
        double averageRangeAll = sumRangeAll / counterRanges;
        System.out.printf("Student's final assessment is %.2f.", averageRangeAll);
    }
}