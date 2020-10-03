package WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        int countBook = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("No More Books")) {
                System.out.printf("The book you search is not here!\n" +
                        "You checked %d books.", countBook);
                break;
            } else if (input.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", countBook);
                break;
            } else {
                countBook++;
            }
        }
    }
}