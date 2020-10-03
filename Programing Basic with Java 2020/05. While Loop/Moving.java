package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeRoom = width * length * height;

        int volumeBoxes = 0;
        boolean isFull = false;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            volumeBoxes += boxes;
            if (volumeBoxes > volumeRoom) {
                isFull=true;
                System.out.printf("No more free space! You need %d Cubic meters more.", volumeBoxes - volumeRoom);
                break;
            }
            input = scanner.nextLine();
        }
        if (!isFull){
            System.out.printf("%d Cubic meters left.", volumeRoom - volumeBoxes);
        }
    }
}