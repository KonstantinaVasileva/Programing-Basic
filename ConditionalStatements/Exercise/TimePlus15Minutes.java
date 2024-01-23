import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int min2 = min + 15;

        if ( min2 >=60) {
            hour = hour + 1;
            min2 = min2 - 60;
        }
        if (hour > 23)
            hour = 0;
       System.out.printf("%d:%02d", hour, min2);
//        int sumMin = inputHour * 60 + inputMin + 15;
//        int hour = sumMin / 60;
//        int min = sumMin % 60;
//
//        if (hour > 23){
//            hour = 0;
//        }
//        System.out.printf("%d:%02d", hour, min);



    }
}
