package SearchingSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectiveSort {

    public static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[index]){
                    index=j;
                }
            }
            swap(arr,i, index);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        for (int i = 0; i < arr.length; i++) {
           int tmp = arr[first];
           arr[first]=arr[second];
           arr[second]=tmp;
        }
    }
}
