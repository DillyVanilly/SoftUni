import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        double budget = scanner.nextDouble();
        int people = scanner.nextInt();
        double fuelPerKM = scanner.nextDouble();
        double food = scanner.nextDouble();
        double room = scanner.nextDouble();

        if (people > 10) {
            room *= 0.75;
        }

        double currentExpense = (food + room) * people * days;

        for (int i = 1; i <= days; i++) {
            double travelledDistance = Double.parseDouble(scanner.nextLine());
            currentExpense += travelledDistance * fuelPerKM;

            if (i % 3 == 0 || i % 5 == 0) {
                currentExpense *= 1.4;
            }
            if (i % 7 == 0) {
                currentExpense -= currentExpense / people;
            }
        }

        if (currentExpense > budget) {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",
                    currentExpense - budget);
        } else {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.%n",
                    budget - currentExpense);
        }
    }
}