import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;

        int x = Integer.MAX_VALUE;

        for (int i = 1; i <= x; i++) {
            double m = Double.parseDouble(scanner.nextLine());
            if (m < 0){
                System.out.println("Negative number!");
                return;}

                n = m;
                System.out.printf("Result: %.2f%n", n * 2);

        }

        }
    }
