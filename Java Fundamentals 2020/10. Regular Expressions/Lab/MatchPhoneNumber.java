import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        String input = scanner.nextLine();

        Pattern pettern = Pattern.compile(regex);
        Matcher matcher = pettern.matcher(input);

        List<String> matchedPhones = new LinkedList<>();

        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}