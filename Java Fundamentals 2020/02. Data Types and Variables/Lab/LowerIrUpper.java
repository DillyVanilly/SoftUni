//8.	Lower or Upper
//      Write a program that prints whether a given character is upper-case or lower-case.

//      Examples
//  Input	Output
//  L	    upper-case
//  f	    lower-case

import java.util.Scanner;

public class LowerIrUpper {
    public static void main(String[] args) {

        char input = new Scanner(System.in).nextLine().charAt(0);
        if (65 <= input && input <= 90) {
            System.out.println("upper-case");
        } else if (97 <= input && input <= 122){
            System.out.println("lower-case");
        }
    }
}