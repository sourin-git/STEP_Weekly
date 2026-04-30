import java.util.Scanner;

public class TrimComparison {
    public static int[] findTrimIndexes(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (startIndex < text.length() && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[] {startIndex, endIndex + 1};
    }

    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        StringBuilder substring = new StringBuilder();

        for (int index = startIndex; index < endIndex; index++) {
            substring.append(text.charAt(index));
        }

        return substring.toString();
    }

    public static boolean compareStringsUsingCharAt(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) {
            return false;
        }

        for (int index = 0; index < firstText.length(); index++) {
            if (firstText.charAt(index) != secondText.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text with spaces: ");
        String text = scanner.nextLine();

        int[] trimIndexes = findTrimIndexes(text);
        String customTrimmedText = createSubstringUsingCharAt(text, trimIndexes[0], trimIndexes[1]);
        String builtInTrimmedText = text.trim();

        System.out.println("Trim using user-defined method: [" + customTrimmedText + "]");
        System.out.println("Trim using trim(): [" + builtInTrimmedText + "]");
        System.out.println("Do both methods match? " + compareStringsUsingCharAt(customTrimmedText, builtInTrimmedText));

        scanner.close();
    }
}
