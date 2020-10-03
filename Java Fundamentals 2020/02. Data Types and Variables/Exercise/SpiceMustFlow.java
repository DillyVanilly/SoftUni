import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        int yield = new Scanner(System.in).nextInt();

        int storage = 0;
        int days = 0;

        while (yield >= 100) {
            storage += (yield - 26);
            days++;
            yield -= 10;
        }
        if (storage > 26) {
            storage -= 26;
        }

        System.out.println(days);
        System.out.println(storage);
    }
}