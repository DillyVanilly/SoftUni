import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        String[] bugIndexes = scanner.nextLine().split(" ");

        for (String index : bugIndexes) {
            int bugIndex = Integer.parseInt(index);
            if (bugIndex >= 0 & bugIndex < field.length) {
                field[bugIndex] = 1;
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] command = input.split(" ");
            int bugIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int flyLength = Integer.parseInt(command[2]);

            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] == 0) {
                input = scanner.nextLine();
                continue;
            }
            field[bugIndex] = 0;

            for (int i = bugIndex; i < field.length; i++) {

                if (direction.equals("right")) {
                    bugIndex += flyLength;

                } else if (direction.equals("left")) {
                    bugIndex -= flyLength;
                }

                if (bugIndex >= 0 && bugIndex < field.length && field[bugIndex] == 0) {
                    field[bugIndex] = 1;
                    break;
                }
            }
            input = scanner.nextLine();
        }
        for (int j : field) {
            System.out.print(j + " ");
        }
    }
}