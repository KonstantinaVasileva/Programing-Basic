import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marc = Integer.parseInt(scanner.nextLine());
        int liter = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = pen * 5.8;
        double marcPrice = marc * 7.2;
        double prepPrice = liter * 1.2;

        double totalPrice = (penPrice + marcPrice + prepPrice) * (1 - (discount/100.0));

        System.out.println(totalPrice);

    }
}
