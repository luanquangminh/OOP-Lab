import java.util.Scanner;

public class DateCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        while (year < 0) {
            System.out.println("Invalid input. Year must be a positive number.");
            System.out.print("Enter a year: ");
            year = scanner.nextInt();
        }
        System.out.print("Enter a month (1-12): ");
        month = scanner.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("Invalid input. Month must be between 1 and 12.");
            System.out.print("Enter a month (1-12): ");
            month = scanner.nextInt();
        }
        int daysInMonth = getDaysInMonth(year, month);
        System.out.println("Number of days in the month: " + daysInMonth);
        scanner.close();
    }
    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            // case 1, 3, 5, 7, 8, 10, 12:
            //     return 31;
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;  
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            // case 4, 6, 9, 11:
            //     return 30;
            case 4:
                return 30;
            case 6:
                return 30;
            case 11:
                return 30;
            case 9:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; 
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
