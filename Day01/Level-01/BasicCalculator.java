import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
		
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
		
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
		
        // Display all results in one line
        System.out.println("The addition, subtraction, multiplication, and division of " + number1 + " and " + number2 + " are: " 
		+ addition + ", " + subtraction + ", " + multiplication + ", and " + (number2 != 0 ? division : "undefined") + ".");
	}
}
