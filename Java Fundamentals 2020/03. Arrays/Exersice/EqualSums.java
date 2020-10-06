import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int element = 0;
        boolean  flag =  false;

        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int k = 0; k < i; k++) {
                sumLeft += arr[k];
            }
            for (int j = i+1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                flag = true;
                element = i;
                break;
            }
        }
        if (flag) {
            System.out.println(element);
        } else {
            System.out.println("no");
        }
    }
}