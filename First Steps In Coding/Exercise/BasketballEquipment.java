import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double bascetShoose = tax * 0.6;
        double basketEquip = bascetShoose * 0.8;
        double bascetBoll = basketEquip / 4.0;
        double bascetAccesory = bascetBoll / 5.0;

        double allTaxese = tax + bascetShoose + basketEquip + bascetBoll + bascetAccesory;

        System.out.printf("%.2f", allTaxese);

    }
}
