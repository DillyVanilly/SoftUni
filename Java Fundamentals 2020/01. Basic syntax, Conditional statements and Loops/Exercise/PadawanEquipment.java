import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOneLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOneRobe = Double.parseDouble(scanner.nextLine());
        double priceOneBelt = Double.parseDouble(scanner.nextLine());

        double totalLightSabers = (Math.ceil(countStudents * 1.10)) * priceOneLightSaber;
        double totalRobes = countStudents * priceOneRobe;
        double totalBelts = (countStudents - (Math.floor(countStudents * 1.0 / 6))) * priceOneBelt;

        double totalEquipments = totalBelts + totalLightSabers + totalRobes;

        if (totalEquipments <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalEquipments);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalEquipments - amountMoney);
        }
    }
}