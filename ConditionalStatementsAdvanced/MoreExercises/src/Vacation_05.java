import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String place = "";
        double price = 0.00;

        switch (season){
            case "Summer":
                location = "Alaska";
                if (budget <= 1000){
                    place = "Camp";
                    price = budget * 0.65;
                } else if (budget <= 3000) {
                    place = "Hut";
                    price = budget * 0.80;
                } else {place = "Hotel";
                price = budget * 0.90;}
                break;
            case "Winter":
                location = "Morocco";
                if (budget <= 1000){
                    place = "Camp";
                    price = budget * 0.45;
                } else if (budget <= 3000) {
                    place = "Hut";
                    price = budget * 0.60;
                } else {place = "Hotel";
                price = budget * 0.90;}
                break;
        }
        System.out.printf("%s - %s - %.2f", location, place, price);

    }
}
