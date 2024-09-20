import java.util.Scanner;

public class OperationBetweenNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String nOperator = scanner.nextLine();
        int result;

        if (n2 == 0 && (nOperator.equals("/")||nOperator.equals("%")))
            System.out.printf("Cannot divide %d by zero", n1);
        else {
            switch (nOperator) {
                case "+": {
                    result = n1 + n2;
                    if (result % 2 == 1)
                        System.out.printf("%d %s %d = %d - odd", n1, nOperator, n2, result);
                    else System.out.printf("%d %s %d = %d - even", n1, nOperator, n2, result);
                } break;
                case "-": {
                    result = n1 - n2;
                    if (result % 2 == 1)
                        System.out.printf("%d %s %d = %d - odd", n1, nOperator, n2, result);
                    else System.out.printf("%d %s %d = %d - even", n1, nOperator, n2, result);
                }break;
                case "*": {
                    result = n1 * n2;
                    if (result % 2 == 1)
                        System.out.printf("%d %s %d = %d - odd", n1, nOperator, n2, result);
                    else System.out.printf("%d %s %d = %d - even", n1, nOperator, n2, result);
                } break;
                case "/": {
                    double result2 = n1*1.0 / n2;
                    System.out.printf("%d %s %d = %.2f", n1,nOperator, n2, result2);
                } break;
                case "%": {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %d", n1,nOperator, n2, result);
                }break;
            }
        }
    }
}
