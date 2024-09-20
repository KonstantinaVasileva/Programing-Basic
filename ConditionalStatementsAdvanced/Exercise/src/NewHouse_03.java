import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double leftMoney = 0;

        switch (flowers) {
            case "Roses": {
                if (count > 80) {
                    price = (count * 5) * 0.9;
                } else price = count * 5;
            }
            break;
            case "Dahlias": {
                if (count > 90)
                    price = (count * 3.8) * 0.85;
                else price = count * 3.8;
            }
            break;
            case "Tulips":
                if (count > 80)
                    price = (count * 2.8) * 0.85;
                else price = count * 2.8;
                break;
            case "Narcissus":
                if (count < 120)
                    price = (count * 3) * 1.15;
                else price = count * 3;
                break;
            case "Gladiolus":
                if (count < 80)
                    price = (count * 2.5) * 1.2;
                else price = count * 2.5;
                break;
        }
                if (price <= budget) {
                    leftMoney = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, leftMoney);
                }   else {
                    leftMoney = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", leftMoney);}


    }
}
