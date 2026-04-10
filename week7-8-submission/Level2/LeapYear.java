import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("LeapYear program works only for year >= 1582");
            return false;
        }
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean result = isLeapYear(year);
        
        if (year >= 1582) {
            if (result) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        
        scanner.close();
    }
}