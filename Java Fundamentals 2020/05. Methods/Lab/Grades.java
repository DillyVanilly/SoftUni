import java.util.Scanner;

public class Grades {

    public static void printsCorrespondingGrade(double grade) {
        String massage = "0";
        if (2 <= grade && grade <= 2.99) {
            massage = "Fail";
        } else if (3 <= grade && grade <= 3.49) {
            massage = "Poor";
        } else if (3.50 <= grade && grade <= 4.49) {
            massage = "Good";
        } else if (4.50 <= grade && grade <= 5.49) {
            massage = "Very good";
        } else if (5.50 <= grade && grade <= 6.00) {
            massage = "Excellent";
        }
        System.out.println(massage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        printsCorrespondingGrade(grade);
    }
}