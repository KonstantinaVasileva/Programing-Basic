import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int tulip = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrPryce = 0.00;
        double rosePrice = 0.00;
        double tulipPrice = 0.00;

        switch (season){
            case "Spring":
            case "Summer":
                chrPryce = 2;
                rosePrice = 4.10;
                tulipPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrPryce = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
                break;
        }
        double bouquetPrice = chrysanthemum * chrPryce + rose * rosePrice + tulip * tulipPrice;
        if (holiday.equals("Y"))
            bouquetPrice *= 1.15;
        if (tulip > 7 && season.equals("Spring"))
            bouquetPrice *= 0.95;
        if (rose >= 10 && season.equals("Winter"))
            bouquetPrice *= 0.90;
        if (chrysanthemum + rose + tulip >20)
            bouquetPrice *= 0.80;
        System.out.printf("%.2f", (bouquetPrice + 2));


    }
}
