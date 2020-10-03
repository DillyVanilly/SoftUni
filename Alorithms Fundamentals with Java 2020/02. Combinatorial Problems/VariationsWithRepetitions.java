package CombinatorialProblemsLab;

import java.util.Scanner;

public class VariationsWithRepetitions {
    public static String[] variationsArr;
    public static String[] kVariations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        variationsArr = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        kVariations = new String[k];

        variations(0);
    }

    private static void variations(int index) {
        if (index == kVariations.length) {
            print(kVariations);
        } else {
            for (String s : variationsArr) {
                kVariations[index] = s;
                variations(index + 1);
            }
        }
    }

    private static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}