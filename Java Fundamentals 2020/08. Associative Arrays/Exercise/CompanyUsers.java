import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> compInfo = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String empID = tokens[1];

            compInfo.putIfAbsent(company, new ArrayList<>());

            if (!compInfo.get(company).contains(empID)) {
                compInfo.get(company).add(empID);
            }
            input = scanner.nextLine();
        }
        compInfo.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(e -> System.out.println("-- " + e));
        });
    }
}