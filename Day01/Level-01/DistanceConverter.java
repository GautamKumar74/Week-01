import java.util.Scanner;

public class DistanceConverter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet= sc.nextDouble();

        // Conversion factors
        final double FEET_PER_YARD= 3;
        final double YARDS_PER_MILE= 1760;

        // Convert the distance to yards and miles
        double distanceInYards= distanceInFeet / FEET_PER_YARD;
        double distanceInMiles= distanceInYards / YARDS_PER_MILE;

        // Display the results
        System.out.println("The distance in feet is " + distanceInFeet + 
                           ", which is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
