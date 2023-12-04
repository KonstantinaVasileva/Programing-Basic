import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = a * b * c;
        double volumeLiter = volume / 1000.0;
        double water = volumeLiter * (1 - percent / 100.0);

        System.out.println(water);

    }
}
