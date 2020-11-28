import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '>') {
                strength += Character.getNumericValue(sb.charAt(i + 1));
            } else if (strength > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.print(sb.toString());
    }
}