import java.util.Scanner;

public class SubstringComparison {
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

        System.out.print("Enter the text: ");
        String text = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            System.out.println("Invalid indexes provided.");
            scanner.close();
            return;
        }

        String customSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Do both substrings match? " + compareStringsUsingCharAt(customSubstring, builtInSubstring));

        scanner.close();
    }
}
