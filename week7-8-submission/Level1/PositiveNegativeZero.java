import java.util.Scanner;

public class PositiveNegativeZero {
    public int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNegativeZero pnz = new PositiveNegativeZero();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = pnz.checkNumber(number);
        
        if (result == 1) {
            System.out.println("The number is positive");
        } else if (result == -1) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        
        scanner.close();
    }
}