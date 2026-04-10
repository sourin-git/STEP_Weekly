import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer)");
        } else {
            int recursionSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

            System.out.println("Sum using recursion: " + recursionSum);
            System.out.println("Sum using formula n*(n+1)/2: " + formulaSum);

            if (recursionSum == formulaSum) {
                System.out.println("Both methods produce the same result!");
            } else {
                System.out.println("Results do not match!");
            }
        }
        
        scanner.close();
    }
}