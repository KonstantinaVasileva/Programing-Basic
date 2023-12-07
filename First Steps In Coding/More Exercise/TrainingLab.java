import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        int numW = (int) (w * 100) / 120 ;
        int numH = (int) ((h-1) * 100) / 70 ;

        int all = numH * numW - 3;

        System.out.println(all);


    }
}
