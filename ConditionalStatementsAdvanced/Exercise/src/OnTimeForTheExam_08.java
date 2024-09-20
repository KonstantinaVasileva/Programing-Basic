import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMin;
        int arriveAllMin = arriveHour * 60 + arriveMin;
        int dif = examAllMin - arriveAllMin;
        int difHour = dif/60;
        int difMin = dif % 60;

        if (dif < 0){
            if (difHour==0) {
                System.out.printf("Late%n%d minutes after the start", Math.abs(difMin));
            }else System.out.printf("Late%n%d:%02d hours after the start", Math.abs(difHour), Math.abs(difMin));
        }else if(dif > 30) {
            if (difHour == 0){
                System.out.printf("Early%n%d minutes before the start", difMin);
            }else System.out.printf("Early%n%d:%02d hours before the start", difHour, difMin);
        } else if (dif == 0) {
            System.out.println("On time");
        } else System.out.printf("On time%n%d minutes before the start", difMin);
    }
}
