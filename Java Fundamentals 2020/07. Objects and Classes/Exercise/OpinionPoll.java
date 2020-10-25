import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> allPersons = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            allPersons.add(new Person(info[0], Integer.parseInt(info[1])));
        }

        allPersons.stream()
                .filter(person -> person.getAge() > 30)
                .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.toString()));
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", getName(), getAge());
        }
    }
}