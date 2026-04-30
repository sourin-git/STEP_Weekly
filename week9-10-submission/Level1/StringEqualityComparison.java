import java.util.Scanner;

public class StringEqualityComparison {
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

        System.out.print("Enter the first string: ");
        String firstText = scanner.next();

        System.out.print("Enter the second string: ");
        String secondText = scanner.next();

        boolean customComparison = compareStringsUsingCharAt(firstText, secondText);
        boolean builtInComparison = firstText.equals(secondText);

        System.out.println("Comparison using charAt(): " + customComparison);
        System.out.println("Comparison using equals(): " + builtInComparison);
        System.out.println("Do both methods match? " + (customComparison == builtInComparison));

        scanner.close();
    }
}
