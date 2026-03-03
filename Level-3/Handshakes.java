import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int combination = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes among " + n + " students is " + combination);
    }
}