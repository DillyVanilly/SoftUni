import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            int tmp = 0;
            for (int i = 0; i < arr.length; i++) {

                if (i == 0) {
                    tmp = arr[i];
                }

                if (i == arr.length - 1) {
                    arr[i] = tmp;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
            n--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}