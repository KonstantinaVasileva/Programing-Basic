import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int miniones = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double turnover = puzzles * 2.6 + talkingDoll * 3.0 + teddyBear * 4.1 + miniones * 8.20 + truck * 2;
        int countToy = puzzles + talkingDoll + teddyBear + miniones + truck;

        if (countToy >=50){
            turnover = turnover * 0.75;
        }

        double profit = turnover * 0.9;
        double moneyLeft = Math.abs(profit - tripPrice);

        if (profit >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }

    }
}
