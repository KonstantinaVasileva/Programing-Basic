import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int najlon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int workHour = Integer.parseInt(scanner.nextLine());

        double najlonPrice = (najlon + 2) * 1.5;
        double paintPrice = (paint * 1.1) * 14.5;
        double razreditelPrice = razreditel * 5.0;
        double materialPrice = najlonPrice + paintPrice + razreditelPrice + 0.4;
        double workPrice = (materialPrice * 0.3) * workHour;
        double totalPrice = materialPrice + workPrice;
        System.out.println(totalPrice);

    }
}
