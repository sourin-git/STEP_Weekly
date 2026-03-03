import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ages and Heights
        int age1, age2, age3;
        double h1, h2, h3;
        
        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");
        age1 = input.nextInt(); h1 = input.nextDouble();
        age2 = input.nextInt(); h2 = input.nextDouble();
        age3 = input.nextInt(); h3 = input.nextDouble();
        
        // Finding youngest
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        // Finding tallest
        double tallestHeight = Math.max(h1, Math.max(h2, h3));
        
        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);
        input.close();
    }
}