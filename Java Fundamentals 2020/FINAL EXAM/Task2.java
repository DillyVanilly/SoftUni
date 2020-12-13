import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([^\\s]+)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String numbers = matcher.group(2);
                String lowerLetters = matcher.group(3);
                String upperLetters = matcher.group(4);
                String symbols = matcher.group(5);
                System.out.println("Password: " + numbers + lowerLetters + upperLetters + symbols);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}