package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());

        int pieces = widthCake * lengthCake;
        while (pieces > 0) {
            String comment = scanner.nextLine();
            if (comment.equals("STOP")) {
                break;
            } else {
                int takenPieces = Integer.parseInt(comment);
                pieces -= takenPieces;
            }
        }
        if (pieces >= 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }
    }
}