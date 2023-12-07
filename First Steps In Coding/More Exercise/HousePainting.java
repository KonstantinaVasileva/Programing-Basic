import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double roofArea = 2 * (x * y) + 2 * (( x * h )/2);
        double sideArea = 2 * (x*x) + 2 * (x * y) - (1.2 * 2 + 2 * (1.5 * 1.5));

        double redPaint = roofArea / 4.3;
        double greenPaint = sideArea / 3.4;

        System.out.printf("%.2f",greenPaint);
        System.out.printf("%n %.2f",redPaint);

    }
}
