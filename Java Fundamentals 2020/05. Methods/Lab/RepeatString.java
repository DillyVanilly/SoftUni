import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(s, n));
    }

    private static String repeatString(String s, int n) {
        String[] repeatArr = new String[n];
        for (int i = 0; i < n; i++) {
            repeatArr[i] = s;
        }
        return String.join("", repeatArr);
    }
}