import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> allVehicles = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] date = command.split(" ");
            allVehicles.add(new Vehicle(date[0], date[1], date[2], Integer.parseInt(date[3])));
            command = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            String finalCommand = model;
            allVehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(finalCommand))
                    .forEach(System.out::println);
            model = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", average(allVehicles.stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList())));

        System.out.printf("Trucks have average horsepower of: %.2f.%n", average(allVehicles.stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList())));
    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsepower();
        }
        return sum / vehicles.size();
    }

    static class Vehicle {
        private final String typeOfVehicle;
        private final String model;
        private final String colorOfVehicle;
        private final int horsepower;

        public Vehicle(String typeOfVehicle, String model, String colorOfVehicle, int horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.colorOfVehicle = colorOfVehicle;
            this.horsepower = horsepower;
        }

        public String getType() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return colorOfVehicle;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n"
                            + "Model: %s%n"
                            + "Color: %s%n"
                            + "Horsepower: %d",
                    getType().toUpperCase().charAt(0) + this.getType().substring(1),
                    getModel(), getColor(), getHorsepower());
        }
    }
}