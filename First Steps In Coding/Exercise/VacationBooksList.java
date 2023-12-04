import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int daysForBook = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = (pages / pagesForHour) / daysForBook;

        System.out.println(hoursPerDay);

    }
}
