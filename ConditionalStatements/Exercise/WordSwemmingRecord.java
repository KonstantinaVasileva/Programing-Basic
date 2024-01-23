import java.util.Scanner;

public class WordSwemmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oldRecord = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double lostTime = (Math.floor(lenght / 15) * 12.5);
        double allTime = lenght * timeForMeter + lostTime;
        double diference = allTime - oldRecord;

        if (allTime < oldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diference);
        }

    }
}
