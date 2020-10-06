import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String s1 : arr2) {
            for (String s2 : arr1) {
                if (s1.equals(s2)) {
                    System.out.print(s1 + " ");
                }
            }
        }
    }
}