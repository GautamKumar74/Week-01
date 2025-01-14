import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();
		
        // Convert height to inches
        double totalInches = heightCm / 2.54;
		
        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
		
        // Display the result
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
	}
}
