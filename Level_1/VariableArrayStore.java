package STEP_Weekly.Level_1;

import java.util.Scanner;

public class VariableArrayStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double totalSum = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            totalSum += numbers[i];
        }
        System.out.println("\nTotal Sum: " + totalSum);
        input.close();
    }
}
