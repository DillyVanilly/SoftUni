import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine().toLowerCase();

        System.out.println(findCountOfVowels(input));
    }

    private static int findCountOfVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}