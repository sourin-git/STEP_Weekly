package STEP_Weekly.Level_1;

import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] table = new int[10];

        // Fill array using loop
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display results
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        input.close();
    }
}