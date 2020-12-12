import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates {
    public static class Cities {
        String name;
        int population;
        int gold;

        public Cities(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public int getGold() {
            return gold;
        }

        public int getPopulation() {
            return population;
        }

        public void increaseGold(int gold) {
            this.gold += gold;
        }

        public void increasePopulation(int population) {
            this.population += population;
        }

        public void decreaseGold(int plunderGold) {
            this.gold -= plunderGold;
        }

        public void decreasePopulation(int plunderPeople) {
            this.population -= plunderPeople;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cities> allCities = new TreeMap<>();

        String commands = scanner.nextLine();
        while (!commands.equals("Sail")) {
            String[] tokens = commands.split("\\|{2}");
            String name = tokens[0];
            int population = Integer.parseInt(tokens[1].trim());
            int gold = Integer.parseInt(tokens[2].trim());
            if (allCities.containsKey(name)) {
                allCities.get(name).increaseGold(gold);
                allCities.get(name).increasePopulation(population);
            } else {
                Cities city = new Cities(name, population, gold);
                allCities.putIfAbsent(name, city);
            }
            commands = scanner.nextLine();
        }

        commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] tokens = commands.split("=>");
            String town = tokens[1];
            switch (tokens[0]) {
                case "Plunder":
                    int people = Integer.parseInt(tokens[2].trim());
                    int gold = Integer.parseInt(tokens[3].trim());
                    allCities.get(town).decreaseGold(gold);
                    allCities.get(town).decreasePopulation(people);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            town, gold, people);
                    if (allCities.get(town).getGold() <= 0 || allCities.get(town).getPopulation() <= 0) {
                        allCities.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int golds = Integer.parseInt(tokens[2]);
                    if (golds < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        allCities.get(town).increaseGold(golds);
                        int totalGold = allCities.get(town).getGold();
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                                , golds, town, totalGold);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Ahoy, Captain! There are " + allCities.size() + " wealthy settlements to go to:");
        allCities.values().stream()
                .sorted((a, b) -> Integer.compare(b.getGold(), a.getGold()))
                .forEach(cities -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        cities.getName(), cities.getPopulation(), cities.getGold()));
    }
}