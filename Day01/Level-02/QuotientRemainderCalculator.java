import java.util.Scanner;

public class QuotientRemainderCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1= sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2= sc.nextInt();

        // Calculate the quotient and remainder
        int quotient= number1 / number2;
        int remainder= number1 % number2;

        // Display the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                           " of the two numbers " + number1 + " and " + number2 + ".");
    }
}
