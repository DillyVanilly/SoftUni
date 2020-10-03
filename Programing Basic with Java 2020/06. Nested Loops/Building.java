package NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloors; floor > 0; floor--) {
            for (int room = 0; room < countRooms; room++) {
                if (floor == countFloors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor,room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
