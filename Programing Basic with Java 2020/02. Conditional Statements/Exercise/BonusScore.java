package ConditionalStatementsExe;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        double bonusPoint;
        double finalNum;

        if (startNum <= 100) {
            bonusPoint = 5;
        } else if (startNum <= 1000) {
            bonusPoint = startNum * 0.20;
        } else {
            bonusPoint = startNum * 0.10;
        }

        if (startNum % 2 == 0) {
            bonusPoint += 1;
        }
        if (startNum%10==5){
            bonusPoint+=2;
        }

        finalNum=startNum+bonusPoint;

        System.out.printf("%.1f%n%.1f", bonusPoint,finalNum);
    }
}
