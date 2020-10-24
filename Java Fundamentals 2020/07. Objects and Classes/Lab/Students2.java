import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] info = input.split(" ");

            Student s = new Student(info[0], info[1], Integer.parseInt(info[2]), info[3]);

            int existingIndex = findStudentIndex(studentsList, s.getFirstName(), s.getLastName());
            if (existingIndex != -1) {
                studentsList.get(existingIndex).setHomeTown(s.homeTown);
                studentsList.get(existingIndex).setAge(s.age);
            } else {
                studentsList.add(s);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHomeTown().equals(city)) {
                System.out.println(student);
            }
        }
    }

    static int findStudentIndex(List<Student> studentsList, String firstName, String lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getFirstName().equals(firstName)
                    && studentsList.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
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

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }
}