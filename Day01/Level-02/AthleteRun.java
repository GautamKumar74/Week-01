import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the sides of the triangle as input
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double distanceToRun = 5 * 1000;

        // Calculate the number of rounds needed
        double rounds = distanceToRun / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is " + rounds);
    }
}