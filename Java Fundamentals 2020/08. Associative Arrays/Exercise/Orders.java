import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> orders = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] productInfo = input.split(" ");
            String product = productInfo[0];
            double price = Double.parseDouble(productInfo[1]);
            double quantity = Double.parseDouble(productInfo[2]);

            if (orders.containsKey(product)) {
                orders.get(product).set(0, price);

                double newQuantity = orders.get(product).get(1) + quantity;
                orders.get(product).set(1, newQuantity);
            } else {
                orders.put(product, new ArrayList<>());
                orders.get(product).add(price);
                orders.get(product).add(quantity);
            }
            input = scanner.nextLine();
        }

        orders.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value.get(0) * value.get(1)));
    }
}