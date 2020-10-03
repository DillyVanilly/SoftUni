package CombinatorialProblemsLab;

import java.util.Scanner;

public class PermutWithoutRepetitions {
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");

        permute(0);
    }

    private static void permute(int index) {
        if (index == elements.length) {
            print(elements);
        } else {
            permute(index + 1);
            for (int i = index + 1; i < elements.length; i++) {
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
            }
        }
    }

    private static void swap(String[] arr, int first, int second) {
        String tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

    private static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}