import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean valid = num <100 || num >200;

        if (valid && num != 0)
            System.out.println("invalid");
    }
}
