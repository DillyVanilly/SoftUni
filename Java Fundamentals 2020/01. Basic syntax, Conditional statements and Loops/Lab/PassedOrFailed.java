import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {

        double grade = new Scanner(System.in).nextDouble();

        double successGrade = 3.00;

        if (grade >= successGrade) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}