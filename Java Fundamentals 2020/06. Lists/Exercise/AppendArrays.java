import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");

        String result = "";
        for (int i = arrays.length - 1; i >= 0; i--) {
            String[] currentArr = arrays[i].split("\\s+");
            for (String s : currentArr) {
                if (!s.equals("")) {
                    result += s + " ";
                }
            }
        }
        System.out.println(result);
    }
}