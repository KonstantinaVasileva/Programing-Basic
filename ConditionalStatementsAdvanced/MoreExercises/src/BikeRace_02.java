import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double tax = 0.00;

        switch (trace){
            case "trail":
                tax = junior * 5.5 + seniors * 7;
                break;
            case "cross-country":
                tax = junior * 8 + seniors * 9.5;
                break;
                case "downhill":
                tax = junior * 12.25 + seniors * 13.75;
                break;
            case "road":
                tax = junior * 20 + seniors * 21.5;
                break;
        }

        if (trace.equals("cross-country") && junior + seniors>=50)
            tax *= 0.75;
        tax *= 0.95;
        System.out.printf("%.2f", tax);

    }
}
