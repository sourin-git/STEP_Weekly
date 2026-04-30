import java.util.Scanner;

public class UppercaseConversion {
    public static String convertToUppercase(String text) {
        StringBuilder uppercaseText = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char currentCharacter = text.charAt(index);

            if (currentCharacter >= 'a' && currentCharacter <= 'z') {
                currentCharacter = (char) (currentCharacter - 32);
            }

            uppercaseText.append(currentCharacter);
        }

        return uppercaseText.toString();
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
        String text = scanner.nextLine();

        String customUppercase = convertToUppercase(text);
        String builtInUppercase = text.toUpperCase();

        System.out.println("Uppercase using user-defined method: " + customUppercase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("Do both methods match? " + compareStringsUsingCharAt(customUppercase, builtInUppercase));

        scanner.close();
    }
}
