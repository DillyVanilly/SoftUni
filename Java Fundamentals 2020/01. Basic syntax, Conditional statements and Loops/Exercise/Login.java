import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder pass = new StringBuilder(username);
        pass.reverse();
        String passcode = pass.toString();

        String input = scanner.nextLine();

        for (int i = 0; i < 4; i++) {
            if (input.equals(passcode)) {
                System.out.println("User " + username + " logged in.");
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Incorrect password. Try again.");
                    input = scanner.nextLine();
                } else {
                    System.out.println("User " + username + " blocked!");
                }
            }
        }
    }
}