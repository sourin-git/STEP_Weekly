package STEP_Weekly.Level_2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        int count = String.valueOf(Math.abs(number)).length();
        int[] digits = new int[count];
        int temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed digits array: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        input.close();
    }
}