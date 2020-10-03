import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        int age = new Scanner(System.in).nextInt();
        String message ;

        if (0 <= age && age <= 2) {
            message = "baby";
        } else if (age <= 13) {
            message = "child";
        } else if (age <= 19) {
            message = "teenager";
        } else if (age <= 65) {
            message = "adult";
        } else {
            message = "elder";
        }
        System.out.println(message);
    }
}