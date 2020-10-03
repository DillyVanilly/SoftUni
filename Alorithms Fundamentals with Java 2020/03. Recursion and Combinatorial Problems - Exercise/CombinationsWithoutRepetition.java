package ExerciseRecursionCombinatorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsWithoutRepetition {
    public static int n;
    public static int k;
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        k = Integer.parseInt(reader.readLine());
        array = new int[k];

        combinations(array, 0, 1);
    }

    private static void combinations(int[] arr, int index, int start) {
        if (index == arr.length) {
            print(arr);
        } else {
            for (int i = start; i <= n; i++) {
                arr[index] = i;
                combinations(arr, index+1, i+1);
            }
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}