package SearchingSorting;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class BubbleSort {
    public static int[] arr;
    public static int[] counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        counter = new int[arr.length+1];

        sort(arr);

        for (int index = 0; index < counter.length; index++) {
            if (counter[index] != 0) {
                for (int i = 0; i <counter[index]; i++) {
                    System.out.print(index);
                }
            }
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
    }

//    private static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    swap(arr, i, j);
//                }
//            }
//        }
//    }

    private static void swap(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
