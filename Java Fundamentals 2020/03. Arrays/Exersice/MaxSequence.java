import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        int maxCount = 0;
        int num = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
                if (maxCount < counter) {
                    maxCount = counter;
                    num = arr[i];
                }
            } else {
                counter = 0;
            }
        }
        for (int i = 0; i <= maxCount; i++) {
            System.out.print(num + " ");
        }
    }
}