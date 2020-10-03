package FirstStepsLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 2.5;
        int otherPrice = 4;


        int allDog = Integer.parseInt(scanner.nextLine());
        int otherDog = Integer.parseInt(scanner.nextLine());

        double sum = (allDog*price) + (otherDog*otherPrice);

        System.out.println(sum);
    }
}