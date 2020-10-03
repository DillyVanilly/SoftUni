package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int number = firstNum; number <= secondNum; number++) {
            int firstDigit = number / 100000;
            int secondDigit = number / 10000 % 10;
            int thirdDigit = number / 1000 % 10;
            int forthDigit = number / 100 % 10;
            int fifthDigit = number / 10 % 10;
            int sixthDigit = number % 10;

            int sumEvenPosition = secondDigit + forthDigit + sixthDigit;
            int sumOddPosition = firstDigit + thirdDigit + fifthDigit;

            if (sumEvenPosition == sumOddPosition) {
                System.out.println(number);
            }
        }

//           ВАРИАНТ 2:

//        int firstNum = Integer.parseInt(scanner.nextLine());
//        int secondNum = Integer.parseInt(scanner.nextLine());
//
//        for (int i = firstNum; i <= secondNum; i++) {
//            String currentNum = "" + i;
//            int evenSum = 0;
//            int oddSum = 0;
//            for (int j = 0; j < currentNum.length(); j++) {
//                int currentPositionNum = Integer.parseInt("" + currentNum.charAt(j));
//                if (j % 2 == 0) {
//                    evenSum += currentPositionNum;
//                } else {
//                    oddSum += currentPositionNum;
//                }
//            }
//            if (evenSum == oddSum) {
//                System.out.print(i + " ");
//            }
//        }
    }
}