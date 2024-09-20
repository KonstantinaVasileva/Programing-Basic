import java.util.Scanner;

public class OpBwNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.00;

        if (numTwo==0 && (operator.equals("/")||operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero", numOne);
        return;}


        if (operator.equals("+")) {
            result = numOne + numTwo;
        } else if (operator.equals("-")) {
            result = numOne - numTwo;
        } else if (operator.equals("*")) {
            result = numOne * numTwo;
        } else if (operator.equals("/")) {
            result = numOne*1.0 / numTwo;
        } else if (operator.equals("%")) {
            result = numOne % numTwo;
        }
        switch (operator){
            case "+":
            case "-":
            case "*":
                if (result % 2 == 0){
                    System.out.printf("%d %s %d = %.0f - even", numOne, operator, numTwo, result);
                } else System.out.printf("%d %s %d = %.0f - odd", numOne, operator, numTwo, result);
                break;
            case "/":
                System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, result);
                break;
            case "%":
                System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, result);
                break;
        }

    }
}