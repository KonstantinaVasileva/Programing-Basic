import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apart = 0.0;

        switch (month){
            case ("May"):
            case ("October"):{
               if  (nights >14) {
                    studio = (nights * 50) * 0.7;
                    apart = (nights * 65) * 0.9;
                } else if (nights > 7) {
                    studio = 0.95 * (nights * 50);
                    apart = nights * 65;
                } else {
                   studio = nights * 50;
                   apart = nights * 65;
               }
            } break;
            case ("June"):
            case ("September"):{
                if (nights>14) {
                    studio = 0.8 * (nights * 75.20);
                    apart = 0.9 * (nights * 68.7);
                }else {
                studio = nights * 75.20;
                apart = nights * 68.70;}
            }break;
            case("July"):
            case ("August"):{
                if (nights > 14){
                    studio = nights * 76;
                    apart = 0.9 * (nights * 77);
                }else {
                studio = nights * 76;
                apart = nights * 77;}
            }break;
        }
        System.out.printf("Apartment: %.2f lv.", apart);
        System.out.printf("%nStudio: %.2f lv.", studio);

    }
}
