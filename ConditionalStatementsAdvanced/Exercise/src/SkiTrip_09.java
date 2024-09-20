import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayHotel = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0.00;
        int sleepNight = dayHotel - 1;

        switch (room){
            case "room for one person":
                price = sleepNight * 18;
                break;
            case "apartment":
                price = 25 * sleepNight;
                if (sleepNight < 10)
                    price *= 0.7;
                else if (sleepNight <=15) {
                    price *= 0.65;
                }else price *= 0.5;
                break;
            case "president apartment":
                price = 35 * sleepNight;
                if (sleepNight < 10)
                    price *= 0.9;
                else if (sleepNight <=15) {
                    price *= 0.85;
                }else price *= 0.8;
                break;
        }
        if (rating.equals("positive"))
            price *= 1.25;
        if (rating.equals("negative"))
            price *= 0.9;

        System.out.printf("%.2f", price);
    }
}
