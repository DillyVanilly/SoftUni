import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOgCroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double singlePrice = 0;
        double peopleCount = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        singlePrice = 8.45;
                        break;
                    case "Saturday":
                        singlePrice = 9.80;
                        break;
                    case "Sunday":
                        singlePrice = 10.46;
                        break;
                }
                if (countOgCroup >= 30) {
                    peopleCount = (countOgCroup * singlePrice) * 0.85;
                } else {
                    peopleCount = countOgCroup * singlePrice;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        singlePrice = 10.90;
                        break;
                    case "Saturday":
                        singlePrice = 15.60;
                        break;
                    case "Sunday":
                        singlePrice = 16.0;
                        break;
                }
                if (countOgCroup >= 100) {
                    peopleCount = (countOgCroup - 10) * singlePrice;
                } else {
                    peopleCount = countOgCroup * singlePrice;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        singlePrice = 15.0;
                        break;
                    case "Saturday":
                        singlePrice = 20.0;
                        break;
                    case "Sunday":
                        singlePrice = 22.5;
                        break;
                }
                if (10 <= countOgCroup && countOgCroup <= 20) {
                    peopleCount = (countOgCroup * singlePrice) * 0.95;
                } else {
                    peopleCount = countOgCroup * singlePrice;
                }
                break;
        }
        System.out.printf("Total price: %.2f", peopleCount);
    }
}