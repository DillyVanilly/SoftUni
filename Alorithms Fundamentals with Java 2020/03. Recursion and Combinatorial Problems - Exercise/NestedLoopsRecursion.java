package ExerciseRecursionCombinatorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedLoopsRecursion {

    public static int[] array;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        array = new int[n];

        permute(0);
    }

    private static void permute(int index) {
        if (index == array.length) {
            print();
        } else {
            for (int i = 1; i <= n; i++) {
                array[index] = i;
                permute(index + 1);
            }
        }
    }

    private static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
