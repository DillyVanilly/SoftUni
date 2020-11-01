import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        boolean isOver = false;

        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {

            String[] commands = rooms[i].split("\\s+");
            String command = commands[0];
            int number = Integer.parseInt(commands[1]);

            switch (command) {
                case "potion":
                    if (health + number <= 100) {
                        health = health + number;
                    } else {
                        number = 100 - health;
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    health -= number;
                    String monster = command;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        System.out.println("Best room: " + (i + 1));
                        isOver = true;
                        break;
                    }
            }
            if (isOver) {
                break;
            }
        }
        if (!isOver) {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + health);
        }
    }
}