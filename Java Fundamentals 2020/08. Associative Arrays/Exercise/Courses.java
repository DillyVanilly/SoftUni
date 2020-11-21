import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            courses.putIfAbsent(courseName, new LinkedList<>());
            courses.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(k -> {
                    System.out.println(k.getKey() + ": " + k.getValue().size());
                    k.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.println("-- " + e));
                });
    }
}