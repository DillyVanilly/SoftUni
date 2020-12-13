import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> emailUser = new TreeMap<>();

        String commands;

        while (!"Statistics".equals(commands = scanner.nextLine())) {
            String[] tokens = commands.split("->");
            String username = tokens[1];

            switch (tokens[0]) {
                case "Add":
                    if (emailUser.containsKey(username)) {
                        System.out.printf("%s is already registered%n", username);
                    } else {
                        emailUser.put(username, new ArrayList<>());
                    }
                    break;

                case "Send":
                    String email = tokens[2];
                    emailUser.get(username).add(email);
                    break;
                case "Delete":
                    if (emailUser.containsKey(username)) {
                        emailUser.remove(username);
                    } else {
                        System.out.printf("%s not found!%n", username);
                    }
                    break;
            }
        }
        System.out.printf("Users count: %d%n", emailUser.size());
        emailUser.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(email -> System.out.printf(" - %s%n", email));
                });
    }
}