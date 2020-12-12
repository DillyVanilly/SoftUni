import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] tokens = command.split(">>>");

            switch (tokens[0]) {
                case "Contains":
                    String substring = tokens[1];
                    if (key.contains(substring)) {
                        System.out.println(key + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String indices = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String oldSubs = key.substring(startIndex, endIndex);
                    String newSubs = "";
                    switch (indices) {
                        case "Upper":
                            newSubs = oldSubs.toUpperCase();
                            break;
                        case "Lower":
                            newSubs = oldSubs.toLowerCase();
                            break;
                    }
                    key = key.replace(oldSubs, newSubs);
                    System.out.println(key);
                    break;

                case "Slice":
                    int fromIndex = Integer.parseInt(tokens[1]);
                    int toIndex = Integer.parseInt(tokens[2]);
                    String dellSub = key.substring(fromIndex, toIndex);
                    key = key.replace(dellSub, "");
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}