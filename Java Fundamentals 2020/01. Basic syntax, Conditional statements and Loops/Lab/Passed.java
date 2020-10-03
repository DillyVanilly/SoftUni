import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        double grade = new Scanner(System.in).nextDouble();

        double successGrade = 3.00;

        if (grade >= successGrade) {
            System.out.println("Passed!");
        }
    }
}