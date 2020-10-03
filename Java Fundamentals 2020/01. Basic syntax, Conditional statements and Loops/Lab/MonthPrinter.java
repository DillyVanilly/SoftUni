import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        String massage;

        switch (number) {
            case 1:
                massage = "January";
                break;
            case 2:
                massage = "February";
                break;
            case 3:
                massage = "March";
                break;
            case 4:
                massage = "April";
                break;
            case 5:
                massage = "May";
                break;
            case 6:
                massage = "June";
                break;
            case 7:
                massage = "July";
                break;
            case 8:
                massage = "August";
                break;
            case 9:
                massage = "September";
                break;
            case 10:
                massage = "October";
                break;
            case 11:
                massage = "November";
                break;
            case 12:
                massage = "December";
                break;
            default:
                massage = "Error!";
                break;
        }
        System.out.println(massage);
    }
}