import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());

        double palamudPrice = skumPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double midiPrice = 7.50;

        double totalPrice = palamudPrice * palamudKg + safridPrice * safridKg + midiPrice * midiKg;

        System.out.printf("%.2f",totalPrice);

    }
}
