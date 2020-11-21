import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();
                if ("shards".equals(material) || "fragments".equals(material) || "motes".equals(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    junk.putIfAbsent(material, 0);
                    int currJunk = junk.get(material);
                    junk.put(material, currJunk + quantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junk.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}