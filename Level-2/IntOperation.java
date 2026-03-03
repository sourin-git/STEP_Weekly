import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", and " + op3);
    }
}