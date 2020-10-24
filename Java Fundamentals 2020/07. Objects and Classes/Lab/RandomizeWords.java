import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int x = rnd.nextInt(words.length);
            int y = rnd.nextInt(words.length);
            String tmp = words[x];
            words[x] = words[y];
            words[y] = tmp;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}