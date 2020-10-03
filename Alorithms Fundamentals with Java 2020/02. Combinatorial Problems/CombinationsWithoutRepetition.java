package CombinatorialProblemsLab;

import java.util.Scanner;

public class CombinationsWithoutRepetition {

    public static String[] combinationsArr;
    public static String[] kCombo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        combinationsArr = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        kCombo = new String[k];

        combinations(combinationsArr, 0, 0);
    }

    private static void combinations(String[] arr, int index, int start) {
        if (index == kCombo.length) {
            print(kCombo);
        } else {
            for (int i = start; i < combinationsArr.length; i++) {
                kCombo[index] = combinationsArr[i];
                combinations(arr, index + 1, i + 1);
            }
        }
    }

    private static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}