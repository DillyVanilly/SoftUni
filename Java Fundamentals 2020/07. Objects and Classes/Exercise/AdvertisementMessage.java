import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        Message message = new Message();

        for (int i = 0; i < n; i++) {
            System.out.println(message.randomMessage());
        }
    }

    static class Message {

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        public String randomMessage() {
            String phrase = phrases[random.nextInt(phrases.length)];

            String event = events[random.nextInt(events.length)];

            String author = authors[random.nextInt(authors.length)];

            String city = cities[random.nextInt(cities.length)];

            return String.format("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}