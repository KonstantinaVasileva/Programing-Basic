import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeSum = timeFirst + timeSecond + timeThird;

        int timeMin = timeSum / 60;
        int timeSec = timeSum % 60;

//        if (timeSec < 10){
//            System.out.printf("%d:0%d", timeMin, timeSec);
//        } else {
//            System.out.printf("%d:%d", timeMin, timeSec);
//        }
        System.out.printf("%d:%02d", timeMin, timeSec);
    }
}
