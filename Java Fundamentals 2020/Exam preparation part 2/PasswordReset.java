import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "TakeOdd":
                    StringBuilder newPass = new StringBuilder();
                    for (int i = 1; i < pass.length(); i += 2) {
                      newPass.append(pass.charAt(i));
                    }
                    pass= newPass.toString();
                    System.out.println(pass);
                    break;

                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String sub = pass.substring(index, index + length);
                    pass = pass.replaceFirst(sub, "");
                    System.out.println(pass);
                    break;

                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (pass.contains(substring)) {
                        pass = pass.replace(substring, substitute);
                        System.out.println(pass);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + pass);
    }
}