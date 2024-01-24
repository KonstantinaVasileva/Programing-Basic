import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double transport;

        if (people >= 50)
            transport = 0.25 * budget;
        else if (people >= 25) {
            transport = 0.4 * budget;
        } else if (people >= 10) {
            transport = 0.5 * budget;
        } else if (people >= 5) {
            transport = 0.60 * budget;
        } else transport = 0.75 * budget;

        double leftMoney = budget - transport;
        double tiketPrice = 0;

        switch (category){
            case "VIP":
                tiketPrice = people * 499.99; break;
            case "Normal":
                tiketPrice = people * 249.99; break;
        }
        boolean isEnough = leftMoney - tiketPrice < 0;

        if (isEnough)
            System.out.printf("Not enough money! You need %.2f leva.", tiketPrice - leftMoney);
        else System.out.printf("Yes! You have %.2f leva left.", leftMoney - tiketPrice);



    }
}
