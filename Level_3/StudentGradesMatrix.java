package STEP_Weekly.Level_3;

import java.util.Scanner;

public class StudentGradesMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = input.nextInt();

        int[][] marks = new int[num][3];
        double[] percentages = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) + " marks:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextInt();
                if (marks[i][j] < 0) {
                    System.err.println("Marks cannot be negative. Re-enter.");
                    j--;
                }
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
        }
        System.out.println("\nPhy\tChem\tMath\t%\tGrade");
        for (int i = 0; i < num; i++) {
            String grade = (percentages[i] >= 80) ? "A" : (percentages[i] >= 60) ? "B" : "C";
            System.out.printf("%d\t%d\t%d\t%.1f\t%s\n", 
                marks[i][0], marks[i][1], marks[i][2], percentages[i], grade);
        }
        input.close();
    }
}