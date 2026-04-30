import java.util.Scanner;

public class WordSplitComparison {
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

    public static String[] splitWordsUsingCharAt(String text) {
        int textLength = findLengthWithoutLength(text);
        int wordCount = 0;
        boolean insideWord = false;

        for (int index = 0; index < textLength; index++) {
            char currentCharacter = text.charAt(index);

            if (currentCharacter != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;
            } else if (currentCharacter == ' ') {
                insideWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = -1;
        int wordIndex = 0;

        for (int index = 0; index <= textLength; index++) {
            char currentCharacter = index < textLength ? text.charAt(index) : ' ';

            if (currentCharacter != ' ' && wordStart == -1) {
                wordStart = index;
            }

            if ((currentCharacter == ' ' || index == textLength) && wordStart != -1) {
                StringBuilder word = new StringBuilder();
                for (int characterIndex = wordStart; characterIndex < index; characterIndex++) {
                    word.append(text.charAt(characterIndex));
                }
                words[wordIndex++] = word.toString();
                wordStart = -1;
            }
        }

        return words;
    }

    public static boolean compareStringArrays(String[] firstArray, String[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (!firstArray[index].equals(secondArray[index])) {
                return false;
            }
        }

        return true;
    }

    public static void displayWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] customWords = splitWordsUsingCharAt(text);
        String trimmedText = text.trim();
        String[] builtInWords = trimmedText.isEmpty() ? new String[0] : trimmedText.split("\\s+");

        System.out.println("Words using user-defined method:");
        displayWords(customWords);
        System.out.println("Words using split():");
        displayWords(builtInWords);
        System.out.println("Do both arrays match? " + compareStringArrays(customWords, builtInWords));

        scanner.close();
    }
}
