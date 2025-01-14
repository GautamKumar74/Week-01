import java.util.Scanner;

public class DoubleOpt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c (as double values)
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform the double operations
        double result1 = a + b * c;    // Operation 1: a + (b * c)
        double result2 = a * b + c;    // Operation 2: (a * b) + c
        double result3 = c + a / b;    // Operation 3: c + (a / b)
        double result4 = a % b + c;    // Operation 4: (a % b) + c

        // Display the results
        System.out.println("The results of Double Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
