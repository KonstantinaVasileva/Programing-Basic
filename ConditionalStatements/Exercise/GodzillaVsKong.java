import java.util.Scanner;

public class GodzillaVsKong
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int walkOn = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double allClothingPrice = walkOn * clothingPrice;

        if (walkOn > 150)
        {
            allClothingPrice = allClothingPrice * 0.9;
        }
        double allPrice = decorPrice + allClothingPrice;
        double isEnough = Math.abs(budget - allPrice);

        if (allPrice > budget)
        {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",isEnough );
        } else
        {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", isEnough);
        }


    }
}
