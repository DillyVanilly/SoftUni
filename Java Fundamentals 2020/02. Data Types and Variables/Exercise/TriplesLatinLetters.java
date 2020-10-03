import java.util.Scanner;

public class TriplesLatinLetters {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            char s1 = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char s2 = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char s3 = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", s1, s2, s3);
                }
            }
        }
    }
}
