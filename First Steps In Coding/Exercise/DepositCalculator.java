import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depSum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double glp = Double.parseDouble(scanner.nextLine());

        double finalSum = depSum + period * ((depSum * glp/100) / 12);

        System.out.println(finalSum);

    }
}
