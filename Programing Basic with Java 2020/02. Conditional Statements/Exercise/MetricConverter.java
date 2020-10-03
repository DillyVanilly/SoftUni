package ConditionalStatementsExe;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String startUnit = scanner.nextLine();
        String finalUnit = scanner.nextLine();

        double numInMm = 0;

        if (startUnit.equals("m")) {
            numInMm = num * 1000;
        } else if (startUnit.equals("cm")) {
            numInMm = num * 10;
        } else {
            numInMm=num;
        }

        if (finalUnit.equals("m")) {
            numInMm /= 1000;
        } else if (finalUnit.equals("cm")) {
            numInMm /= 10;
        }
        System.out.printf("%.3f",numInMm);
    }
}
