package WhileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double changeInSt = Math.round(changeInLeva * 100);
        int countCoins = 0;

        while (changeInSt > 0) {
            if (changeInSt >= 200) {
                changeInSt -= 200;
                countCoins++;
            } else if (changeInSt >= 100) {
                changeInSt -= 100;
                countCoins++;
            } else if (changeInSt >= 50) {
                changeInSt -= 50;
                countCoins++;
            } else if (changeInSt >= 20) {
                changeInSt -= 20;
                countCoins++;
            } else if (changeInSt >= 10) {
                changeInSt -= 10;
                countCoins++;
            } else if (changeInSt >= 5) {
                changeInSt -= 5;
                countCoins++;
            } else if (changeInSt >= 2) {
                changeInSt -= 2;
                countCoins++;
            } else if (changeInSt >= 1) {
                changeInSt -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
