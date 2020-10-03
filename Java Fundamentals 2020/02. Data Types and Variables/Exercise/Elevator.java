import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses;

        if (numOfPeople <= capacity) {
            courses = 1;
        } else if (numOfPeople % capacity == 0) {
            courses = numOfPeople / capacity;
        } else {
            courses = (numOfPeople / capacity) + 1;
        }
        System.out.println(courses);
    }
}