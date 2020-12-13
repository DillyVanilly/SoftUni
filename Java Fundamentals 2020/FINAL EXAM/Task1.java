import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Complete")) {
            String[] tokens = commands.split("\\s+");

            if ("Make".equals(tokens[0])) {
                switch (tokens[1]) {
                    case "Upper":
                        email = email.toUpperCase();
                        System.out.println(email);
                        break;
                    case "Lower":
                        email = email.toLowerCase();
                        System.out.println(email);
                        break;
                }
            } else if ("GetDomain".equals(tokens[0])) {
                int count = Integer.parseInt(tokens[1]);
                String domain = email.substring(email.length() - count);
                System.out.println(domain);
            } else if ("GetUsername".equals(tokens[0])) {
                if (email.contains("@")) {
                    int stopIndex = email.indexOf('@');
                    String userName = email.substring(0, stopIndex);
                    System.out.println(userName);
                } else {
                    System.out.println("The email " + email + " doesn't contain the @ symbol.");
                }
            } else if ("Replace".equals(tokens[0])) {
                String symbol = tokens[1];
                email = email.replaceAll(symbol, "-");
                System.out.println(email);
            } else if ("Encrypt".equals(tokens[0])) {
                for (int i = 0; i < email.length(); i++) {
                    int charValue = email.charAt(i);
                    System.out.print(charValue + " ");
                }
            }
            commands= scanner.nextLine();
        }
    }
}