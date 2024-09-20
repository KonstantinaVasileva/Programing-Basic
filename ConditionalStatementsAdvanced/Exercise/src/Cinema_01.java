import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int tickets = row * columns;
        double profit = 0;

        switch (projection){
            case "Premiere":
                profit = tickets * 12;
                break;
            case "Normal":
                profit = tickets * 7.5;
                break;
            case "Discount":
                profit = tickets * 5;
                break;
        }
        System.out.printf("%.2f leva", profit);

    }
}
