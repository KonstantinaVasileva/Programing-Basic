import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        int timeSeries = Integer.parseInt(scanner.nextLine());
        int breakLunch = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakLunch/8.0;
        double breakTime = breakLunch/4.0;
        double leftTime = breakLunch - (lunchTime + breakTime);
        double freeTime = Math.ceil(Math.abs(leftTime - timeSeries));

        if (leftTime >=timeSeries){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial,freeTime );
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, freeTime);
        }

    }
}
