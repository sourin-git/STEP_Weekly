import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        // Conditional block for voting
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        input.close();
    }
}