package ExerciseRecursionCombinatorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = reader.readLine().split("\\s+");

        printReveredArray(elements, elements.length - 1);
    }

    public static void printReveredArray(String[] arr, int index) {

        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");;
        printReveredArray(arr, index - 1);
    }
}