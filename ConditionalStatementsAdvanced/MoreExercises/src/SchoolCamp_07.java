import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int sleepNight = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        if (group.equals("girls") || group.equals("boys"))
        {
            if (season.equals("Winter")){
                price = 9.60;
            } else if (season.equals("Spring")) {
                price = 7.2;
            } else if (season.equals("Summer")) {
                price = 15;
            }
        } else if (group.equals("mixed")){
            if (season.equals("Winter")){
                price = 10;
            } else if (season.equals("Spring")) {
                price = 9.50;
            } else if (season.equals("Summer")) {
                price = 20;
            }
        }
        if (count >= 50){
            price *= 0.50;
        } else if (count >= 20){
            price *= 0.85;
        } else if (count >=10) {
            price *= 0.95;
        }
            String sport = "";
        if (season.equals("Winter")){
            if (group.equals("girls")){
                sport = "Gymnastics";
            } else if (group.equals("boys")) {
                sport = "Judo";
            } else if (group.equals("mixed")) {
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (group.equals("girls")){
                sport = "Athletics";
            } else if (group.equals("boys")) {
                sport = "Tennis";
            } else if (group.equals("mixed")) {
                sport = "Cycling";
            }
        } else if (season.equals("Summer")) {
            if (group.equals("girls")){
                sport = "Volleyball";
            } else if (group.equals("boys")) {
                sport = "Football";
            } else if (group.equals("mixed")) {
                sport = "Swimming";
            }
        }
        System.out.printf("%s %.2f lv.", sport, sleepNight * price * count);
    }
}
