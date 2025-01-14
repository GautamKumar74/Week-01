import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Prompt the user to enter the base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = sc.nextDouble();
		
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = sc.nextDouble();
		
        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInches * heightInches;
		
        // Conversion factor
        final double SQUARE_INCHES_TO_SQUARE_CM = 6.4516;
		
        // Calculate the area in square centimeters
        double areaInSquareCm = areaInSquareInches * SQUARE_INCHES_TO_SQUARE_CM;
		
        // Display the results
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters.");
	}
}
