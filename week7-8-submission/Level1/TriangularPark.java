import java.util.Scanner;

public class TriangularPark {
    public int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000;
        return (int) Math.ceil(distanceInMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangularPark park = new TriangularPark();

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        int rounds = park.calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete 5 km");
        
        scanner.close();
    }
}