import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] date = input.split(" ");
            persons.add(new Person(date[0], date[1], Integer.parseInt(date[2])));
            input = scanner.nextLine();
        }

        persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);
    }

    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(), getID(), getAge());
        }
    }
}
