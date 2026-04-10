import java.util.Scanner;

public class Handshakes {
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Handshakes handshakes = new Handshakes();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int result = handshakes.calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of possible handshakes: " + result);
        
        scanner.close();
    }
}