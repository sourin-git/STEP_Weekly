import java.util.Scanner;

public class SumUntilStop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        
        // Infinite loop with break
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();
            
            if (value <= 0) {
                break; // Exit loop
            }
            total += value;
        }
        
        System.out.println("The total sum is: " + total);
        input.close();
    }
}