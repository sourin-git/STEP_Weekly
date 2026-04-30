import java.util.Scanner;

public class StringCharactersComparison {
    public static char[] getCharactersWithoutToCharArray(String text) {
        char[] characters = new char[text.length()];

        for (int index = 0; index < text.length(); index++) {
            characters[index] = text.charAt(index);
        }

        return characters;
    }

    public static boolean compareCharArrays(char[] firstArray, char[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

        return true;
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
        String text = scanner.next();

        char[] customCharacters = getCharactersWithoutToCharArray(text);
        char[] builtInCharacters = text.toCharArray();

        System.out.print("Characters using user-defined method: ");
        displayCharacters(customCharacters);
        System.out.print("Characters using toCharArray(): ");
        displayCharacters(builtInCharacters);
        System.out.println("Do both arrays match? " + compareCharArrays(customCharacters, builtInCharacters));

        scanner.close();
    }
}
