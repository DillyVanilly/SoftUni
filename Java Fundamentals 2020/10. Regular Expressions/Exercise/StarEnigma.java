import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        while (n-- > 0) {

            String message = scanner.nextLine();
            String decrypted = "";

            Pattern pattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);
            Matcher star = pattern.matcher(message);

            int count = 0;
            for (int i = 0; i < message.length(); i++) {
                if (star.find()) {
                    count++;
                }
            }
            for (int i = 0; i < message.length(); i++) {
                char symbol = message.charAt(i);
                decrypted += (char)(symbol - count);
            }
            String regex = ".*?(?<planet>[A-Z][a-z]+)(?:[^@\\-!:>]*):(?<population>(\\d)+)" +
                    "(?:[^@\\-!:>]*)!(?<attack>[AD])!(?:[^@\\-!:>]*)->(?<soldierCount>\\d+)";

            Pattern pattern1 = Pattern.compile(regex);
            Matcher planets = pattern1.matcher(decrypted);

            while (planets.find()){
                String planet = planets.group("planet");
                String attack = planets.group("attack");

                if ("A".equals(attack)){
                    attacked.add(planet);

                }else {
                    destroyed.add(planet);

                }
            }
        }
        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.stream().sorted().forEach(planet -> System.out.println("-> " + planet));

        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }
}