import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coolEmojis = new ArrayList<>();

        String text = scanner.nextLine();

        int threshold=1;
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(text);

        while (digitMatcher.find()) {
            int diggit = Integer.parseInt(digitMatcher.group(0));
            threshold *=diggit;
        }

        int counter=0;
        Pattern namePattern = Pattern.compile("(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))");
        Matcher nameMatcher = namePattern.matcher(text);

        while (nameMatcher.find()) {
            String emoji = nameMatcher.group();
            counter++;
            int coolness = 0;
            for (int i = 2; i < emoji.length() - 2; i++) {
                int charValue = emoji.charAt(i);
                coolness += charValue;
            }
            if (coolness >= threshold) {
                coolEmojis.add(emoji);
            }
        }
        System.out.println("Cool threshold: " + threshold);
        System.out.println(counter + " emojis found in the text. The cool ones are:");
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}