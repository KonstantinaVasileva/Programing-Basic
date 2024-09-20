import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int persons = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        boolean even = (persons % 2 == 0);


        switch (season){
            case "Spring": {
                rent = 3000;
                if (persons <=6){
                    rent *= 0.9;
                } else if (persons <= 11) {
                    rent *= 0.85;
                } else  {
                    rent *= 0.75;
                }
                if (even)
                    rent *= 0.95;
            } break;
            case "Summer":
                rent = 4200;
                if (persons <=6){
                    rent *= 0.9;
                } else if (persons <= 11) {
                    rent *= 0.85;
                } else  {
                    rent *= 0.75;
                }
                if (even)
                    rent *= 0.95;
                break;
            case "Autumn":
                rent = 4200;
                if (persons <=6){
                    rent *= 0.9;
                } else if (persons <= 11) {
                    rent *= 0.85;
                } else  {
                    rent *= 0.75;
                }
                break;
            case "Winter":
                rent = 2600;
                if (persons <=6){
                    rent *= 0.9;
                } else if (persons <= 11) {
                    rent *= 0.85;
                } else  {
                    rent *= 0.75;
                }
                if (even)
                    rent *= 0.95;
                break;
        }
            if (rent<=budget)
                System.out.printf("Yes! You have %.2f leva left.", budget - rent);
            else System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
    }
}
