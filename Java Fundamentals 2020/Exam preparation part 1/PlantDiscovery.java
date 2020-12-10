import java.util.*;

public class PlantDiscovery {
    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void resetRating() {
            this.ratings.clear();
        }

        public int getRarity() {
            return rarity;
        }

        public double getAverageRating() {
            if (this.ratings.isEmpty()) {
                return 0;
            }
            double averageRating = 0;
            for (Double rating : ratings) {
                averageRating += rating;
            }
            averageRating = averageRating / this.ratings.size();
            return averageRating;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plantsByName = new HashMap();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            Plant p = new Plant(nameAndRarity[0], Integer.parseInt(nameAndRarity[1]));
            plantsByName.put(p.getName(), p);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandAndParam = command.split(": ");
            switch (commandAndParam[0]) {
                case "Rate":
                    String[] rateParam = commandAndParam[1].split(" - ");
                    String ratePlantName = rateParam[0];
                    int rating = Integer.parseInt(rateParam[1]);

                    Plant ratePlant = plantsByName.get(ratePlantName);
                    if (ratePlant != null) {
                        ratePlant.addRating(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    String[] updateParam = commandAndParam[1].split(" - ");
                    String updatePlantName = updateParam[0];
                    int updateRating = Integer.parseInt(updateParam[1]);

                    Plant updatePlant = plantsByName.get(updatePlantName);
                    if (updatePlant != null) {
                        updatePlant.setRarity(updateRating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    String resetByName = commandAndParam[1];
                    Plant restPlant = plantsByName.get(resetByName);
                    if (restPlant != null) {
                        restPlant.resetRating();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsByName.values()
                .stream()
                .sorted((a, b) -> {
                    if (a.getRarity() != b.getRarity()) {
                        return Integer.compare(b.getRarity(), a.getRarity());
                    } else {
                        return Double.compare(b.getRarity(), a.getRarity());
                    }
                })
                .map(p -> "- " + p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f", p.getAverageRating()))
                .forEach(s -> System.out.println(s));
    }
}