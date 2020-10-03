package CombinatorialProblemsLab;

import java.util.Scanner;

public class VariationsWithoutRepetitions {
    public static String[] elements;
    public static String[] variationsArr;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        variationsArr = new String[k];

        used = new boolean[elements.length];

        variations(0);
    }

    private static void variations(int index) {

        if (index == variationsArr.length) {
            print(variationsArr);
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]){
                    used[i]=true;
                    variationsArr[index]=elements[i];
                    variations(index+1);
                    used[i]=false;
                }
            }
        }
    }

    private static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}
