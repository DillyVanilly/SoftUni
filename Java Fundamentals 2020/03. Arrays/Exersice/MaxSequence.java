import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int maxCount = 1;
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    counter++;
                    if (maxCount < counter) {
                        maxCount = counter;
                        maxNum = arr[i];
                    }
                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxNum + " ");
        }
    }
}
