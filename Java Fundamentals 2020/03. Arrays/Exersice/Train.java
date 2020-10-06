import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = scanner.nextInt();

        int[] train = new int[countOfWagons];

        int sumOfPeople = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = scanner.nextInt();
            sumOfPeople += train[i];
        }
        for (int num : train) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print(sumOfPeople);
    }
}