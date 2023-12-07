import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cel = Double.parseDouble(scanner.nextLine());
        double far = (cel * 9/5) + 32;

        System.out.printf("%.2f", far);
    }
}
