package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        double area = 0;
        if (type.equals("square")) {
            double sideLength = Double.parseDouble(scanner.nextLine());
            area = sideLength * sideLength;

        } else if (type.equals("rectangle")) {
            double sideLength = Double.parseDouble(scanner.nextLine());
            double sideTwoLength = Double.parseDouble(scanner.nextLine());
            area = sideLength * sideTwoLength;

        } else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * (radius * radius);

        } else if (type.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = length * height / 2;

        }
        System.out.printf("%.3f", area);
    }
}