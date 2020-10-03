import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        int num = 1;

        for (int counter = 0; counter < n;) {
            if (num % 2 !=0) {
                System.out.println(num);
                sum += num;
                counter++;
            }
            num++;
        }
        System.out.printf("Sum: %d", sum);
    }
}