import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double nPrice = n * 250;
        double mPrice = m * (nPrice * 0.35);
        double pPrice = p * (nPrice * 0.1);
        double moneyNeeded = nPrice + mPrice + pPrice;

        if (n > m){
            moneyNeeded *= 0.85;
        }


        double safeMoney = Math.abs(budged - moneyNeeded);

        if (budged >= moneyNeeded){
            System.out.printf("You have %.2f leva left!", safeMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", safeMoney);
        }
    }
}
