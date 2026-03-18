package STEP_Weekly.Level_2;

import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (cm) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            personData[i][1] = input.nextDouble();

            // Validation
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Try again.");
                i--; continue;
            }

            double heightInM = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (heightInM * heightInM);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else status[i] = "Overweight";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", 
                personData[i][1], personData[i][0], personData[i][2], status[i]);
        }
        input.close();
    }
}