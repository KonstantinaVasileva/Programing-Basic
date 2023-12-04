import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double allMenu = (chikenMenu * 10.35 + fishMenu * 12.4 + veganMenu * 8.15);
        double desert = 0.2 * allMenu;
        double totalPrice = allMenu + desert + 2.5;

        System.out.println(totalPrice);

    }
}
