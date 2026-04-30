import java.util.Scanner;

public class StringLengthFinder {
    public static int findLengthWithoutLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException exception) {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.next();

        int customLength = findLengthWithoutLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using length(): " + builtInLength);

        scanner.close();
    }
}
