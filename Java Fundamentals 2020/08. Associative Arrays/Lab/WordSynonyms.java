import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> list = words.get(word);
            if (list == null) {
                list = new ArrayList<>();
                words.put(word, list);
            }
            list.add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + String.join(", ", entry.getValue()));
        }
    }
}