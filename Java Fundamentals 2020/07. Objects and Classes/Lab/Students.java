import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] info = input.split(" ");

            String firstName = info[0];
            String lastName = info[1];
            int age = Integer.parseInt(info[2]);
            String town = info[3];

            studentsList.add(new Student(firstName, lastName, age, town));

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }
}