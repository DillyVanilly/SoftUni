//4.	Town Info
//You will be given 3 lines of input. On the first line you will be given the name of the town,
// on the second – the population and on the third the area. Use the correct data types and print the result in the following format:
//"Town {town name} has population of {population} and area {area} square km".

//Examples
//Input
//Sofia
//1286383
//492

// Output
// Town Sofia has population of 1286383 and area 492 square km.

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}