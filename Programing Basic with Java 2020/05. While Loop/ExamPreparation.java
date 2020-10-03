package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedTime = 0;
        int solvedProblemCount = 0;
        double sumScore = 0;
        String lastProb = "";
        boolean isFailed = false;

        int failedThreshold = Integer.parseInt(scanner.nextLine()); //grades<=4


        while (failedTime < failedThreshold) {
            String task = scanner.nextLine();
            if ("Enough".equals(task)) {
                isFailed = true;
                break;
            }
            int score = Integer.parseInt(scanner.nextLine());
            if (score <= 4) {
                failedTime++;
            }
            sumScore += score;
            solvedProblemCount++;
            lastProb = task;
        }
        if (!isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedTime);
        } else {
            System.out.printf("Average score: %.2f%n", sumScore / solvedProblemCount);
            System.out.printf("Number of problems: %d%n", solvedProblemCount);
            System.out.printf("Last problem: %s", lastProb);
        }
    }
}