import java.util.*;

public class Largest3Numbers {
    public static void main(String[] args) {

        Arrays.stream(new Scanner(System.in).nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .sorted((i1,i2)-> Integer.compare(i2,i1))
                .limit(3)
                .forEach(integer -> System.out.print(integer + " "));
    }
}