import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(command,a,b));
    }

    public static int calculate(String command, int a, int b) {
        int result = 0;
        switch (command) {
            case "add":
                result = a + b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "divide":
                result = a / b;
                break;
        }
        return result;
    }
}
