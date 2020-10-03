import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxKeg = "";

        for (int i = 0; i < n; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentKen = Math.PI * Math.pow(radius, 2) * height;
            if (currentKen > maxVolume) {
                maxVolume = currentKen;
                maxKeg = modelKeg;
            }
        }
        System.out.println(maxKeg);
    }
}