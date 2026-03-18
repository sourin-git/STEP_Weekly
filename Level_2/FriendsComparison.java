package STEP_Weekly.Level_2;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height for " + names[i] + ": ");
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int minAge = ages[0];
        double maxHeight = heights[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) minAge = ages[i];
            if (heights[i] > maxHeight) maxHeight = heights[i];
        }

        System.out.println("Youngest Age: " + minAge);
        System.out.println("Tallest Height: " + maxHeight);
        input.close();
    }
}