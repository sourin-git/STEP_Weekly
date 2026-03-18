package STEP_Weekly.Level_3;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        int[] freq = new int[10]; // Indices 0-9 for digits

        long temp = Math.abs(number);
        if (temp == 0) freq[0]++;
        
        while (temp > 0) {
            int digit = (int)(temp % 10);
            freq[digit]++;
            temp /= 10;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }
        input.close();
    }
}