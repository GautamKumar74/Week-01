import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula: (Celsius × 9/5) + 32
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
