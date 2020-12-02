import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String participant : participants) {
            racers.put(participant, 0);
        }

        String nameRegex = "[A-Za-z]";
        Pattern namePattern = Pattern.compile(nameRegex);
        String distanceRegex = "\\d";
        Pattern distancePattern = Pattern.compile(distanceRegex);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(input);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            if (racers.containsKey(name.toString())) {
                int currentDist = racers.get(name.toString());
                Matcher distMatcher = distancePattern.matcher(input);
                while (distMatcher.find()) {
                    currentDist += Integer.parseInt(distMatcher.group());
                }
                racers.put(name.toString(), currentDist);
            }
            input = scanner.nextLine();
        }

        List<String> winners = racers.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = 1;
        for (String winner : winners) {

            switch (count++) {
                case 1:
                    System.out.println("1st place: " + winner);
                    break;
                case 2:
                    System.out.println("2nd place: " + winner);
                    break;
                case 3:
                    System.out.println("3rd place: " + winner);
                    break;
            }
        }
    }
}