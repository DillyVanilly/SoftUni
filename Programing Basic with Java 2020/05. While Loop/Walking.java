package WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int goal = 10000;
        int totalSteps = 0;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;
            if (totalSteps >= goal) {
                break;
            }
            input=scanner.nextLine();
        }
        if (input.equals("Going home")){
            int stepsToHome =Integer.parseInt(scanner.nextLine());
            totalSteps+=stepsToHome;
        }

        if (totalSteps>=goal){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - goal);
        } else {
            int diff = goal-totalSteps;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
