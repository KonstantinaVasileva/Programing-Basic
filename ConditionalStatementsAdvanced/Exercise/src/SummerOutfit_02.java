import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        switch (dayTime) {
            case "Morning":
                if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees > 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 10) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                break;
            case "Afternoon":
                if (degrees >=25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } else if (degrees > 18) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }break;
            case "Evening":
                if (degrees >=25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
