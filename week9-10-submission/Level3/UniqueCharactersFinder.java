import java.util.Scanner;

public class UniqueCharactersFinder {
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

    public static char[] findUniqueCharacters(String text) {
        int textLength = findLengthWithoutLength(text);
        char[] temporaryCharacters = new char[textLength];
        int uniqueCount = 0;

        for (int outerIndex = 0; outerIndex < textLength; outerIndex++) {
            char currentCharacter = text.charAt(outerIndex);
            boolean isUnique = true;

            for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {
                if (text.charAt(innerIndex) == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temporaryCharacters[uniqueCount++] = currentCharacter;
            }
        }

        char[] uniqueCharacters = new char[uniqueCount];
        for (int index = 0; index < uniqueCount; index++) {
            uniqueCharacters[index] = temporaryCharacters[index];
        }

        return uniqueCharacters;
    }

    public static void displayCharacters(char[] characters) {
        for (char character : characters) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("Unique characters in the text:");
        displayCharacters(uniqueCharacters);

        scanner.close();
    }
}
