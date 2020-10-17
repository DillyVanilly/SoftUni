import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergingList = new ArrayList<>();

        int indexInFirst = 0;
        int indexInSecond = 0;

        while (indexInFirst < firstList.size() || indexInSecond < secondList.size()) {
            if (indexInFirst < firstList.size()) {
                mergingList.add(firstList.get(indexInFirst));
            }
            if (indexInSecond < secondList.size()) {
                mergingList.add(secondList.get(indexInSecond));
            }
            indexInFirst++;
            indexInSecond++;
        }
        System.out.println(mergingList.toString().replaceAll("[\\[\\],]", ""));
    }
}