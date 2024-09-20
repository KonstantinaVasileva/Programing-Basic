import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMount = Double.parseDouble(scanner.nextLine());
        double peek = 0;

        if (kmPerMount <= 5000){
            switch (season){
                case "Spring":
                case "Autumn":
                    peek = 0.75;
                    break;
                case "Summer":
                    peek = 0.90;
                    break;
                case "Winter":
                    peek = 1.05;
                    break;
            }
        } else if (kmPerMount<= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    peek = 0.95;
                    break;
                case "Summer":
                    peek = 1.10;
                    break;
                case "Winter":
                    peek = 1.25;
                    break;
            }
        }else if (kmPerMount <= 20000){
            peek = 1.45;
        }
        double salary = (kmPerMount * peek * 4) * 0.90;
        System.out.printf("%.2f", salary);

    }
}
