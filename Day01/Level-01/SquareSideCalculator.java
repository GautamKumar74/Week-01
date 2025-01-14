import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
		
        // Calculate the side length of the square
        double side= perimeter / 4;
		
        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");
	}
}
