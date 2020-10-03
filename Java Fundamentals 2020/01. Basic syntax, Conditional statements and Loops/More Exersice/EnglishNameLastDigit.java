import java.util.Scanner;

public class EnglishNameLastDigit {

    public static void giveMeLastDigit(int num) {
        int lastDigit = num % 10;
        String message = "";
        switch (lastDigit) {
            case 1:
                message = "one";
                break;
            case 2:
                message = "two";
                break;
            case 3:
                message = "three";
                break;
            case 4:
                message = "four";
                break;
            case 5:
                message = "five";
                break;
            case 6:
                message = "six";
                break;
            case 7:
                message = "seven";
                break;
            case 8:
                message = "eight";
                break;
            case 9:
                message = "nine";
                break;
            case 0:
                message = "zero";
                break;
        }
        System.out.println(message);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        giveMeLastDigit(number);
    }
}