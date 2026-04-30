import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeUsingIndexes(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (startIndex < endIndex) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static boolean isPalindromeUsingRecursion(String text, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }

        if (text.charAt(startIndex) != text.charAt(endIndex)) {
            return false;
        }

        return isPalindromeUsingRecursion(text, startIndex + 1, endIndex - 1);
    }

    public static char[] reverseTextUsingCharAt(String text) {
        char[] reversedCharacters = new char[text.length()];
        int reverseIndex = 0;

        for (int index = text.length() - 1; index >= 0; index--) {
            reversedCharacters[reverseIndex++] = text.charAt(index);
        }

        return reversedCharacters;
    }

    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalCharacters = text.toCharArray();
        char[] reversedCharacters = reverseTextUsingCharAt(text);

        for (int index = 0; index < originalCharacters.length; index++) {
            if (originalCharacters[index] != reversedCharacters[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        boolean indexResult = isPalindromeUsingIndexes(text);
        boolean recursionResult = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        boolean arrayResult = isPalindromeUsingArrays(text);

        System.out.println("Palindrome check using indexes: " + indexResult);
        System.out.println("Palindrome check using recursion: " + recursionResult);
        System.out.println("Palindrome check using arrays: " + arrayResult);

        scanner.close();
    }
}
