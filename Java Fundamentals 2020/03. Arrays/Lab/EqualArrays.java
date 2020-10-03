import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int massage = 0;
        boolean flag = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                massage += arr1[i];
            } else {
                massage = i;
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d", massage);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", massage);
        }
    }
}