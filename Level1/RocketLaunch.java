import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter start value for countdown: ");
        int counter = input.nextInt();
        
        // While loop for countdown
        while (counter >= 1) {
            System.out.println(counter + "...");
            counter--; // Decrement
        }
        System.out.println("Liftoff!");
        input.close();
    }
}