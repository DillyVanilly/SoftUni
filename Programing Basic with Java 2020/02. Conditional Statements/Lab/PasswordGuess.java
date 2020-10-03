package ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userPass = scanner.nextLine();

        String pass = "s3cr3t!P@ssw0rd";

        if (userPass.equals(pass)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
