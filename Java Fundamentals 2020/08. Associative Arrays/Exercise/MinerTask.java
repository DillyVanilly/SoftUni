import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();

        int count = 1;
        String resource = "";
        int quantity;
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            if (count % 2 == 1) {
                resource = input;
                if (!map.containsKey(resource)) {
                    map.put(resource, 0);
                }
            } else {
                quantity = Integer.parseInt(input);
                int current = map.get(resource);
                map.put(resource, current + quantity);
            }
            input = scanner.nextLine();
            count++;
        }
        map.forEach((r, v) -> System.out.println(r + " -> " + v));
    }
}