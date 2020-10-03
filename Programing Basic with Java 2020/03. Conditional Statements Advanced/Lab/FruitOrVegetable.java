package ConditionalStatAdvanceLab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();

        if ("banana".equals(productName)||"apple".equals(productName)||"kiwi".equals(productName)||
                "cherry".equals(productName)||"lemon".equals(productName)||"grapes".equals(productName)){
            System.out.println("fruit");
        } else if ("tomato".equals(productName)||"cucumber".equals(productName)||"pepper".equals(productName)||
                "carrot".equals(productName)){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
