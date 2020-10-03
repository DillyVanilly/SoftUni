package SearchingSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int[] arr;
    public static int key;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        key = Integer.parseInt(scanner.nextLine());

        System.out.println(getIndex(arr, key));
    }

    private static int getIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}