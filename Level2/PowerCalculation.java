import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number and power: ");
        int number = input.nextInt();
        int power = input.nextInt();
        long result = 1;
        
        // Loop to multiply base result by number power times
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(number + " raised to the power of " + power + " is " + result);
        input.close();
    }
}