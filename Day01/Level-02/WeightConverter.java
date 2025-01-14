import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the weight in pounds as input
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor from pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms);
    }
}
