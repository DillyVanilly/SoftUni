import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int totalLitters = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters > capacity-totalLitters) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitters += litters;
            }
        }
        System.out.println(totalLitters);
    }
}