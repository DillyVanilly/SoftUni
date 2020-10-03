import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        int dayNumber = new Scanner(System.in).nextInt();

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (0 < dayNumber && dayNumber <= dayOfWeek.length) {
            System.out.println(dayOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}