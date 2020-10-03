package FirstStepsLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursToComplete = 3;

        String architectName = scanner.nextLine();

        int projects = Integer.parseInt(scanner.nextLine());

        int allHours = hoursToComplete*projects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                , architectName,allHours,projects);
    }
}
