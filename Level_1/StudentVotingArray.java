package STEP_Weekly.Level_1;

import java.util.Scanner;

public class StudentVotingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            int age = input.nextInt();
            if (age < 0) {
                System.err.println("Invalid age entered. Exiting.");
                System.exit(0);
            }
            ages[i] = age;
        }
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote");
            }
        }
        input.close();
    }
}