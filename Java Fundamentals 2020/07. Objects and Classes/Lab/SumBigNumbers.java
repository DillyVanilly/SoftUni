import java.util.Scanner;
import java.math.BigInteger;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNum.add(secondNum);
        System.out.println(sum);
    }
}